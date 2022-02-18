import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.addUnicodeLocaleAttribute("anglais (Etats-Unis)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: anglais (Etats-Unis) [at index 0]");
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
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE" + "'", str1, "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE");
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("trutrufals", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " trutrufals  " + "'", str2, " trutrufals  ");
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("{1,0}", "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{1,0}" + "'", str2, "{1,0}");
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("-1.0", (int) (byte) 1, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.stripAll(strArray0);
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                   English", "-1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale.Builder builder7 = builder4.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("\u7fa9\u5927\u5229\u6587", "{fulse,fulse,fulse,fulse,true");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ???? [at index 0]");
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
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
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
        java.lang.String[] strArray94 = org.apache.commons.lang3.StringUtils.split("}", "\u4e2d\u6587\u53f0\u7063)it_it", 7);
        boolean boolean95 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) wildcardClassArray0, (java.lang.Object[]) strArray94);
        java.lang.String str96 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray94);
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
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "}" + "'", str96, "}");
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                   English", "en-US", "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   English" + "'", str3, "                                   English");
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("}eurt,eslaf,eslaf,eslaf,eslaf{", '#');
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) 10L);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str3, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Chinese", "", "         ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 48, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", 0, "{");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US" + "'", str3, "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "n", "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("French (France)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French (France)" + "'", str1, "French (France)");
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
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
            java.util.Locale.Builder builder38 = builder34.addUnicodeLocaleAttribute("                                              Giappone                                              ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                               Giappone                                               [at index 0]");
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
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "china");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "China" + "'", str1, "China");
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{" + "'", str1, "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "CHINA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHINA" + "'", str1, "CHINA");
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "china", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "\u4e2d\u6587\u53f0\u7063)it_it", "anglais (Etats-Unis)", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        java.util.Locale locale2 = new java.util.Locale("[]", "France");
        java.lang.Object obj3 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "[]_FRANCE");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]_FRANCE");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]_FRANCE");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]_FRANCE");
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("{FALSE,...", "{false,fal");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ne");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
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
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray0);
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
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("}eurt,esl", "", 1, 98);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("  {false,false,false,false,true}   ", "{fnlse,fnlse,fnlse,fnlse,trne");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("en_GB", "zho");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("{fnlse,fnlse,fnlse,fnlse,trne", "se,false,false,tru{false,false,false,false");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE", "JPN", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        boolean[][][][] booleanArray0 = null;
        boolean[][][][] booleanArray1 = org.apache.commons.lang3.ArrayUtils.toArray(booleanArray0);
        org.junit.Assert.assertNull(booleanArray1);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray9 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray9);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.add(intArray9, 0, 4);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray9);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray3, intArray5);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray3, 0, 23);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setUnicodeLocaleKeyword("", "\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444France");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
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
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray44, 'a');
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.clone(charArray44);
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.subarray(charArray44, (int) (byte) 100, (int) ' ');
        boolean boolean51 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "falsefalsefalsefalsetrue", charArray50);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray53 = org.apache.commons.lang3.ArrayUtils.remove(charArray50, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 39, Length: 0");
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("FRA", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aitalianaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aitalianaa" + "'", str1, "aitalianaa");
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, 1.0d, (double) 35);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 0);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) 100, 4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, (-1), (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strSet1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
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
            char[] charArray72 = org.apache.commons.lang3.ArrayUtils.add(charArray59, 13, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 5");
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
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\u4e2d\u6587", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("{}", (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                              Giappone                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setVariant("                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                                                                                                      [at index 0]");
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
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(charArray16, 'a');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.subarray(charArray16, 100, 7);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray16, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "{false,fal");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) (short) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) 'u', 10);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray6);
        double[] doubleArray15 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray15, (double) (short) -1);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray17, (double) (short) 1, 100.0d);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray6, doubleArray17);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray22);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray23);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray6, doubleArray23);
        boolean boolean26 = languageRange1.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("etruefalse                                                                                          ", "\u30a2\u30e1", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "en_GB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", "  {false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (", "trutrufals");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray5, (java.lang.Object) builder9, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.setExtension('x', "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW [at index 0]");
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
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ENG", "-1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("FRA", "united states");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("en_US", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_US" + "'", str2, "en_US");
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 2, (int) '#');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (byte) 0, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        java.lang.Double[] doubleArray0 = null;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("100.0#-1.0#10.0#1.0#100.0#1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 100.0#-1.0#10.0#1.0#100.0#1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
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
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "US", charArray30);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray34 = org.apache.commons.lang3.ArrayUtils.add(charArray30, 3, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 1");
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
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", (java.lang.CharSequence) "{false,false,false,false,tru");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                   English", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("11003510", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  {false,false,false,false,true}  ", (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "");
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        byte[] byteArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray0);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\u610f\u5927\u5229\u6587", "kor", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 'a', (int) 'x');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444France", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444France" + "'", str3, "44444444444444444444444444France");
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        java.lang.Double[] doubleArray7 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7, (double) (short) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray7, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("United States", (java.lang.Object[]) doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str11, "100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0United States-1.0United States10.0United States1.0United States100.0United States1.0" + "'", str12, "100.0United States-1.0United States10.0United States1.0United States100.0United States1.0");
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("italian", "{false,fal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italian" + "'", str2, "italian");
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (byte) -1, 0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ja");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", "u uu", "USA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        char[] charArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(charArray0, 'u');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray1, ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "##", charArray3);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setUnicodeLocaleKeyword("[]", "{false,...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: [] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        byte[] byteArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 100, 213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u4e2d\u6587", "  {false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("en", "44444444444444444444444444France");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setScript("-1.0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: -1.0 [at index 0]");
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
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 'u', 10);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray4);
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, (double) (short) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray15, (double) (short) 1, 100.0d);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray15);
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray20);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray21);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray21);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.add(doubleArray21, (int) (byte) 10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("TI_ti", "{97,1,10,10,35,-1,35,-1}", (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene", "{false,false,false,false,true");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                              Giappone                                              ", "                                                                                                    ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              Giappone                                              " + "'", str3, "                                              Giappone                                              ");
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("tru4tru4fals");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tru4tru4fals" + "'", str1, "tru4tru4fals");
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{  ", "truetruefalsetruetruefalsetruetruefalsetruetruefalsetruetChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ja");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        java.util.Locale locale2 = new java.util.Locale("Italian");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.lang.String str9 = locale6.getDisplayName(locale8);
        java.lang.String str10 = locale2.getDisplayVariant(locale6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("100.0#-1.0#10.0#1.0#100.0#1.0", locale2);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0", "0", (int) (short) -1);
        long[] longArray17 = new long[] { 'a' };
        long[] longArray24 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray17, longArray24);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.add(longArray25, (int) (short) 1, (long) (byte) 1);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.subarray(longArray28, (-1), (-1));
        java.lang.Long[] longArray32 = org.apache.commons.lang3.ArrayUtils.toObject(longArray28);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray32, (java.lang.Object) floatArray33);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) int34, (int) '#');
        java.lang.Short[] shortArray38 = new java.lang.Short[] { (short) 0 };
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray38, (short) (byte) 1);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray40);
        java.lang.Short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray40);
        java.lang.Short[] shortArray44 = new java.lang.Short[] { (short) 0 };
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray44, (short) (byte) 1);
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray40, shortArray46);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray15, (java.lang.Object) shortArray47, 0);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray47, (short) 10);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) "100.0#-1.0#10.0#1.0#100.0#1.0", (java.lang.Object) (short) 10);
        org.junit.Assert.assertEquals(locale2.toString(), "italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italian" + "'", str4, "italian");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-US" + "'", str7, "en-US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str9, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str11, "100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[97]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("US", "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("DEU", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DEU" + "'", str2, "DEU");
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setScript("100.0United States-1.0United States10.0United States1.0United States100.0United States1.0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 100.0United States-1.0United States10.0United States1.0United States100.0United States1.0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "KOR", (java.lang.CharSequence) "{10,32,10,5,1,5}");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "KOR" + "'", charSequence2, "KOR");
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("anglais(Etats-Unis)", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais(Etats-Unis)" + "'", str2, "anglais(Etats-Unis)");
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "   }eurt,eslaf,eslaf,eslaf,eslaf{  ", (java.lang.CharSequence) "{false,false,false,false,true");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "   }eurt,eslaf,eslaf,eslaf,eslaf{  " + "'", charSequence2, "   }eurt,eslaf,eslaf,eslaf,eslaf{  ");
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("FRA", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("CHINA", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene", "\u65e5\u6587\u65e5\u672c)", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHINA" + "'", str4, "CHINA");
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguageTag("RK_ok");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: RK_ok [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("truetruefalse", "0a-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "truetruefalse" + "'", str2, "truetruefalse");
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("en", "}eurt,esla", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "{fnlse,fnlse,fnlse,fnlse,trne");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\u5229\u5927\u610f\u6587\u5229\u5927\u610f", 13, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u5229\u5927\u610f\u6587\u5229\u5927\u610f" + "'", str3, "\u5229\u5927\u610f\u6587\u5229\u5927\u610f");
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[1, 100, 35, 10, 100]");
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("{fPfPfPfPNPJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{fPfPfPfPNPJ" + "'", str1, "{fPfPfPfPNPJ");
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("en-CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en-CA");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, (float) 39);
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "truetruefalsetruetruefalsetruetruefalsetruetruefalsetruetChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr", (java.lang.CharSequence) "truetruetruefalsetruetruetruefalsefalse");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "truetruefalsetruetruefalsetruetruefalsetruetruefalsetruetChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr" + "'", charSequence2, "truetruefalsetruetruefalsetruetruefalsetruetruefalsetruetChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr");
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) (short) 1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, (-1), 0);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray7, (double) '#');
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) '4', (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", (java.lang.CharSequence) "e");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", charSequence2, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u7fa9\u5927\u5229\u6587", "\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
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
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray50 = org.apache.commons.lang3.ArrayUtils.add(charArray13, 42, 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("{false,..", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{false,.." + "'", str2, "{false,..");
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "china");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("anglais (Etats-Unis)", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "{false,..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("[]", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u30a2\u30e1", "etruefalse                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a2\u30e1" + "'", str2, "\u30a2\u30e1");
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("RK_ok", "chinois (Chine)", 7, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chinois (Chine)" + "'", str4, "chinois (Chine)");
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen", "{fPfPfPfPNPJ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("en_GB", "11003510");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_GB" + "'", str2, "en_GB");
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\u7fa9\u5927\u5229\u6587", "                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet1, ' ');
        java.util.Collection[] collectionArray5 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.String>[] strCollectionArray6 = (java.util.Collection<java.lang.String>[]) collectionArray5;
        strCollectionArray6[0] = strSet1;
        java.util.Collection<java.lang.String>[] strCollectionArray9 = org.apache.commons.lang3.ArrayUtils.toArray(strCollectionArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String>[] strCollectionArray11 = org.apache.commons.lang3.ArrayUtils.remove(strCollectionArray6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(collectionArray5);
        org.junit.Assert.assertNotNull(strCollectionArray6);
        org.junit.Assert.assertNotNull(strCollectionArray9);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) 5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 0.0, 5.0]");
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("{fulse,fulse,fulse,fulse,true", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("n", "}eurt,esla");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n" + "'", str2, "n");
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("{0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{0}" + "'", str1, "{0}");
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "######{false,false,false,false,true");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", charSequence2, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("e");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{false,false,false,false,true", 'a');
        boolean boolean5 = languageRange1.equals((java.lang.Object) "{false,false,false,false,true");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=35.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE", (int) (byte) 1, "FRA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE" + "'", str3, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("france", (int) 'a', "-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1" + "'", str3, "france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1");
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("zho", "en-US", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setUnicodeLocaleKeyword("falsefalsefalsefalsetrue", "ne");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: falsefalsefalsefalsetrue [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "uNITED sTATES");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        java.lang.Boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, true);
        org.junit.Assert.assertNull(booleanArray2);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("chinois (Chine)", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinois (Chine)                                                                                     " + "'", str2, "chinois (Chine)                                                                                     ");
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "TRUETRUEFALSE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tRUETRUEFALSE" + "'", str1, "tRUETRUEFALSE");
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("{false,fal", "\u4e2d\u6587\u53f0\u7063)it_it");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "it_IT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("italian", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian" + "'", str3, "italian");
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("}eurt,esla", " ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("etruefalse", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.lang.String[] strArray9 = new java.lang.String[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("nglais (Etats-Unis)", strArray4, strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "\u65e5\u6587\u65e5\u672c)");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}eurt,esla" + "'", str7, "}eurt,esla");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nglais (Etats-Unis)" + "'", str11, "nglais (Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "11003510");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, 1.0d, (double) 35);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray4, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "{0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 100, (-1));
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray4, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray10, 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.remove(byteArray13, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("   }eurt,eslaf,eslaf,eslaf,eslaf{  ", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("        {fPfPfPfPNPJ   ", 0, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        {fPfPfPfPNPJ   " + "'", str3, "        {fPfPfPfPNPJ   ");
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("TI_ti");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: TI_ti [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
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
        java.lang.String[] strArray94 = org.apache.commons.lang3.StringUtils.split("}", "\u4e2d\u6587\u53f0\u7063)it_it", 7);
        boolean boolean95 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) wildcardClassArray0, (java.lang.Object[]) strArray94);
        java.lang.String str96 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray94);
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
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "}" + "'", str96, "}");
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "English");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("en", "United States");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, 100.0d, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray2, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("01530011");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01530011" + "'", str1, "01530011");
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setRegion("france");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: france [at index 0]");
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
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("100.0United States-1.0United States10.0United States1.0United States100.0United States1.0", "n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0a-1", "trutrufals", "a");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\u4e2d\u6587\u53f0\u7063)it_it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u53f0\u7063)it_it" + "'", str1, "\u4e2d\u6587\u53f0\u7063)it_it");
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene", "truetruef4lse", (int) '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                   English");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("etruefalse", "aitalianaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("\u52a0\u62ff\u5927", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("{fPfPfPfPNPJ", (int) 'x', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE", "anglais (Etats-Unis)", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "China");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "China" + "'", str1, "China");
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        float[] floatArray3 = new float[] { 100, (byte) -1, (-1) };
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray6, (float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.remove(floatArray6, 213);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 213, Length: 3");
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
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, 2);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 5, 10, 32, 10]");
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("anglais (Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais (Etats-Unis)" + "'", str1, "anglais (Etats-Unis)");
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("anglais (Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais (Etats-Unis)" + "'", str1, "anglais (Etats-Unis)");
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\u52a0\u62ff\u5927", "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\u82f1\u8a9e\u30a2EN_US             ", (java.lang.CharSequence) "\u65e5\u6587\u65e5\u672c)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\u65e5\u6587", "uNITED sTATES");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("EN-US", "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EN-US" + "'", str2, "EN-US");
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "en_GB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("{false,false,false,false,tra", "CHINA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{false,false,false,false,tra" + "'", str2, "{false,false,false,false,tra");
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray11 = org.apache.commons.lang3.ArrayUtils.remove(longArray6, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
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
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray25, (long) 6, (int) '4');
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
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("######{false,false,false,false,true", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######{false,false,false,false,true" + "'", str2, "######{false,false,false,false,true");
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\u7f8e\u56fd", (java.lang.CharSequence) "{false,false,false,false,true}");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u7f8e\u56fd" + "'", charSequence2, "\u7f8e\u56fd");
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("anglais(Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais(Etats-Unis)" + "'", str1, "anglais(Etats-Unis)");
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("TRUETRUEFALSE", "united states");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510" + "'", str1, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("}eurt,esla", "        {fPfPfPfPNPJ   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("US", "e", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("anglais(Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais(Etats-Unis)" + "'", str1, "anglais(Etats-Unis)");
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("US", "uNITED sTATES", "{FPFPFPFPNPJ", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "US" + "'", str4, "US");
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        long[] longArray0 = null;
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        org.junit.Assert.assertNull(longArray1);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "United States");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("united states");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "united states" + "'", str1, "united states");
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR_fr" + "'", str1, "FR_fr");
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("TRUETRUEFALSE", (-1), "n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRUETRUEFALSE" + "'", str3, "TRUETRUEFALSE");
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en_GB" + "'", str1, "en_GB");
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray6);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray6, 1, (long) 100);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(longArray12, (long) 213);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray16 = org.apache.commons.lang3.ArrayUtils.remove(longArray12, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 48, Length: 5");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "china");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        float[] floatArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "{false,..", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("  {false,false,false,false,true}  ", "}eurt,esla");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  {false,false,false,false,true}  " + "'", str2, "  {false,false,false,false,true}  ");
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
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
        int[] intArray62 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray10, 213);
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray62, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray66 = org.apache.commons.lang3.ArrayUtils.remove(intArray62, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 21, Length: 5");
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
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 4 + "'", int64 == 4);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("   }eurt,eslaf,eslaf,eslaf,eslaf{  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   }eurt,eslaf,eslaf,eslaf,eslaf{  " + "'", str1, "   }eurt,eslaf,eslaf,eslaf,eslaf{  ");
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("\u7f8e\u56fd", "{false,false,false,false,tra", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("china");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "china" + "'", str1, "china");
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, 0, (int) (short) 1);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray20, false);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray22, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray24, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
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
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
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
            java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("}eurt,esla");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: }eurt,esla [at index 0]");
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
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("11003510", 2, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11003510" + "'", str3, "11003510");
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("japonais (Japon)", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "japonais (Japon)" + "'", str2, "japonais (Japon)");
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 0);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) '4', 3);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("anglais(Etats-Unis)", (int) 'u', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais(Etats-Unis)                                                                                                  " + "'", str3, "anglais(Etats-Unis)                                                                                                  ");
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("italien (Italie)", "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray0, "{false,false,false,false,tru");
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray0, (java.lang.Object) doubleArray4, (int) (short) 0);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray4, 'x', 10, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{" + "'", str1, "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Italy", (int) 'u', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)", 21);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      " + "'", str2, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ");
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
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
        boolean boolean47 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u4e2d\u6587", charArray42);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
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
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "italien" + "'", str35, "italien");
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
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray0, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u610f\u5927\u5229\u6587", "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\u5229\u5927\u610f\u6587\u5229\u5927\u610f", (java.lang.CharSequence) "EN-US");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u5229\u5927\u610f\u6587\u5229\u5927\u610f" + "'", charSequence2, "\u5229\u5927\u610f\u6587\u5229\u5927\u610f");
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("China", "italian", " ", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
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
            java.util.Locale.Builder builder9 = builder4.addUnicodeLocaleAttribute("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW [at index 0]");
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
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("EN-US", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EN-US" + "'", str2, "EN-US");
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
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
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(floatArray12, 0.0f);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "}eurt,eslaf,eslaf,eslaf,eslaf{", (java.lang.CharSequence) "S");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "}eurt,eslaf,eslaf,eslaf,eslaf{" + "'", charSequence2, "}eurt,eslaf,eslaf,eslaf,eslaf{");
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("true                                                                                                    true                                                                                                    false", "English");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true                                                                                                    true                                                                                                    false" + "'", str2, "true                                                                                                    true                                                                                                    false");
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "france");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("{false,false,false,false,true", (int) (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{false,false,false,false,true" + "'", str3, "{false,false,false,false,true");
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("-1", "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("}", "\u4e2d\u6587\u53f0\u7063)it_it", 7);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "{false,false,false,false,tru");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ', (int) 'a', 13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u6587\u53f0\u7063)it_it", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE", 48);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("en_US", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("RK_ok", "france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                  ", (int) '4', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  " + "'", str3, "                                                                                                  ");
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray5, (java.lang.Object) builder9, 4);
        java.util.Locale locale12 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.setRegion("\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? (??) [at index 0]");
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
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        java.util.Locale locale1 = new java.util.Locale("TRUETRUEFALSE");
        org.junit.Assert.assertEquals(locale1.toString(), "truetruefalse");
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("{fnlse,fnlse,fnlse,fnlse,trne");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range={fnlse");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u65e5\u6587\u65e5\u672c)", "Italy");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("-1.0", "en-US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0" + "'", str2, "-1.0");
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("anglais (Etats-Unis)", "  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene", "TI_ti");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene" + "'", str2, "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene");
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
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
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) (byte) 1, 48);
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0a-1", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0a-1" + "'", str2, "0a-1");
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray6, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray8, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, false]");
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0a-1", (int) 'x', (int) 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("trutrufals");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "trutrufals" + "'", str1, "trutrufals");
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse" + "'", str1, "true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("chinois (Chine)                                                                                     ", 0, "nglais (Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinois (Chine)                                                                                     " + "'", str3, "chinois (Chine)                                                                                     ");
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.remove(floatArray3, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 39, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("  {false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (", "france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("united states", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ENG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "en", "{97,1,10,10,35,-1,35,-1}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "de");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "de");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "de");
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("DEU", (int) ' ', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx" + "'", str3, "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx");
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Collection<java.util.Locale> localeCollection3 = null;
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale.FilteringMode filteringMode18 = null;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList15, filteringMode18);
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.util.Locale locale23 = new java.util.Locale("Italian");
        java.util.Locale locale24 = java.util.Locale.ITALY;
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Locale locale26 = java.util.Locale.US;
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.ITALY;
        java.util.Locale locale29 = java.util.Locale.US;
        java.util.Locale locale30 = locale29.stripExtensions();
        java.lang.String str31 = locale30.toLanguageTag();
        java.lang.String str32 = locale28.getDisplayScript(locale30);
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.util.Locale locale35 = java.util.Locale.US;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.lang.String str37 = locale36.toLanguageTag();
        java.lang.String str38 = locale34.getDisplayScript(locale36);
        java.lang.String str39 = locale34.getDisplayLanguage();
        java.util.Locale locale40 = java.util.Locale.ITALY;
        java.util.Locale locale41 = java.util.Locale.US;
        java.util.Locale locale42 = locale41.stripExtensions();
        java.lang.String str43 = locale42.toLanguageTag();
        java.lang.String str44 = locale40.getDisplayScript(locale42);
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale20, locale23, locale24, locale25, locale26, locale28, locale33, locale34, locale42 };
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList49 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList46, filteringMode48);
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection3, filteringMode48);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.lang.String[] strArray58 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList59);
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList59);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList59, "italien (Italie)");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals(locale23.toString(), "italian");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en-US" + "'", str27, "en-US");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en-US" + "'", str31, "en-US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "en-US" + "'", str37, "en-US");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "italien" + "'", str39, "italien");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "en-US" + "'", str43, "en-US");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode48.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList49);
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + " italien (Italie)hi!italien (Italie)en-USitalien (Italie) " + "'", str64, " italien (Italie)hi!italien (Italie)en-USitalien (Italie) ");
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U" + "'", str1, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U");
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("{false,false,false,false,true", "-1", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US" + "'", str2, "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("etruefalse", 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("{fnlse,fnlse,fnlse,fnlse,trne");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{fnlse,fnlse,fnlse,fnlse,trne" + "'", str1, "{fnlse,fnlse,fnlse,fnlse,trne");
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("  {FPFPFPFPNPJ   ", "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str2, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", "         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "{0}");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("italian", "     ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("en_GB", "truetruefalsetruetruefalsetruetruefalsetruetruefalsetruetChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "{false,false,false,false,tra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{false,false,false,false,tra" + "'", str1, "{false,false,false,false,tra");
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Etats-Unis");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etats-Unis" + "'", str1, "Etats-Unis");
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aitalianaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\u610f\u5927\u5229\u6587", "Taiwan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("fr_FR", "kor");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" ", 4, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\u6cd5\u6587", (int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587                                                 " + "'", str2, "\u6cd5\u6587                                                 ");
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
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
        java.util.Locale.setDefault(locale12);
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
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("truetruef4lse", "Italy");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "truetruef4lse" + "'", str2, "truetruef4lse");
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("  {false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (", "######{false,false,false,false,true", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Etats-Unis", "etruefalse                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\u4e2d\u6587\u53f0\u7063)it_it", "ENG", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("etruefalse                                                                                          ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "etruefalse                                          " + "'", str2, "etruefalse                                          ");
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u6cd5\u6587\u6cd5\u56fd)", '#', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
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
            char[] charArray22 = org.apache.commons.lang3.ArrayUtils.add(charArray16, 213, 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 213, Length: 0");
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
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("10 32 10 5 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10321051" + "'", str1, "10321051");
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("kor", "se,false,false,tru{false,false,false,false", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u6cd5\u6587\u6cd5\u56fd)");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("united states", strArray2, strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "united states" + "'", str5, "united states");
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, '#', (int) '#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Italy");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        byte[] byteArray0 = null;
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, 35, (int) 'x');
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("FR_fr", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FR_fr" + "'", str2, "FR_fr");
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("10321051", "                                   English", "n");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "en-CA", (java.lang.CharSequence) "ne");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("    ", "uNITED sTATES", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("   }eurt,eslaf,eslaf,eslaf,eslaf{  ", "\u5fb7\u56fd", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getScript();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("\u82f1\u6587\u7f8e\u570b)", locale1);
        java.lang.Object obj5 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-US" + "'", str2, "en-US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str4, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "en_US");
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("11003510", "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx" + "'", str2, "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx");
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "JPN", "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)", "}eurt,eslaf,eslaf,eslaf,eslaf{" };
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setVariant("\u5229\u5927\u610f\u6587\u5229\u5927\u610f");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: )???( ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Giappone", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Giappone" + "'", str2, "Giappone");
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("ne");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("{10,32,10,5,1,5}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse" + "'", str1, "true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        java.util.Locale locale2 = new java.util.Locale("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", "\u97e9\u56fd");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u97e9\u56fd");
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("falsefalsefalsefalsetrue");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "falsefalsefalsefalsetrue" + "'", str1, "falsefalsefalsefalsetrue");
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ne");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "{}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        java.lang.Long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray16, (java.lang.Object) floatArray17);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, 2, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
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
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("italien (Italie)", (int) 'u', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) 'a');
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray3, 13);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = org.apache.commons.lang3.ArrayUtils.remove(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 13]");
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = builder1.build();
        java.lang.String str4 = locale0.getDisplayLanguage(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray16, (java.lang.Object) 4, 4);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 1);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (int) 'x', (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 120, Length: 2");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0]");
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("u uu", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587" + "'", str1, "\u6cd5\u6587");
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", 23, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US" + "'", str3, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("chinois (Chine)", "11003510");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinois (Chine)" + "'", str2, "chinois (Chine)");
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("English", "nglais (Etats-Unis)");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("11003510", strArray4);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("{false,false,false,false,tru", "                                                                                                    ", (int) '#');
        java.lang.String[] strArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("falsefalsefalsefalsetrue", strArray4, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray15 = org.apache.commons.lang3.ArrayUtils.add((java.lang.CharSequence[]) strArray10, (int) (byte) 100, (java.lang.CharSequence) "\u6cd5\u6587                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[h]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[h]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "falsefalsefalsefalsetrue" + "'", str12, "falsefalsefalsefalsetrue");
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("{false,..", 250);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                 {false,.." + "'", str2, "                                                                                                                                                                                                                                                 {false,..");
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("a", "44444444444444444444444444France", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("JPN", "", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("44444444444444444444444444France", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "ja", 42);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0" + "'", str4, "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  {false,false,false,false,true}   ", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE", 213, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setUnicodeLocaleKeyword("}eur", "chinois (Chine)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: }eur [at index 0]");
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
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                                                                                 {false,..", (java.lang.CharSequence) "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(?en_us??(?en_us??(?en_us??(?en_us??(?en_us??(?en_us??(?en_us??(?en_us??(?en_us??(?en_us");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("}eur", "\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("italien");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("RK_ok", "{fnlse,fnlse,fnlse,fnlse,trne", 5, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RK_ok{fnlse,fnlse,fnlse,fnlse,trne" + "'", str4, "RK_ok{fnlse,fnlse,fnlse,fnlse,trne");
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 'u', 10);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, 0.0d);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.add(doubleArray4, (int) (byte) 100, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "france", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 0, (int) '#');
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 5);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, 9, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1, 1, 0, 1, 10]");
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
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
        java.util.Locale locale15 = locale6.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = locale15.getUnicodeLocaleType("\u6cd5\u6587                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                                  ??                                                 ");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
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
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray44, 'a');
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.clone(charArray44);
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.subarray(charArray44, (int) (byte) 100, (int) ' ');
        boolean boolean51 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "falsefalsefalsefalsetrue", charArray50);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray54 = org.apache.commons.lang3.ArrayUtils.add(charArray50, (int) (short) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
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
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) boolean47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setLanguage("\u5229\u5927\u610f\u6587\u5229\u5927\u610f");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: )???( ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Taiwan", (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("{10,32,10,5,1,5}", "  {false,false,false,false,true}   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
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
            java.util.Locale.Builder builder34 = builder32.setRegion("}eurt,esla");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: }eurt,esla [at index 0]");
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
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "EN-US");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                              Giappone                                              ", "{1,0}", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "USA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("jpn", "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
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
        java.lang.Class<?> wildcardClass33 = charArray30.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\u97e9\u56fd", "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\u5927\u5229\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\u610f\u5927\u5229\u6587", "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str2, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("        {{false,false,false,false,true}PfPfPfPNPJ   ", "[]", "{0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        {{false,false,false,false,true}PfPfPfPNPJ   " + "'", str3, "        {{false,false,false,false,true}PfPfPfPNPJ   ");
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("RK_ok{fnlse,fnlse,fnlse,fnlse,trne", "united states");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
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
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) 0);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_US", "United States", (int) (byte) -1);
        java.lang.String[] strArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray29);
        int int31 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\u82f1\u6587\u7f8e\u570b)", strArray29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale locale35 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strSet36);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet36, "hi!");
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray29, (java.lang.Object) str39);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) (short) 0, (java.lang.Object) int40);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("US", "se,false,false,tru{false,false,false,false");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US" + "'", str2, "US");
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray4, "USA", 9, 0);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 35);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(floatArray12, (float) 21);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U", "{0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Etats-Unis", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Etts-Unis" + "'", str2, "Etts-Unis");
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("[]", "RK_ok{fnlse,fnlse,fnlse,fnlse,trne");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("FRA", (int) (byte) -1, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRA" + "'", str3, "FRA");
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "France");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en-US", "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("ko_KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ko_KR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("CHINA", "S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(byteArray0, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("kor", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith(" ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor" + "'", str4, "kor");
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                    ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("{false,..");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range={false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = org.apache.commons.lang3.ArrayUtils.remove(intArray21, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 0");
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 35, 0]");
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("TI_ti");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TI_TI" + "'", str1, "TI_TI");
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
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
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.remove(shortArray30, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 1");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("fr_FR", "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr_FR" + "'", str2, "fr_FR");
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE" + "'", str1, "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE");
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\u5fb7\u56fd", "United States", "{false,false,false,false,tru");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u5fb7\u56fd" + "'", str3, "\u5fb7\u56fd");
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("chinois (Chine)", "\u5fb7\u6587\u5fb7\u56fd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinois (Chine)" + "'", str2, "chinois (Chine)");
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ENG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENG" + "'", str1, "ENG");
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) 'a');
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, 7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("tRUETRUEFALSE", (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tRUETRUEFALSE" + "'", str3, "tRUETRUEFALSE");
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chinois (Chine)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinois (chine)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("}eurt,esla", "{false,...", "aitalianaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}eurt,esla" + "'", str3, "}eurt,esla");
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = locale1.getISO3Language();
        java.util.Locale locale4 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale4.getUnicodeLocaleType("{false,false,false,false,tra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: {false,false,false,false,tra");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u610f\u5927\u5229\u6587", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str2, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("}eurt,esl", "naliait");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse", "zh_TW");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 10.0d);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (short) 100, (double) 'u');
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "en-US");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-ecnarf" + "'", str1, "1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-ecnarf");
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Collection<java.util.Locale> localeCollection7 = null;
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList19);
        java.util.Locale.FilteringMode filteringMode22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList19, filteringMode22);
        java.util.Locale locale24 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.util.Locale locale27 = new java.util.Locale("Italian");
        java.util.Locale locale28 = java.util.Locale.ITALY;
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Locale locale30 = java.util.Locale.US;
        java.lang.String str31 = locale30.toLanguageTag();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.util.Locale locale33 = java.util.Locale.US;
        java.util.Locale locale34 = locale33.stripExtensions();
        java.lang.String str35 = locale34.toLanguageTag();
        java.lang.String str36 = locale32.getDisplayScript(locale34);
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.util.Locale locale38 = java.util.Locale.ITALY;
        java.util.Locale locale39 = java.util.Locale.US;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.lang.String str41 = locale40.toLanguageTag();
        java.lang.String str42 = locale38.getDisplayScript(locale40);
        java.lang.String str43 = locale38.getDisplayLanguage();
        java.util.Locale locale44 = java.util.Locale.ITALY;
        java.util.Locale locale45 = java.util.Locale.US;
        java.util.Locale locale46 = locale45.stripExtensions();
        java.lang.String str47 = locale46.toLanguageTag();
        java.lang.String str48 = locale44.getDisplayScript(locale46);
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale24, locale27, locale28, locale29, locale30, locale32, locale37, locale38, locale46 };
        java.util.ArrayList<java.util.Locale> localeList50 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList50, localeArray49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList53 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList50, filteringMode52);
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, localeCollection7, filteringMode52);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.lang.String[] strArray62 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strList63);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList63);
        boolean boolean67 = languageRange1.equals((java.lang.Object) strList66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "france" + "'", str3, "france");
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals(locale27.toString(), "italian");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en-US" + "'", str31, "en-US");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "en-US" + "'", str35, "en-US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en-US" + "'", str41, "en-US");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str43, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en-US" + "'", str47, "en-US");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(localeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode52.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList53);
        org.junit.Assert.assertNotNull(localeList54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "United States", (java.lang.CharSequence) "\u65e5\u6587\u65e5\u672c)");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal" + "'", str1, "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ", "        {{false,false,false,false,true}PfPfPfPNPJ   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str2, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
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
            float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (int) (byte) 10, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
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
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray16, (java.lang.Object) 4, 4);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 0);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.add(byteArray25, (byte) -1);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray27, (byte) 100, (-1));
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray16, (java.lang.Object) byteArray31);
        java.lang.String str33 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray16);
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
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{1,0}" + "'", str33, "{1,0}");
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("en_US", "TI_ti", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\u4e2d\u6587\u53f0\u7063)it_it");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(longArray12, (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray19 = org.apache.commons.lang3.ArrayUtils.remove(longArray12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 8");
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
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "etruefalse                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
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
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.add(shortArray40, 100, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
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
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "RK_ok", "ne");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 'u', 10);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray4);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) (short) 100, (double) (-1));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setExtension('4', "etruefalse                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u5fb7\u56fd", (java.lang.CharSequence) "DEU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setVariant("ENG");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ENG [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "{false,fal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{false,fal" + "'", str1, "{false,fal");
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("se,false,false,tru{false,false,false,false");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Etts-Unis", "\u5fb7\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Etts-Unis" + "'", str2, "Etts-Unis");
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("en-CA", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-CA" + "'", str2, "en-CA");
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u7fa9\u5927\u5229\u6587", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str2, "\u7fa9\u5927\u5229\u6587");
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        float[] floatArray6 = new float[] { 10, '#', 3, (byte) -1, 0, (byte) 0 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray6);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray6, (int) (short) 1, 10);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (int) (byte) 100, (float) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[35.0, 3.0, -1.0, 0.0, 0.0, 10.0]");
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", "         ", 98, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str4, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("        {fPfPfPfPNPJ   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   JPNPfPfPfPf{        " + "'", str1, "   JPNPfPfPfPf{        ");
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse" + "'", str1, "True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("en_US", " italien (Italie)hi!italien (Italie)en-USitalien (Italie) ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_" + "'", str2, "_");
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Giappone");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray4);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0, 4);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray4);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 0);
        java.lang.String str12 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray11);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.clone(intArray11);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray11, 0, 98);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{0}" + "'", str12, "{0}");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("{}", "}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\u52a0\u62ff\u5927", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u52a0\u62ff\u5927" + "'", str2, "\u52a0\u62ff\u5927");
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("French (France)", "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French (France)" + "'", str2, "French (France)");
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("{false,fal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{false,fal" + "'", str1, "{false,fal");
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                  " + "'", str1, "                                                                                                  ");
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("100.0#-1.0#10.0#1.0#100.0#1.0", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str2, "100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("100.0#-1.0#10.0#1.0#100.0#1.0", 98, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                     100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str3, "                                                                     100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("en_GB", "eng");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("coreano");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "coreano" + "'", str1, "coreano");
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" ", "-1.0{0}10.0{0}1.0{0}100.0{0}1.0", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("se,false,false,tru{false,false,false,false", "{fnlse,fnlse,fnlse,fnlse,trne", "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA" + "'", str3, "FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA");
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("RK_ok{fnlse,fnlse,fnlse,fnlse,trne", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RK_ok{fnlse,fnlse,fnlse,fnlse,trne" + "'", str2, "RK_ok{fnlse,fnlse,fnlse,fnlse,trne");
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = org.apache.commons.lang3.ArrayUtils.remove(intArray8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        java.lang.Double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) '#');
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("n", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Collection<java.lang.String> strCollection5 = null;
        java.util.Locale.FilteringMode filteringMode6 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags(languageRangeList4, strCollection5, filteringMode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + filteringMode6 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode6.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse(" trutrufals  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=trutrufals");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        int int5 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray3, '#', 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\u7fa9\u5927\u5229\u6587");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray23 = new boolean[] { false, false, false, false, true };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray23);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.add(booleanArray23, false);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray12, booleanArray26);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, (int) (short) 1, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray12, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 120, Length: 5");
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
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, true, false, false, false, true]");
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray6, (float) 0L);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray6, (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.remove(floatArray6, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 4");
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
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
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
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray49, 'a', 39);
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("etruefalse                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "etruefalse                                                                                         " + "'", str1, "etruefalse                                                                                         ");
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("{false,...", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{false,..." + "'", str2, "{false,...");
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\u82f1\u8a9e\u30a2en_US             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2en_US" + "'", str1, "\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("en-CA", "                                                                     100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str1, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray3, 250);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
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
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray24 = org.apache.commons.lang3.ArrayUtils.remove(longArray19, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 21, Length: 4");
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
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "11003510" + "'", str14, "11003510");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        double[] doubleArray0 = null;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 5, 2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str1, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("        {fPfPfPfPNPJ   ", "aitalianaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        {fPfPfPfPNPJ   " + "'", str2, "        {fPfPfPfPNPJ   ");
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
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
            long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray24, 250, (long) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 250, Length: 0");
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
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
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
            java.util.Locale.Builder builder38 = builder34.setScript("{false,..");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: {false,.. [at index 0]");
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
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getCountry();
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, true);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5);
        boolean boolean11 = locale0.equals((java.lang.Object) booleanArray5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DE" + "'", str1, "DE");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ne");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("US");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "  {FPFPFPFPNPJ   ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("n", strArray3, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("n", strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "n" + "'", str9, "n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        java.lang.String str2 = languageRange1.getRange();
        int[] intArray6 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) '4');
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray9, 5);
        boolean boolean12 = languageRange1.equals((java.lang.Object) intArray9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 35, 0, 5]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("se,false,false,tru{false,false,false,false");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: se,false,false,tru{false,false,false,false [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE" + "'", str1, "TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE");
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setExtension('u', "}eurt,eslaf,eslaf,eslaf,eslaf{");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: }eurt,eslaf,eslaf,eslaf,eslaf{ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  {false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (", "  {FPFPFPFPNPJ   ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false, (int) (short) 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("US");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "  {FPFPFPFPNPJ   ");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) (byte) -1);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray9, (int) (short) 1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray11, (-1), 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray1, (java.lang.Object) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u7fa9\u5927\u5229\u6587", "italian", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("zh_TW", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_TW" + "'", str2, "zh_TW");
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("it_it", "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE", "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it_it" + "'", str3, "it_it");
    }
}
