import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest72 {

    public static boolean debug = false;

    @Test
    public void test36001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36001");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\U0023\\U00\\U0041\\U", 7);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36002");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                         u0023\\u002u0023\\u002u0023\\u002u0", "23\\u0023\\u0023          3    23\\u0023\\u0023      ", 98);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("...                          ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test36003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36004");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                            aaaaaaaaaaaaa3200\\a                                ", 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test36005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36005");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "23                                                                                     hi!hi!hi!", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test36006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36006");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                300U", 97, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36007");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200", "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ", (int) '0');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\ 61\\ 61\\61u 61\\ 61\\610020", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 61\\ 61\\61u 61\\ 61\\610020" + "'", str2, "\\ 61\\ 61\\61u 61\\ 61\\610020");
    }

    @Test
    public void test36010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36010");
        char[] charArray9 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61uuu", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test36011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36011");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("u......\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00", 532, 121);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u......\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00" + "'", str3, "u......\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00");
    }

    @Test
    public void test36012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36013");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", (java.lang.CharSequence) "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    " + "'", charSequence2, "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
    }

    @Test
    public void test36014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36014");
        char[] charArray17 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray17);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  2   ", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!10010hi!10010h\\400310hi!10010hi!10010hi", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("", charArray17);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U000AAAAAAAAAAAAAA3200U\\A", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test36015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                            5500u\\aaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA1111111111111111111111111111111111111111111111                                            5500U\\AAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA1111111111111111111111111111111111111111111111                                            5500U\\AAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36016");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", (java.lang.CharSequence) "AAAAAAA     \\u0041                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36017");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "u\\3200u\\32", 118, (int) 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test36018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36018");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36019");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6", "  2  UUUUU", 667);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("300000", "222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c", "...                             AAAA15AAAA                                 AAAA15AAAA               ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36023");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...    ...uuuuu61uuuuuuuuuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test36024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\u0020                                        ", "\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020                                        " + "'", str2, "\\u0020                                        ");
    }

    @Test
    public void test36025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36025");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '1');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                   ######", 296, 124);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str4, "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test36026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("U 61.", 'h', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U 61." + "'", str3, "U 61.");
    }

    @Test
    public void test36027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "1\\U00234                                      \\U0023\\U00\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36028");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("000000000000000000000000000000000000000000000000000000000000", " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 161);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36029");
        char[] charArray14 = new char[] { ' ' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "####A000U\\", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1\\U00234                                      \\U0023\\U00\\u0                    ..", charArray14);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("23i23i23i23iui31i23i23i23i23", charArray14);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U6663\\u6623\\u6623\\u6623\\u6623\\u6623UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu662", charArray14);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n666U3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\326", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test36030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU20\\u0020\\u0020\\u0020\\u00    20\\u0020\\u0020\\u0020\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0", 113, 54);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", "                                         \n\n1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36033");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n\n1", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", 86);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("A000U\\", "aaaa                                                ", 96);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach(" 61\\", strArray6, strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\4\n\n", "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                     ", strArray10, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concatWith("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6", (java.lang.Object[]) strArray14);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " 61\\" + "'", str11, " 61\\");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                     " + "'", str16, "                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\4\n\n" + "'", str17, "\\4\n\n");
    }

    @Test
    public void test36034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) " 61..11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36035");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("11111111111111111111 111111111111111111111", "U   6");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36037");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u01\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                           a             u6", "6                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36038");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...020u0020u0020u0020u0020u0020u0020u0020...        ", 267, 257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36039");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) '\\', (int) (short) 1);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                        ", strArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("u61", '1');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ", strArray6, strArray17);
        int int21 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...0000000000000000000000000000000", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "u6" + "'", str19, "u6");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     " + "'", str20, "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
    }

    @Test
    public void test36040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36040");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("a", "u......\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test36042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36042");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 270, "             u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u" + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u");
    }

    @Test
    public void test36043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36043");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HHHHHHHHHHHHHUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U", "20u0020u0020u0020u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36044");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U", "                                                                                      u\\32");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("   2     ...                                ...    \\U002", "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36046");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (java.lang.CharSequence) "AAAAAA                             HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 497 + "'", int2 == 497);
    }

    @Test
    public void test36047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36047");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u005c\\u00", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "............................", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444423\\u0023\\u444444444444444444444", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 21 + "'", int23 == 21);
    }

    @Test
    public void test36048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36048");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u003", "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 111, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36050");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                                                                                  61", "\\u005c", 4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0023", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) 'u', (int) (byte) 10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("\\61\\61\\61\\61\\61\\61", strArray6);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("023\\u0023       aaaaaaa                             61\\", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test36051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36051");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ", "...111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("uuu  6  6  6  6  6  ", "u002322222                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6  6  6  6  6  " + "'", str2, "6  6  6  6  6  ");
    }

    @Test
    public void test36053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36053");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "\\u0023");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61", strArray2, strArray6);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U61", "");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concatWith("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (java.lang.Object[]) strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("23AU0023AU0023AU0023AU0023AU0023AU0023AU0023UAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray6, strArray15);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61" + "'", str11, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "U61" + "'", str16, "U61");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "23AU0023AU0023AU0023AU0023AU0023AU0023AU0023UAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str17, "23AU0023AU0023AU0023AU0023AU0023AU0023AU0023UAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "00U\\3200U\\3200U\\3200U\\3200U\\3200");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36055");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "aaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36056");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "\\400326666666666666666666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\4003266666666666666666666666666666666666666", 130);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36057");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("111111111111111111111111111111111111111111111111111111111111111111111111111111111111..", "1111111111111111111111111111111111111111111113\\U0003\\U0111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84 + "'", int2 == 84);
    }

    @Test
    public void test36058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000uuuuuuuuuuuuuuuuuuuuuuuuu...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36060");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6", "aaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "i!         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36062");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U002066666666666666666666666666666666666666", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n210000000000000000000000000000000000000000000000000\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\0auu0", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0###", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test36063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36063");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                       0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n16U", "                  ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test36064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...", "11111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111", "   ...3\\u23\\u23U6    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\..." + "'", str3, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...");
    }

    @Test
    public void test36065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36065");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("      61\\ 61\\ ", 440, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36066");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '6' + "'", char2 == '6');
    }

    @Test
    public void test36067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36067");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", "\\u0023                                                                                     hi!hi!hi!                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36068");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###u\\32                                                                             ", "222222222222222222222222222222222\\UUU02\\...222222222222222222222222222222222", 306);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36069");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                                                                  61", "\\u005c", 4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0023", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", "23hi!hi!hi!                                                                          ", 161);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      iiiii", strArray5, strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      iiiii" + "'", str11, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      iiiii");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test36070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36070");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "AAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36071");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...      " + "'", str1, "...      ");
    }

    @Test
    public void test36072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36072");
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("0023", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\n", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny(".......................................1111111", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test36073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 173);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                      " + "'", str2, "                                                                      uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                      ");
    }

    @Test
    public void test36074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("cccccccccccccccccccccccccccccccccc\n     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cccccccccccccccccccccccccccccccccc" + "'", str1, "cccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test36075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\\UUU02\\... 3hi!hi!hi!                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\UUU02\\... 3hi!hi!hi!" + "'", str1, "\\UUU02\\... 3hi!hi!hi!");
    }

    @Test
    public void test36076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36076");
        char[] charArray20 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray20);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray20);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray20);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray20);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray20);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray20);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray20);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray20);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", charArray20);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ", charArray20);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", charArray20);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray20);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsAny("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", charArray20);
        boolean boolean34 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray20);
        int int35 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test36077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36078");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36079");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", (java.lang.CharSequence) "\\U005C                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00" + "'", charSequence2, "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
    }

    @Test
    public void test36080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36080");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "0023\\U0023\\U0023\\U0023\\U0023\\U004444444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   \n\\u002                                   ...", "                                                                      u003                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   \n\\u002                                   ..." + "'", str2, "   \n\\u002                                   ...");
    }

    @Test
    public void test36082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                       aaaaaaaaaaaaa\\\\\\", "                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaaaaaaaa\\\\\\" + "'", str2, "                                       aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test36083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test36084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36085");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ", 136, 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      " + "'", str3, "      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ");
    }

    @Test
    public void test36086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("10hi!1", "                                                                                                        aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36087");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\", "8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     \\U0023\\U0023\\U0023\\U0023\\U002     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16 ", 243);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\" + "'", str4, "5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\");
    }

    @Test
    public void test36088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36088");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                     ......  77777777777777777777777777777777777777777777777777777777777777777777777", "200U\\3200U\\3200U");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "           \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36090");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36091");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "22222222222222222222222222222222222222241AAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\AAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 306, 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36093");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36094");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...", 5);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\\u003                                                ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test36095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC0023\\U0023\\U0023\\U0023\\U0023\\U00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", '#', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC0023\\U0023\\U0023\\U0023\\U0023\\U00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC0023\\U0023\\U0023\\U0023\\U0023\\U00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test36096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36096");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  \\u0023\\u0023\\u0023\\u0023\\u0023\\16 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36097");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\  \\\\0020                                                            ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36098");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    " + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    ");
    }

    @Test
    public void test36099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36099");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 ", "000000000000000000000000000000...             000000000000000000041\\u00000000000000000000000000000000...             000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36100");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00234                                      \\U0023\\U00\\u0                    ", "U0023\\U00\\u0041\\U0023", 192);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("       aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa" + "'", str1, "aaaaaaa");
    }

    @Test
    public void test36102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36102");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36103");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0200iui\\", 136, "aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                            5500u\\aaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                   0200iui\\" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                   0200iui\\");
    }

    @Test
    public void test36104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36104");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36105");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test36106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("u003                    ", (int) '\\', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u003                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "u003                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  " + "'", str1, "16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  ");
    }

    @Test
    public void test36108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36108");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "3\\u0023u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36109");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("u\\3200u\\32");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u\\3200u\\32" + "'", str1, "u\\3200u\\32");
    }

    @Test
    public void test36110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36110");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                             ", 55);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concatWith("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (java.lang.Object[]) strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("1111111     ", strArray11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.split(" 61", "                                                                                                  61");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaa", strArray19, strArray22);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", strArray5, strArray22);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny("...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10hi!100" + "'", str13, "10hi!100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10hi!100" + "'", str14, "10hi!100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10hi!100" + "'", str15, "10hi!100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10hi!100" + "'", str16, "10hi!100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10hi!100" + "'", str18, "10hi!100");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "aaaa" + "'", str23, "aaaa");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###" + "'", str24, "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test36111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36111");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "6\\6\\6\\6\\6\\6\\6\\6\\6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36112");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", '\\');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
    }

    @Test
    public void test36113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36113");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("33333333", "u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ", 4, 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3333u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   " + "'", str4, "3333u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ");
    }

    @Test
    public void test36114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "...aaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200uaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test36115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36115");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023................................");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U" + "'", str4, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U");
    }

    @Test
    public void test36116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36116");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("333333U0033#U0033#U0033#U0033#U0033#U0033");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '3' + "'", char1 == '3');
    }

    @Test
    public void test36117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36117");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa", 32, "...\\61\\61\\61\\61\\61\\...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa" + "'", str3, "aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa");
    }

    @Test
    public void test36118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu    222222222222222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu    222222222222222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu    222222222222222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 635, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test36120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36120");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6", "\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36121");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36122");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("           161\\161\\161\\161\\161\\16177777777777777777777777777", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36123");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 121);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "1111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36125");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00", "65                                  5a5757575757575757575757575757575757575757575751115757575757575757575757575757575757575757575751115", 306);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36126");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("1\\ 61\\ ...                                A\\u2AAAAAAAAAAAAAau\\                                                                 A\\u", "      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36129");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0075", "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test36130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36130");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  UUU6  6  6  6  6  ", 'c');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("..                    0u\\00U\\3200U\\                                      43200U\\1                                         ", "  \\U005C  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh", "         0000000000000000000000000000000000000000000000000\\U0037         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh" + "'", str2, "ChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh");
    }

    @Test
    public void test36133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36133");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 112);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36134");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002", (java.lang.CharSequence) "   2     ...                                ...    \\U0023");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002" + "'", charSequence2, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002");
    }

    @Test
    public void test36135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hCUUUUUUuuuuuuuuuuuuuuuuuu\\4555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16" + "'", str1, "uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16");
    }

    @Test
    public void test36137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA", "3\\u0023\\u", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA" + "'", str3, "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA");
    }

    @Test
    public void test36138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36138");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36139");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                 \\ 0030                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36140");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa                                                ", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("\\u0037", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     1111111........................................................................................", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test36141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36141");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 130);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 130 + "'", int2 == 130);
    }

    @Test
    public void test36142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36142");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "#11#1111\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36143");
        char[] charArray12 = new char[] { ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa      ", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...11111111111111111111111111111111111111111111111111111111", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0032", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray12);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61.##############################################", charArray12);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("U 32  U 32", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test36144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36144");
        char[] charArray2 = new char[] {};
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test36145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36145");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068", "                 \\u0030\\\\\\\\                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36146");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...", "23\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36147");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                     ", 237);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36148");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'U', 139);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 139 + "'", int2 == 139);
    }

    @Test
    public void test36149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("uuu6  6  6  6  6", "H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuu6  6  6  6  6" + "'", str2, "uuu6  6  6  6  6");
    }

    @Test
    public void test36150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36150");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ 6161\\ 61\\ 6161\\ 00u\\0200u\\\n16u    ", 'c');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36151");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                        \\U0023\\U00\\u0041\\U0023                         ", "AAAAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   AAAAAAAAAAAAAAAAAAAAAAAAA", 107);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" ...                         ", "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ...                         " + "'", str2, " ...                         ");
    }

    @Test
    public void test36153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36153");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003", 262);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36154");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("5555555                     ...", "                                                                                ", 1000, 147);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5555555                     ...                                                                                " + "'", str4, "5555555                     ...                                                                                ");
    }

    @Test
    public void test36155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36155");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "5c", (java.lang.CharSequence) " 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36156");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1        61        615c    61        61        61", "61.", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "UUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u61", 104, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2", 62, 91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n..." + "'", str3, "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...");
    }

    @Test
    public void test36158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                           001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................                                                                                           ", "533333333333333333333333333333\\40032333333333333333333333333333333C", 46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................                                                                                           " + "'", str3, "                                                                                           001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................                                                                                           ");
    }

    @Test
    public void test36159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\300 066666666666666666666666666666666666666", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\300 066666666666666666666666666666666666666" + "'", str2, "\\300 066666666666666666666666666666666666666");
    }

    @Test
    public void test36160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36160");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r  \n\n1                                         ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1 == '\r');
    }

    @Test
    public void test36161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36161");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("6u666", "\n\n\n\n\n\n\n\n\n\n\n\\\\i\\                       61\n                       ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                       aaaaaaaaaaaaa\\\\\\", "                                                                                                                                                                                                      \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaaaaaaaa\\\\\\" + "'", str2, "                                       aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test36163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36163");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000", (int) (short) 10, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000" + "'", str3, "00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000");
    }

    @Test
    public void test36164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36164");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("75", 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36165");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "2  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36166");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u", "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        ", "23\\U                                         ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36167");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.substringsBetween("", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "                                                                                                        aaaaaaa    ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "\\u0023");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray6, strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("                                                                                                        aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", '\n');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray6, strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concatWith("...                                      57", (java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str12, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str16, "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                        aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str17, "                                                                                                        aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test36168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36168");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61\\uuuuuuuuuuuuuuuu6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61\\uuuuuuuuuuuuuuuu6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61\\uuuuuuuuuuuuuuuu6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       5C111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCChhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       5C111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str2, "       5C111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test36170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1", 339);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                   0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1                                                                                   " + "'", str2, "                                                                                   0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1                                                                                   ");
    }

    @Test
    public void test36171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36171");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...", "                    ...", (int) 'I', 393);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ..." + "'", str4, "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...");
    }

    @Test
    public void test36172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", str1, "...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test36173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36173");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("..............................");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0\\u0020\\u00", "                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0\\u0020\\u00" + "'", str2, "0\\u0020\\u00");
    }

    @Test
    public void test36175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36175");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000", (java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000" + "'", charSequence2, "                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000");
    }

    @Test
    public void test36176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36176");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  6  6  6  6  6  uuu", 393, "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAA  6  6  6  6  6  uuu" + "'", str3, "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAA  6  6  6  6  6  uuu");
    }

    @Test
    public void test36177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36177");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ih01001!ih0", "                                 0023\\u0023\\u0023\\ U020\\u0020\\u0020\\u00", "      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36178");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa", "                                                                                                                                                                                                                          11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36179");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36180");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", (java.lang.CharSequence) "\\      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test36181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36181");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                  \\U0023\\U00\\u0041\\U                                   \\uhi!hi!hi!\\uhi!hi!hi!\\uhi!hi!", 440, 861);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36182");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 497);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "iiiiiiiiiiiiiiuuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuuiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    ", "u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    " + "'", str2, "...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    ");
    }

    @Test
    public void test36185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36185");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36186");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                 \\u0030\\\\\\\\                  ", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...", 54);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36187");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                              \\u003");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u003" + "'", str1, "\\u003");
    }

    @Test
    public void test36188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36188");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "         a          ", 120, 33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         a          " + "'", str4, "         a          ");
    }

    @Test
    public void test36189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...", 135, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h " + "'", str3, "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h ");
    }

    @Test
    public void test36190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36190");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aa                                          ", "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n210000000000000000000000000000000000000000000000000\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\0auu0", "                                                                                                        \\u0023\\u\\", 168);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aa                                          " + "'", str4, "aa                                          ");
    }

    @Test
    public void test36191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6" + "'", str1, "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6");
    }

    @Test
    public void test36192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36192");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u", '7');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test36193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36193");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("23\\U                                        ", 48, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36194");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("10hi!10010hi!161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U10hi!10010hi!1", "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36195");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" u004", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36196");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36198");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161\\", "u6      61        61        61        61", 354);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36199");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "ccccccccccccc\\U0068cccccc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36201");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36203");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaa", 'C');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test36204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36205");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                        aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36206");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 92 + "'", int1 == 92);
    }

    @Test
    public void test36207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36207");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                                                                                                                                             ", "A000U\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61A000U\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61A000U\\", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "00U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n16U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", " aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    " + "'", str2, "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
    }

    @Test
    public void test36210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36210");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                  I!", "\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                  I!" + "'", str5, "                                                                                                  I!");
    }

    @Test
    public void test36211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36211");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("U   ", "UUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u61", "61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333", 157);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U   " + "'", str4, "U   ");
    }

    @Test
    public void test36212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36212");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("  ......  \\u00410023\\U0023\\U0023\\U002                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA  ......  \\u00410023\\U0023\\U0023\\U002", "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) '5', "                  \\U0033\\U0033\\U0033\\U0033\\U0033\\U0033\\U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("61\\\\U0020", " u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", (int) '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "         0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test36216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36216");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                   2                              ", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36217");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", "", 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test36218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36218");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("2\\3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\320032", "0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\\\\2\\\\\\\\\\2\\\\\\56156156156156156156156uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "UUUUUUUUUUu6UUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\2\\\\\\\\\\2\\\\\\56156156156156156156156uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "\\\\2\\\\\\\\\\2\\\\\\56156156156156156156156uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36220");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("    61        61 ...II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAAIIII\\U0023\\U0023\\U0023\\U0023\\U0023\\U0", "                                                                                      u\\32", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2", "       ", 91);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test36222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\u003\\u0023\\u0023\\u0023\\                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                \\3200u\\3200u\\3200u\\300u\\" + "'", str1, "                                                                                                                \\3200u\\3200u\\3200u\\300u\\");
    }

    @Test
    public void test36223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36223");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ", "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u0020", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          " + "'", str3, "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
    }

    @Test
    public void test36224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36224");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  ......  \\u00410023\\U0023\\U0023\\U0023\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...h ", 85);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("uuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuu61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuu61" + "'", str1, "uuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuu61");
    }

    @Test
    public void test36226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 611111111..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36227");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("61uuu", "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "0\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320", 380);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61uuu" + "'", str4, "61uuu");
    }

    @Test
    public void test36228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "                                                                                                                      6u666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########" + "'", str2, "U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
    }

    @Test
    public void test36229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("3\\u0023u0023\\u0023\\u0023\\u0023\\u002", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\u0023u0023\\u0023\\u0023\\u0023\\u002             " + "'", str2, "3\\u0023u0023\\u0023\\u0023\\u0023\\u002             ");
    }

    @Test
    public void test36230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    " + "'", str1, "                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ");
    }

    @Test
    public void test36231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36231");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36232");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("300000", "                    3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\161", '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111" + "'", str2, "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111");
    }

    @Test
    public void test36234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36234");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("u6      61        61        61        61                                                            ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333", 7, 297);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u6     uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333" + "'", str4, "u6     uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333");
    }

    @Test
    public void test36235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36235");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36236");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ", "61uuuuuuuuuuuuhi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61uuuuuuuuuuuuu", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36237");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("iiiiiaaaaaa                             iiiiii", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '5');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "iiiiiaaaaaa5iiiiii" + "'", str7, "iiiiiaaaaaa5iiiiii");
    }

    @Test
    public void test36238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36239");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61", 76);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                         \n\n1                                                    \n\n1     ", 460);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                             \n\n1                                                    \n\n1     " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                             \n\n1                                                    \n\n1     ");
    }

    @Test
    public void test36241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36241");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("           161\\161\\161\\161\\161\\16177777777777777777777777777", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         161\\161\\161\\161\\161\\16177777777777777777777777777" + "'", str2, "                                         161\\161\\161\\161\\161\\16177777777777777777777777777");
    }

    @Test
    public void test36244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36244");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("U       aaaaaaa       aaaaaaa", "A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ", "61\\\\u0020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   " + "'", str2, "                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ");
    }

    @Test
    public void test36246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36246");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                             6u623\\U                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "161\\161\\161\\161\\161\\161\\U6                      \n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n", 73);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36247");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\\\\\\\\\\\\\\\\\\\...HH...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\...hh..." + "'", str1, "\\\\\\\\\\\\\\\\\\\\...hh...");
    }

    @Test
    public void test36249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\u005c\\u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\\\\\\\\\\\\\...", "6161");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\..." + "'", str2, "\\\\\\\\\\\\\\...");
    }

    @Test
    public void test36251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", "UUUUUUUUUUUUUUUUUUUUUUUUUUUU..55          aaaaaaa       CCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36252");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36253");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00", "A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("        75");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75" + "'", str1, "75");
    }

    @Test
    public void test36255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...1111111111111111111111111111111111111111...", 393);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...1111111111111111111111111111111111111111..." + "'", str2, "...1111111111111111111111111111111111111111...");
    }

    @Test
    public void test36256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36256");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              AAAAAAAAA", "                     u                         ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36257");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u", "   \n\\u002                                         \n\n1           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36258");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                      ", "\\u0030\\\\\\\\", 32);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                      " + "'", str5, "                                      ");
    }

    @Test
    public void test36259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("      \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                               ", 29, (int) '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  " + "'", str3, "                                                  ");
    }

    @Test
    public void test36261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36261");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                    222222222222222222222222222222222", "6\\6\\6\\6\\6\\6\\6\\6\\6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36262");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                     u                         ", " U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36263");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny(" 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test36264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333" + "'", str1, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333");
    }

    @Test
    public void test36265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 61\\61" + "'", str1, "\\ 61\\61");
    }

    @Test
    public void test36266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36266");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u005c\\u00", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "............................", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "00U\\3200U\\3200U\\3200U\\3200U\\3200", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test36267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U", "hhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36268");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u" + "'", str1, "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
    }

    @Test
    public void test36269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("##############################################.16 ", 356, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555##############################################.16 5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555" + "'", str3, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555##############################################.16 5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test36270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                         " + "'", str1, "                                                                                                                                                         ");
    }

    @Test
    public void test36271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc", 'U', '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc" + "'", str3, "ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc");
    }

    @Test
    public void test36272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36272");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("000000000000000000000000000000000000000000000\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0000000000000000000000000000000000000000000000", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "IIIIIIIIIIIII...AAAA      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "23hh23hh23hh23hh23hh23hh23hh23hh23");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23hh23hh23hh23hh23hh23hh23hh23hh23" + "'", str1, "23hh23hh23hh23hh23hh23hh23hh23hh23");
    }

    @Test
    public void test36276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0" + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
    }

    @Test
    public void test36277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36277");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("3\\u0...", "aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                            5500u\\aaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa", "\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3..." + "'", str3, "3...");
    }

    @Test
    public void test36279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36279");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###\n\\u003\\u0023\\u0023\\u0023\\###", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\163200u\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36280");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                             ", "\\u003                                                ", 55);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("77777777777777777777777777", 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                 ...", strArray5, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                 ..." + "'", str9, "                                                 ...");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "77777777777777777777777777" + "'", str11, "77777777777777777777777777");
    }

    @Test
    public void test36281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        \\U0023\\U0023\\U0023", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", 370);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36282");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "", (int) (short) 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str6, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test36283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test36284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36284");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36285");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510HI!100", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U", 26);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test36286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36286");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                ##0U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n###                                 ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test36287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555", "6   U u\\32");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555" + "'", str2, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555");
    }

    @Test
    public void test36288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36288");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("u003                    111111111111111", "10HI!100", "23\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                              23\\u0023\\u0023\\u002                                                       ", "\n\n1                        23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36290");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                             U002322222                                             ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                        2  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                        2  " + "'", str1, "                                                                                                                                                                                                                                                                        2  ");
    }

    @Test
    public void test36292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0023u0023\\u0023\\u0023\\u0023\\u0023\\u003\\u\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023u0023\\u0023\\u0023\\u0023\\u0023\\u003\\u\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\" + "'", str1, "0023u0023\\u0023\\u0023\\u0023\\u0023\\u003\\u\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\");
    }

    @Test
    public void test36293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36293");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("222222222222222222222222222222222222222222222u6", "     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36294");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  ......  ", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36295");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                 ", "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36296");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "  U6                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36297");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("3200U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36298");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test36299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c", "#61#6161\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c" + "'", str2, "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c");
    }

    @Test
    public void test36300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36300");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                 61\n", "                                                                                                        AAAAAAA     ", (int) '2');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                 61\n" + "'", str4, "                                                 61\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test36301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36301");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0023\\u0023\\u0023\\u0023\\u002", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuu 3200u", "600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u1111111111111111111111111111111111111...", "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36303");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                 a                                                                                                                                              ", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", (int) '\\', 103);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                 a                                          61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U                                                                                         " + "'", str4, "                                                 a                                          61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U                                                                                         ");
    }

    @Test
    public void test36304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\U23\\U23\\U23\\U23\\U23\\U23\\U23", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U23\\U23\\U23\\U23\\U23\\U23\\U23" + "'", str2, "\\U23\\U23\\U23\\U23\\U23\\U23\\U23");
    }

    @Test
    public void test36305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36305");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       ", "                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...", 369);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36306");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih   2    2    2  ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("U###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###U\\32                                                                             ", "\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###U\\32                                                                             " + "'", str2, "U###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###U\\32                                                                             ");
    }

    @Test
    public void test36308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36308");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 250, 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("UUUUUU 6\\\\U0020 6\\\\U0020 6              ", 146, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test36310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36310");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36311");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray3, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!", strArray3);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "   u61    ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "23                                                                                     hi!hi!hi!");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str9, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test36312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("261                                                                                                                    ", 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "261                                                                                                                    " + "'", str2, "261                                                                                                                    ");
    }

    @Test
    public void test36313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36313");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("6u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6u" + "'", str1, "6u");
    }

    @Test
    public void test36315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36315");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" ", "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", (int) '2');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("                                           \\u005c", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray9);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, ' ', 153, 43);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test36316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36316");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "\\u0023                                                                                                                                                  hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36317");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("111111111111111111111", "61\\ 61\\61");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test36318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36318");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  \\     \\     \\     \\     \\     ", "... \\\\\\aaaaaaaaaaaaA\\16 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\     \\     \\     \\     \\     " + "'", str2, "  \\     \\     \\     \\     \\     ");
    }

    @Test
    public void test36320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36320");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...      \n\n1           ...                                                                                              ", "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuu", (int) '.');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36321");
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61616161616161616161616161", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("!ih!ih!ih   2    2    2  ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test36322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36322");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0" + "'", str1, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0");
    }

    @Test
    public void test36324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36324");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111" + "'", str1, "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111");
    }

    @Test
    public void test36325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("  \\U005C  ", "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u0022361.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\U005C  " + "'", str2, "  \\U005C  ");
    }

    @Test
    public void test36326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                   1\\61\\6161\\61\\6161\\61\\6161\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\61\\6161\\61\\6161\\61\\6161\\" + "'", str1, "1\\61\\6161\\61\\6161\\61\\6161\\");
    }

    @Test
    public void test36327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("533333333333333333333333333333\\4003233333333333333333333333333333", "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "533333333333333333333333333333\\4003233333333333333333333333333333" + "'", str2, "533333333333333333333333333333\\4003233333333333333333333333333333");
    }

    @Test
    public void test36328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36328");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!ih!ih!i", "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61", "\\U0023\\U00\\U0041\\U", 189);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!ih!i" + "'", str4, "!ih!ih!i");
    }

    @Test
    public void test36329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("u0023\\u002u0023\\u002u0023\\u002u0", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " u0023\\u002u0023\\u002u0023\\u002u0 " + "'", str2, " u0023\\u002u0023\\u002u0023\\u002u0 ");
    }

    @Test
    public void test36330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36330");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("61");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                          \\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                                           ", strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h", "");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444", strArray8, strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0023                                                                                                                                                  hi!hi!hi", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444" + "'", str12, "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0023                                                                                                                                                  hi!hi!hi" + "'", str13, "\\u0023                                                                                                                                                  hi!hi!hi");
    }

    @Test
    public void test36331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36331");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "5500u\\", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36332");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36333");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                      u003                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36334");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...", 'C');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu..." + "'", str3, " 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test36335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\u005c\\u00666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100666666666666666666666100023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u\\3200016666666666666666666660013200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32000166666666666666666666600u\\c500u\\" + "'", str1, "3200u\\3200016666666666666666666660013200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32000166666666666666666666600u\\c500u\\");
    }

    @Test
    public void test36336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("23\\u                                                                                      ", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36337");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...", "#####aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa#####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36338");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] { '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test36339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  575\\u0037200U\\", "500u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\U\\3200u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  575\\u0037200U\\" + "'", str2, "  575\\u0037200U\\");
    }

    @Test
    public void test36340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36340");
        char[] charArray22 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray22);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray22);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray22);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray22);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray22);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray22);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray22);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray22);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", charArray22);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ", charArray22);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", charArray22);
        int int34 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray22);
        boolean boolean35 = org.apache.commons.lang3.StringUtils.containsAny("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", charArray22);
        boolean boolean36 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray22);
        int int37 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...", charArray22);
        int int38 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "        \\u0034         ", charArray22);
        boolean boolean39 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "u                                                ", charArray22);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test36341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36341");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              hi!123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36342");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test36343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                              11111                                ...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\" + "'", str1, "11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\");
    }

    @Test
    public void test36344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36344");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U", "                                 0023\\u0023\\u0023\\ U020\\u0020\\u0020\\u00", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" 61\\ 61\\ 61...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0... 61\\ 61\\ 61\\", "\\61\\61\\61\\61\\61\\61aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0... 61\\ 61\\ 61\\" + "'", str2, " 61\\ 61\\ 61...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0... 61\\ 61\\ 61\\");
    }

    @Test
    public void test36346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36346");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAAAA   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhhaaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhh" + "'", str3, "         ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAAAA   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhhaaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test36347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36347");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\U0069", "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36348");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\U0023\\U002", "...uuuuuuuuuu", 25);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test36349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                                                                                                                                             ", (java.lang.CharSequence) "...3\\u23\\u23U6              c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36350");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "7");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", '2');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "                                           \\u005c");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66" + "'", str11, "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
    }

    @Test
    public void test36351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36351");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                    16uAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                         \n\n1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36352");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...                          ...", "", (int) '\n');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "       22222\\U0023\\U00\\u0041\\U002322222", (int) '\r');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0", strArray8, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                    16aaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0" + "'", str13, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
    }

    @Test
    public void test36353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36353");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) 'C', (int) 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...", "6\\ 6\\6uuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000..." + "'", str2, "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...");
    }

    @Test
    public void test36355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36355");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36356");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaac11111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaac11111111111111111111111111111111111111111" + "'", str1, "Aaaac11111111111111111111111111111111111111111");
    }

    @Test
    public void test36357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36357");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36358");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("UUUUUU 6\\\\U0020 6\\\\U0020 6              ", "\\\\0020        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36359");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...uuuuuuuuuu", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...uuuuuuuuuu" + "'", str2, "...uuuuuuuuuu");
    }

    @Test
    public void test36361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36361");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                 \\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36362");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002" + "'", str1, "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002");
    }

    @Test
    public void test36363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36363");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......", "\\u005c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36364");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "000000000000000000000000000000...             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36365");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U002", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test36366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAA     \\u0041           \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                         ", "\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...0u005cu0", "                                                                                   16u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0u005cu0" + "'", str2, "...0u005cu0");
    }

    @Test
    public void test36368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u" + "'", str1, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u");
    }

    @Test
    public void test36369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36369");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "...23\\0023\\002375757575757575757575757575757575757575757575757575757575", 566);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36370");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222\\u0032", "1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36371");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u005c");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("23                                                                                     hi!hi!hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u005c" + "'", str6, "\\u005c");
    }

    @Test
    public void test36372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36372");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\r", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6", 339);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'c');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r" + "'", str6, "\r");
    }

    @Test
    public void test36373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuu 3200u           ", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36374");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("  \n\\u0020\\\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test36375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36376");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAAAAAAAA...0U\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ..." + "'", str1, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...");
    }

    @Test
    public void test36378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("6666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6666" + "'", str1, "6666");
    }

    @Test
    public void test36379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("  \n\\u0020\\\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str2, "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test36380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("6666666666666666666666666666666666666666666663\\u0...", "0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2", "..                    0u\\00U\\3200U\\                                      43200U\\1                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6666666666666666666666666666666666666666666663 ....." + "'", str3, "6666666666666666666666666666666666666666666663 .....");
    }

    @Test
    public void test36381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36381");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("..................6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUU..55          aaaaaaa       CCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36382");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "000000000000000000000000000000", "3\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36383");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "6                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", (java.lang.CharSequence) "...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "6                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", charSequence2, "6                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test36384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36384");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                   U\\1400u\\00U\\3200U\\", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36385");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '6', 139);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test36386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36386");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAA51AAAA", "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36387");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
    }

    @Test
    public void test36388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36388");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36389");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("           \n\n", "222223200U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36390");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                          \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAA", "", 566);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36391");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" 61.##############################################", "        75");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36392");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 121, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36393");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi61iAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36394");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("        5c11111111111111111111111111 61\\ 1111111111111111111111", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023u6                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36395");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" ...                         ", "61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6", 155);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test36398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36398");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444   ...4444444444444444444444444444444444444", "hi!", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" 61..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61.." + "'", str1, "61..");
    }

    @Test
    public void test36400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36400");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36402");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '7' + "'", char1 == '7');
    }

    @Test
    public void test36403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001");
    }

    @Test
    public void test36404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36404");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36405");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "####A000U\\", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test36406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36406");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uUUUUUUUUU...", "iiiiiaaaaaa                             iiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36407");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36408");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61A000U\\" + "'", str1, "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61A000U\\");
    }

    @Test
    public void test36409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36409");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1", "...02...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa");
    }

    @Test
    public void test36411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                             7777777777777777777", "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\u005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             7777777777777777777" + "'", str2, "                             7777777777777777777");
    }

    @Test
    public void test36412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36412");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\U0023\\U...                                   ", "u61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\iui2\\4\n\n                                                                                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36414");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...", 110, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36415");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU", '7', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU");
    }

    @Test
    public void test36416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36416");
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray19);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray19);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray19);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray19);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray19);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray19);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", charArray19);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ", charArray19);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", charArray19);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray19);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", charArray19);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test36417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   2", (int) '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            2" + "'", str2, "            2");
    }

    @Test
    public void test36418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36418");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "1.61.6161.61.6161.61.6161.6", (java.lang.CharSequence) "                                                                                                                            ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126 + "'", int2 == 126);
    }

    @Test
    public void test36419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36419");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '7', 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test36420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36420");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '7', '7');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '7' + "'", char2 == '7');
    }

    @Test
    public void test36421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ", "iii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  " + "'", str2, " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ");
    }

    @Test
    public void test36422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u", 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u" + "'", str2, "                                                      00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u");
    }

    @Test
    public void test36423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0023", "AAAA51AAAAAAAA51AAAAAAA1\\U23\\u0023\\u...AAAAAA51AAAAAAA", 227);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36424");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aa        75", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36425");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "22222222222222222222uuu0023                                            222222222222222222222", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "22222222222222222222uuu0023                                            222222222222222222222" + "'", charSequence2, "22222222222222222222uuu0023                                            222222222222222222222");
    }

    @Test
    public void test36426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("cccccccccccccccccccccccccccccccccc\n     ", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 cccccccccccccccccccccccccccccccccc\n     " + "'", str2, "                                                 cccccccccccccccccccccccccccccccccc\n     ");
    }

    @Test
    public void test36427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("3200U", 189);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U" + "'", str2, "3200U");
    }

    @Test
    public void test36428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36428");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                 ...", 480);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................", "                AAAA15AAAA                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1................." + "'", str2, "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................");
    }

    @Test
    public void test36430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("1!h1", "0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1!h1" + "'", str2, "1!h1");
    }

    @Test
    public void test36431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36431");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) ' ', "                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36432");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("61\\\\u002", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36433");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0030", 178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36434");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  aaaaaaaaaaaaaaaaaaaaaaaa", 0, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                         ", "u61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                         " + "'", str3, "                                                                                                                                                         ");
    }

    @Test
    public void test36436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36436");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", "AAA51AAAA");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '3');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\" + "'", str4, "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
    }

    @Test
    public void test36437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ", 268, "...         1 61 6161 61 6161 61 6161 6...         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 616" + "'", str3, "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 616");
    }

    @Test
    public void test36438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36438");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("23\\U0023\\U002", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "   23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36440");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0035", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36441");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...023\\U0023\\U00237575757575757575757575757575757575757");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36444");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                         \n\n1    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "22222222222222222222uuu0023                                            222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(" uuuuuuuuuuU6uuuuuuuuuuu                         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " uuuuuuuuuuU6uuuuuuuuuuu                         " + "'", str2, " uuuuuuuuuuU6uuuuuuuuuuu                         ");
    }

    @Test
    public void test36447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36447");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "23");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36448");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6                                       23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6                                       23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6                                       ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\n\n\n\n\n\n\n\n\n\n\n\n                                           aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36450");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                        AAAAAAA     ", "222222222222...020u0020u0020u0020u0020u0020u0020u0020...        ", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "   ...6\\66\\6\\66\\6\\66\\6\\6                             A\\0023AAAAAAAAAAAAA                            uuuuuuuuuu...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36452");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\\\0020        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        0200\\\\" + "'", str1, "        0200\\\\");
    }

    @Test
    public void test36454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36454");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("33333333333333333333333333333333333333333333", (-1), "                                                                                                  I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33333333333333333333333333333333333333333333" + "'", str3, "33333333333333333333333333333333333333333333");
    }

    @Test
    public void test36455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36455");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("IIIIIIIIIIIII...AAAA      ", (int) (byte) 10, 930);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36456");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa      ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...11111111111111111111111111111111111111111111111111111111", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("333333333333333333333333333333333333333333u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test36457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61" + "'", str2, "61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
    }

    @Test
    public void test36458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36458");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("5544u4", 349, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36459");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("###\n\\u002                                         \n\n1", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "          \\U0023\\U00\\U0041\\U          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36463");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "1111111111111111111111111111111111111111111113\\U0003\\U01111111111111111111111111111111111111111111111111111111111111111111111111111111111111111113\\U0003\\U01111111111111111111111111111111111111111111111111111111111111111111111111111111111111111113\\U0003\\U01111111111111111111111111111111111111111111111111111111111111111111111111111111111111111113\\U0003\\U01111111111111111111111111111111111111111111111111111111111111111111111111111111111111111113\\U0003\\U011111111111111111111111111111111111111111111111111111111111161\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\i\\\\U0023\\U0023    3\\U0023\\U0023\\i\\\\U0023\\U0023...", 532);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\i\\\\U0023\\U0023    3\\U0023\\U0023\\i\\\\U0023\\U0023..." + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\i\\\\U0023\\U0023    3\\U0023\\U0023\\i\\\\U0023\\U0023...");
    }

    @Test
    public void test36465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u" + "'", str1, "u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u");
    }

    @Test
    public void test36466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36466");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("...                                                               ...");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '.' + "'", char1 == '.');
    }

    @Test
    public void test36467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36467");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 834, "...1...                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  " + "'", str3, "...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ");
    }

    @Test
    public void test36468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36468");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("023\\u0023\\u0023", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61", 90, 288);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "023\\u0023\\u002361\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61" + "'", str4, "023\\u0023\\u002361\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61");
    }

    @Test
    public void test36469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                         75                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test36470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  2  UUUUU", "61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("77777777777777777777700000000000000000000777777777777777777777", (int) 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36472");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0020\\u0##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36473");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('1', (int) '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36474");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                  5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa", (java.lang.CharSequence) "                                  AAAAAAAAAAAAA3200u");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                  5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa" + "'", charSequence2, "5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                  5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa");
    }

    @Test
    public void test36475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36475");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\\");
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("   u61    ", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", 296, 354);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 296");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str8, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test36476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("U61\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U61\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00" + "'", str2, "U61\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
    }

    @Test
    public void test36477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36477");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('i', 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test36478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36478");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ", "   8     8     8     8     8     8     8     8  8     8     8     8     8     8     8     8", 45);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36479");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                261aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "  023\\u0023       aaaaaaa                             61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 682 + "'", int2 == 682);
    }

    @Test
    public void test36480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36480");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("u0023\\u002", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 476);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test36483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36483");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'u', 117);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 117 + "'", int2 == 117);
    }

    @Test
    public void test36484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u", "\\U0023\\U00\\U0041\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u" + "'", str2, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u");
    }

    @Test
    public void test36485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36485");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test36486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36486");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", 164, 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36487");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\U002066666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36488");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 147);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 147 + "'", int2 == 147);
    }

    @Test
    public void test36489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36489");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "UUUUUUUUUUu6UUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
    }

    @Test
    public void test36491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36491");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("  \n\n1                                         ", 'u');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test36492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36492");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   ", 63, 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("11111111111u6111111111111111111111   2 11111111UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u611111111111111111111", "                                  AAAAAAAAAAAAA3200u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11111111111u6111111111111111111111   2 11111111UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u611111111111111111111" + "'", str2, "11111111111u6111111111111111111111   2 11111111UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u611111111111111111111");
    }

    @Test
    public void test36494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36494");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) " 6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0200\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36496");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76 + "'", int1 == 76);
    }

    @Test
    public void test36497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1", "1\\u00234                                      \\u0023\\u00\\U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1" + "'", str2, "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1");
    }

    @Test
    public void test36498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36498");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36499");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 'a');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray1, strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '1');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str7, "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str9, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 104, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }
}

