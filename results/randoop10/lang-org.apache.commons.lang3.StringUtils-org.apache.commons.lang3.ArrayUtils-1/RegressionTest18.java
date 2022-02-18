import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 10.0d);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, 10.0d, (double) 0.0f);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray3);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 7, 32);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, -1.0, 10.0]");
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ngla");
        java.util.Collection<java.util.Locale> localeCollection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale3 = java.util.Locale.lookup(languageRangeList1, localeCollection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("false");
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray1, (java.lang.Object) "n-US   ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 213);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray5, 0.0f);
        java.lang.Float[] floatArray13 = new java.lang.Float[] { 1.0f, 10.0f, 100.0f, 1.0f, 100.0f };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray13);
        java.lang.Float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray13);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray13, (float) '#');
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray5, floatArray17);
        float[] floatArray22 = new float[] { 100, (byte) -1, (-1) };
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray22);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray24);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray25, (float) (byte) 0);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.clone(floatArray27);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray18, floatArray28);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.remove(floatArray28, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 117, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[213.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[213.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[213.0, 1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[213.0, 1.0, 10.0, 100.0, 1.0, 100.0, -1.0, -1.0, 100.0]");
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setExtension('a', "francese (Francia)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: francese (Francia) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) (short) 0);
        double[] doubleArray12 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) (byte) 10, 1.0d);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray12, 10.0d);
        double[] doubleArray18 = new double[] {};
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray22 = null;
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray18, doubleArray22);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray18, (double) 4, (double) (byte) 10);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray12, doubleArray18);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray18, 97, (int) '#');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray8, doubleArray30);
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray30, 6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray34, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 34, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        java.util.Locale locale1 = new java.util.Locale("SouthKorea");
        org.junit.Assert.assertEquals(locale1.toString(), "southkorea");
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
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
        java.util.Locale.Builder builder36 = builder32.setLanguage("");
        java.util.Locale.Builder builder37 = builder32.clearExtensions();
        java.util.Locale.Builder builder39 = builder32.setLanguageTag("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder42 = builder32.setUnicodeLocaleKeyword("\u4e2d\u56fd                                                                                                ", "\u110b\u1175\u11af\u1107\u1169\u11ab\u110b\u1165");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??                                                                                                 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                  ", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ne");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("US");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "  {FPFPFPFPNPJ   ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("n", strArray6, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "  {false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)", strArray3, strArray14);
        java.lang.Object[] objArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "n" + "'", str12, "n");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str16, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[                                                                                                  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[                                                                                                  ]");
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("ja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_j", "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "1 100 35 10aaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
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
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) byteArray49);
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#tts-Unis", (int) (byte) 100, "Etats-Unisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#tts-UnisEtats-UnisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuEtats-Unisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "#tts-UnisEtats-UnisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuEtats-Unisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\u30a2\u30e1##", 333);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a2\u30e1##" + "'", str2, "\u30a2\u30e1##");
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
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
        java.util.Locale locale35 = builder34.build();
        java.util.Locale.Builder builder36 = builder34.clearExtensions();
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
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
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
        java.lang.String str21 = locale20.getCountry();
        java.util.Locale locale23 = new java.util.Locale("\u30a2\u30e1");
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category24, locale25);
        java.util.Locale locale27 = java.util.Locale.getDefault(category24);
        java.util.Locale locale28 = java.util.Locale.US;
        java.lang.String str29 = locale28.toLanguageTag();
        java.lang.String str30 = locale28.getScript();
        java.util.Locale.setDefault(category24, locale28);
        java.lang.String str32 = locale28.getCountry();
        java.lang.String str33 = locale23.getDisplayCountry(locale28);
        java.util.Locale locale35 = new java.util.Locale("Italian");
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str37 = locale35.getDisplayName(locale36);
        java.util.Locale locale38 = java.util.Locale.US;
        java.util.Locale locale39 = locale38.stripExtensions();
        java.lang.String str40 = locale38.getDisplayCountry();
        java.lang.String str41 = locale35.getDisplayVariant(locale38);
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        java.util.Locale locale44 = java.util.Locale.US;
        java.util.Locale locale45 = locale44.stripExtensions();
        java.lang.String str46 = locale45.getLanguage();
        java.lang.String str47 = locale43.getDisplayScript(locale45);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.upperCase("\u82f1\u8a9e\u30a2en_US             ", locale43);
        java.lang.String str49 = locale43.getCountry();
        java.lang.String str50 = locale38.getDisplayScript(locale43);
        java.lang.String str51 = locale28.getDisplayScript(locale38);
        java.lang.String str52 = locale20.getDisplayScript(locale28);
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet54 = locale53.getUnicodeLocaleAttributes();
        java.lang.String str55 = locale28.getDisplayName(locale53);
        java.lang.String str56 = locale28.toLanguageTag();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "US" + "'", str21, "US");
        org.junit.Assert.assertEquals(locale23.toString(), "\u30a2\u30e1");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en-US" + "'", str29, "en-US");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "US" + "'", str32, "US");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale35.toString(), "italian");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "italian" + "'", str37, "italian");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Vereinigte Staaten von Amerika" + "'", str40, "Vereinigte Staaten von Amerika");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en" + "'", str46, "en");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u82f1\u8a9e\u30a2EN_US             " + "'", str48, "\u82f1\u8a9e\u30a2EN_US             ");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "FR" + "'", str49, "FR");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\uc601\uc5b4\ubbf8\uad6d)" + "'", str55, "\uc601\uc5b4\ubbf8\uad6d)");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "en-US" + "'", str56, "en-US");
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 48, 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 48, Length: 2");
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
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
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
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray30, (byte) -1);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.clone(byteArray36);
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
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 0]");
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("{false,false,false,false,tra", "\u7f8e\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{false,false,false,false,tra" + "'", str2, "{false,false,false,false,tra");
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "u uu", 10);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("}eurt,esla", " ");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("etruefalse", strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "\u56fd\u7f8e");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("     zH_CN", strArray4, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}eurt,esla" + "'", str11, "}eurt,esla");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}eurt,esla" + "'", str12, "}eurt,esla");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "     zH_CN" + "'", str15, "     zH_CN");
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
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
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category15, locale16);
        java.util.Locale locale18 = java.util.Locale.getDefault(category15);
        java.util.Locale locale19 = java.util.Locale.US;
        java.lang.String str20 = locale19.toLanguageTag();
        java.lang.String str21 = locale19.getScript();
        java.util.Locale.setDefault(category15, locale19);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray23 = org.apache.commons.lang3.ArrayUtils.add(categoryEnumArray14, (java.lang.Enum<java.util.Locale.Category>) category15);
        java.util.Locale.Category category25 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category25, locale26);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category28, locale29);
        java.lang.String str32 = locale29.getExtension('a');
        java.util.Locale.setDefault(category25, locale29);
        java.util.Locale locale34 = java.util.Locale.US;
        java.lang.String str35 = locale34.toLanguageTag();
        java.util.Locale locale36 = java.util.Locale.US;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        java.lang.String str39 = locale34.getDisplayCountry(locale37);
        java.util.Locale locale40 = java.util.Locale.FRANCE;
        java.util.Locale locale41 = java.util.Locale.US;
        java.util.Locale locale42 = locale41.stripExtensions();
        java.lang.String str43 = locale42.getLanguage();
        java.lang.String str44 = locale40.getDisplayScript(locale42);
        java.lang.String str45 = locale34.getDisplayName(locale40);
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str47 = locale40.getDisplayName(locale46);
        java.lang.String str48 = locale40.getVariant();
        java.util.Locale.setDefault(category25, locale40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray50 = org.apache.commons.lang3.ArrayUtils.add(categoryEnumArray14, 69, (java.lang.Enum<java.util.Locale.Category>) category25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 69, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en-US" + "'", str20, "en-US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(categoryEnumArray23);
        org.junit.Assert.assertTrue("'" + category25 + "' != '" + java.util.Locale.Category.FORMAT + "'", category25.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category28 + "' != '" + java.util.Locale.Category.FORMAT + "'", category28.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de_DE");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "en-US" + "'", str35, "en-US");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "United States" + "'", str39, "United States");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "en" + "'", str43, "en");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "anglais (Etats-Unis)" + "'", str45, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str47, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...lse,f", "\u97e9");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...lse,f" + "'", str2, "...lse,f");
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u6587\u53f0\u7063)", "US                                                                                                  ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for ?? (??)");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587\u53f0\u7063)_US                                                                                                  ");
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (short) 100);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229\u6587AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229\u6587AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u65e5\u6587", "Italien (Italie)hi!italien (Italie)en-USitalien (Italie)", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
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
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder35.clearExtensions();
        java.util.Locale.Builder builder38 = builder35.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder40 = builder38.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale41 = builder38.build();
        java.util.Locale.Builder builder43 = builder38.setRegion("en");
        java.lang.Character[] charArray49 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray49);
        char[] charArray51 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray50);
        java.lang.Object obj52 = objMap15.getOrDefault((java.lang.Object) builder38, (java.lang.Object) charArray51);
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray51, '#', 15);
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
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("united# #states", "{Italian}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("10321051");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        char[] charArray4 = new char[] { ' ', 'a' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray4);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray4);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, 0, 98);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "FR_FR", charArray11);
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
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 401 + "'", int1 == 401);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("en-US", "English");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray5, (java.lang.Object) strArray8, (int) 'a');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray14);
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
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " a" + "'", str15, " a");
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray7);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) doubleArray7);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, 42, (double) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 1.0]");
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", (java.lang.CharSequence) "ja_J");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", charSequence2, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
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
        java.lang.Short[] shortArray25 = new java.lang.Short[] { (short) 0 };
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25, (short) (byte) 1);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray25, (java.lang.Object) (byte) 10);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25);
        java.lang.Short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray30);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray21, shortArray30);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.add(shortArray21, (short) (byte) 10);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray34, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.add(shortArray34, 87, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 87, Length: 3");
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
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, 0, 10]");
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) (byte) 1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray7);
        java.lang.Short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray7);
        java.lang.Short[] shortArray11 = new java.lang.Short[] { (short) 0 };
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray11, (short) (byte) 1);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray7, shortArray13);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray7);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) shortArray7);
        java.lang.Short[] shortArray18 = new java.lang.Short[] { (short) 0 };
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) (byte) 1);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray20);
        java.lang.Short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray20);
        java.lang.Short[] shortArray24 = new java.lang.Short[] { (short) 0 };
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray24, (short) (byte) 1);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray20, shortArray26);
        java.lang.Short[] shortArray29 = new java.lang.Short[] { (short) 0 };
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray29, (short) (byte) 1);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray31);
        java.lang.Short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray31);
        java.lang.Short[] shortArray35 = new java.lang.Short[] { (short) 0 };
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray35, (short) (byte) 1);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray31, shortArray37);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray26, shortArray38);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray38);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray7, shortArray38);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 43, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        short[] shortArray1 = new short[] { (short) 10 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 10, 35);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray1, (short) (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray1, (short) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) -1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, 0, (short) 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 10);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray1);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 0, 15);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray1, (int) (short) -1, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[]");
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale0.getDisplayName(locale3);
        java.util.Set<java.lang.Character> charSet6 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Vereinigte Staaten von Amerika" + "'", str2, "Vereinigte Staaten von Amerika");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str5, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("de", 6, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uudeuu" + "'", str3, "uudeuu");
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray16 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray16, 0L);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray18);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray18);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.subarray(longArray18, 100, (-1));
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.add(longArray18, 10L);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray18, (long) (short) -1, (int) (byte) 100);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.add(longArray18, (long) 13);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray30);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[1, 100, 35, 10, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[1, 100, 35, 10, 13]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("FRANCE", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "FRANCE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) (short) 100);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 5);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.clone(intArray13);
        java.lang.String str15 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray14);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray14, 100);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.subarray(intArray14, 39, (int) 'x');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{10,32,10,5,1,5}" + "'", str15, "{10,32,10,5,1,5}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("100.010.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.010." + "'", str1, "100.010.");
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'u');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray12);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14, 'x');
        char[] charArray18 = null;
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.addAll(charArray17, charArray18);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray18, '#');
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
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("\u610f\u5927\u5229)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  (???) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("korn-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   ", "\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587katlatmatnatoatrattatvatwatzauaaugaumausauyauzavaavcaveavgaviavnavuawfawsayeaytazaazmazw", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray13);
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17, 'u');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, '#');
        char[] charArray22 = null;
        char[] charArray29 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray29, 'a', (int) (short) 10);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray29, 'u');
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray29, 'u');
        char[] charArray43 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray43, 'a', (int) (short) 10);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray43, ' ');
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray43, ' ');
        char[] charArray51 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray50);
        char[] charArray58 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray58, 'a', (int) (short) 10);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray58, ' ');
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray50, charArray58);
        java.lang.Character[] charArray65 = org.apache.commons.lang3.ArrayUtils.toObject(charArray50);
        char[] charArray67 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray50, 'u');
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray36, charArray67);
        char[] charArray69 = org.apache.commons.lang3.ArrayUtils.addAll(charArray22, charArray67);
        char[] charArray73 = new char[] { ' ', 'a' };
        boolean boolean74 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray73);
        char[] charArray75 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray73);
        char[] charArray76 = org.apache.commons.lang3.ArrayUtils.addAll(charArray69, charArray75);
        char[] charArray77 = org.apache.commons.lang3.ArrayUtils.addAll(charArray21, charArray69);
        char[] charArray84 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int87 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray84, 'a', (int) (short) 10);
        int int89 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray84, ' ');
        char[] charArray91 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray84, ' ');
        int int94 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray91, 'u', (int) '4');
        char[] charArray96 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray91, 'u');
        char[] charArray97 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray91);
        char[] charArray98 = org.apache.commons.lang3.ArrayUtils.addAll(charArray69, charArray97);
        boolean boolean99 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray69);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[ ,  , 4,  , a, 4]");
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
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[ , a]");
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray76), " 4 a4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray76), " 4 a4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray76), "[ , 4,  , a, 4,  , a]");
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), " 4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), " 4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[ , 4,  , a, 4,  , 4,  , a, 4]");
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
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertNotNull(charArray96);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray96), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray96), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray96), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray97);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray97), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray97), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray97), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray98);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray98), " 4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray98), " 4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray98), "[ , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("{false,false,false,false,true}", 379, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxChine");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxChinexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxChinexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx{false,false,false,false,true}" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxChinexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxChinexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx{false,false,false,false,true}");
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        java.util.Locale locale1 = new java.util.Locale("Italian");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale1.getDisplayVariant(locale4);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayScript(locale11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("\u82f1\u8a9e\u30a2en_US             ", locale9);
        java.lang.String str15 = locale9.getCountry();
        java.lang.String str16 = locale4.getDisplayScript(locale9);
        java.lang.String str17 = locale9.getISO3Language();
        java.util.Locale locale18 = locale9.stripExtensions();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("RK_ok");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.upperCase("1.0-1.00.00.0", locale21);
        java.lang.String str23 = locale9.getDisplayScript(locale21);
        java.lang.String str25 = locale9.getExtension('a');
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian" + "'", str3, "italian");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Vereinigte Staaten von Amerika" + "'", str6, "Vereinigte Staaten von Amerika");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u8a9e\u30a2EN_US             " + "'", str14, "\u82f1\u8a9e\u30a2EN_US             ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FR" + "'", str15, "FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fra" + "'", str17, "fra");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1.0-1.00.00.0" + "'", str22, "1.0-1.00.00.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.util.Locale locale7 = locale1.stripExtensions();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("naliait", locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = java.util.Locale.US;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale13.getDisplayCountry(locale16);
        java.lang.String str19 = locale11.getDisplayScript(locale13);
        java.util.Locale locale20 = locale11.stripExtensions();
        java.lang.String str21 = locale7.getDisplayCountry(locale11);
        java.util.Locale locale22 = locale7.stripExtensions();
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = locale23.getDisplayCountry(locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Vereinigte Staaten von Amerika" + "'", str3, "Vereinigte Staaten von Amerika");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "naliait" + "'", str8, "naliait");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet12);
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "United States" + "'", str21, "United States");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("uudeuu", "                                                                                         ...lse,f", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("{1,0}", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("nglais (Etats-Unis)", "                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u65e5\u6587\u65e5\u672c)", "naliait");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
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
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.clone(intArray29);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray29);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray29);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 35, -1, 32, 0, 35, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 35, 0, 32, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 35, -1, 32, 0, 35, -1]");
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_CORE                             slafurturt", "en_GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\u610f\u5927\u5229");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = org.apache.commons.lang3.ArrayUtils.add(longArray0, 43, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 43, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(")enihC( sionihc", "Italian (Italy)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\u82f1\u8a9e\u30a2en_US             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("xxxxxxxxxx", 12, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADxxxxxxxxxx" + "'", str3, "ADxxxxxxxxxx");
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.util.Locale locale9 = new java.util.Locale("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", "coreano", "");
        java.util.Locale locale11 = new java.util.Locale("Italian");
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.lang.String str14 = locale9.getDisplayName(locale11);
        java.lang.String str15 = locale3.getDisplayName(locale11);
        java.lang.Object obj16 = locale11.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-US" + "'", str2, "en-US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str4, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Japanisch" + "'", str5, "Japanisch");
        org.junit.Assert.assertEquals(locale9.toString(), "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_COREANO");
        org.junit.Assert.assertEquals(locale11.toString(), "italian");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "italian" + "'", str13, "italian");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (COREANO)" + "'", str14, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (COREANO)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Japanese" + "'", str15, "Japanese");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "italian");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "italian");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "italian");
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
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
            java.util.Locale.Builder builder15 = builder3.addUnicodeLocaleAttribute("zH_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zH_CN [at index 0]");
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
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("\u6cd5\u6587                                                 ", locale3);
        java.lang.String str6 = locale3.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-US" + "'", str2, "en-US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u7f8e\u56fd" + "'", str4, "\u7f8e\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587                                                 " + "'", str5, "\u6cd5\u6587                                                 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.remove(longArray6, (int) (short) 0);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray11, (long) 401);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\u97e9\u56fd", (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "44444444444444444444444444france                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444france                " + "'", str1, "44444444444444444444444444france                ");
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-Uanglais(Etats-Unis)                                                                                                  EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-US", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("English", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        java.lang.Integer[] intArray9 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        java.lang.Integer[] intArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray9);
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category11, locale12);
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale.Category[] categoryArray16 = new java.util.Locale.Category[] { category11, category14 };
        java.util.Locale.Category[][] categoryArray17 = new java.util.Locale.Category[][] { categoryArray16 };
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category18, locale19);
        java.util.Locale.Category category21 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale22 = java.util.Locale.getDefault(category21);
        java.util.Locale.Category[] categoryArray23 = new java.util.Locale.Category[] { category18, category21 };
        java.util.Locale.Category[][] categoryArray24 = new java.util.Locale.Category[][] { categoryArray23 };
        java.util.Locale.Category category25 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category25, locale26);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.getDefault(category28);
        java.util.Locale.Category[] categoryArray30 = new java.util.Locale.Category[] { category25, category28 };
        java.util.Locale.Category[][] categoryArray31 = new java.util.Locale.Category[][] { categoryArray30 };
        java.util.Locale.Category[][][] categoryArray32 = new java.util.Locale.Category[][][] { categoryArray17, categoryArray24, categoryArray31 };
        java.util.Locale.Category category34 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category35 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category36 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category37 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category38 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category38, locale39);
        java.util.Locale.Category category41 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale42 = java.util.Locale.getDefault(category41);
        java.util.Locale.Category[] categoryArray43 = new java.util.Locale.Category[] { category34, category35, category36, category37, category38, category41 };
        java.util.Locale.Category category44 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category45 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category46 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category47 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category48 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category48, locale49);
        java.util.Locale.Category category51 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale52 = java.util.Locale.getDefault(category51);
        java.util.Locale.Category[] categoryArray53 = new java.util.Locale.Category[] { category44, category45, category46, category47, category48, category51 };
        java.util.Locale.Category[][] categoryArray54 = new java.util.Locale.Category[][] { categoryArray43, categoryArray53 };
        java.util.Locale.Category[][] categoryArray57 = org.apache.commons.lang3.ArrayUtils.subarray(categoryArray54, (int) '#', 35);
        java.util.Locale.Category[][][] categoryArray58 = org.apache.commons.lang3.ArrayUtils.add(categoryArray32, 0, categoryArray57);
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) intArray10, (java.lang.Object) categoryArray57, (int) (short) 0);
        java.util.Locale.Category category62 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale63 = java.util.Locale.getDefault(category62);
        java.util.Locale.Category category64 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category65 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category66 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale67 = java.util.Locale.getDefault(category66);
        java.util.Locale.Category category68 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale69 = java.util.Locale.getDefault(category68);
        java.util.Locale.Category category70 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale71 = java.util.Locale.getDefault(category70);
        java.util.Locale.Category[] categoryArray72 = new java.util.Locale.Category[] { category62, category64, category65, category66, category68, category70 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray73 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray72);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray74 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray72);
        java.lang.String[] strArray78 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u6cd510)32)10)5)1)5", "Chinese (China)", 28);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) categoryEnumArray74, (java.lang.Object[]) strArray78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum<java.util.Locale.Category>[][] categoryEnumArray80 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Enum<java.util.Locale.Category>[][]) categoryArray57, 95, categoryEnumArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 95, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray16);
        org.junit.Assert.assertNotNull(categoryArray17);
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.FORMAT + "'", category21.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray23);
        org.junit.Assert.assertNotNull(categoryArray24);
        org.junit.Assert.assertTrue("'" + category25 + "' != '" + java.util.Locale.Category.FORMAT + "'", category25.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category28 + "' != '" + java.util.Locale.Category.FORMAT + "'", category28.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray30);
        org.junit.Assert.assertNotNull(categoryArray31);
        org.junit.Assert.assertNotNull(categoryArray32);
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category34.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category35 + "' != '" + java.util.Locale.Category.FORMAT + "'", category35.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category36.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category37 + "' != '" + java.util.Locale.Category.FORMAT + "'", category37.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category38 + "' != '" + java.util.Locale.Category.FORMAT + "'", category38.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category41 + "' != '" + java.util.Locale.Category.FORMAT + "'", category41.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray43);
        org.junit.Assert.assertTrue("'" + category44 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category44.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category45 + "' != '" + java.util.Locale.Category.FORMAT + "'", category45.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category46.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category47 + "' != '" + java.util.Locale.Category.FORMAT + "'", category47.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category48 + "' != '" + java.util.Locale.Category.FORMAT + "'", category48.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category51 + "' != '" + java.util.Locale.Category.FORMAT + "'", category51.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray53);
        org.junit.Assert.assertNotNull(categoryArray54);
        org.junit.Assert.assertNotNull(categoryArray57);
        org.junit.Assert.assertNotNull(categoryArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + category62 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category62.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "it");
        org.junit.Assert.assertTrue("'" + category64 + "' != '" + java.util.Locale.Category.FORMAT + "'", category64.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category65 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category65.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category66 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category66.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale67);
// flaky:         org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertTrue("'" + category68 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category68.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "it");
        org.junit.Assert.assertTrue("'" + category70 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category70.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale71);
// flaky:         org.junit.Assert.assertEquals(locale71.toString(), "it");
        org.junit.Assert.assertNotNull(categoryArray72);
        org.junit.Assert.assertNotNull(categoryEnumArray73);
        org.junit.Assert.assertNotNull(categoryEnumArray74);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        short[] shortArray2 = new short[] { (short) 10, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 10, (byte) 10 };
        short[][] shortArray6 = new short[][] { shortArray2, shortArray5 };
        short[] shortArray9 = new short[] { (short) 10, (byte) 10 };
        short[] shortArray12 = new short[] { (short) 10, (byte) 10 };
        short[][] shortArray13 = new short[][] { shortArray9, shortArray12 };
        short[] shortArray16 = new short[] { (short) 10, (byte) 10 };
        short[] shortArray19 = new short[] { (short) 10, (byte) 10 };
        short[][] shortArray20 = new short[][] { shortArray16, shortArray19 };
        short[] shortArray23 = new short[] { (short) 10, (byte) 10 };
        short[] shortArray26 = new short[] { (short) 10, (byte) 10 };
        short[][] shortArray27 = new short[][] { shortArray23, shortArray26 };
        short[] shortArray30 = new short[] { (short) 10, (byte) 10 };
        short[] shortArray33 = new short[] { (short) 10, (byte) 10 };
        short[][] shortArray34 = new short[][] { shortArray30, shortArray33 };
        short[][][] shortArray35 = new short[][][] { shortArray6, shortArray13, shortArray20, shortArray27, shortArray34 };
        java.util.Locale.LanguageRange languageRange37 = new java.util.Locale.LanguageRange("T");
        java.lang.String str38 = languageRange37.getRange();
        java.lang.String str39 = languageRange37.getRange();
        java.lang.String str40 = languageRange37.getRange();
        short[][][] shortArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray35, (java.lang.Object) languageRange37);
        double double42 = languageRange37.getWeight();
        double double43 = languageRange37.getWeight();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[10, 10]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[10, 10]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[10, 10]");
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[10, 10]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "t" + "'", str38, "t");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "t" + "'", str39, "t");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "t" + "'", str40, "t");
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getScript();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale4.toLanguageTag();
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale4.getDisplayLanguage(locale8);
        java.lang.String str10 = locale3.getDisplayCountry(locale4);
        java.lang.String str11 = locale1.getDisplayCountry(locale4);
        java.util.Locale locale12 = locale4.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-US" + "'", str5, "en-US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-US" + "'", str6, "en-US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "South Korea" + "'", str11, "South Korea");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
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
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(byteArray19, (byte) 10);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(byteArray19, (byte) -1);
        java.lang.Double[] doubleArray38 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray38, (double) (short) 0);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray38, '#');
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) (byte) -1, (java.lang.Object) doubleArray38);
        java.lang.Double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray38);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str42, "100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 17, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 " + "'", str3, "                 ");
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("h{0,-1}{0,German (Germany)h{0,-1}{0,-", "truetruef4lse", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("         USA         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "USA" + "'", str1, "USA");
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
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
        long[] longArray26 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray26, 0L);
        java.lang.Long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toObject(longArray28);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) longArray29);
        int[] intArray34 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray34);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray34, (int) '4');
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.add(intArray37, 5);
        int[] intArray45 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray45, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray45);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray45);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.clone(intArray45);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.addAll(intArray37, intArray50);
        java.lang.Object obj52 = objMap15.replace((java.lang.Object) str30, (java.lang.Object) intArray50);
        java.util.Collection<java.lang.Object> objCollection53 = objMap15.values();
        java.util.Collection<java.lang.Object> objCollection54 = objMap15.values();
        double[] doubleArray59 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray59, (double) (byte) 10, 1.0d);
        int int64 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray59, 10.0d);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray59, (double) (short) 10);
        java.lang.Double[] doubleArray67 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray59);
        double[] doubleArray68 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray67);
        java.lang.Double[] doubleArray69 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray72 = new double[] { 4, 100L };
        double[] doubleArray75 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray72, (int) '4', 5);
        int int79 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray75, (double) 2, 0, (double) 100);
        int int81 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray69, (java.lang.Object) 100, (int) (short) 100);
        java.lang.Double[] doubleArray82 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray69);
        double[] doubleArray83 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray69);
        boolean boolean84 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray68, doubleArray83);
        boolean boolean85 = objMap15.remove((java.lang.Object) "        {fPfPfPfPNPJ   ", (java.lang.Object) boolean84);
        java.util.Set<java.lang.Object> objSet86 = objMap15.keySet();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet87 = objMap15.entrySet();
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
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "11003510" + "'", str30, "11003510");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, 35, 0, 5]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 35, 0, 10, 32, 10, 5, 1]");
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objCollection53);
        org.junit.Assert.assertNotNull(objCollection54);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objSet86);
        org.junit.Assert.assertNotNull(objEntrySet87);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
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
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray28, 'a');
        char[] charArray38 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray38, 'a', (int) (short) 10);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray38, ' ');
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray38, ' ');
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray45);
        char[] charArray48 = org.apache.commons.lang3.ArrayUtils.add(charArray45, ' ');
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.addAll(charArray28, charArray48);
        char[] charArray51 = org.apache.commons.lang3.ArrayUtils.remove(charArray28, 5);
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.subarray(charArray28, 250, (int) (short) 0);
        int int55 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray28);
        char[] charArray56 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray28);
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
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), " 4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), " 4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[ , 4,  , a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), " 4 a4a 4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), " 4 a4a 4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[ , 4,  , a, 4, a,  , 4,  , a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[]");
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[ , 4,  , a, 4, a]");
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "N");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder3.clearExtensions();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder11 = builder9.clear();
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder13.clear();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = builder15.build();
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.util.Set<java.lang.String> strSet19 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder20 = builder8.setLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, '4');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_COREANO", "French (France)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("{10}", "\u56fd\u7f8e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{10}" + "'", str2, "{10}");
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("ed", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ????? (????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray6, (java.lang.Object) builder10, 4);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray22 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray22, 'a', (int) (short) 10);
        char[] charArray32 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray32, 'a', (int) (short) 10);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray32, ' ');
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray32, ' ');
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray39);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.addAll(charArray22, charArray39);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.clone(charArray41);
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.subarray(charArray41, 2, 35);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) charArray15, (java.lang.Object) charArray45);
        char[] charArray47 = null;
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray45, charArray47);
        boolean boolean49 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  {false,false,false,false,true}  ", charArray47);
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
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[u,  , u, u, u]");
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
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxitalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "truefalsefalsefalsefalsetruetruefalse");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
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
        java.lang.Class<?>[][] wildcardClassArray32 = org.apache.commons.lang3.ArrayUtils.clone(wildcardClassArray31);
        char[] charArray39 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray39, 'a', (int) (short) 10);
        char[] charArray49 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray49, 'a', (int) (short) 10);
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray49, ' ');
        char[] charArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray49, ' ');
        char[] charArray57 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray56);
        char[] charArray58 = org.apache.commons.lang3.ArrayUtils.addAll(charArray39, charArray56);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.contains(charArray39, '4');
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) wildcardClassArray32, (java.lang.Object) charArray39);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray39, ' ');
        int int65 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray39, ' ');
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray39, '4', 743);
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
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 5 + "'", int68 == 5);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u7f8e\u56fd", "truetruefalse", (int) (short) 1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", 213);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE", strArray4, strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "ja                                        ");
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE" + "'", str9, "TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        float[] floatArray3 = new float[] { 100, (byte) -1, (-1) };
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray4, "USA", 9, 0);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray4);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 'x');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.add(floatArray13, 756, (float) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 756, Length: 4");
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
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (short) 0);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray3, (java.lang.Object) doubleArray13, 4);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray17, false);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray17);
        double[] doubleArray23 = new double[] { 'x', 0.0f };
        double[] doubleArray26 = new double[] { 'x', 0.0f };
        double[][] doubleArray27 = new double[][] { doubleArray23, doubleArray26 };
        boolean[] booleanArray33 = new boolean[] { false, false, false, false, true };
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray33);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray33, (int) (byte) -1, (int) '#');
        java.lang.String str38 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray33);
        boolean[] booleanArray44 = new boolean[] { false, false, false, false, true };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray44);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray44, true);
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.add(booleanArray44, (int) (short) 0, false);
        boolean[] booleanArray51 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray33, booleanArray44);
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray33, true);
        boolean[] booleanArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray33);
        java.lang.Boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray33);
        double[][] doubleArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray27, (java.lang.Object) booleanArray55);
        java.lang.Short[] shortArray58 = new java.lang.Short[] { (short) 0 };
        short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray58, (short) (byte) 1);
        int int62 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray58, (java.lang.Object) (byte) 10);
        java.lang.Short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray58);
        java.lang.Boolean[] booleanArray67 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray68 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray67);
        java.lang.Boolean[] booleanArray69 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray68);
        int int71 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray63, (java.lang.Object) booleanArray68, (int) (byte) 1);
        boolean[] booleanArray72 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray68);
        boolean[] booleanArray73 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray72);
        double[][] doubleArray74 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray27, (java.lang.Object) booleanArray73);
        boolean[] booleanArray76 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray73, true);
        boolean[] booleanArray77 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray17, booleanArray73);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, false]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[120.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[120.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{false,false,false,false,true}" + "'", str38, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertNotNull(booleanArray68);
        org.junit.Assert.assertNotNull(booleanArray69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(booleanArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray72), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray73), "[true, true, false]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertNotNull(booleanArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray76), "[true, false]");
        org.junit.Assert.assertNotNull(booleanArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray77), "[true, true, false, true, true, false]");
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
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
            java.util.Locale.Builder builder9 = builder4.setRegion(" sTATES");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:  sTATES [at index 0]");
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
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 1L, 3);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray6, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
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
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.clone(longArray46);
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray49, (long) (short) 0, 333);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray54 = org.apache.commons.lang3.ArrayUtils.remove(longArray49, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Length: 0");
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
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
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
        objMap15.clear();
        java.util.Locale locale90 = new java.util.Locale("                                                ENG                                                 ");
        java.lang.Object obj91 = null;
        java.lang.Object obj92 = objMap15.replace((java.lang.Object) locale90, obj91);
        java.util.Set<java.lang.Object> objSet93 = objMap15.keySet();
        java.util.Set<java.lang.Object> objSet94 = objMap15.keySet();
        boolean boolean95 = objMap15.isEmpty();
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
        org.junit.Assert.assertEquals(locale90.toString(), "                                                eng                                                 ");
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(objSet93);
        org.junit.Assert.assertNotNull(objSet94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\u82f1\u8a9e\u30a2en_US", (int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2en_US                                            " + "'", str2, "\u82f1\u8a9e\u30a2en_US                                            ");
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "-.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-." + "'", str1, "-.");
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\u4e2d\u6587\u53f0\u7063)it_it");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_US");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category3, locale4);
        java.lang.String str7 = locale4.getExtension('a');
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale10.getUnicodeLocaleType("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?? (???????)?? (?????? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (short) 100, 2);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, false, 42);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray15);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.Class<?> wildcardClass21 = booleanArray20.getClass();
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
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{  ", 34, "{false,false,false,false,tra");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{  " + "'", str3, "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{  ");
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("italiano", "FR", 2, (int) 'u');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "itFR" + "'", str4, "itFR");
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                true{false,f", "{false,false,false,false,tru        {{false,false,false,false,true}PfPfPfPNPJ           {{false,false,false,false,true}PfPfPfPNPJ  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("KOR       ", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_CORE                             slafurturt");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "#tts-UnisEtats-UnisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuEtats-Unisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (java.lang.CharSequence) "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "#tts-UnisEtats-UnisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuEtats-Unisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", charSequence2, "#tts-UnisEtats-UnisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuEtats-Unisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        java.util.Locale locale1 = new java.util.Locale("\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2                    ");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2                    ");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2                    ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2                    ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2                    ");
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.lang.String str7 = locale0.getDisplayCountry(locale1);
        java.lang.Object obj8 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-US" + "'", str2, "en-US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-US" + "'", str3, "en-US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "en_US");
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
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
        short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray58, 8, 23);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.contains(shortArray62, (short) 100);
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
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) (short) 100);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray11);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.clone(intArray11);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.clone(intArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray14);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("     zH_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     zh_cn" + "'", str1, "     zh_cn");
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("-1", "Japanisch (Japan)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("true{false,ftruetruetruetruetrue", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)1 1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\u7f8e\u56fd", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u7f8e\u56fd" + "'", str2, "\u7f8e\u56fd");
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                           etruefalse                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                           etruefalse                                          " + "'", str1, "                                           etruefalse                                          ");
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444444444444444444444ITALIEN (ITALIE)444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444ITALIEN (ITALIE)444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444ITALIEN (ITALIE)444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444", "english");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) -1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA", "KR");
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) intArray0, (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) -1);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\uc77c\ubcf8\uc5b4false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal", 35, "zh-cn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc77c\ubcf8\uc5b4false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal" + "'", str3, "\uc77c\ubcf8\uc5b4false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("se,false,false,tru{false,false,false,false", 31, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "se,false,false,tru{false,false,false,false" + "'", str3, "se,false,false,tru{false,false,false,false");
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("rt,esluf,esluf,esluf,esluf{                                                                         ", (int) '#', 87);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...sluf,esluf{                                                                         " + "'", str3, "...sluf,esluf{                                                                         ");
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("10321051", 213);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                             10321051" + "'", str2, "                                                                                                                                                                                                             10321051");
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
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
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.remove(shortArray9, 0);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray9, (short) 1);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray9);
        java.lang.Short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray9);
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
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(shortArray48);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray6);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray6, 1, (long) 100);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (long) (byte) -1);
        java.lang.Long[] longArray15 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray15, ' ');
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray15);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray18, (long) 9, (int) (byte) 100);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[1, 100, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 100 35 10" + "'", str17, "1 100 35 10");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = org.apache.commons.lang3.ArrayUtils.remove(charArray3, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 69, Length: 2");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("T", 117);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0_{false,false,false,false,tru_TRUETRUEFALSE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
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
            java.util.Locale.Builder builder38 = builder34.setVariant("                                                                       aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                                                                        aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                     [at index 0]");
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
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("nglais (Etats-Unis)}", "aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
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
        java.lang.Short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray15);
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
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.add(byteArray38, (byte) 100);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray38, 107, (int) (short) 1);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray16, (java.lang.Object) (short) 1);
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
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 0, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = builder1.build();
        java.lang.String str4 = locale0.getDisplayLanguage(locale3);
        java.lang.String str5 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) 'a');
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray3, 13);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray3, 95);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray7, 23);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray9, (int) (short) 1, 9);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 13]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 95]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 95, 23]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("nnnnnnnnnnnnnnnnnnnnnnnnnnnnn", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
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
        boolean[] booleanArray26 = new boolean[] { false, false, false, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray26);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray26, (int) (byte) -1, (int) '#');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray26);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray26);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray26, (int) (short) 0, (int) (short) -1);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray35, (int) (byte) 0, 13);
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray15, booleanArray35);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray15);
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
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[]");
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[]");
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[]");
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[]");
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
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
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.add(booleanArray8, false);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray8);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray27, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 17, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, false]");
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
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
        java.lang.Object obj19 = locale3.clone();
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "zh_CN");
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 10L);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray4, 117);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 117, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Taiwan", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, (int) '4', (int) ' ');
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray3, 0.0f);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) 766);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, 1, 19);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[766.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 10.0f, (double) (-1));
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 21, 250);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 98, 28);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray3);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray9, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray11, 'x');
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
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , a,  ]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , a,  ]");
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
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
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray0);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
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
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, 5, 29);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray26, (float) 98, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[1.0, -1.0, 13.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
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
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray2);
        byte[] byteArray26 = null;
        byte[] byteArray28 = new byte[] { (byte) 100 };
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray28, byteArray29);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray26, byteArray28);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray28);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray39, (byte) 10, (int) '#');
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.add(byteArray45, (byte) -1);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray39, byteArray45);
        byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray45);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray45, (byte) 100);
        byte[] byteArray52 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray2, byteArray45);
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray52, (byte) -1);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray52, (byte) 1, 87);
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray52, (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray52);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[100]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, false);
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
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false, false, true]");
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        java.lang.Character[] charArray2 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[] charArray11 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[] charArray14 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[] charArray17 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[][] charArray18 = new java.lang.Character[][] { charArray2, charArray5, charArray8, charArray11, charArray14, charArray17 };
        java.lang.Character[][] charArray19 = org.apache.commons.lang3.ArrayUtils.clone(charArray18);
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("France");
        java.lang.String str22 = languageRange21.getRange();
        java.lang.String str23 = languageRange21.getRange();
        java.lang.String str24 = languageRange21.getRange();
        java.lang.String str25 = languageRange21.getRange();
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray19, (java.lang.Object) languageRange21);
        java.lang.String str27 = languageRange21.getRange();
        java.lang.String str28 = languageRange21.getRange();
        java.lang.Float[] floatArray33 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray33, (float) 0L);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.add(floatArray35, (float) 0L);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.add(floatArray37, 5, (float) 4);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray40);
        boolean boolean42 = languageRange21.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "france" + "'", str22, "france");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "france" + "'", str23, "france");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "france" + "'", str24, "france");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "france" + "'", str25, "france");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "france" + "'", str27, "france");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "france" + "'", str28, "france");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[1.0, -1.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[1.0, -1.0, 0.0, 0.0, 0.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("_ng_ng_ng_ng", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_ng_ng_ng_ng" + "'", str2, "_ng_ng_ng_ng");
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\u6cd510)32)10)5)1)5", "4hi!4en-us4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("English", "nglais (Etats-Unis)");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("11003510", strArray3);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap6 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, 'h', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[h]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[h]");
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                           CHINOIS", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           CHINOIS" + "'", str2, "                           CHINOIS");
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "fran\347ais");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (short) 0);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray3, (java.lang.Object) doubleArray13, 4);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, false);
        boolean[] booleanArray19 = null;
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray18, booleanArray19);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray19, true);
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
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, false]");
        org.junit.Assert.assertNull(booleanArray22);
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        java.util.Locale locale1 = new java.util.Locale("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("-1.01.0-1.01.0", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                           " + "'", str2, "                                                                                                           ");
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("falsefalsefalsefalsefalsefaaaaaDEaaaaaa", "eNG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "falsefalsefalsefalsefalsefaaaaaDEaaaaaa" + "'", str2, "falsefalsefalsefalsefalsefaaaaaDEaaaaaa");
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale0.getDisplayScript(locale2);
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.lang.String str6 = locale0.getDisplayVariant();
        java.lang.String str7 = locale0.getDisplayScript();
        java.lang.Object obj8 = null;
        boolean boolean9 = locale0.equals(obj8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-US" + "'", str3, "en-US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italiano" + "'", str5, "italiano");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("French (France)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French(France)" + "'", str1, "French(France)");
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
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
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray44, 'a', (int) (short) 100);
        char[] charArray54 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray54, 'a', (int) (short) 10);
        int int59 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray54, ' ');
        char[] charArray61 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray54, ' ');
        char[] charArray62 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray61);
        char[] charArray64 = org.apache.commons.lang3.ArrayUtils.add(charArray61, ' ');
        java.lang.Character[] charArray70 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray71 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray70);
        java.util.Locale.Builder builder72 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder73 = builder72.clearExtensions();
        java.util.Locale.Builder builder74 = builder72.clearExtensions();
        int int76 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray70, (java.lang.Object) builder74, 4);
        char[] charArray78 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray70, 'a');
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray64, charArray78);
        boolean boolean80 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray44, charArray78);
        int int82 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray78, 'a');
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 4 + "'", int57 == 4);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), " 4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), " 4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[ , 4,  , a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[u,  , u, u, u]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) -1);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 213);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) intArray3, 'a', 39, 213);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\u30d5\u30e9\u30f3\u30b9\u8a9e", 17, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("German (Germany", 743, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGerman (Germanyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGerman (Germanyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=anglais(etats-unis)anglais(etats-unis)anglais(etats-unis)anglais(etats-unis)anglais(etats-unis)anglais(etats-unis)anglais(etats-unis)anglais(etats-unis)anglais(etats-unis)anglais(etats-unis)anglais(etats-unis)anglais(etats-unis)anglais(e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray7);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, false]");
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        java.lang.Object[] objArray0 = null;
        int[] intArray4 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, (int) (byte) 0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray4, (int) 'a');
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.add(intArray4, (int) (byte) -1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(intArray4, 10);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray0, (java.lang.Object) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0, 97]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-", 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-" + "'", str2, "9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-");
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("{false,false,false,false,tru        {{false,false,false,false,true}PfPfPfPNPJ           {{false,false,false,false,true}PfPfPfPNPJ  ", "ja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_j", 7);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        java.util.Locale locale1 = new java.util.Locale("Italian");
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italian" + "'", str2, "italian");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian" + "'", str3, "italian");
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "h{0,-1}{0,German (Germany)h{0,-1}{0,-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h{0,-1}{0,German (Germany)h{0,-1}{0,-" + "'", str1, "h{0,-1}{0,German (Germany)h{0,-1}{0,-");
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hsilgnE                                   ", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0a-1", "                                        aj");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0a-1" + "'", str2, "0a-1");
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 379, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 10.0f };
        java.lang.Float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray1, (float) 2);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, 10.0f);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-CN");
        java.lang.String str2 = languageRange1.getRange();
        double[] doubleArray6 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray6, (double) (short) -1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) (byte) 10);
        boolean boolean12 = languageRange1.equals((java.lang.Object) int11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-cn" + "'", str2, "zh-cn");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale.Builder builder11 = builder8.setLocale(locale10);
        java.lang.String str12 = locale1.getDisplayScript(locale10);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder15 = builder13.clearExtensions();
        java.util.Locale.Builder builder16 = builder13.clear();
        java.util.Locale.Builder builder17 = builder13.clear();
        java.util.Locale.Builder builder18 = builder13.clear();
        java.util.Locale locale19 = builder13.build();
        java.lang.String str20 = locale19.getDisplayName();
        java.lang.String str21 = locale19.getDisplayLanguage();
        java.lang.String str22 = locale1.getDisplayName(locale19);
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "English (United States)" + "'", str22, "English (United States)");
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        java.lang.Byte[][] byteArray5 = new java.lang.Byte[][] { byteArray4 };
        java.lang.Byte[][][] byteArray6 = new java.lang.Byte[][][] { byteArray5 };
        java.lang.Byte[] byteArray8 = new java.lang.Byte[] { (byte) 100 };
        java.lang.Byte[] byteArray10 = new java.lang.Byte[] { (byte) 100 };
        java.lang.Byte[] byteArray12 = new java.lang.Byte[] { (byte) 100 };
        java.lang.Byte[] byteArray14 = new java.lang.Byte[] { (byte) 100 };
        java.lang.Byte[] byteArray16 = new java.lang.Byte[] { (byte) 100 };
        java.lang.Byte[][] byteArray17 = new java.lang.Byte[][] { byteArray8, byteArray10, byteArray12, byteArray14, byteArray16 };
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) 10, (int) '#');
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.add(byteArray30, (byte) -1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray24, byteArray30);
        java.lang.Byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray30);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray34, (java.lang.Object) 4, 4);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray34);
        java.lang.Byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray34);
        java.lang.Byte[][] byteArray40 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, byteArray34);
        java.lang.Object[] objArray41 = null;
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray40, objArray41);
        java.lang.Byte[][][] byteArray43 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, byteArray40);
        java.lang.Byte[][][] byteArray44 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray6);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray14);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertNotNull(byteArray44);
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("  {false,false,false,false,true}   ");
        java.lang.String str2 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf", "                                   English");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("-.", "truetruefalse", "inglese");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder0.build();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale6.getDisplayLanguage();
        java.util.Locale locale9 = locale6.stripExtensions();
        java.util.Set<java.lang.Character> charSet10 = locale6.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        boolean[] booleanArray0 = null;
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray12, (double) (short) 0);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray14);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) doubleArray14, 4);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        boolean[] booleanArray25 = new boolean[] { false, false, false, false, true };
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray25);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray25, (int) (byte) -1, (int) '#');
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray25);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray25);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray25);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray32, (int) (short) 100, 2);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray35, true, (int) ' ');
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray35);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray19, true);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray41);
        boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, true);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, false]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[true, false]");
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[true]");
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
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
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, 2, (byte) -1);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray12, (byte) 0);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale2 = new java.util.Locale("Italian");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.lang.String str5 = locale2.getDisplayCountry();
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale9.getISO3Language();
        java.lang.String str11 = locale9.getDisplayScript();
        java.lang.String str12 = locale7.getDisplayCountry(locale9);
        java.lang.String str13 = locale2.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet14 = locale2.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italian" + "'", str4, "italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "eng" + "'", str10, "eng");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("100.010.", 3, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.010." + "'", str3, "100.010.");
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("}eurt,esla", " ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("etruefalse", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("etruefalse                                                                                          ", "         ", (int) (short) 10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray11, 69);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}eurt,esla" + "'", str6, "}eurt,esla");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}eurt,esla" + "'", str7, "}eurt,esla");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("china");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        boolean boolean7 = languageRange1.equals((java.lang.Object) builder6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "china" + "'", str3, "china");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("(Chine) chinois", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(Chine) chinois" + "'", str2, "(Chine) chinois");
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        long[] longArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "10.0100.01.0100.00.0", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        java.util.Locale locale3 = new java.util.Locale("tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse", "9)enihC( sionihc-", "1.0-1.00.00.0");
        org.junit.Assert.assertEquals(locale3.toString(), "tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse_9)ENIHC( SIONIHC-_1.0-1.00.00.0");
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ok" + "'", str1, "ok");
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "k", "tedesco (Germania");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        boolean[] booleanArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray6, (float) 0L);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray8, (float) 250, (int) (byte) -1);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 100, 97);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.remove(floatArray8, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 25, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[1.0, -1.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u7f8e\u56fd", (int) (short) 0, "t");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u7f8e\u56fd" + "'", str3, "\u7f8e\u56fd");
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, 2);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, (int) 'x');
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.clone(intArray10);
        java.util.Locale.Category category14 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale.Category category16 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category17 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category18 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale19 = java.util.Locale.getDefault(category18);
        java.util.Locale.Category category20 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale21 = java.util.Locale.getDefault(category20);
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.util.Locale.Category[] categoryArray24 = new java.util.Locale.Category[] { category14, category16, category17, category18, category20, category22 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray25 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray24);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray28 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray25, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap29 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray28);
        int int30 = objMap29.size();
        java.util.Locale locale31 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet32, ' ');
        java.lang.Object obj35 = objMap29.get((java.lang.Object) strSet32);
        long[] longArray40 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray40, 0L);
        java.lang.Long[] longArray43 = org.apache.commons.lang3.ArrayUtils.toObject(longArray42);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) longArray43);
        int[] intArray48 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray48);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray48, (int) '4');
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.add(intArray51, 5);
        int[] intArray59 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray59, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray59);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray59);
        int[] intArray64 = org.apache.commons.lang3.ArrayUtils.clone(intArray59);
        int[] intArray65 = org.apache.commons.lang3.ArrayUtils.addAll(intArray51, intArray64);
        java.lang.Object obj66 = objMap29.replace((java.lang.Object) str44, (java.lang.Object) intArray64);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray64);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray64);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray64);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category14.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.FORMAT + "'", category16.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category17.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category18.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(categoryArray24);
        org.junit.Assert.assertNotNull(categoryEnumArray25);
        org.junit.Assert.assertNotNull(categoryEnumArray28);
        org.junit.Assert.assertNotNull(objMap29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "11003510" + "'", str44, "11003510");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, 35, 0, 5]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 35, 0, 10, 32, 10, 5, 1]");
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("     zh_cn", "china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    ", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55555z1_10" + "'", str3, "55555z1_10");
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) (byte) 10);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray7, (double) 95);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[95.0]");
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("{fulse,fulse,fulse,fulse,tru");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("1 100 35 10aaaaaaaaaaaaaaaaaaaaa", "  {FALSE,FALSE,FALSE,FALSE,TRUE}  ");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("tr#tr#fals                                    ", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("\uc77c\ubcf8\uc5b4", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
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
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.contains(longArray12, (long) 39);
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) (short) 0);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray9);
        java.lang.Boolean[] booleanArray14 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        java.lang.Double[] doubleArray22 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray22, (double) (short) 0);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray24);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray14, (java.lang.Object) doubleArray24, 4);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray24);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.add(doubleArray24, (double) (byte) 100);
        java.lang.Double[] doubleArray33 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray33, (double) (byte) -1);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray33);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray36, (int) (short) 1);
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray30, doubleArray36);
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.add(doubleArray36, (double) 6);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray41, (double) 9, (double) (byte) 100);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray41);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0, 100.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 1.0, 6.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "\u97e9\u56fd                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
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
        java.util.Locale locale76 = java.util.Locale.KOREA;
        java.lang.String str77 = locale76.getVariant();
        boolean boolean78 = objMap15.containsValue((java.lang.Object) locale76);
        java.util.Set<java.lang.Object> objSet79 = objMap15.keySet();
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
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objSet79);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray3 = new double[] { 4, 100L };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray3, (int) '4', 5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 2, 0, (double) 100);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray0, (java.lang.Object) 100, (int) (short) 100);
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 23);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray16, (double) 42, (double) (byte) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray16, (double) 'a', 1, (double) 743);
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
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("corean", "444444COREANO", "10321051");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "corean" + "'", str3, "corean");
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("{fulse,fulse,fulse,fulse,tru", "ja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_J");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("truefalsefalsefalsefalsetruetruefalse", "hsilgnE                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale0.getDisplayScript(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.lang.String str7 = locale2.getDisplayCountry(locale6);
        java.util.Locale.setDefault(locale2);
        java.util.Set<java.lang.String> strSet9 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = java.util.Locale.US;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale13.getDisplayCountry(locale16);
        java.lang.String str19 = locale11.getDisplayScript(locale13);
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Set<java.lang.Character> charSet22 = locale21.getExtensionKeys();
        java.util.Locale locale23 = java.util.Locale.US;
        java.lang.String str24 = locale23.toLanguageTag();
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Set<java.lang.Character> charSet27 = locale26.getExtensionKeys();
        java.lang.String str28 = locale23.getDisplayCountry(locale26);
        java.lang.String str29 = locale21.getDisplayScript(locale23);
        java.util.Locale locale30 = locale23.stripExtensions();
        java.lang.String str31 = locale23.getScript();
        java.lang.String str32 = locale11.getDisplayName(locale23);
        java.lang.String str33 = locale2.getDisplayCountry(locale23);
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder34.clear();
        java.util.Locale locale36 = builder34.build();
        java.lang.String str37 = locale36.getDisplayCountry();
        java.lang.String str38 = locale36.getLanguage();
        java.lang.String str39 = locale36.getScript();
        java.lang.String str40 = locale2.getDisplayName(locale36);
        java.lang.String str41 = locale2.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-US" + "'", str3, "en-US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "United States" + "'", str7, "United States");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet12);
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-US" + "'", str24, "en-US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "United States" + "'", str28, "United States");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "English (United States)" + "'", str32, "English (United States)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "United States" + "'", str33, "United States");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "English (United States)" + "'", str40, "English (United States)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}" + "'", str2, "france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}");
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano", "ja_JP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano" + "'", str2, "italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano");
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray6, (java.lang.Object) builder10, 4);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("US", charArray14);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray14);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray16);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray16, "TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE", 16, 12);
        java.lang.Character[] charArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray16);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray22, 'a');
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[u,  , u, u, u]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[u,  , u, u, u]");
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        long[] longArray0 = new long[] {};
        long[] longArray5 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray7, (long) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray7);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, (long) 10, (int) (short) 1);
        java.lang.Long[] longArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray14);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray15);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray15, (long) 2);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray15, (long) (short) 0);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.clone(longArray20);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray21, (long) 48);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray7, longArray21);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(longArray21, (long) 98);
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
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) 17);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (int) (short) -1, (float) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[17.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[17.0, 0.0]");
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Etts-Unis", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", 15);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
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
            java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("trutrufals");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: trutrufals [at index 0]");
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
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u610f\u5927\u5229\u6587\u610f\u5927\u5229", "US                                                                                                  ", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(" 4hi!4en-us4 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
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
            int[] intArray30 = org.apache.commons.lang3.ArrayUtils.remove(intArray13, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 3");
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
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        java.util.Locale locale2 = new java.util.Locale("", "{false,false,false,false,true}");
        java.lang.String str3 = locale2.getISO3Language();
        java.lang.String str4 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "_{FALSE,FALSE,FALSE,FALSE,TRUE}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{FALSE,FALSE,FALSE,FALSE,TRUE}" + "'", str4, "{FALSE,FALSE,FALSE,FALSE,TRUE}");
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf", (int) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf" + "'", str3, "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf");
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587katlatmatnatoatrattatvatwatzauaaugaumausauyauzavaavcaveavgaviavnavuawfawsayeaytazaazmazw", "italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("101035-135-197United States1Uni", "{false,false,false,false,true");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "101035-135-197United States1Uni" + "'", str2, "101035-135-197United States1Uni");
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(strArray0);
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        java.lang.Short[] shortArray9 = new java.lang.Short[] { (short) 0 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray9, (short) (byte) 1);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray11);
        java.lang.Short[] shortArray14 = new java.lang.Short[] { (short) 0 };
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14, (short) (byte) 1);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray20 = new java.lang.Short[] { (short) 0 };
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray20, (short) (byte) 1);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray16, shortArray22);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray11, shortArray23);
        java.lang.Short[] shortArray26 = new java.lang.Short[] { (short) 0 };
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray26, (short) (byte) 1);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray28);
        java.lang.Short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray28);
        java.lang.Short[] shortArray32 = new java.lang.Short[] { (short) 0 };
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray32, (short) (byte) 1);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray28, shortArray34);
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.add(shortArray28, (short) (byte) -1);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray37, (short) (byte) 100);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray39, (short) 10);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray11, shortArray39);
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray0, (java.lang.Object) shortArray11, (int) (byte) 100);
        double[] doubleArray48 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray48, (double) (short) -1);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray48);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray48, (double) 0);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray48);
        java.lang.String[][][] strArray55 = org.apache.commons.lang3.ArrayUtils.removeElement(strArray0, (java.lang.Object) doubleArray48);
        double[] doubleArray56 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray48);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
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
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 100.0, 0.0]");
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("EN(US", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("{false,false,false,false,true}", 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("{FPFPFPFPNPJ", "444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{FPFPFPFPNPJ" + "'", str2, "{FPFPFPFPNPJ");
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("english", "", "", (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "english" + "'", str4, "english");
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) 100, (double) (byte) 1);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (short) 1, (int) (short) 100, 1.0d);
        double[] doubleArray17 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray17, (double) (short) -1);
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray17);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray20, (double) (byte) 100, (double) (-1.0f));
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray20);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray20);
        java.lang.Double[] doubleArray32 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray32, (double) (short) 0);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray32, '#');
        java.lang.Double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray32);
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray37, (double) (byte) 100);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray25, doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0, 10.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str36, "100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
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
        java.util.Locale locale14 = locale10.stripExtensions();
        java.lang.Object obj15 = locale14.clone();
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "en_US");
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("u uuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u uuu" + "'", str1, "u uuu");
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
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
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray27, true, 0);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray27, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.add(booleanArray27, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 5");
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
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u82f1\u6587\u7f8e\u56fd)", "en(us", 7);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        java.lang.Long[] longArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        java.lang.Long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, (long) (byte) -1);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray4, (long) 37);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zho", 0.0d);
        char[] charArray9 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, 'a', (int) (short) 10);
        char[] charArray19 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray19, 'a', (int) (short) 10);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray19, ' ');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, ' ');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray26);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.addAll(charArray9, charArray26);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.add(charArray26, 'a');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray26);
        boolean boolean32 = languageRange2.equals((java.lang.Object) charArray26);
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
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , a, 4, a]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 100, (-1));
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray4, (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (int) '4', (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray6, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, 5, (float) 4);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray11);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray11);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[1.0, -1.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[1.0, -1.0, 0.0, 0.0, 0.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u5fb7\u56fd", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("eng", "{false,false,false,false,tru", 2);
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) (byte) 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray5, (java.lang.Object) (byte) 10);
        java.lang.Short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) shortArray10);
        java.lang.Short[] shortArray13 = new java.lang.Short[] { (short) 0 };
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13, (short) (byte) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray15);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray15);
        java.lang.Short[] shortArray19 = new java.lang.Short[] { (short) 0 };
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) (byte) 1);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray15, shortArray21);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.add(shortArray15, (short) (byte) -1);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray24, (short) (byte) 100);
        java.lang.Short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray24);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray27, 'a');
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) shortArray10, (java.lang.Object) shortArray27);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
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
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0a-1" + "'", str29, "0a-1");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("zh-cnaaaaaaaaaaaaaa", "\u5229\u5927\u610f\u6587\u5229\u5927\u610f");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
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
        java.lang.Short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray18);
        java.lang.Short[] shortArray26 = new java.lang.Short[] {};
        java.lang.Short[] shortArray27 = new java.lang.Short[] {};
        java.lang.Short[] shortArray28 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray29 = new java.lang.Short[][] { shortArray26, shortArray27, shortArray28 };
        java.lang.Short[][] shortArray30 = org.apache.commons.lang3.ArrayUtils.clone(shortArray29);
        java.lang.Short[] shortArray32 = new java.lang.Short[] { (short) 0 };
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray32, (short) (byte) 1);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray32, (java.lang.Object) (byte) 10);
        java.lang.Short[][] shortArray37 = org.apache.commons.lang3.ArrayUtils.add(shortArray29, shortArray32);
        java.lang.Short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray32);
        java.lang.Short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray32);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray32);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray40);
        java.lang.Short[] shortArray43 = new java.lang.Short[] { (short) 0 };
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray43, (short) (byte) 1);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray45);
        java.lang.Short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray45);
        java.lang.Short[] shortArray49 = new java.lang.Short[] { (short) 0 };
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray49, (short) (byte) 1);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray45, shortArray51);
        java.lang.Short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray52);
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray52, (short) 0, 35);
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray40, shortArray52);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray18, shortArray57);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray58);
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
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[0]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[0, -1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                  ", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  " + "'", str2, "                                                                                                  ");
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
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
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray44);
        char[] charArray53 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray53, 'a', (int) (short) 10);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray53, ' ');
        char[] charArray60 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray53, ' ');
        char[] charArray61 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray60);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray60);
        boolean boolean63 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray60);
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray60, '#', (int) (short) -1);
        char[] charArray69 = org.apache.commons.lang3.ArrayUtils.add(charArray60, 2, 'u');
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray45, charArray60);
        char[] charArray72 = org.apache.commons.lang3.ArrayUtils.remove(charArray60, 2);
        char[] charArray80 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int83 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray80, 'a', (int) (short) 10);
        int int85 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray80, ' ');
        char[] charArray87 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray80, ' ');
        int int88 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aitalianaa", charArray80);
        char[] charArray91 = org.apache.commons.lang3.ArrayUtils.subarray(charArray80, 4, 0);
        boolean boolean92 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray72, charArray91);
        char[] charArray94 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray72, ' ');
        int int95 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Japanisch", charArray72);
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
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[]");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 4 + "'", int56 == 4);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[4, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "4au 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "4au 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[4, a, u,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "4a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "4a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[4, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 4 + "'", int83 == 4);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray91), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray91), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray91), "[]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(charArray94);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray94), "4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray94), "4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray94), "[4, a, 4]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray2, ' ');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "       ...", charArray4);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Unitedetruefxlse etruefxlseStxtes", "_{FALSE,FALSE,FALSE,FALSE,TRUE}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Unitedetruefxlse etruefxlseStxtes" + "'", str2, "Unitedetruefxlse etruefxlseStxtes");
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
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
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray47 = org.apache.commons.lang3.ArrayUtils.add(charArray43, (int) ' ', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
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
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse" + "'", str1, "true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        float[] floatArray0 = null;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.remove(floatArray1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("en-US", locale3);
        java.lang.String str6 = locale3.getDisplayCountry();
        java.lang.String str7 = locale3.getScript();
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
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("T");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t" + "'", str2, "t");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "t" + "'", str3, "t");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "t" + "'", str4, "t");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        char[] charArray16 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray16, 'a', (int) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray23);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.clone(charArray25);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.subarray(charArray26, 10, (int) (short) 100);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray29);
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
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
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
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray39, (short) -1);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray39);
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
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0]");
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("giapponese (Giappone)");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("italien (Italie)hi!italien (Italie)en-USitalien (Italie)", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        java.util.Locale locale3 = new java.util.Locale("Etats-Unis", "  en-US   ", "  {FALSE,FALSE,FALSE,FALSE,TRUE}                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals(locale3.toString(), "etats-unis_  EN-US   _  {FALSE,FALSE,FALSE,FALSE,TRUE}                                                                                                                                                                                                                          ");
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "51103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("DE", 16, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "     t      ", "US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0" + "'", str3, "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "aaaaaDEaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = new float[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) (short) 0, (int) (byte) 10);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray5);
        float[] floatArray11 = new float[] {};
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray11);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray14);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.clone(floatArray14);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (int) '4', (int) ' ');
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray10, floatArray19);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(floatArray19, (float) 34);
        java.lang.Float[] floatArray28 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray28, (float) (byte) 0);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray30);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray30, (float) (short) 10, (int) 'u');
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray19, floatArray30);
        java.lang.Float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray30);
        java.lang.String[] strArray39 = org.apache.commons.lang3.StringUtils.split("}eurt,eslaf,eslaf,eslaf,eslaf{", '#');
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray39, (java.lang.Object) 10L);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray39);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) floatArray36, (java.lang.Object[]) strArray39);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "}eurt,eslaf,eslaf,eslaf,eslaf{" + "'", str42, "}eurt,eslaf,eslaf,eslaf,eslaf{");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, (int) (short) 10, (int) (short) 1);
        float[] floatArray5 = new float[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray5);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        float[] floatArray8 = new float[] {};
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray8);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray10, (float) (short) 0, (int) (byte) 10);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray7);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) 35, 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) 7, 97);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.util.Locale locale7 = locale1.stripExtensions();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("naliait", locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = java.util.Locale.US;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale13.getDisplayCountry(locale16);
        java.lang.String str19 = locale11.getDisplayScript(locale13);
        java.util.Locale locale20 = locale11.stripExtensions();
        java.lang.String str21 = locale7.getDisplayCountry(locale11);
        java.util.Locale locale22 = locale7.stripExtensions();
        java.lang.String str23 = locale22.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "United States" + "'", str3, "United States");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "naliait" + "'", str8, "naliait");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet12);
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "United States" + "'", str21, "United States");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray12, (byte) 0);
        java.lang.Byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray18, (byte) 0);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray21, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u4e2d\u570b", "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, 'a', 9);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray3, '4');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.remove(charArray10, 2);
        java.lang.Character[] charArray18 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray19);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.addAll(charArray10, charArray20);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, ' ');
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " a4u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " a4u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , a, 4, u,  , u, u, u]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder0.build();
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category8, locale9);
        java.util.Locale locale11 = java.util.Locale.getDefault(category8);
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = locale12.getScript();
        java.util.Locale.setDefault(category8, locale12);
        java.util.Locale locale16 = java.util.Locale.US;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale.setDefault(category8, locale17);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder20.clear();
        java.util.Locale locale22 = builder20.build();
        java.util.Locale.setDefault(category8, locale22);
        java.util.Locale locale24 = locale22.stripExtensions();
        java.lang.String str25 = locale6.getDisplayName(locale22);
        boolean boolean26 = locale6.hasExtensions();
        java.lang.String str27 = locale6.getVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-US" + "'", str18, "en-US");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 100, (-1));
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray4, (byte) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 1, (int) (byte) 10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, 3, (byte) 100);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.clone(byteArray15);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray16, 6, (-1));
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray16, 29, 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.remove(byteArray16, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 0, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        short[] shortArray5 = new short[] { (byte) 1, (short) 10, (short) -1, (short) -1, (byte) 1 };
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray9);
        java.lang.Short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray9);
        java.lang.Short[] shortArray13 = new java.lang.Short[] { (short) 0 };
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13, (short) (byte) 1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray9, shortArray15);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) (byte) -1);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) (byte) 100);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray20, (short) 10);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray20);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.add(shortArray23, (short) 100);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray25);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray5, shortArray25);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray5, (short) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 10, -1, -1, 1]");
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
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, -1, 100]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
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
        java.util.Locale locale30 = java.util.Locale.UK;
        java.lang.Long[] longArray32 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray32);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.clone(longArray34);
        boolean boolean36 = objMap15.replace((java.lang.Object) locale30, (java.lang.Object) "}eur", (java.lang.Object) longArray34);
        java.util.Locale.setDefault(locale30);
        java.lang.String str38 = locale30.getDisplayCountry();
        java.lang.String str39 = locale30.getScript();
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
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(categoryArray26);
        org.junit.Assert.assertNotNull(categoryEnumArray27);
        org.junit.Assert.assertNotNull(categoryEnumArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_GB");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "United Kingdom" + "'", str38, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("{nglais (Etats-Unis)}{nglais (Etats-Unis)}{zh_CN", "cinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
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
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray28, 'a');
        char[] charArray38 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray38, 'a', (int) (short) 10);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray38, ' ');
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray38, ' ');
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray45);
        char[] charArray48 = org.apache.commons.lang3.ArrayUtils.add(charArray45, ' ');
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.addAll(charArray28, charArray48);
        char[] charArray51 = org.apache.commons.lang3.ArrayUtils.remove(charArray28, 5);
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.subarray(charArray28, 250, (int) (short) 0);
        int int55 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray28);
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray28, '4');
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
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), " 4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), " 4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[ , 4,  , a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), " 4 a4a 4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), " 4 a4a 4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[ , 4,  , a, 4, a,  , 4,  , a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[]");
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 4 + "'", int57 == 4);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) -1);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray7, (short) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray9);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
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
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray43);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains(byteArray43, (byte) 0);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.clone(byteArray43);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 0, 10, 1, 1, 0, 1, 10]");
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = java.util.Locale.getISOCountries();
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("[ , hi!, en-US,  ]   JPNPfPfPfPf{        []", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("United   States", strArray1, strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 23 + "'", int4 == 23);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "United   States" + "'", str5, "United   States");
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("       ...", "\u5229\u5927\u610f\u6587\u5229\u5927\u610f", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u82f1\u82f1\u82f1\u82f1\u82f1\u82f1..." + "'", str3, "\u82f1\u82f1\u82f1\u82f1\u82f1\u82f1\u82f1...");
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
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
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray35, 5, (-1));
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.add(byteArray40, (byte) 0);
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
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                           naliait                                                                                                           ", 19, 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            " + "'", str3, "            ");
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setExtension('a', "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: {97,1,10,10,35, [at index 0]");
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
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
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
        java.lang.CharSequence[] charSequenceArray19 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.CharSequence[]) strArray8);
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
        org.junit.Assert.assertNotNull(charSequenceArray19);
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f11", "1 100 35 10");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        java.util.Locale locale2 = java.util.Locale.US;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("", locale2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("  {fPfPfPfPNPJ   ", locale2);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale6.getVariant();
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.lang.String str11 = locale6.getDisplayVariant(locale10);
        java.lang.String str12 = locale2.getDisplayScript(locale6);
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = java.util.Locale.US;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale13.getDisplayCountry(locale16);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale21.getLanguage();
        java.lang.String str23 = locale19.getDisplayScript(locale21);
        java.lang.String str24 = locale13.getDisplayName(locale19);
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str26 = locale19.getDisplayName(locale25);
        java.lang.String str27 = locale19.getVariant();
        java.lang.String str28 = locale19.getDisplayVariant();
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("  {false,false,false,false,true}   ");
        java.util.Locale locale36 = new java.util.Locale("0", "{false,false,false,false,tru", "truetruefalse");
        java.lang.String str37 = locale36.getScript();
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.upperCase("china", locale36);
        java.lang.String str39 = locale31.getDisplayLanguage(locale36);
        java.lang.String str40 = locale29.getDisplayName(locale36);
        java.lang.String str41 = locale19.getDisplayCountry(locale29);
        java.lang.String str42 = locale6.getDisplayVariant(locale19);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  {FPFPFPFPNPJ   " + "'", str5, "  {FPFPFPFPNPJ   ");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "United States" + "'", str18, "United States");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "anglais (Etats-Unis)" + "'", str24, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str26, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals(locale36.toString(), "0_{FALSE,FALSE,FALSE,FALSE,TRU_truetruefalse");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CHINA" + "'", str38, "CHINA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Italian" + "'", str40, "Italian");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Francia" + "'", str41, "Francia");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        org.apache.commons.lang3.StringUtils stringUtils0 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils1 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils2 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils3 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils4 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils5 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray6 = new org.apache.commons.lang3.StringUtils[] { stringUtils0, stringUtils1, stringUtils2, stringUtils3, stringUtils4, stringUtils5 };
        org.apache.commons.lang3.StringUtils stringUtils7 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils8 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils9 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils10 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils11 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils12 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray13 = new org.apache.commons.lang3.StringUtils[] { stringUtils7, stringUtils8, stringUtils9, stringUtils10, stringUtils11, stringUtils12 };
        org.apache.commons.lang3.StringUtils stringUtils14 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils15 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils16 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils17 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils18 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils19 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray20 = new org.apache.commons.lang3.StringUtils[] { stringUtils14, stringUtils15, stringUtils16, stringUtils17, stringUtils18, stringUtils19 };
        org.apache.commons.lang3.StringUtils[][] stringUtilsArray21 = new org.apache.commons.lang3.StringUtils[][] { stringUtilsArray6, stringUtilsArray13, stringUtilsArray20 };
        org.apache.commons.lang3.StringUtils[][][] stringUtilsArray22 = new org.apache.commons.lang3.StringUtils[][][] { stringUtilsArray21 };
        org.apache.commons.lang3.StringUtils[] stringUtilsArray23 = new org.apache.commons.lang3.StringUtils[] {};
        org.apache.commons.lang3.StringUtils[] stringUtilsArray24 = new org.apache.commons.lang3.StringUtils[] {};
        org.apache.commons.lang3.StringUtils[] stringUtilsArray25 = new org.apache.commons.lang3.StringUtils[] {};
        org.apache.commons.lang3.StringUtils[][] stringUtilsArray26 = new org.apache.commons.lang3.StringUtils[][] { stringUtilsArray23, stringUtilsArray24, stringUtilsArray25 };
        org.apache.commons.lang3.StringUtils[][][] stringUtilsArray27 = new org.apache.commons.lang3.StringUtils[][][] { stringUtilsArray26 };
        org.apache.commons.lang3.StringUtils[][][] stringUtilsArray28 = org.apache.commons.lang3.ArrayUtils.addAll(stringUtilsArray22, stringUtilsArray27);
        org.apache.commons.lang3.StringUtils[][][] stringUtilsArray31 = org.apache.commons.lang3.ArrayUtils.subarray(stringUtilsArray27, 16, 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable[][] cloneableArray33 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.Cloneable[][]) stringUtilsArray27, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringUtilsArray6);
        org.junit.Assert.assertNotNull(stringUtilsArray13);
        org.junit.Assert.assertNotNull(stringUtilsArray20);
        org.junit.Assert.assertNotNull(stringUtilsArray21);
        org.junit.Assert.assertNotNull(stringUtilsArray22);
        org.junit.Assert.assertNotNull(stringUtilsArray23);
        org.junit.Assert.assertNotNull(stringUtilsArray24);
        org.junit.Assert.assertNotNull(stringUtilsArray25);
        org.junit.Assert.assertNotNull(stringUtilsArray26);
        org.junit.Assert.assertNotNull(stringUtilsArray27);
        org.junit.Assert.assertNotNull(stringUtilsArray28);
        org.junit.Assert.assertNotNull(stringUtilsArray31);
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "     ", (java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U{97,1,10");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
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
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(shortArray21, (short) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.add(shortArray21, 43, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 43, Length: 2");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXITALYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAsOATH kOREA", "44444444444444444444444444france                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\u82f1\u8a9e\u30a2EN_US             ", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", 43, 22);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US     " + "'", str4, "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US     ");
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray11, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray11, 756);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 756, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("SE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE", "truefalsetruefalsefalse");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("                                                                     100.0#-1.0#10.0#1.0#100.0#1.0");
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("[ , hi!, en-US,  ]   JPNPfPfPfPf{        []", locale2);
        boolean boolean6 = locale2.equals((java.lang.Object) "                                          ja_JP");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ , hi!, en-us,  ]   jpnpfpfpfpf{        []" + "'", str4, "[ , hi!, en-us,  ]   jpnpfpfpfpf{        []");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 0, false);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true, (int) ' ');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, 32, 5);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "{fPfPfPfPNPJ{fPfPfPfPNPJ{fPfPfPfPNPJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx", "xzh-TW  xx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("10321051", "italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)", "                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10321051" + "'", str3, "10321051");
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("it", "Japanese (Japan)", "{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("coreano", 39, "en(us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coreanoen(usen(usen(usen(usen(usen(usen" + "'", str3, "coreanoen(usen(usen(usen(usen(usen(usen");
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = new float[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) (short) 0, (int) (byte) 10);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray5);
        float[] floatArray11 = new float[] {};
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray11);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray14);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.clone(floatArray14);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (int) '4', (int) ' ');
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray10, floatArray19);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) 9);
        float[] floatArray23 = new float[] {};
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray23);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray23);
        float[] floatArray27 = new float[] {};
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray27);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray27);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray27);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray23, floatArray27);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (int) (short) 0, (float) (byte) 100);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray23);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray23);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray23);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray23, (float) 51);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray23, (float) 10L, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[9.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("FR_FR", "true true false");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FR_FR" + "'", str2, "FR_FR");
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
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
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray19);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray19);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray28);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray29, false, (int) 'u');
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayScript(locale6);
        java.util.Locale locale9 = locale3.stripExtensions();
        java.lang.String str10 = locale0.getDisplayScript(locale3);
        java.lang.String str11 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "United States" + "'", str5, "United States");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh_CN" + "'", str11, "zh_CN");
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u6cd5\u6587", 213, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale3 = new java.util.Locale("Italian");
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.lang.String str6 = locale0.getDisplayLanguage(locale4);
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.lang.String str8 = locale4.getDisplayLanguage(locale7);
        java.lang.String str9 = locale4.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese" + "'", str9, "Chinese");
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
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
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray30);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray30);
        java.lang.Short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray30);
        java.util.Locale locale40 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale40);
        java.util.Locale locale42 = java.util.Locale.US;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.util.Set<java.lang.Character> charSet44 = locale43.getExtensionKeys();
        java.lang.String str45 = locale43.getScript();
        java.lang.String str46 = locale40.getDisplayName(locale43);
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray30, (java.lang.Object) str46, 17);
        java.lang.Short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray30);
        double[] doubleArray53 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray53, (double) (byte) 10, 1.0d);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray53, 10.0d);
        double[] doubleArray59 = new double[] {};
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray59, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray63 = null;
        double[] doubleArray64 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray59, doubleArray63);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray59, (double) 4, (double) (byte) 10);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray53, doubleArray59);
        double[] doubleArray71 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray59, 97, (int) '#');
        int int73 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray49, (java.lang.Object) doubleArray59, (int) (byte) 0);
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray49, "{true,true,false}");
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
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Chinese (China)" + "'", str46, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "0" + "'", str75, "0");
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("      naliait", "falsefalsefalsefalsefalsefaaaaaDEaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA" + "'", str1, "FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA");
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", "\u30a2\u30e1#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ts-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etangl" + "'", str2, "ts-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etanglats-unis)ais (etangl");
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444", "\u6cd5");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
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
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.add(shortArray21, 47, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 47, Length: 3");
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
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1" + "'", str1, "\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1\u30a2\u8a9e\u82f1");
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\u6cd5\u6587\u6cd5\u570b)", 29, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd                                                                                           ", "uuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
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
        java.lang.String str20 = locale18.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en_US" + "'", str20, "en_US");
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "10321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u", "DEUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_", 'u');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("etruefals", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                   ", "97UnitedaStates1UnitedaStates10UnitedaStates10UnitedaStates35UnitedaStates-1UnitedaStates35UnitedaStates-1", "        ja_jp");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("TW", "\u4e2d\u6587\u53f0\u7063)it_it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TW" + "'", str2, "TW");
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuSouth Korea", ",false,false,tru{fal", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("ita", "nglais (etats-unis)", 320);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, false);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true]");
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        double[] doubleArray1 = new double[] { 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 35, (double) (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 1, (double) (short) 100);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray1);
        double[] doubleArray12 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) (byte) 10, 1.0d);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray12, 10.0d);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, 10.0d, (double) 0.0f);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray12);
        double[] doubleArray23 = new double[] { 0 };
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray23, (double) 35, (double) (byte) 10);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray23, (int) (byte) 100, 213);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray12, doubleArray29);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray1, doubleArray12);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 10, (double) (-1L));
        java.lang.Double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
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
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.clone(intArray29);
        int[] intArray36 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray36, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray36);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray36, (int) (short) 100);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray36);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.add(intArray36, 5);
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray44, 4, (int) (short) 1);
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.remove(intArray44, 0);
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.add(intArray44, 4, 250);
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.addAll(intArray29, intArray52);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray29, 10, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 35, 0, 32, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[10, 32, 10, 5, 250, 1, 5]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, 35, 0, 32, -1, 35, 0, 10, 32, 10, 5, 250, 1, 5]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("      []");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "][      " + "'", str1, "][      ");
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("{uuu                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                            uuu{" + "'", str1, "                            uuu{");
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("it", 89, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                       it" + "'", str3, "                                                                                       it");
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
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
        java.lang.Float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray12, 'u', 131, 22);
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
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
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
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray18, (short) (byte) 10, (int) '#');
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray18, (short) 1, 9);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) 1);
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, 0, (short) 0);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[0, 0]");
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u82f1\u8a9e", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e" + "'", str2, "\u82f1\u8a9e");
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "{-1.0,1.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
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
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Unitedetruefxlse etruefxlseStxtes", "\u5fb7\u6587\u5fb7\u56fd)", "97101035-135-1");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("France-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1", "true{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,f", 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "France-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1" + "'", str3, "France-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1");
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("de_DE", "de-de", 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DE" + "'", str3, "de_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DEde-dede_DE");
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "\u6cd5\u6587                                                 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("(Chine) chinois", "                                   English", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 13, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ko");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 10, (int) '#');
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray14, (byte) -1);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray8, byteArray14);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray14);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray25, (byte) 10, (int) '#');
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.add(byteArray31, (byte) -1);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray25, byteArray31);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray25);
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.add(byteArray38, (byte) -1);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray40, (byte) 100, (-1));
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray25, byteArray40);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray14, byteArray25);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray14, (int) ' ', 3);
        byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.clone(byteArray14);
        boolean boolean50 = languageRange1.equals((java.lang.Object) byteArray49);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[10, 1, 1, 0, 1, 10, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 0, 10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("italien", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 0L);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaeaafaa", "ko-KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaeaafaa" + "'", str2, "aaeaafaa");
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
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
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray20, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.clone(charArray22);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray23, '#');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.addAll(charArray14, charArray23);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , u, u, u]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[u,  , u, u, u]");
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("{1,100true{1,100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{1,100true{1,100" + "'", str1, "{1,100true{1,100");
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hsilgnE", (java.lang.CharSequence) "444444coreano");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hsilgnE" + "'", charSequence2, "hsilgnE");
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("etruefals", "\u65e5\u5927\u5229\u6587\u65e5\u6587", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", "ng");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray3, 0, (int) (byte) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray8);
        short[] shortArray10 = null;
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray9, shortArray10);
        java.lang.Short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray9);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, 19, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 19, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) (byte) 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray3, (int) '4', (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 10, 6);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.remove(shortArray11, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", (java.lang.CharSequence) "italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 749 + "'", int2 == 749);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu-1", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu-1" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu-1");
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ADxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 2, 0, (double) 100);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) 8, 0, (double) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "444444coreano");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'u');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, 'u');
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14, ' ');
        float[] floatArray17 = new float[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray17);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray17);
        float[] floatArray21 = new float[] {};
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray21);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray21);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray17, floatArray21);
        float[] floatArray26 = null;
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray17, floatArray26);
        java.lang.Float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray17);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) charArray14, (java.lang.Object) floatArray28);
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(" sTATES");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sTATES" + "'", str1, "sTATES");
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Italienisch", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("T", "", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" sTATES", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " sTATES" + "'", str2, " sTATES");
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("-1...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-1...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("CHINA", "\u6cd5");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINA" + "'", str2, "CHINA");
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) 'a');
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) (byte) -1);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(intArray3, 10);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = org.apache.commons.lang3.ArrayUtils.add(intArray15, 12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 35, 0]");
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
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
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray14);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.subarray(intArray14, 250, 51);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
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
            java.util.Locale.Builder builder82 = builder79.removeUnicodeLocaleAttribute("\u4e2d\u6587\u53f0\u7063)it_it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (??)it_it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
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
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
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
        java.util.Set<java.lang.Object> objSet19 = objMap15.keySet();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objSet19);
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("{", "\u97d3\u56fd\u8a9e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{" + "'", str2, "{");
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "itali");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) -1);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray7, (short) -1);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray7, (int) (short) 1, 213);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray12, (short) 0);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.clone(shortArray14);
        java.lang.Short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray15);
        java.lang.Short[] shortArray18 = new java.lang.Short[] { (short) 0 };
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) (byte) 1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(shortArray20, (short) (byte) 100);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray20);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray20, (int) '4', (-1));
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.add(shortArray26, (short) 1);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray28, (short) (byte) 10, 6);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray15, shortArray28);
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
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 1]");
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("RF_RF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RF_RF" + "'", str1, "RF_RF");
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("truetruefalse", "en-US", (int) '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("\u4e2d\u6587\u53f0\u7063)it_it", strArray5);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale.Builder builder11 = builder8.clear();
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray5, (java.lang.Object) builder8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder8.setExtension('4', "{0,-1}");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 0, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        java.lang.Boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray14, 756, 47);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray17, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ingleseuuuuuuuuuuuuuuuu", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ingleseuuuuuuuuuuuuuuuu" + "'", str2, "ingleseuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
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
        java.lang.Short[] shortArray69 = new java.lang.Short[] { (short) 0 };
        short[] shortArray71 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray69, (short) (byte) 1);
        short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray69);
        java.lang.String str73 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray69);
        short[] shortArray75 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray69, (short) (byte) 10);
        java.lang.Object obj76 = objMap45.get((java.lang.Object) shortArray75);
        java.lang.Double[] doubleArray77 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray78 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray77);
        java.lang.String str79 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) doubleArray77);
        java.lang.Double[] doubleArray80 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray77);
        boolean boolean81 = objMap45.containsKey((java.lang.Object) doubleArray77);
        double[] doubleArray83 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray77, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(categoryArray26);
        org.junit.Assert.assertNotNull(categoryEnumArray27);
        org.junit.Assert.assertNotNull(categoryEnumArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category30.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category32 + "' != '" + java.util.Locale.Category.FORMAT + "'", category32.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category33.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category34.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category36.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category38 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category38.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(categoryArray40);
        org.junit.Assert.assertNotNull(categoryEnumArray41);
        org.junit.Assert.assertNotNull(categoryEnumArray44);
        org.junit.Assert.assertNotNull(objMap45);
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category46.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category48 + "' != '" + java.util.Locale.Category.FORMAT + "'", category48.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category49 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category49.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category50 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category50.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category52 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category52.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category54 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category54.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
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
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[0]");
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[0]");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray75), "[0]");
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("italien (Italie)", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u65e5\u6587\u65e5\u672c)" + "'", str1, "\u65e5\u6587\u65e5\u672c)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ja" + "'", str2, "ja");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JP" + "'", str3, "JP");
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
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
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray6);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[100.0, -1.0, -1.0]");
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
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        char[] charArray8 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (short) 10);
        char[] charArray18 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray18, 'a', (int) (short) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, ' ');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray18, ' ');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray25);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.addAll(charArray8, charArray25);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(charArray8, '4');
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aitalianaa", charArray8);
        char[] charArray37 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray37, 'a', (int) (short) 10);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray37, ' ');
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray37, ' ');
        char[] charArray51 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray51, 'a', (int) (short) 10);
        char[] charArray61 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray61, 'a', (int) (short) 10);
        int int66 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray61, ' ');
        char[] charArray68 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray61, ' ');
        char[] charArray69 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray68);
        char[] charArray70 = org.apache.commons.lang3.ArrayUtils.addAll(charArray51, charArray68);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray37, charArray51);
        char[] charArray74 = org.apache.commons.lang3.ArrayUtils.subarray(charArray37, 10, 100);
        char[] charArray75 = org.apache.commons.lang3.ArrayUtils.addAll(charArray8, charArray74);
        char[] charArray76 = org.apache.commons.lang3.ArrayUtils.clone(charArray75);
        char[] charArray77 = null;
        char[] charArray78 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray85 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int88 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray85, 'a', (int) (short) 10);
        int int90 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray85, ' ');
        char[] charArray92 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray85, ' ');
        boolean boolean93 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray78, charArray92);
        boolean boolean95 = org.apache.commons.lang3.ArrayUtils.contains(charArray92, '#');
        char[] charArray96 = org.apache.commons.lang3.ArrayUtils.addAll(charArray77, charArray92);
        char[] charArray97 = org.apache.commons.lang3.ArrayUtils.addAll(charArray76, charArray96);
        int int98 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "DE", charArray97);
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
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[]");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray76), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray76), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray76), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[]");
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 4 + "'", int88 == 4);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(charArray92);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray92), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray92), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray92), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(charArray96);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray96), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray96), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray96), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray97);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray97), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray97), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray97), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "italien (Italie)hi!italien (Italie)en-USitalien (Italie)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien (Italie)hi!italien (Italie)en-USitalien (Italie)" + "'", str1, "italien (Italie)hi!italien (Italie)en-USitalien (Italie)");
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) longArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray7, ' ', (int) ' ', (int) (byte) 1);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray7, ' ');
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7, (long) ' ');
        java.lang.Object[] objArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) longArray7);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11003510" + "'", str8, "11003510");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[1, 100, 35, 10]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 100 35 10" + "'", str15, "1 100 35 10");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100, 35, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100, 35, 10]");
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
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
        char[] charArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray49, '4');
        char[] charArray53 = org.apache.commons.lang3.ArrayUtils.add(charArray51, 'u');
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray53);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray57 = org.apache.commons.lang3.ArrayUtils.add(charArray53, 221, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 221, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "  a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "  a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[ ,  , a, 4, a]");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "  a4au");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "  a4au");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[ ,  , a, 4, a, u]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
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
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray29);
        java.lang.Long[] longArray31 = org.apache.commons.lang3.ArrayUtils.toObject(longArray29);
        java.lang.Long[] longArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray32, 'a', (int) (short) 1, 250);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertNotNull(longArray32);
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("nnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "en-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("francese (Francia)", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=francese (francia)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("zh-CN", "{nglais (Etats-Unis)}{nglais (Etats-Unis)}{zh_CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
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
        java.lang.String str21 = locale16.getCountry();
        java.lang.String str22 = locale16.getDisplayCountry();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ja                                        ", "         USA         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ja                                        " + "'", str2, "ja                                        ");
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray12);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray12, (byte) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray18);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray18, (byte) 100);
        java.lang.Byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray18);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 1]");
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN", "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN" + "'", str2, "ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN");
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...lse,f", 39, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               ...lse,f                " + "'", str3, "               ...lse,f                ");
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaah{0,-1}{0,German (Germany)h{0,-1}{0,-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaah{0,-1}{0,German (Germany)h{0,-1}{0,-" + "'", str1, "aaaaaaaaaaah{0,-1}{0,German (Germany)h{0,-1}{0,-");
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "{10}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        char[] charArray1 = new char[] { '4' };
        char[] charArray3 = new char[] { '4' };
        char[] charArray5 = new char[] { '4' };
        char[] charArray7 = new char[] { '4' };
        char[] charArray9 = new char[] { '4' };
        char[] charArray11 = new char[] { '4' };
        char[][] charArray12 = new char[][] { charArray1, charArray3, charArray5, charArray7, charArray9, charArray11 };
        char[] charArray20 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray20, 'a', (int) (short) 10);
        char[] charArray30 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray30, 'a', (int) (short) 10);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray30, ' ');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray30, ' ');
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray37);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.addAll(charArray20, charArray37);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains(charArray20, '4');
        boolean boolean42 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aitalianaa", charArray20);
        char[] charArray49 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray49, 'a', (int) (short) 10);
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray49, ' ');
        char[] charArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray49, ' ');
        char[] charArray63 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray63, 'a', (int) (short) 10);
        char[] charArray73 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int76 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray73, 'a', (int) (short) 10);
        int int78 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray73, ' ');
        char[] charArray80 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray73, ' ');
        char[] charArray81 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray80);
        char[] charArray82 = org.apache.commons.lang3.ArrayUtils.addAll(charArray63, charArray80);
        boolean boolean83 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray49, charArray63);
        char[] charArray86 = org.apache.commons.lang3.ArrayUtils.subarray(charArray49, 10, 100);
        char[] charArray87 = org.apache.commons.lang3.ArrayUtils.addAll(charArray20, charArray86);
        char[][] charArray88 = org.apache.commons.lang3.ArrayUtils.add(charArray12, charArray20);
        char[] charArray89 = org.apache.commons.lang3.ArrayUtils.clone(charArray20);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[4]");
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
        org.junit.Assert.assertNotNull(charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[]");
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray89), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray89), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray89), "[ ,  , 4,  , a, 4]");
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("truetruef4lse", 19, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        java.util.Locale locale3 = new java.util.Locale("corean", "-1.01.0-1.01.0", " 4hi!4en-US4 ");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "corean_-1.01.0-1.01.0_ 4hi!4en-US4 ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "corean_-1.01.0-1.01.0_ 4hi!4en-US4 " + "'", str4, "corean_-1.01.0-1.01.0_ 4hi!4en-US4 ");
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Deutsch (Deutschland)", 10, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Deutsch (Deutschland)" + "'", str3, "Deutsch (Deutschland)");
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 0);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray9 = new float[] {};
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray11);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray11);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray11);
        float[] floatArray22 = new float[] { 10, '#', 3, (byte) -1, 0, (byte) 0 };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray22);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray22, (int) (short) 1, 10);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray28 = new float[] {};
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray28);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray27, floatArray28);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray27);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray27);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray34 = new float[] {};
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray33, floatArray34);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray33);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray27, floatArray33);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray22, floatArray27);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray11, floatArray27);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray11);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229)false", "                                                                                            ", "{1,0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229)false" + "'", str3, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229)false");
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-UANGLAIS(ETATS-UNIS)                                                                                                  EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-US");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-UANGLAIS(ETATS-UNIS)EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-US" + "'", str3, "EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-UANGLAIS(ETATS-UNIS)EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-US");
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("0a-1", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0a-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd  slaf#urt#urthsilgnE", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray16, (java.lang.Object) 4, 4);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) -1);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 10);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 10);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray25, 5, (int) '4');
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray25, (byte) 1);
        java.lang.Byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray25);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray25);
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
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        java.util.Locale locale2 = new java.util.Locale("##", "true{false,f");
        boolean boolean3 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "##_TRUE{FALSE,F");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("TWIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_IT", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TWIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_IT" + "'", str2, "TWIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_IT");
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet1, ' ');
        java.util.Collection[] collectionArray5 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.String>[] strCollectionArray6 = (java.util.Collection<java.lang.String>[]) collectionArray5;
        strCollectionArray6[0] = strSet1;
        java.util.Collection<java.lang.String>[] strCollectionArray9 = org.apache.commons.lang3.ArrayUtils.toArray(strCollectionArray6);
        java.lang.Iterable<java.lang.String>[] strIterableArray12 = org.apache.commons.lang3.ArrayUtils.subarray((java.lang.Iterable<java.lang.String>[]) strCollectionArray6, (-1), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strCollectionArray6, 'x', (int) (short) -1, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(collectionArray5);
        org.junit.Assert.assertNotNull(strCollectionArray6);
        org.junit.Assert.assertNotNull(strCollectionArray9);
        org.junit.Assert.assertNotNull(strIterableArray12);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = new float[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) (short) 0, (int) (byte) 10);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray5);
        float[] floatArray11 = new float[] {};
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray11);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray14);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.clone(floatArray14);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (int) '4', (int) ' ');
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray10, floatArray19);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) 9);
        float[] floatArray23 = new float[] {};
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray23);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray23);
        float[] floatArray27 = new float[] {};
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray27);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray27);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray27);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray23, floatArray27);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (int) (short) 0, (float) (byte) 100);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray23);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray23);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray23);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(floatArray23, (float) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[9.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "uuuuuuuuuuuuuuuuuu     ", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
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
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray22);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(intArray22, 2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        short[] shortArray4 = new short[] { (byte) 0, (short) 1, (byte) 100, (short) 1 };
        short[] shortArray9 = new short[] { (byte) 0, (short) 1, (byte) 100, (short) 1 };
        short[] shortArray14 = new short[] { (byte) 0, (short) 1, (byte) 100, (short) 1 };
        short[] shortArray19 = new short[] { (byte) 0, (short) 1, (byte) 100, (short) 1 };
        short[][] shortArray20 = new short[][] { shortArray4, shortArray9, shortArray14, shortArray19 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray20);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
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
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray12, (byte) 0, (int) (short) 0);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray12, (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray16);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray16);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, 1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 1, 0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 1, 1, 0, 1, 10, 10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1, 0, 1, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
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
        java.util.Locale.Builder builder36 = builder32.setLanguageTag("Taiwan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder38 = builder36.addUnicodeLocaleAttribute("anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis) [at index 0]");
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
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("South Korea", 117, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxSouth Korea" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxSouth Korea");
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
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
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray19);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray19);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray19, true, (int) (short) 0);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray19, true);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray19);
        java.lang.Boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray34);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray35);
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Korean", 32, (int) 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean" + "'", str3, "Korean");
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) (-1.0f));
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) 10.0f, (double) 21);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray7, (-1.0d), (double) 10);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, 100.0d);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray7, (double) 37, (double) 89);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("(Chine) chinois", "[ , hi!, en-US,  ]   JPNPfPfPfPf{        [", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(Chine) chinois" + "'", str3, "(Chine) chinois");
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444italie4444444444444444", "Jxpxn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444italie4444444444444444" + "'", str2, "444444444444444italie4444444444444444");
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String[] strArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("Giappone");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("       ...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:        ... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray6);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 5);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, 117, 107);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("xzh-TW  xx", "TRUETRUEFALSE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xzh-TW  xx" + "'", str2, "xzh-TW  xx");
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) (byte) 100);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) 1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0]");
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ETRUEFALSE                                          ", "j", 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu-1");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("{97,1,10,10,35,-1,35,-1}", "nglais (Etats-Unis)}", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        java.lang.Integer[] intArray10 = org.apache.commons.lang3.ArrayUtils.toObject(intArray9);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray10, 2);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) intArray10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10321051" + "'", str14, "10321051");
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 10.0f };
        java.lang.Float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray2, (float) (byte) 10);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        float[] floatArray6 = new float[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray6);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.clone(floatArray9);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, (int) '4', (int) ' ');
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, 7, 4);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(floatArray17, 0.0f);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.clone(floatArray17);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray20);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray20);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.remove(floatArray4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0-1", "", 15);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Englishtru#tru#fals                                    ", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englishtru#tru#fals                                    " + "'", str2, "Englishtru#tru#fals                                    ");
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfals", "allemand (Allemagne)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand (Allemagne)" + "'", str2, "allemand (Allemagne)");
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(" sTATES", "44444444444444444444444444444444444444ital", "97UnitedaStates1UnitedaStates10UnitedaStates10UnitedaStates35UnitedaStates-1UnitedaStates35UnitedaStates-1                         ", 107);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " sTATES" + "'", str4, " sTATES");
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_-1.0-1.0100.0", "chinois", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, 'x', 107, 35);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) '4');
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray4, (long) 2, (int) 'x');
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (-1L));
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray4, (long) 16, 7);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                            e", "    ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ANGLAIS (eTATS-uN", "-.", "Englishtru#tru#fals                                    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
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
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray48, '4');
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("97United States1United States10United States10United States35United States-1United States35United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=97united states1united states10united states10united states35united states-1united states35united states");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "444444COREANO");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...sluf,esluf{                                                                         ", "\u30b9\u30ea\u30ae\u30a4\u8a9e\u82f1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...sluf,esluf{                                                                         " + "'", str2, "...sluf,esluf{                                                                         ");
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0", "{uuu                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str2, "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 213);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray5, 0.0f);
        java.lang.Float[] floatArray13 = new java.lang.Float[] { 1.0f, 10.0f, 100.0f, 1.0f, 100.0f };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray13);
        java.lang.Float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray13);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray13, (float) '#');
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray5, floatArray17);
        java.lang.Float[] floatArray24 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray24, (float) (byte) 0);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray26);
        java.lang.Float[] floatArray33 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray33, (float) (byte) 0);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray35);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray26, floatArray35);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray35);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray35);
        float[] floatArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray35, (float) 35);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray5, floatArray41);
        java.lang.Class<?> wildcardClass43 = floatArray41.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[213.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[213.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[213.0, 1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[1.0, 1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[1.0, 1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[0.0, 100.0, 0.0, 1.0, 1.0, 0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[1.0, 1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
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
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray18, (byte) -1);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 100, (-1));
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) 10);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, (int) (short) 1, (byte) 100);
        java.lang.Object obj30 = objMap15.remove((java.lang.Object) (short) 1);
        java.lang.Object obj31 = null;
        boolean boolean32 = objMap15.containsValue(obj31);
        java.lang.Object obj33 = null;
        boolean boolean34 = objMap15.containsKey(obj33);
        boolean boolean35 = objMap15.isEmpty();
        java.util.Locale locale38 = java.util.Locale.TAIWAN;
        java.util.Locale locale39 = locale38.stripExtensions();
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.lowerCase("ne", locale39);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.lowerCase("truetruetruefalsetruetruetruefalsefalse", locale39);
        boolean boolean42 = objMap15.containsValue((java.lang.Object) "truetruetruefalsetruetruetruefalsefalse");
        java.util.Set<java.lang.Object> objSet43 = objMap15.keySet();
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 100, 0, -1]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ne" + "'", str40, "ne");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "truetruetruefalsetruetruetruefalsefalse" + "'", str41, "truetruetruefalsetruetruetruefalsefalse");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objSet43);
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd  slaf#urt#urthsilgnE", "United   States", 95);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                     100.0#-1.0#10.0#1.0#100.0#1.0", "\u5229\u5927\u610f\u6587\u5229\u5927\u610f\u5229\u5927\u610f\u6587\u5229\u5927\u610f\u5229\u5927\u610f\u6587\u5229\u5927\u610f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setExtension('u', "EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-UANGLAIS(ETATS-UNIS)EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: UANGLAIS(ETATS [at index 318]");
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
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1English (United Kingdom)", "  0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1English (United Kingdom)" + "'", str2, "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1English (United Kingdom)");
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray2, "");
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        java.lang.Character[] charArray14 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, 'a');
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.add(charArray18, '#');
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "de_D", charArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray2, (java.lang.Object) boolean21);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.01.0" + "'", str6, "-1.01.0");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "u uuu#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "u uuu#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[u,  , u, u, u, #]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.parse("KOR");
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("France");
        java.util.Locale.LanguageRange languageRange32 = new java.util.Locale.LanguageRange("France");
        java.lang.String str33 = languageRange32.getRange();
        java.lang.String str34 = languageRange32.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] { languageRange30, languageRange32 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Locale locale41 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strSet42);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet42, "hi!");
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet42, 'x');
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags(languageRangeList28, (java.util.Collection<java.lang.String>) strSet42, filteringMode49);
        java.util.Locale locale51 = java.util.Locale.JAPAN;
        java.lang.String str52 = locale51.getISO3Country();
        java.lang.String str53 = locale51.getDisplayName();
        java.util.Set<java.lang.String> strSet54 = locale51.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode55 = null;
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags(languageRangeList28, (java.util.Collection<java.lang.String>) strSet54, filteringMode55);
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet54, "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...");
        boolean boolean59 = locale15.equals((java.lang.Object) "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...");
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
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "france" + "'", str33, "france");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "france" + "'", str34, "france");
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "JPN" + "'", str52, "JPN");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u65e5\u6587\u65e5\u672c)" + "'", str53, "\u65e5\u6587\u65e5\u672c)");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("  {false,false,false,false,true}   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range={false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray3);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) (byte) -1);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray12, (short) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray12);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                   UNITED STATES", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   UNITED STATES" + "'", str3, "                   UNITED STATES");
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setLanguage("de-de");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: de-de [at index 0]");
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
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\u610f\u5927\u5229\u6587\u610f\u5927\u5229                                                                                       ", "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229                                                                                       " + "'", str2, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229                                                                                       ");
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0 ({FALSE,FALSE,FAJPN", "10.0100.01.0100.00.0", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("{0}", "italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0)32)10)5)1)5", 401, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("de_D", "zh-cnaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "it-IT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("     zh_cn", "it-it", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     zh_cn" + "'", str3, "     zh_cn");
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaDEaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaDEaaaaaa" + "'", str1, "aaaaaDEaaaaaa");
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "hsilgnE", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray12, false);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList54, strMap66);
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
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str35, "\u7fa9\u5927\u5229\u6587");
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
        org.junit.Assert.assertNotNull(languageRangeList67);
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        int[] intArray0 = null;
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 250, 333);
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "TWIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_ITIT_IT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ja_J", "\u82f1\u8a9e\u30a2EN_US             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2EN_US             " + "'", str2, "\u82f1\u8a9e\u30a2EN_US             ");
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("{false,false,false,false,true", "ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENchinois (Chine)                                                                                     ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENEN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{false,false,false,false,true" + "'", str2, "{false,false,false,false,true");
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
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
        java.util.Locale locale12 = locale9.stripExtensions();
        java.util.Locale locale14 = new java.util.Locale("\u30a2\u30e1");
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category15, locale16);
        java.util.Locale locale18 = java.util.Locale.getDefault(category15);
        java.util.Locale locale19 = java.util.Locale.US;
        java.lang.String str20 = locale19.toLanguageTag();
        java.lang.String str21 = locale19.getScript();
        java.util.Locale.setDefault(category15, locale19);
        java.lang.String str23 = locale19.getCountry();
        java.lang.String str24 = locale14.getDisplayCountry(locale19);
        java.lang.String str25 = locale9.getDisplayVariant(locale14);
        java.util.Set<java.lang.Character> charSet26 = locale14.getExtensionKeys();
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals(locale14.toString(), "\u30a2\u30e1");
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en-US" + "'", str20, "en-US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "US" + "'", str23, "US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charSet26);
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
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
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray49 = org.apache.commons.lang3.ArrayUtils.remove(charArray47, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "                                               en_US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                true{false,f", (java.lang.CharSequence) "aaafr_fraaaa (UNITED STATES)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, 7);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (-1.0f), 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 'x', 87);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 250, 116);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("  en-US   ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  en-US   " + "'", str2, "  en-US   ");
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 213);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray5, 0.0f);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray5, (float) '#', 107);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[213.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[213.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, (float) 10);
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: {1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0}{1.0,-1.0,0.0,0.0} [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.add(booleanArray34, 34, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 34, Length: 0");
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
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                 ", "tedesco (Germania");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        java.lang.Character[] charArray3 = new java.lang.Character[] { ' ', ' ', 'a' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray4);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , a]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setUnicodeLocaleKeyword("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", "444444444444444444444ITALIEN (iTALIE)44444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("1#0#0#1#0", "{false,false,false,false,tru        {{false,false,false,false,true}PfPfPfPNPJ           {{false,false,false,false,true}PfPfPfPNPJ  ", "TRUE{FALSE,F");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444444444444444444444444fRANCE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444fRANCE" + "'", str1, "44444444444444444444444444fRANCE");
    }
}
