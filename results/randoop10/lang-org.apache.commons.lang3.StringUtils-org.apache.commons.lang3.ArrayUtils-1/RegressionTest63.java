import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest63 {

    public static boolean debug = false;

    @Test
    public void test31501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31501");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      zaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaSoath Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test31502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31502");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u30a2\u30e1", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test31503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31503");
        char[] charArray4 = new char[] { ' ', 'a' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray4);
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("", charArray4);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(charArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = org.apache.commons.lang3.ArrayUtils.remove(charArray4, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 87, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test31504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31504");
        float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray1 = new float[] {};
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray0, floatArray1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray0);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray7 = new float[] {};
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray6, floatArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray0, floatArray6);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray6);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.remove(floatArray6, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 20, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test31505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31505");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
    }

    @Test
    public void test31506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31506");
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray5, (java.lang.Object) builder9, 4);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, 'a');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray14, 'u');
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.subarray(charArray16, (int) (byte) 10, (int) (short) 100);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(charArray19, '4');
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test31507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31507");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 100, (-1));
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 0);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0, -1]");
    }

    @Test
    public void test31508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31508");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("101-1.00321-1.00101-1.0051-1.001", "eurte44444444444)dnalhcstued(hcstued44444444444urte", 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test31509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31509");
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
        java.util.Collection<java.lang.Object> objCollection69 = objMap15.values();
        java.util.Set<java.lang.Object> objSet70 = objMap15.keySet();
        objMap15.clear();
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
        org.junit.Assert.assertNotNull(objCollection69);
        org.junit.Assert.assertNotNull(objSet70);
    }

    @Test
    public void test31510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31510");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ENGLISHTRU#TRU#FALS                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=englishtru#tru#fals");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}
