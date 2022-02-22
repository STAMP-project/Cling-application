import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest76 {

    public static boolean debug = false;

    @Test
    public void test38001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38001");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "3\\u003\\u", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test38002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("20u0020u0020u0020u00", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20u0020u0020u0020u00" + "'", str2, "20u0020u0020u0020u00");
    }

    @Test
    public void test38003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test38004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiii", 834, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiii" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiii");
    }

    @Test
    public void test38005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("610000000000000000000000000000000000000000000000000                                  0auu0aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "610000000000000000000000000000000000000000000000000                                  0AUU0AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U002" + "'", str1, "610000000000000000000000000000000000000000000000000                                  0AUU0AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U002");
    }

    @Test
    public void test38006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38006");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("000000000000000000000000000000000000000000000000000000000000", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0", 267);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000000000000000000000000000000000000" + "'", str3, "000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test38007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("533333333333333333333333333333\\432333333333333333333333333333333C", "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "533333333333333333333333333333\\432333333333333333333333333333333C" + "'", str2, "533333333333333333333333333333\\432333333333333333333333333333333C");
    }

    @Test
    public void test38008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38008");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U0023", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                             \\u0069                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test38009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38009");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23hi!hi!hi!                                                                          ", "                                  AAAAAAAAAAAAA3200u\\A                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38011");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\", "      AAAA...", 60);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "                                                                                                                                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "Aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "555555555555555555555555555555555555555555555555555555  ......  61555555");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38014");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...                                      57", "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0023\\U0023\\U0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu", (int) '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\U0023\\U0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu" + "'", str2, "0023\\U0023\\U0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu");
    }

    @Test
    public void test38016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38016");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", strArray9);
        java.lang.String[] strArray12 = null;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray9, strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "    16        16        16        16        16        16        16        16        16        16        16        16        16    ");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", strArray3, strArray15);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032" + "'", str4, "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str13, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023" + "'", str16, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test38017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38017");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaa", 479, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38018");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'u', (int) '5', 7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023     00U\\3200U\\3200U\\3200U\\3200U\\3200", strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test38019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("........6 \\1616 \\16 \\1616 ", "3333361                                         \n\n1                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("200u\\3200u\\3200u\\", "\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "200u\\3200u\\3200u\\" + "'", str2, "200u\\3200u\\3200u\\");
    }

    @Test
    public void test38021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38021");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "uuu0023                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38022");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test38023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hCUUUUUUuuuuuuuuuuuuuuuuuu\\4555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HcuuuuuuUUUUUUUUUUUUUUUUUU\\4555555555555555555555555" + "'", str1, "HcuuuuuuUUUUUUUUUUUUUUUUUU\\4555555555555555555555555");
    }

    @Test
    public void test38024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38024");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\61\\61\\61\\61\\u0023", 63, "                                                                             6u666");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             \\61\\61\\61\\61\\u0023" + "'", str3, "                                             \\61\\61\\61\\61\\u0023");
    }

    @Test
    public void test38025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38025");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("u0023\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222", "\\                                                u                                                005                                                c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaa" + "'", str1, "Aaaa");
    }

    @Test
    public void test38027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n.." + "'", str1, "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n..");
    }

    @Test
    public void test38028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 112, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38029");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61UUUUUUUUUUUUHI!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61UUUUUUUUUUUUU", "0\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020                       ", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("23004\\13200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001666666666666666666666666666666666666623004\\", '#', 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23004\\13200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001666666666666666666666666666666666666623004\\" + "'", str3, "23004\\13200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001666666666666666666666666666666666666623004\\");
    }

    @Test
    public void test38031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "uuuuuuuuuuuuuuuuu1u 61u 6161u 61u 6161u 61u 6161u 6uuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38032");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'A');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAu" + "'", str4, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAu");
    }

    @Test
    public void test38033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                 ...", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 ..." + "'", str2, "                                                 ...");
    }

    @Test
    public void test38034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", (int) '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            " + "'", str2, "                                                                                            ");
    }

    @Test
    public void test38035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38035");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      ", "666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38036");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 61", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test38037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38037");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38038");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "111111111", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("11111111111111111111111111111...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test38039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaa", (java.lang.CharSequence) "u0023                                                                             hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38040");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("6161616161616161616161616", "                             6  6  6  6  6  uuu                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...0u\\3114...0u\\31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("   00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ", "77777777777777777777700000000000000000000777777777777777777777\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38043");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                  AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\U00\\u0041\\U                                   ", "uu!IHu...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("111111U1111111", "...000000000000000000000000000000000000000000000000000000000000...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111U1111111" + "'", str2, "111111U1111111");
    }

    @Test
    public void test38045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                 A\\u0023AAAAAAAAAAAAAa000u\\                                 3", 685, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38046");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("575\\u0037200U\\", ".....", "61\\6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "575\\u0037200U\\" + "'", str3, "575\\u0037200U\\");
    }

    @Test
    public void test38047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\...hh...", "61......61\\61\\61\\61\\61\\61\\...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38048");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020", "161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\16177777777777777777777777777", "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020" + "'", str3, "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020");
    }

    @Test
    public void test38049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38049");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777", "6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666", 562, 110);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777776\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666" + "'", str4, "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777776\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666");
    }

    @Test
    public void test38050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###" + "'", str1, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
    }

    @Test
    public void test38051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38051");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("55555555555555555555555555555555555555555555555#####4", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", 237);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38052");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 157, "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\u005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUA\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3" + "'", str3, "61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUA\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3");
    }

    @Test
    public void test38053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38054");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u   2", "Aaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC 6...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccccccc 6..." + "'", str1, "ccccccccccccccccccccccccccccccccccccccccccccccccc 6...");
    }

    @Test
    public void test38056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38056");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "1\\61\\61\\61\\61", (java.lang.CharSequence) "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 616");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38057");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                    ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u005c", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "       ");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                       61\n                       ", strArray7, strArray11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAA                                                ", strArray2, strArray11);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str13, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                       61\n                       " + "'", str17, "                       61\n                       ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAA                                                " + "'", str18, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAA                                                ");
    }

    @Test
    public void test38058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa", "3200U\\3200U\\\\i\\3200U\\3200U\\3");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38059");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("22222\\U0023\\U00\\u0041\\U002322222", "\\u003");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test38060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38060");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 116, "22222222222222222\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str3, "                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test38061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ", "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38063");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "57");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3261\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", "                                         \n\n1                                                    \n\n1     ", (int) '\n');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333", strArray13, strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("222222222222222222222222222261\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\612222222222222222222222222222", strArray7, strArray13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa      " + "'", str5, "aaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaa      " + "'", str6, "aaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaaaaaa" + "'", str8, "aaaaaaa");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaa" + "'", str9, "aaaaaaa");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333" + "'", str18, "3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "222222222222222222222222222261\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\612222222222222222222222222222" + "'", str19, "222222222222222222222222222261\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\612222222222222222222222222222");
    }

    @Test
    public void test38064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" u004 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " u004 " + "'", str2, " u004 ");
    }

    @Test
    public void test38065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                 ####a\n", 685);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test38067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("6666666666666666                                                                                            AAAAAAA      66666666666666666", (int) '0', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6666666666666666                                                                                            AAAAAAA      66666666666666666" + "'", str3, "6666666666666666                                                                                            AAAAAAA      66666666666666666");
    }

    @Test
    public void test38068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38068");
        char[] charArray9 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U002322222", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test38069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", " 1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\U 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38070");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("U6623\\U6623\\U6623\\U6623\\U6623\\U6623U666", '0');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'U' + "'", char2 == 'U');
    }

    @Test
    public void test38071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("    \n", "  UUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUU" + "'", str2, "UUU");
    }

    @Test
    public void test38072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38072");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38073");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00  " + "'", str1, "    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00  ");
    }

    @Test
    public void test38074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        " + "'", str2, "                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ");
    }

    @Test
    public void test38075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38075");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 518);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu" + "'", str3, "u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu");
    }

    @Test
    public void test38076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38076");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\ 61\\ 61", 'h');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'h');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61\\ 61\\ 61" + "'", str4, "61\\ 61\\ 61");
    }

    @Test
    public void test38077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38077");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("3322u\\3322u\\3322u\\...2u\\3322u\\3322u\\3322u\\3322u\\3322u\\33\\u22A8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3322U\\3322U\\3322U\\...2U\\3322U\\3322U\\3322U\\3322U\\3322U\\33\\U22A8" + "'", str1, "3322U\\3322U\\3322U\\...2U\\3322U\\3322U\\3322U\\3322U\\3322U\\33\\U22A8");
    }

    @Test
    public void test38078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                        6u666u                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                        6u666u                                        " + "'", str1, "                                        6u666u                                        ");
    }

    @Test
    public void test38079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38079");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###        ", "U0023\\U00\\u0041\\U");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38080");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("23\\U0023\\U");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  2   ", (int) (byte) 100, 98);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'A', 7, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test38081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\16");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\" + "'", str1, "61\\");
    }

    @Test
    public void test38082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38082");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38083");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("75", ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1", strArray6, strArray9);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", strArray6);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\r');
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "AAAA51AAAA");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u003", strArray6, strArray20);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray25);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray25, strArray30);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!", strArray25);
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.stripAll(strArray25, "   u61    ");
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray34);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.stripAll(strArray34, "23                                                                                     hi!hi!hi!");
        java.lang.String[] strArray39 = org.apache.commons.lang3.StringUtils.stripAll(strArray34, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\\\", strArray6, strArray34);
        java.lang.String[] strArray41 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "75" + "'", str11, "75");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\u003" + "'", str21, "\\u003");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str31, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\\\" + "'", str40, "\\\\");
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test38084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhhh", "023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38085");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '.');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test38086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00...", "0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00..." + "'", str2, "...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00...");
    }

    @Test
    public void test38087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38087");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38088");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0055                                            1111111111111111111111111111111111111111111111", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ", '0', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      " + "'", str3, "      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ");
    }

    @Test
    public void test38090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38090");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\", 300);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38091");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("uUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'u' + "'", char1 == 'u');
    }

    @Test
    public void test38092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                           ", 87, "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                           " + "'", str3, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                           ");
    }

    @Test
    public void test38093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38093");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("UUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u61", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38094");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0023\\U\\", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38095");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ", "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38096");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034......   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...                                                         ", 834);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test38098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                        \\u0023\\u\\", 161);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        \\u0023\\u\\" + "'", str2, "                                                                                                        \\u0023\\u\\");
    }

    @Test
    public void test38099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38099");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u00", "23\\U0023\\U...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "                               UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\0u00020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38102");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("   2     ...                                ...    \\U002", 'C');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test38103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38103");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("IUI0020\\4\n\n.............................................................................", "         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38104");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0055", "", 886);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\\', 189, 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test38105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38105");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38106");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("000000000U0023\\U0023\\U0023\\U...", "\\u00c\\u00", 929);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38107");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38108");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("    u0034                                                                                          ", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("61\\61\\6", "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\6" + "'", str2, "61\\61\\6");
    }

    @Test
    public void test38110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38110");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("iiiiii                                                            iiiiii", "", "        61        61        6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiii                                                            iiiiii" + "'", str3, "iiiiii                                                            iiiiii");
    }

    @Test
    public void test38112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("u002322222                                                              ", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u002322222                                                              " + "'", str2, "u002322222                                                              ");
    }

    @Test
    public void test38113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38113");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111113\\u1111111111111111111111111111111111111111111116111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510HI!100", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38115");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0013200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001", "\\u0023                                                                                     hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                             ", (java.lang.CharSequence) " 11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38117");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...UUUUUUUUUUUUUUUUU                   ", "666666666666...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38118");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", '0');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0", "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0" + "'", str2, "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0");
    }

    @Test
    public void test38120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38120");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "3333361                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38121");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\U0023\\U00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38122");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00223\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u002", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", 886);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38123");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("1\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38124");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\U0023\\U00\\U0041\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38125");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu", 'A');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu" + "'", str3, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu");
    }

    @Test
    public void test38126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("161\\ 61\\ 6161\\ 61\\ 6161\\ ", 237, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161\\ 61\\ 6161\\ 61\\ 6161\\ " + "'", str3, "161\\ 61\\ 6161\\ 61\\ 6161\\ ");
    }

    @Test
    public void test38127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                     61\\\\u0020                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\\\u0020" + "'", str1, "61\\\\u0020");
    }

    @Test
    public void test38128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38128");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAAAAAA                             HHHHHHHHHHHHHHHHHAAAAAA                             HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38129");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38131");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38132");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'u');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38133");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU" + "'", str1, "57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU");
    }

    @Test
    public void test38134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38135");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    ", '1');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("u003                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u003                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "u003                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "33333333333333333333");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38139");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...", 50, 119);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU..." + "'", str3, "         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
    }

    @Test
    public void test38140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "AAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAA" + "'", str1, "AAAAAAAA");
    }

    @Test
    public void test38142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                 ...", 356, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "                                 ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test38143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38143");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test38144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                 A\\u0023AAAAAAAAAAAAA                      ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38145");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                            uuuuuuuuuuuuuuuuuu", "                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhh", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhh                  " + "'", str2, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhh                  ");
    }

    @Test
    public void test38147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38147");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", "  ......  \\u00410023\\U0023\\U0023\\U002                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA  ......  \\u00410023\\U0023\\U0023\\U002");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "aaaaac500\\0\\0200\\0200\\0200\\0200\\0200\\\n###");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38149");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ", '0');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "", 117, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test38150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38150");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("u6      61        61        61        61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38151");
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaa\\\\\\", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray15);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      ", charArray15);
        java.lang.Class<?> wildcardClass26 = charArray15.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 57 + "'", int25 == 57);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test38152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38152");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("111111111111111111111111111111111111\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...11111111111111111111111111111111111111111U", "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\u");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38153");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!ih!ih!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38154");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\n\n\n\n\n1", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n1" + "'", str2, "\n\n\n\n\n1");
    }

    @Test
    public void test38156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38156");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("575\\u0037200U", "\\U002322222", "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "575#u##u7\\###" + "'", str3, "575#u##u7\\###");
    }

    @Test
    public void test38157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6" + "'", str2, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6");
    }

    @Test
    public void test38158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "6U665CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38159");
        char[] charArray9 = new char[] { '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("23                                                                                     hi!hi!hi!", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0034", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\05c0000000000000000000000000000000000000000000000000", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test38160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38160");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                       \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\", "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666575757575757575757575757575757575757575757575757575111666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38161");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", 'A');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38162");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "       ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "           \n\n161\\ 61\\ 6");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str6, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str10, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str14, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38163");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Aaaaaaaaaaa...616161616161616161616161", "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38164");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111", "400u\\00U\\3200U\\", 130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38165");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                   0##                                                  ", 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38166");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ", "\\                                                u                                                005                                                c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38167");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\U00685555555555555555555555555555555555555555555555555555555555555555555555", (int) 'C');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ", "                                                                                                                                                                                                                   1\\61\\6161\\61\\6161\\61\\6161\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu " + "'", str2, " 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ");
    }

    @Test
    public void test38169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38169");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "23AAAAAAAAAAAAA0u0A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa", "3333361                                         \n\n133323\\U                                                                                             3333361                                         \n\n1333");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38171");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 263, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38172");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                 \\u0023                                                                                     hi!hi!hi!  ", "020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38173");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", (java.lang.CharSequence) "1h!1020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u002");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\" + "'", charSequence2, "u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test38174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38174");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...3\\u0023\\u00231\\40032", " 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116", "     8     8     8     8   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...3\\u0023\\u00231\\40032" + "'", str3, "...3\\u0023\\u00231\\40032");
    }

    @Test
    public void test38175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38175");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("6                                     ", "...                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38176");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23hi!hi!hi!", "        #######    61        61        615c    61        61        61                                                                                                                                                                                                                                                                                                                                    ", 29);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38177");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...", 296, "             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                                      200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32              " + "'", str3, "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                                      200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32              ");
    }

    @Test
    public void test38178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38178");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("uuuuuuuuuuuu 3200u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUU 3200U" + "'", str1, "UUUUUUUUUUUU 3200U");
    }

    @Test
    public void test38179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38179");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", 65, "\\aua005aca\\aua0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00" + "'", str3, "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
    }

    @Test
    public void test38180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38180");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                     ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test38181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("75", "3\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "75" + "'", str2, "75");
    }

    @Test
    public void test38182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38182");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  2   ", "                                                  75", (int) (short) 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test38183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   ", "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("8     8     8     8     8     8     8     8  8     8     8     8     8     8     8    ", 136, 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38185");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38186");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...      \n\n1           ...                                                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38187");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1161\\", "AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test38188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38188");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str2, "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test38189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38189");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ", "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", 53);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ###", 543, 255);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test38190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38191");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("23\\u0023\\u0023          3    23\\u0023\\u0023      ", "111111116 \\16 \\16 \\16 \\16 \\16", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38192");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", "\\u0075", (int) (byte) 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\n\n");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '6', 86, 70);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str5, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test38193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38193");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "55555555555", 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str3, "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test38194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38194");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\r\r\r\r\r\r", (java.lang.CharSequence) "11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.1111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 243 + "'", int2 == 243);
    }

    @Test
    public void test38195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38195");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("3200u\\3200");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38196");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\  6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6", '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test38197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38197");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u\\" + "'", str1, "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u\\");
    }

    @Test
    public void test38199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38199");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("16u", 156);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16u" + "'", str2, "16u");
    }

    @Test
    public void test38201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38201");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("111111111111111111111U", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
    }

    @Test
    public void test38202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38203");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...11111111111111111111111111111111111111111111111111111111", "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...11111111111111111111111111111111111111111111111111111111" + "'", str2, "...11111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00", 260, 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test38206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#6666\r\r\r\r\r\r\r##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u00230023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u00230023\\u0023\\u0023\\u0023" + "'", str1, "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u00230023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test38208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38208");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\nu002                                         \n\n1                                        ", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38209");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\", 'I');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '6' + "'", char2 == '6');
    }

    @Test
    public void test38210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38210");
        char[] charArray6 = new char[] { ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u0023                                            ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   u61    ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUaaaaaaaaaaaaa\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test38211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38211");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 60, 930);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       " + "'", str2, "...       ");
    }

    @Test
    public void test38213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                         ", 189, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38215");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "023\\U0023\\U0023\\U0023    ", 25);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("          aaaaaaa       ", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 25 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test38216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("i!         ", 245);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.", 122, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.###################" + "'", str3, "\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.###################");
    }

    @Test
    public void test38218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38218");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u005c\\u00");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1aaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      6\\16");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#u#005#c##u#00" + "'", str5, "#u#005#c##u#00");
    }

    @Test
    public void test38219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38219");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                u                                                ", "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38220");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaa                             ", "  2   ", 104);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                                           \\\\0033005");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaa                             " + "'", str4, "aaaaaa                             ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaa" + "'", str6, "aaaaaa");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test38222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38222");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test38223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38223");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...                   \n\n1", "                                                     23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", "\\U0075");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\n1" + "'", str3, "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\n1");
    }

    @Test
    public void test38224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38224");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("222222222222222222222222222222222222222222222u                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...", 178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38225");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hhhhhhhhhhhhhuuuuuuu", (java.lang.CharSequence) "uuuuuuuuuaaaaaaa       3200u\\32033333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hhhhhhhhhhhhhuuuuuuu" + "'", charSequence2, "hhhhhhhhhhhhhuuuuuuu");
    }

    @Test
    public void test38226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "U00234                                      \\U0023\\U00\\U0                    ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38227");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38228");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\400326666666666666666666666666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test38229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38229");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 " + "'", charSequence2, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 ");
    }

    @Test
    public void test38230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444", 192, 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444" + "'", str3, "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
    }

    @Test
    public void test38231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     ", 255, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "555555555555555555555555555555555555555555555555555555555555555555555555555555555\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     5555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str3, "555555555555555555555555555555555555555555555555555555555555555555555555555555555\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     5555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test38232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38232");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 61", strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0020", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10hi!100" + "'", str10, "10hi!100");
    }

    @Test
    public void test38233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38233");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (short) 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test38234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Aaaaaaaaaaa...", "16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222AAAAAAAAAAAAA U 6AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa..." + "'", str2, "aaaaaaaaaa...");
    }

    @Test
    public void test38235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38235");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", str1, "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test38237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38238");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!", "###", 55);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test38239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38239");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("1        61        615c    61        61        61", "161\\16161\\161");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38241");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "1111111111123\\U                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("1111111166662222222222222222222222222222222221111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111166662222222222222222222222222222222221111111" + "'", str1, "1111111166662222222222222222222222222222222221111111");
    }

    @Test
    public void test38243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38243");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38244");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u005c\\u00666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100666666666666666666666100023\\u0023", "                                                                                                                     ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38245");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\222223200U\\1400u\\00U\\3200U\\22222", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38246");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] { '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("00u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaa", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test38247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38247");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0063");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023           ", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38249");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '1', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test38250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38250");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0023\\U0023\\U0023\\U0023\\U0023\\U004444444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6" + "'", str1, "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
    }

    @Test
    public void test38252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38252");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61", (java.lang.CharSequence) "uuuuuuuuuuU6uuuuuuuuuuu                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 203 + "'", int2 == 203);
    }

    @Test
    public void test38253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38253");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38254");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                 ...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                            uuuuuuuuuuuuuuuuuu", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuu" + "'", str2, "uuuuuuuuuu");
    }

    @Test
    public void test38256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38256");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...        75                                                                                                                              ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 139 + "'", int4 == 139);
    }

    @Test
    public void test38257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                           Uu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Uu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\" + "'", str1, "Uu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
    }

    @Test
    public void test38258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" 6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     ", "   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     " + "'", str2, "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     ");
    }

    @Test
    public void test38259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38259");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Uu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", "...  u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("U0023                                            ", 117, "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U0023                                            66666666666666666666666666666666666666666666666666666666666666666666" + "'", str3, "U0023                                            66666666666666666666666666666666666666666666666666666666666666666666");
    }

    @Test
    public void test38261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38261");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", "3\\U                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("       aaaaaaa          ", 370, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaa          " + "'", str3, "...aaaaaa          ");
    }

    @Test
    public void test38263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38263");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("11111111111111111111 1111111111111111111111\\6 ", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("UUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UU" + "'", str3, "UU");
    }

    @Test
    public void test38265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("UUUUUUUUUUUU 3200U", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUU 3200U" + "'", str2, "UUUUUUUUUUUU 3200U");
    }

    @Test
    public void test38266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              AAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str2, "16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test38267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("6\\ 6\\6uuuuuuuuuuuuuuuuuuuuuuuuuu", 250, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("UUUUUU61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "                                                        0U\\                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUU61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" + "'", str2, "UUUUUU61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
    }

    @Test
    public void test38269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
    }

    @Test
    public void test38270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", 518);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                            \\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###                                                                                                                             " + "'", str2, "                                                                                                                            \\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###                                                                                                                             ");
    }

    @Test
    public void test38271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38271");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("777777777777777777777777777777777777777777    61    7777777777777777777777777777777777777777777", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38272");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("I!                                                                                   ", "u6      61        61        61        6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                   ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38274");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              ", 82, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("10hi!10010hi!10010h\\400310hi!10010hi!10010hi", "3\\U                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\U                      " + "'", str2, "3\\U                      ");
    }

    @Test
    public void test38276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38276");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\61\\61\\61\\61\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("111111111111111111111u61111111111111111111111123\\U                                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111111111111111111111u61111111111111111111111123\\U                                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "111111111111111111111u61111111111111111111111123\\U                                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38278");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("UU03UUU03", "   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu..." + "'", str2, "61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test38280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38280");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u", 18);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38281");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray13 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence3, charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023                                                                                     ", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test38282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 6\\\\U0020 6\\\\U0020 6              " + "'", str1, "...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 6\\\\U0020 6\\\\U0020 6              ");
    }

    @Test
    public void test38283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                   ...", 'c');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   ..." + "'", str2, "                   ...");
    }

    @Test
    public void test38284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38284");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 43, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38285");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38286");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\", "1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38287");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAA15AAAA", "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("u0023\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str1, "u0023\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test38289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38289");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...                                 ", "u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 563, 245);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                                 u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str4, "...                                 u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test38290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38290");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", "                                                                                                 ", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38291");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("               aaaaaaaaaaaaa3200\\a                                 ", "                   0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test38292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38292");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61", "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", (int) (byte) 10);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\U002322222", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     \\0023\\00\\u0041\\0023     ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " 61" + "'", str7, " 61");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 61" + "'", str9, " 61");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test38293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38293");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("11111111111111111111111111222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38294");
        char[] charArray5 = new char[] { ' ' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u0023                                            ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test38295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38295");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                 \\uhi!hi!hi!                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38296");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                           1\\u00234                                      \\u0023\\u00\\U0                    ..", (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test38297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38297");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\16120\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ", "0020\\u0##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...3\\u23\\u23U6\\UUU02\\UUU02\\UUU02\\aaaaaaaaaa...", "\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0\\\\0020        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...3\\u23\\u23U6\\UUU02\\UUU02\\UUU02\\aaaaaaaaaa..." + "'", str2, "...3\\u23\\u23U6\\UUU02\\UUU02\\UUU02\\aaaaaaaaaa...");
    }

    @Test
    public void test38299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38299");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                         \n\n1                        23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ", (java.lang.CharSequence) "......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38300");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", " 61\\\\u002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                           U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U             ", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 105");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa      " + "'", str5, "aaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaa      " + "'", str6, "aaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test38301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...    ...uuuuu61uuuuuuuuuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38302");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...11111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38303");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u005c", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                                                                 2  ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "0\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u005c" + "'", str8, "\\u005c");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u005c" + "'", str9, "\\u005c");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test38304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38304");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0020");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("1111111111111111111111111111", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\1111111111111111111111111111u11111111111111111111111111110020" + "'", str7, "\\1111111111111111111111111111u11111111111111111111111111110020");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0020" + "'", str11, "\\u0020");
    }

    @Test
    public void test38305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323", 11, '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323" + "'", str3, "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323");
    }

    @Test
    public void test38306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38306");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "6161...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38307");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("666u6", 0, 288);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "666u6" + "'", str3, "666u6");
    }

    @Test
    public void test38308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00", "                                                                                               555555555555555                                                                                               ", "                                                                                                                             0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38309");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38310");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                                      200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38311");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '3' + "'", char1 == '3');
    }

    @Test
    public void test38312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38312");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222\\u0032", "\\      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaa", 48);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                           \\\\0033005c", "U0023                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           \\\\0033005c" + "'", str2, "                                           \\\\0033005c");
    }

    @Test
    public void test38314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
    }

    @Test
    public void test38315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38315");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("a         ", "        #######    61        61        615c    61        61        61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38316");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U002322222", "...U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U...", 96);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("23i23i23i23iui31i23i23i23i23", "6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "", "1\\ 61\\ 6");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38319");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "", (int) 'h');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test38320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...", "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA..." + "'", str2, "      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...");
    }

    @Test
    public void test38321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38321");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u6", "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068", (int) '2');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("    UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU    ", "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U" + "'", str2, "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
    }

    @Test
    public void test38323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("c5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c5" + "'", str1, "c5");
    }

    @Test
    public void test38324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055" + "'", str2, "aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055");
    }

    @Test
    public void test38325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38325");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38326");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U0055", "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test38328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                    \\4   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38329");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                    ", "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAA  6  6  6  6  6  uuu", "uuu0023                                            ", 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                    " + "'", str4, "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test38330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38330");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                    \n                     ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "6666666666666666666666666666666666666666666666666666622222\\U0023\\U00\\u0041\\U002322222                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "CCC                              23\\u0023\\u0023\\u0023\\UCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38332");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                         \n\n1                                                    \n\n", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test38333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "023AAAA51AAAA0023AAAA51AAAA0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ", (int) 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     " + "'", str2, "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ");
    }

    @Test
    public void test38335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38335");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", '6');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'U' + "'", char2 == 'U');
    }

    @Test
    public void test38336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("U6", "6\\\\u0020");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38337");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                               i!                                                                                                                                                                                                                  ", 7, 105);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                                   ..." + "'", str3, "...                                                                                                   ...");
    }

    @Test
    public void test38338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000", 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     ...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000" + "'", str2, "                                                     ...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
    }

    @Test
    public void test38339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38339");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002" + "'", str1, "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002");
    }

    @Test
    public void test38340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38340");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                     ...", "111", 177);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38341");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("U0023\\U002375757575757575757575757575757575757575757575757575757575", 563, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777776\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666", "   U61    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38343");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    " + "'", str3, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    ");
    }

    @Test
    public void test38344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38344");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32          aaaaaaa       u61\\61\\61\\61\\61\\", 177);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38345");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0023\\U0023\\U0023\\U0023\\U0023\\U004444444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test38346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "U00234                                      \\U0023\\U00\\u0                    ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                     61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                     61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                                     61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38348");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '6', 30, 173);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 136");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38349");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "2\\u005c                                               ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2\\u005c                                               ..." + "'", str1, "2\\u005c                                               ...");
    }

    @Test
    public void test38350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38350");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##0U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n###");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                       AAAAAAAAAAAAA3200u\\A                                      ", "\n     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       AAAAAAAAAAAAA3200u\\A                                      " + "'", str2, "                                       AAAAAAAAAAAAA3200u\\A                                      ");
    }

    @Test
    public void test38352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38352");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", 349, "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ " + "'", str3, "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
    }

    @Test
    public void test38353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38353");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAA\\20UUU\\20UUU\\20UUU\\                                               ", "                AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                 ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 172 + "'", int4 == 172);
    }

    @Test
    public void test38354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38354");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "00u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38355");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000", 263, '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" + "'", str3, "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
    }

    @Test
    public void test38356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0AAAAAAAAAAAAAAAAAAAAAAAC5AAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                             6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 0023\\u0023\\u0023\\ U020\\u0020\\u0020\\u00", "...                             AAAA15AAAA                                 AAAA15AAAA               ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38358");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.substringsBetween("", "\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   ", " 61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa             U0023\\U002U0023\\U002U0023\\U002U0             U0023\\U002U0023\\U002U0023\\U002U0             U0023\\U002U0023\\U002U0023\\U002U0             U0023\\U002U0023\\U002U0023\\U002U0        ", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                             6u623\\U", strArray5, strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                             6u623\\U" + "'", str9, "                                                                             6u623\\U");
    }

    @Test
    public void test38359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", (int) (short) 0, "\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    " + "'", str3, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
    }

    @Test
    public void test38360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 460);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu61uuuuuuuuuuuuuuuuuu3\\u0...\\u00" + "'", str1, "      3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu61uuuuuuuuuuuuuuuuuu3\\u0...\\u00");
    }

    @Test
    public void test38362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38362");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "u61uuuuuuu", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23                                               ...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test38363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38363");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23                                                                                     hi!hi!hi!", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("   61        61                                                       ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test38364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38364");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 a", "                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38365");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "                                                                                                   ");
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test38366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16", "                          \\u0023\\u0023\\u0023\\u0023\\u0023\\16                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38367");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("23\\u0023\\u...                                   UUUUUUUUUUUUUUUUUUUUU", "...h    h...                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h...", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38369");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2 2 2 2 4444444444444 1 1", "...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h... ", 227);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38370");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("222222222222222222222222222222222222222222222222222222222222222222222222222222 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              2222222222222222222222222222222222222222222222222222222222222222222222222222222", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("3333361                                         \n\n133323\\u                                                                                             3333361                                         \n\n1333", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test38371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38371");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "U005cu0u005cu0u0023Uu005cu0u005cu0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test38372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38372");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626" + "'", str1, "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626");
    }

    @Test
    public void test38373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...3u6              aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38374");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "666666      66666", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38375");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0032", "75", "6...0000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0032" + "'", str3, "\\u0032");
    }

    @Test
    public void test38376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U", "16U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U" + "'", str2, "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U");
    }

    @Test
    public void test38377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38377");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!", "61\\ 61\\ 61\\ 61\\ 61\\ 611111111..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38378");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666................U0023                                            ................", "43\\0043\\0043\\0043\\0043\\0043\\0043\\0043U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ", "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             " + "'", str2, "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ");
    }

    @Test
    public void test38380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38380");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test38381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\\iui2\\4\n\n", "222222222222222222222222222222222222222222222u6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\iui2\\4\n\n" + "'", str2, "\\iui2\\4\n\n");
    }

    @Test
    public void test38382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38382");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                               !ih!ih!ih", "004");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38383");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                            5a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u" + "'", str2, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u");
    }

    @Test
    public void test38385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ", "\\u003");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU " + "'", str2, "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ");
    }

    @Test
    public void test38386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38386");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\", "####AU", (int) '2');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\" + "'", str4, "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\");
    }

    @Test
    public void test38387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38387");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                            AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0", ".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0" + "'", str2, "u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0");
    }

    @Test
    public void test38389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                         ..", 33, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                         .." + "'", str3, "                                                         ..");
    }

    @Test
    public void test38390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38391");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u0023                                            ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "#", 115, 105);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test38392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38392");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa      ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...11111111111111111111111111111111111111111111111111111111", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U6663\\u6623\\u6623\\u6623\\u6623\\u6623UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu662", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test38393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                  75", 'I', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  75" + "'", str3, "                                                  75");
    }

    @Test
    public void test38394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38394");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\" + "'", str1, "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
    }

    @Test
    public void test38395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", 148);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                            " + "'", str2, "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                            ");
    }

    @Test
    public void test38396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa", "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38397");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("666666666666666666666666666666666666666666                                                                                                                                                              ...666666666666666666666666666666666666666666", "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "666666666666666666666666666666666666666666                                                                                                                                                              ...666666666666666666666666666666666666666666" + "'", str3, "666666666666666666666666666666666666666666                                                                                                                                                              ...666666666666666666666666666666666666666666");
    }

    @Test
    public void test38398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38398");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 'A');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("55555555555                                  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test38399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38399");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", 115);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38401");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0023");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("h", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u0023" + "'", str6, "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u0023");
    }

    @Test
    public void test38402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               ", 135, (int) 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               " + "'", str3, "...0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               ");
    }

    @Test
    public void test38403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38403");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                 cccccccccccccccccccccccccccccccccc\n     ", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38404");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\\\\\\\\\\\\\\\\\\\...hh...", "11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111", 72);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38405");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" 1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\U 1", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38406");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0\\u0020\\u000\\u0020\\u000\\u0020161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("cccccccccccccccccccccccccccccccccccccccccccccccccccccc", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test38407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("23 U  23 U", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38408");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("41");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "41" + "'", str1, "41");
    }

    @Test
    public void test38409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38409");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...............................................................................\\u0034", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".............................." + "'", str2, "..............................");
    }

    @Test
    public void test38411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38411");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                        \\u003 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700", 'C', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700" + "'", str3, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700");
    }

    @Test
    public void test38413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3u61\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U", "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38414");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c\\u00", "                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U..." + "'", str2, "\\U0023\\U...");
    }

    @Test
    public void test38416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38416");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "6\\ 6\\ 6\\u0023\\u0023\\u0023\\u002 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38417");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\16120\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ", 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38418");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaa23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6              aaaaaaaaa", "1\\U00234                                      \\U0023\\U00\\u", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaa23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6              aaaaaaaaa" + "'", str3, "aaaaaaaaa23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6              aaaaaaaaa");
    }

    @Test
    public void test38419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                           ", "                                                                                             U23");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                           " + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                           ");
    }

    @Test
    public void test38420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38420");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...                                    ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38421");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("3232323232323                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3232323232323                                                 " + "'", str1, "3232323232323                                                 ");
    }

    @Test
    public void test38422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38422");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "3200U\\3200U\\\\i\\3200U\\3200U\\3", "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38423");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                     23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", "...      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38424");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                               \\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0                                  ", "                                                                                                        aaaaaaa     ", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38425");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38426");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38427");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38428");
        char[] charArray11 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23                                                                                     hi!hi!hi!", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("aaaa                                                 ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("!ih!ih!ih   2    2    2    2    2    2    2    2    2  ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test38429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38430");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\u", "                                                                                        iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "A000u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\U0043");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", "UUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test38434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38434");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "u003aaaaaa                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 17, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ", 161, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       " + "'", str3, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test38437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38437");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\4", 54, 157);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38438");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaa3aaaaaaaaaaaaaaaaaaaaaaaaaa", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38439");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "22222222222222222222222222222222222222241");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38440");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\", "2 2 2 2 4444444444444 1 1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38441");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("........................................................................................1111111     ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '.' + "'", char1 == '.');
    }

    @Test
    public void test38442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38442");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("22222\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22222\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023..." + "'", str2, "22222\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...");
    }

    @Test
    public void test38443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38443");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test38444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 84, 520);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38445");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("33", "AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38446");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6", 14, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6" + "'", str3, " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
    }

    @Test
    public void test38447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38447");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'C', 288);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288 + "'", int2 == 288);
    }

    @Test
    public void test38448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38448");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("2                                        uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \n\n1                                                                                                                               ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", 460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38449");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                      u003                    ", "55555555555", "\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U                                            ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38451");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("3200u                            aaaaaaaaaaaaa3200\\a", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38452");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61\\\\U0020", (java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38453");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("U0023\\u0... U", "5555555\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38454");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...                                                                                                                 ", (int) '7', 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            " + "'", str3, "                            ");
    }

    @Test
    public void test38455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38455");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23A23A23A23AuA31A23A23A23A23", "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38456");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  2   ", "41AAAAAAAA");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("                              11111                             ", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2" + "'", str6, "2");
    }

    @Test
    public void test38457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38457");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                                     ...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38458");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 6, 155);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38459");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "...\r                                                                                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                     UUUUUUUUUU...                                                                                     ", '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     UUUUUUUUUU...                                                                                     " + "'", str2, "                                                                                     UUUUUUUUUU...                                                                                     ");
    }

    @Test
    public void test38462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38462");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "......A000u\\                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test38463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38463");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("2", "         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", 245);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38465");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test38466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38466");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                ", "10hh!10hh1!10hh1!10hh1!1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38467");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\\\0020", "65                                  5a", 7, 94);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\002065                                  5a" + "'", str4, "\\\\002065                                  5a");
    }

    @Test
    public void test38468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("   ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   ." + "'", str1, "   .");
    }

    @Test
    public void test38469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) " 61\\\\u0020                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38470");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "  ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38471");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u", "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ", 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777", "UUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38473");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'c', 88, 41);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("...6\\66\\6\\66\\6\\66\\6\\6           \\u0\\u005                                                                                          \\u0\\u005", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test38474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38474");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...", '2', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h..." + "'", str3, "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
    }

    @Test
    public void test38475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38475");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0063");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38476");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\u0068", "IIIIIIIIII0023\\u0...IIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test38477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test38478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaa...", "                                                                                                                                                            000000000000000000000000000000...             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaa...");
    }

    @Test
    public void test38479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...000000000000000000000000000000000000000000000000000000000000...", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ...000000000000000000000000000000000000000000000000000000000000..." + "'", str2, "           ...000000000000000000000000000000000000000000000000000000000000...");
    }

    @Test
    public void test38480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032" + "'", str2, "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
    }

    @Test
    public void test38481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                      \\U0023\\U00\\u0                    ..4                           1\\U0023", "575#u##u7\\###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      \\U0023\\U00\\u0                    ..4                           1\\U0023" + "'", str2, "                                      \\U0023\\U00\\u0                    ..4                           1\\U0023");
    }

    @Test
    public void test38482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38482");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0043", "...hhhhhhhhhhhhhhhhhhhhhU61hhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38483");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...                                 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                 ..." + "'", str1, "...                                 ...");
    }

    @Test
    public void test38484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38484");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 936, (int) 'i');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38485");
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                   0041hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ......................................", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test38486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38486");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         \n\n1                                         ", "                                       aaaaaaaaaaaaa\\\\\\", 2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                         \n\n1                                         " + "'", str4, "                                         \n\n1                                         ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test38487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38487");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          11111111111u6111111111111111111111          ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test38488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("23\\U0023\\U...                                   ", "61  \\\\0020                                                                                 \\  \\\\0020                                                                                 uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\U0023\\U...                                   " + "'", str2, "23\\U0023\\U...                                   ");
    }

    @Test
    public void test38489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38489");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...", "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) '\\');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\  6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6" + "'", str1, "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
    }

    @Test
    public void test38491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38491");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test38492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str1, "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test38493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Aaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       aaaaaaA" + "'", str1, "       aaaaaaA");
    }

    @Test
    public void test38494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38494");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("61\n", 10, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55561\n5555" + "'", str3, "55561\n5555");
    }

    @Test
    public void test38495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38495");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                         U0023\\U002U0023\\U002U0023\\U002U0", "   00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ", (int) '.');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            U0023\\U002U0023\\U002U0023\\U002U0" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            U0023\\U002U0023\\U002U0023\\U002U0");
    }

    @Test
    public void test38496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38496");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) " 61\\ 61\\ 61...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0... 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38497");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U003 ", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111111111111", "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111111111111" + "'", str2, "11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38499");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262 + "'", int2 == 262);
    }

    @Test
    public void test38500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0000000000000000000000000000000000000000000000000\\u0037", (int) '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0037" + "'", str2, "\\u0037");
    }
}

