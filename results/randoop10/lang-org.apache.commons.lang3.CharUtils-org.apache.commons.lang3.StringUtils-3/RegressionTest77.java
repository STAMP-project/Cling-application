import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest77 {

    public static boolean debug = false;

    @Test
    public void test38501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38501");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  2   ", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U0023", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "22222222222222222222222222222222222222241AAAAAAAA", charArray16);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 39 + "'", int26 == 39);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test38502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi", "aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi" + "'", str2, "10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi");
    }

    @Test
    public void test38503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38503");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                             23\\u###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u", "1111111111111                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38504");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                              11111                                ", " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38505");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                         ...0023h\\huh0023h\\huh0023h                            ...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38506");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        ", strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 85 + "'", int4 == 85);
    }

    @Test
    public void test38507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38507");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", "###\n\\u002                                         \n\n1         1        61   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38508");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                      A\\u0023AAAAAAAAAAAAA                                       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38509");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                       ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("...0023h\\huh0023h\\huh0023h                            ...            ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test38510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38510");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("111111111111111111111111111111111111111111111111111                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38511");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "     ", (java.lang.CharSequence) "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", charSequence2, "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test38512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "  ......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38513");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("23     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...     32" + "'", str1, "...     32");
    }

    @Test
    public void test38514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38514");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0...                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0...                                                                                                                                                                                                                                   " + "'", str1, "\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0...                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test38515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6" + "'", str1, "1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6");
    }

    @Test
    public void test38516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c..\\u5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c..\\u5" + "'", str1, "\\c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c..\\u5");
    }

    @Test
    public void test38517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("UUUUUUUUUUu6UUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUU6uUUUUUUUUUU" + "'", str1, "UUUUUUUUUUU6uUUUUUUUUUU");
    }

    @Test
    public void test38518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38518");
        char[] charArray8 = new char[] { '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...23\\u0023\\", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test38519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38519");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          ", (java.lang.CharSequence) "\\\\U0023\\U0023...i\\\\U0023\\U0023    3\\U0023\\U0023\\i1\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                             \\u0069                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "\\u0023\\u\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38521");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U003", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "U" + "'", str5, "U");
    }

    @Test
    public void test38522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38522");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                      ", (java.lang.CharSequence) "\n\n1                        23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", charSequence2, "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test38523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("3200u\\3200u\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200u\\3200u\\3200", "5555555                     ..");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38524");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('c', 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262 + "'", int2 == 262);
    }

    @Test
    public void test38525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38525");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38526");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "6\\\\u0020", (java.lang.CharSequence) "533333333333333333333333333333\\40032333333333333333333333333333333C");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "6\\\\u0020" + "'", charSequence2, "6\\\\u0020");
    }

    @Test
    public void test38527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38527");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("6666\r\r\r\r\r\r\r", "...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 563);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6666\r\r\r\r\r\r\r" + "'", str3, "6666\r\r\r\r\r\r\r");
    }

    @Test
    public void test38528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                     ...", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     ..." + "'", str2, "                                                                                     ...");
    }

    @Test
    public void test38529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38529");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "                   \\u0037                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38530");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("U0023\\u0..  6\\\\u0020                                                              ", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38531");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("41                                                                                        ", 25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38532");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\u23\\u23\\u23\\u23\\u23\\u23\\u23");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u23\\u23\\u23\\u23\\u23\\u23\\u23" + "'", str1, "\\u23\\u23\\u23\\u23\\u23\\u23\\u23");
    }

    @Test
    public void test38534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38534");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("000000000000000000000000000003200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A800000000000000000000000000000", 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38535");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ", 107, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38536");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ", "                                    ................U0023                                           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38537");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("111111111111111111111u61111111111111111111111123\\U                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111111111111111111111u61111111111111111111111123\\U" + "'", str1, "111111111111111111111u61111111111111111111111123\\U");
    }

    @Test
    public void test38538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u", "\\U003 111 ", "323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000033u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u3\n06u" + "'", str3, "00000000000033u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u3\n06u");
    }

    @Test
    public void test38539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38539");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...............................................................................\\u0034", "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004u61 \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "00u\\0200u\\0200u\\0200u\\\n16u    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00u\\0200u\\0200u\\0200u\\\n16u    " + "'", str1, "00u\\0200u\\0200u\\0200u\\\n16u    ");
    }

    @Test
    public void test38541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "...6666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" + "'", str2, "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
    }

    @Test
    public void test38542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38542");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38543");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...", "...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38544");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38545");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("I!                                                                                   u003                          ", "                                                   0##                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38546");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  \\                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  \\", "                               \\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38547");
        java.lang.CharSequence charSequence9 = null;
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray19);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray19);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence9, charArray19);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023                                                                                     ", charArray19);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray19);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u002", charArray19);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", charArray19);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\", charArray19);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "23\\U", charArray19);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", charArray19);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "      AAAA...", charArray19);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test38548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38548");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 118);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 118 + "'", int2 == 118);
    }

    @Test
    public void test38549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38549");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023                                                   ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("#################################################\n\n\n\n\n\n\n\n\n\n\n\n\n\n", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test38550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38550");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test38551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38551");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ", '5');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("..............................................", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test38552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....       ", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....       " + "'", str2, "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....       ");
    }

    @Test
    public void test38553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "222222222222222222222222222222222" + "'", str1, "222222222222222222222222222222222");
    }

    @Test
    public void test38554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38554");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u0023\\u00\\U0041\\u", (java.lang.CharSequence) " 61\\ 61\\61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test38555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaa", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa" + "'", str2, "aaaa");
    }

    @Test
    public void test38556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38556");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '6');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray11, strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!", strArray11);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "   u61    ");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray11);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "Hi!hi!hi!");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("uuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..", strArray4, strArray11);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 55 + "'", int5 == 55);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u" + "'", str7, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str17, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.." + "'", str24, "uuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test38557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38557");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "5555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u005555555555222222222222222222222222222222222222222222222u6                                          5555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u0055555555555", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38559");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "10HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\10HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("23AAAAAAAAAAAAA0u0A", '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23AAAAAAAAAAAAA0u0A" + "'", str2, "23AAAAAAAAAAAAA0u0A");
    }

    @Test
    public void test38561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Aaaaaaa     U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaa     U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0" + "'", str2, "Aaaaaaa     U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0");
    }

    @Test
    public void test38562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA", " 11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA" + "'", str2, "AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA");
    }

    @Test
    public void test38563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38563");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\U005C                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38564");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\                 ", 33, 255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 69");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38565");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                 61\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38566");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("11111111111111111111 111111111111111111111", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38567");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU... 61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161########61########61########61########61########61########61########61########61########61########61########61########61###61#####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test38568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38568");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38569");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                   0##                                                  ", "111111U1111111##############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38570");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "u003aaaaaa                                             ", 268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... \\\\\\aaaaaaaaaaaaA\\16 ", "                                      \\u0023\\u00\\u0041\\u0023", 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38572");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa", "23\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test38573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38573");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("555555555555555555555555555555555555555555555555555555  ......  61555555555555555555555555555555555555555555555555555555  ......  \n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  ......  55555555555555555555555555555555555555555555555555555516  ......  555555555555555555555555555555555555555555555555555555" + "'", str1, "\n  ......  55555555555555555555555555555555555555555555555555555516  ......  555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test38574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38574");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "... AAAA15AAAA AAAA15AAAA ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38575");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", 433);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test38577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38577");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38578");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "1111111");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str8, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38579");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "11111111111111111111 111111111111111111111", (java.lang.CharSequence) "                                                                                                                                                                                                                                                              \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u" + "'", str2, "                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u");
    }

    @Test
    public void test38581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38581");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ", "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 84);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 370, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            " + "'", str4, " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test38582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38584");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                            aaaaaaaaaaaaa3200\\a                                 ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test38585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38586");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38587");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...1...                                    ", 497, 227);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("16\\U0061", "4141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16\\U0061" + "'", str2, "16\\U0061");
    }

    @Test
    public void test38589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38589");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 97);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################" + "'", str5, "\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\\\\\\\\\\\61\\\\\\" + "'", str6, "\\\\\\\\\\\\\\\\\\61\\\\\\");
    }

    @Test
    public void test38590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38590");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 61", (int) '\r');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '3', 80, 191);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 80");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38591");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...3200U\\3200U\\\\i\\3200U\\3200U\\3    3200U\\3200U\\\\i\\3200U\\3200U\\3...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", (java.lang.CharSequence) "1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                  1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 650 + "'", int2 == 650);
    }

    @Test
    public void test38592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("c500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA111111111111111111111u6111111111111111111111AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("AAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38594");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aaaaaaa      ", "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 28);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test38595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38595");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("161\\161\\161\\161\\161\\161\\U6                      \n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void test38596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38596");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0023\\u00   ..\\u0023\\u00", 138, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "55          aaaaaaa       CCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55          aaaaaaa       CCCCCCCCCCCCCCCC" + "'", str1, "55          aaaaaaa       CCCCCCCCCCCCCCCC");
    }

    @Test
    public void test38598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("2                                         \n\n1", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2                                         \n\n1" + "'", str2, "2                                         \n\n1");
    }

    @Test
    public void test38599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38599");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("001!IH0...", "\\16 ", (int) 'U');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38600");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38601");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                         111111111111111111111U6111111111111111111111                         ", "       11111111111111..", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("20\\U0020\\U0020\\U0020\\U00", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00" + "'", str2, "20\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
    }

    @Test
    public void test38603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str2, "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test38604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("61\n", "...111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\n" + "'", str2, "61\n");
    }

    @Test
    public void test38605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38605");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\" + "'", str3, "\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
    }

    @Test
    public void test38606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38606");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223", "23\\U                         ", 227);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223" + "'", str3, "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223");
    }

    @Test
    public void test38607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38607");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\uccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", "  \\U005C  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38608");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("......", "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38609");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555##############################################.16 5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...", 393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38610");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                      3200U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38611");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ", 19, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test38612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                              23\\u0023\\u0023\\u002                                                       ", "U003aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              23\\u0023\\u0023\\u002                                                       " + "'", str2, "                              23\\u0023\\u0023\\u002                                                       ");
    }

    @Test
    public void test38613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38613");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("000000000000000000000000000000", 9, 667);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38614");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                              #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###                                                                                     ", "161\\161\\161\\161\\161\\161\\U6                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6", 433, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 237);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38617");
        char[] charArray10 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("0023", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test38618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38618");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "5700u\\", 130, 118);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test38619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38619");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU... 61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38620");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaa", "                   \\u0023\\u0023\\u0023\\u0023\\u0023\\u                   ", 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\0023\\0023\\0023\\0023\\0023\\0023\\0023...", 130, "U002322222");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U0\\0023\\0023\\0023\\0023\\0023\\0023\\0023..." + "'", str3, "U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U0\\0023\\0023\\0023\\0023\\0023\\0023\\0023...");
    }

    @Test
    public void test38622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38622");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  2     2     2     2     4444444444444  1    1 ", "0UUU\\U3200UUU\\U3200UU023\\u0023       aaaaaaa", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38623");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("023\\u0023aaaaaaa", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U" + "'", str2, "                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
    }

    @Test
    public void test38625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\UUU02\\... 3hi!hi!hi!", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000", 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\UUU02\\... 3hi!hi!hi!" + "'", str3, "\\UUU02\\... 3hi!hi!hi!");
    }

    @Test
    public void test38626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38626");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  \n\n1                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test38627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("5...", "61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUA\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5..." + "'", str2, "5...");
    }

    @Test
    public void test38628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38628");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...                           ...0023h\\hh0023h\\hh0023h                            ...", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str1, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test38630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38630");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                             a   ", "\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38631");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAA                            ", "\\U0023\\U00\\U0041\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38632");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ", 369, 685);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           " + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ");
    }

    @Test
    public void test38633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("               3200", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               3200" + "'", str2, "               3200");
    }

    @Test
    public void test38634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38634");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("400u\\00U\\3200U\\", "             \\u0023\\u00\\U0041\\u              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38635");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAA...", 167, 566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38636");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U..." + "'", str1, "...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U...");
    }

    @Test
    public void test38637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777" + "'", str1, "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777");
    }

    @Test
    public void test38638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38638");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(" \\u003 ", "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                      ", "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020", 71);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " \\u003 " + "'", str4, " \\u003 ");
    }

    @Test
    public void test38639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38639");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("A\\u0023AAAAAAAAAAAAA", 297);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38640");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "    u0034                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38641");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        ", "444444444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444444444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test38642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38642");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\61\\61\\61\\61\\61\\61" + "'", str1, "\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test38644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38644");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111111111111111111111111111111111111111111111111111", "111111111111111111111U6111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38645");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0023\\00023\\00023\\ U", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38646");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666");
    }

    @Test
    public void test38647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 191, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323", (java.lang.CharSequence) "                     ......  7777777777777777777777777777777777777777777777777777777777777777777777761\\                     ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                 A                                                                                             ", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 A                                                                                             " + "'", str2, "                                                                                                 A                                                                                             ");
    }

    @Test
    public void test38650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023  h\\huh0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023  h\\huh0023" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023  h\\huh0023");
    }

    @Test
    public void test38651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38651");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\n\n1                                                    \n\n1                                  61\\", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38653");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38654");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1\\ 61\\ 6 ", " 61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61", 367);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38655");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "5544u4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38656");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u", "3200U\\3200U\\\\i\\3200U\\3200U\\3");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38657");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa26");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "62aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "62aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38658");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#################################################", "222222222222222222222222222222222222222222222222222111111111aaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38659");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aa                                          ", "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38660");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075", '.');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075" + "'", str3, "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075");
    }

    @Test
    public void test38661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38661");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("\\u005c", '#');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "                                                                                                 2  ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Aaaaaaa      ", strArray2, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 171 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u005c" + "'", str11, "\\u005c");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\u005c" + "'", str12, "\\u005c");
    }

    @Test
    public void test38662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("66666666666666666666666666666666666666666666666666666AAAAAAA     U   3U    41U   3     ", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuu3200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "66666666666666666666666666666666666666666666666666666AAAAAAA     U   3U    41U   3     " + "'", str2, "66666666666666666666666666666666666666666666666666666AAAAAAA     U   3U    41U   3     ");
    }

    @Test
    public void test38663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38663");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Aaaa", " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38664");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("UUU6  6  6  6  6", "6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38665");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38666");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                     222222222222222222222222222222222222222222222222222222                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "222222222222222222222222222222222222222222222222222222" + "'", str1, "222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test38667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38667");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test38668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("U\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "u\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test38669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAA", "  ......  \\u00410023\\U0023\\U0023\\U0023\\U0023\\U001\\u0041\\u006666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ", "                       \\U0023\\U00\\u0041\\U                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                      u\\32");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u\\32" + "'", str1, "u\\32");
    }

    @Test
    public void test38672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\61", "33333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\61" + "'", str2, "\\61");
    }

    @Test
    public void test38673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38673");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", 234);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38674");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111161\\", "0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057                                                                                                                             1\\u0030UuU\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38675");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("77777777777777777777777777", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38676");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("61");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                          \\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                                           ", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test38677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ", "                                AAAAAAAAAAAAAAAAAAAA                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             " + "'", str2, "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ");
    }

    @Test
    public void test38678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\U0023\\U00\\U0041\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("22222222222222222222uuu0023                                            222222222222222222222", "0023U6                                       u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22222222222222222222uuu0023                                            222222222222222222222" + "'", str2, "22222222222222222222uuu0023                                            222222222222222222222");
    }

    @Test
    public void test38680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\16u3\\16u \\16 \\16 \\16 \\16 \\16  \\16u \\16 \\16 \\16 \\16 ", "22222222222222222222uuu0023 222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38681");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\", "\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 101, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
    }

    @Test
    public void test38683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("U   ", 138);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U                                                                                                                                         " + "'", str2, "U                                                                                                                                         ");
    }

    @Test
    public void test38684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u0023                                                                                     hi!hi!hi!                                                                                                         ", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 hi!hi!hi!                                                                                                         " + "'", str2, "                 hi!hi!hi!                                                                                                         ");
    }

    @Test
    public void test38685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38685");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38686");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "U0##########\\U0023\\4003U0023\\U\\U0023\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0##########\\U0023\\4003U0023\\U\\U0023\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023" + "'", str1, "U0##########\\U0023\\4003U0023\\U\\U0023\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023");
    }

    @Test
    public void test38687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38687");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\i\\");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("u61", '\\');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "\\u00c\\u00", (int) (short) 100, 28);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061" + "'", str11, "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061");
    }

    @Test
    public void test38688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38688");
        char[] charArray12 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U61", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        aaaaaaa", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U0023", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test38689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("3333333333333333333333333333333333                                                                             6u623\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3333333333333333333333333333333333                                                                             6u623\\" + "'", str1, "3333333333333333333333333333333333                                                                             6u623\\");
    }

    @Test
    public void test38691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38692");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("U0023\\U002U0023\\U002U0023\\U002U0", "23\\U0023\\U...                                   ", (int) 'U');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38693");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        " + "'", str2, "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ");
    }

    @Test
    public void test38695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\" + "'", str1, "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
    }

    @Test
    public void test38696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\", "44444444444444444444423\\u0023\\u444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\" + "'", str2, "\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\");
    }

    @Test
    public void test38697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38697");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu", 92);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Aaaac11111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38699");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38700");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\163200u\\", (java.lang.CharSequence) "###");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\163200u\\" + "'", charSequence2, "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\163200u\\");
    }

    @Test
    public void test38701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38701");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "111111111111111111111111111111111111111111111...", (java.lang.CharSequence) "1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "111111111111111111111111111111111111111111111..." + "'", charSequence2, "111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test38702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38702");
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       aaaaaaa          ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u6      61        61        61        61", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test38703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700", 729);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38704");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str1, "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test38705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "6  6  6  6  6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "UUU6 6 6 6 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAAAAAAA", 213);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAA" + "'", str2, "AAAAAAAA");
    }

    @Test
    public void test38708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("2                                             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", 563);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2                                             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str2, "2                                             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test38709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU  ", 71, "                                                                                                     hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU  " + "'", str3, "hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU  ");
    }

    @Test
    public void test38710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38710");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuu 3200u           ", "u0023\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222", "aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                           \\u003                                                                                                                                                                                                                                                            ", "61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("3200", 28, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r3200" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r3200");
    }

    @Test
    public void test38714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("11111111111U0023#U0023#U0023#U0023#U0023#U0023#U0023", 113);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38715");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\", "00000000    2222222222222222222222222222222220000000", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38716");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222AAAAAAAAAAAAA U 6AAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38717");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   \\u003 ", "61\n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38718");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                     61\\\\u0020                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                     61\\\\U0020                                                                                                                     " + "'", str1, "                                                                                                                     61\\\\U0020                                                                                                                     ");
    }

    @Test
    public void test38719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ", "\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       " + "'", str2, "323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ");
    }

    @Test
    public void test38720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38720");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("..                    0u\\00U\\3200U\\                                      43200U\\1                                         ", "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u003\\u0023                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38722");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                   0041", "\\u0023\\u0023\\u0023\\u0023\\u0023\\16", "15 15 15 15 15 11111111");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38724");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\aa\\a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38725");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...AAAA      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38726");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) ".\\16 ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 81 + "'", int2 == 81);
    }

    @Test
    public void test38727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38727");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "23\\u0023\\u...                                   UUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       ", 26, "HHHHHHHHHHHHH023\\U0023       AAAAAAAUUUUUUUUUHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       " + "'", str3, "61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       ");
    }

    @Test
    public void test38729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002" + "'", str2, "3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
    }

    @Test
    public void test38730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38730");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "\\u0023AAAAAAA...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38731");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "...23\\u0023\\u002375757575757575757575757575757575757575757575757575757575", "                                                                                                                                                            000000000000000000000000000000...             ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38732");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("iiiiiiiiiii 6\\\\u0020iiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38733");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...023\\U0023\\U002375757575757575757575757575757575757575757575757575757575111", "u  ......  \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                            \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      ", "5555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u005555555555222222222222222222222222222222222222222222222u6                                          5555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u0055555555555");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111" + "'", str3, "\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111");
    }

    @Test
    public void test38735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                             ...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38736");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "......A000u\\                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" 61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61" + "'", str1, "61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test38738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38738");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA061", "3\\u0003\\u0111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38739");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUU61UUUU", "", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "\\u005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075", "161\\161\\161\\161\\161\\161\\U6                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ", "...........................................\\u0023 hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...........................................\\u0023 hi!hi!hi!" + "'", str2, "...........................................\\u0023 hi!hi!hi!");
    }

    @Test
    public void test38742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("16161616161616161616161616", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16161616161616161616161616" + "'", str2, "16161616161616161616161616");
    }

    @Test
    public void test38743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38743");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38744");
        char[] charArray13 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5C", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("  \\U005C  ", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2U2U2U2U2U2U2U2U2U2", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test38745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38745");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055", (java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 271 + "'", int2 == 271);
    }

    @Test
    public void test38746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38746");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...6666666666666666666666666666666666666666666" + "'", str1, "...6666666666666666666666666666666666666666666");
    }

    @Test
    public void test38747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38747");
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("\\u005c", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\n1                                                                                         ", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000ucccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", charArray15);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test38748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38748");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38749");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                         1\\U00234                                      \\U0023\\U00\\u0                    ..", 70, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         1\\U00234                                      \\U0023\\U00\\u0                    .." + "'", str3, "                                         1\\U00234                                      \\U0023\\U00\\u0                    ..");
    }

    @Test
    public void test38750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38750");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...", "\\u0032                                                                       ", 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "", 136, 257);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 136");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38751");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\i\\                       61\n                       ", "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 271);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                         \n\n                                                     \n\n                                      ", "...3\\u23\\u23u6              c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38753");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '5', 173);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test38754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                           001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38755");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                             ", "\\u003                                                ", 55);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "0000000000000000000000000000000000000000000000000000000");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test38756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\", 153);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\" + "'", str2, "666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test38757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh", 155);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38758");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#6666\r\r\r\r\r\r\r##", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test38759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38759");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
    }

    @Test
    public void test38760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38760");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                            aaaaaaaaaaaaa3200\\a                                 ", "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        ", 369);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38761");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "  \n\\u0020\\\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "66666666666666666666666666666666666666666666666666666AAAAAAA     U   3U    41U   3     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("555555555555555555555555555555555555555555555555555555  ......  ", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "555555555555555555555555555555555555555555555555555555  ......  " + "'", str2, "555555555555555555555555555555555555555555555555555555  ......  ");
    }

    @Test
    public void test38764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38764");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ccccccccccccccccccccccccccccccccccccccccccccccccc 6...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38765");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "61.####################################################################################################", (java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "61.####################################################################################################" + "'", charSequence2, "61.####################################################################################################");
    }

    @Test
    public void test38766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38766");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   c                                           \\u005", "aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 16");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38767");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...3200U\\3200U\\\\i\\3200U\\3200U\\3    3200U\\3200U\\\\i\\3200U\\3200U\\3...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38768");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) "u0023\\u002");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", charSequence2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test38769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("61  \\\\0020                                                                                 \\  \\\\0020                                                                                 uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 41, 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  \\  \\\\0020                              " + "'", str3, "                                                  \\  \\\\0020                              ");
    }

    @Test
    public void test38770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 64, "uuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuu" + "'", str3, "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38771");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Aaaaaaa      ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  16        16        16        16        16        16        16        16        16", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test38772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0020\\u0##", 173, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("U0023\\u0..  6\\\\u0020                                                              ", "                                               HUUU02HUUU02HUUU02HAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\u0..  6\\\\u0020                                                              " + "'", str2, "3\\u0..  6\\\\u0020                                                              ");
    }

    @Test
    public void test38774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test38775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38775");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u005c", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '1');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test38776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38776");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38777");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u 6aaaaaaaaaaaaa", "                                                  75", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38778");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38779");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str1, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test38780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38780");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000", "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38781");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 349);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str4, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test38782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38782");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                            AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38783");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\", "        75                                                                                                           ", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                             61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1161\\\\1u100201161\\\\1u10020116");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test38784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38784");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "7777777777777777777                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38785");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...h ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38786");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hhhhhhhhhhhhh", "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "\\u0075");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("U61", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("2", "", 100);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray13, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1", strArray9, strArray13);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ", strArray4, strArray13);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", 393, (int) 'U');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str19, "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          " + "'", str21, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test38787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38787");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("2uuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2UUUUUUUUUUUUUUUUUUUU" + "'", str1, "2UUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38788");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test38789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38789");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U0", "    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", "    U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" 61..", "16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u 6aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test38791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38791");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("         0000000000000000000000000000000000000000000000000\\U0037         ", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 96 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test38792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("IIIIIIIIIIIII...AAAA      ", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIII...AAAA      " + "'", str2, "IIIIIIIIIIIII...AAAA      ");
    }

    @Test
    public void test38793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38793");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "00000000000000000000");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                    3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str4, " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38794");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", (int) '7');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38795");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ", "u0032\\u0032\\u0032\\u0032\\u0032\\u0032", 116);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38796");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '.');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38797");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\", 380);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\");
    }

    @Test
    public void test38799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38800");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222" + "'", str1, "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222");
    }

    @Test
    public void test38801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38801");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "    2222222222222222222222222222222222UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38802");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38803");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("u003            0023         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38804");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", "6\\\\u0020");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\u002                                         \n\n1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u002                                         \n\n1" + "'", str1, "\\u002                                         \n\n1");
    }

    @Test
    public void test38806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", 'u', '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161" + "'", str3, "\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test38807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38808");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ", "                 \\uhi!hi!hi!                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38809");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 172);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
    }

    @Test
    public void test38810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38810");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                 A\\u0023AAAAAAAAAAAAA                                  ", "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("u003            0023         ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test38811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38811");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iiiiiiiiiiiiiiiiiiiii...uuuuuuuuuuiiiiiiiiiiiiiiiiiiiiii", "21                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 92);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38812");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 ", 17, '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 " + "'", str3, "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 ");
    }

    @Test
    public void test38813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38813");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ih01001!ih01", "uuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38814");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAA", 886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38815");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...3\\u23\\u23U6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "0U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test38817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("610000000000000000000000000000000000000000000000000                                  0auu0", "2U2U2U2U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "610000000000000000000000000000000000000000000000000                                  0auu0" + "'", str2, "610000000000000000000000000000000000000000000000000                                  0auu0");
    }

    @Test
    public void test38818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38818");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                ", "                  \\U0033\\U0033\\U0033\\U0033\\U0033\\U0033\\U", (int) 'c');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38819");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2", "       ", 91);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                 61\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test38820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38820");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("41                                                                                        ", 339, "                                         \n\n1           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         \n\n1                                                    \n\n1                         41                                                                                                                                 \n\n1                                                    \n\n1                          " + "'", str3, "                                         \n\n1                                                    \n\n1                         41                                                                                                                                 \n\n1                                                    \n\n1                          ");
    }

    @Test
    public void test38821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa", 62, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa" + "'", str3, "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa");
    }

    @Test
    public void test38823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38823");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#11#1111\n\n\n\n\n\n\n\n", '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test38824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", "\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6" + "'", str2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
    }

    @Test
    public void test38825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38825");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray4, strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '\\', 156, 113);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test38826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "3200u\\300u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\u0023 hi!hi!hi!", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  " + "'", str2, "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
    }

    @Test
    public void test38828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        " + "'", str2, "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ");
    }

    @Test
    public void test38829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003", 47, '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003");
    }

    @Test
    public void test38830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38830");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("5                                                                                                ", "3322U\\3322U\\3322U\\...2U\\3322U\\3322U\\3322U\\3322U\\3322U\\33\\U22A8", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                            AAAAAAAAAAAAA3200\\A                                               ", 508, 562);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            AAAAAAAAAAAAA3200\\A                                               " + "'", str3, "                            AAAAAAAAAAAAA3200\\A                                               ");
    }

    @Test
    public void test38832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           " + "'", str2, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           ");
    }

    @Test
    public void test38833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(" 61..        ", 255);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61..                                                                                                                                                                                                                                                          " + "'", str2, " 61..                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test38834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38834");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa                                                ", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                  3200 61\\ 61\\ 61", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                               #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###                                                                                                                                                                                                                      ", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test38835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38835");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                             \n\n1                                                    \n\n1     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38836");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaa                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38837");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h ", 'u', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h " + "'", str3, "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h ");
    }

    @Test
    public void test38838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  \\                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  \\", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               \\" + "'", str2, "                               \\");
    }

    @Test
    public void test38839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38839");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 2, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55" + "'", str3, "55");
    }

    @Test
    public void test38840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38840");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 54, "3\\u0003\\u0111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3\\u0003\\u011111111111111111111111111111111111111111111" + "'", str3, "3\\u0003\\u011111111111111111111111111111111111111111111");
    }

    @Test
    public void test38841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38841");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'c', (int) '0');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test38842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("777777777777777777777777777777777777777777777777777777777777777777777777777777777", "hhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhh                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777" + "'", str2, "777777777777777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test38843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38843");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "           161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38844");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                   ######", 262);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("11111111111111111111       111111111111111111111                                                                                           ", "A\\u0023AAAAAAAAAAAAAa000u\\", 21);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38846");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "1\\ 1\\ 1\\ 1\\ 1\\ 11111111..", 354, 93);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test38847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38847");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                  ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38848");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U0023\\U00\\u0041\\U", "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "1111111111111...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\U0023\\U00\\u0041\\U" + "'", str6, "\\U0023\\U00\\u0041\\U");
    }

    @Test
    public void test38849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38849");
        char[] charArray6 = new char[] { ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61uuu", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U0\\0023\\0023\\0023\\0023\\0023\\0023\\0023...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test38850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38850");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61\\61\\61\\61\\61" + "'", str1, "61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test38853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38853");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\U0061\\U0061\\U0061\\U0061\\ u61 1\\U0061\\U0061\\U0061\\U0061", "                 \\ 0030                  ", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("23aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023", 127, "                                                                                                   20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023" + "'", str3, "23aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023");
    }

    @Test
    public void test38855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38855");
        char[] charArray13 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "3\\u0...", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023\\U00\\U0041\\U", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "u003", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                    \n\n1", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                                                                                                                                                                  ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test38856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38856");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "                                                                             136u66136u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("U                 661uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...U                 61", "ua", "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U                 661                                                                                ...U                 61" + "'", str3, "U                 661                                                                                ...U                 61");
    }

    @Test
    public void test38858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38858");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " uuuuuuuuuuU6uuuuuuuuuuu                         ", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38859");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("UUUUUUUUUUU6UUUUUUUUUUU", 520, 356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("16...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575 ", 97, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "16...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575 111111111111111111111" + "'", str3, "16...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575 111111111111111111111");
    }

    @Test
    public void test38861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38861");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\\u003 ", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("1hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test38862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38862");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                                                        u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\77777");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38863");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...  u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ...", "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38864");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("575757575757575757575757575757575757575757575757575111", 75, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38865");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 257);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 257 + "'", int2 == 257);
    }

    @Test
    public void test38866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38866");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) '\\');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38867");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '0', 0, 62);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test38868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38868");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", "a");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("        75", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '\\');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    " + "'", str8, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
    }

    @Test
    public void test38869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38869");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'i', 181, 11);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test38870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38870");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...", "5c11111111111111111111111111 61\\ 111111111111111111111111111", 73);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   AAAAAAAAAAAAAAAAAAAAAAAAA", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", "                                                                                                                                                           uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38873");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh", 80, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38874");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) (short) 1);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("    61        61        61        61        61        61        61        61        61        61        61        61        61   ", strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                 ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            U0023\\U002U0023\\U002U0023\\U002U0", strArray8, strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                 " + "'", str12, "                 ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            U0023\\U002U0023\\U002U0023\\U002U0" + "'", str13, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            U0023\\U002U0023\\U002U0023\\U002U0");
    }

    @Test
    public void test38875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38875");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...h    h...aaaaaaa                            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) " 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61" + "'", str1, " 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61");
    }

    @Test
    public void test38877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38877");
        char[] charArray20 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray20);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray20);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray20);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray20);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray20);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray20);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  2   ", charArray20);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray20);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray20);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!10010hi!10010h\\400310hi!10010hi!10010hi", charArray20);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", charArray20);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray20);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "33333333333333333333333333333\\40032333333333333333333333333333333", charArray20);
        boolean boolean34 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "23\\U0023\\U", charArray20);
        int int35 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                           001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................                                                                                           ", charArray20);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 48 + "'", int32 == 48);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 91 + "'", int35 == 91);
    }

    @Test
    public void test38878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38879");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38880");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("575\\u0037200U\\", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaa", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38882");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("A", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, 'u', (int) '5', 7);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                 A                                                                                             ", strArray10, strArray13);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c", strArray4, strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                 A                                                                                             " + "'", str20, "                                                                                                 A                                                                                             ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c" + "'", str21, "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c");
    }

    @Test
    public void test38883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38883");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test38884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38884");
        char[] charArray10 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U61", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test38885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38885");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38886");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", "ih01001!ih01      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa        ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test38887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38887");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38888");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   U61    ", 28, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhh   U61    " + "'", str3, "hhhhhhhhhhhhhhhhhh   U61    ");
    }

    @Test
    public void test38889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38889");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "65                                  5a5757575757575757575757575757575757575757575751115757575757575757575757575757575757575757575751115");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                 ####AU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38891");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ", "U61");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 48, (int) (byte) -1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "23hi!hi!hi!                                                                          ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, 'a', 161, 35);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777", 191, 84);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test38892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38893");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "                                           \\\\0033005c");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("......77777777777777777777777777777777777777777777777777777777777777777777777", 183);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......77777777777777777777777777777777777777777777777777777777777777777777777" + "'", str2, "......77777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test38895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38895");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("55", "                                                                                           4300u\\", 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................61aaaaaaaaaaaaaaaaaa", 476);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\" + "'", str1, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\");
    }

    @Test
    public void test38898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...\\61\\61\\61\\61\\61\\...", 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...\\61\\61\\61\\61\\61\\..." + "'", str2, "...\\61\\61\\61\\61\\61\\...");
    }

    @Test
    public void test38899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###", "777777777777777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###" + "'", str2, "                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###");
    }

    @Test
    public void test38900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38900");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "                                             ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("5c", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '6');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("u005cu0u005cu0u0023Uu005cu0u005cu0", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "      " + "'", str9, "      ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test38901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38901");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61\\\\50020", "                   \\u0037                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38902");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16");
    }

    @Test
    public void test38904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38904");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("2uuuuuuuuuuuuuuuuuuuu", " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38905");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("###\n\\u002                                         \n\n1", "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 14);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test38906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38906");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6\\\\u00206\\\\u00206", "ua61a\na\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua00", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38907");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u005c\\u00666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100666666666666666666666100023\\u0023", 98, 356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test38909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61", "62aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61" + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test38910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38910");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 36, (int) '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str3, " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test38911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38911");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 861, (int) '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...h ", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...h...32U\\32U\\32U\\32U\\32U\\32U\\32U\\...h " + "'", str2, "...h...32U\\32U\\32U\\32U\\32U\\32U\\32U\\...h ");
    }

    @Test
    public void test38913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("000000000U0023\\U0023\\U0023\\U...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38914");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaa", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 21);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38915");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", ' ');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'A' + "'", char2 == 'A');
    }

    @Test
    public void test38916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38916");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "3333361                                         \n\n133323\\u                                                                                             3333361                                         \n\n1333");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38917");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38918");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                           3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\300U\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38919");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'C', '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'C' + "'", char2 == 'C');
    }

    @Test
    public void test38920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0055                                            1111111111111111111111111111111111111111111111", "\\400326666666666666666666666666666666666666666666");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38922");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61\\ 61\\ 61", 38, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 61uuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "61\\ 61\\ 61uuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("1111111111123\\U                                        ", "0023\\00023\\00023\\ ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38924");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0000000000000000000000000000000000000000000uUu0u3200uUu0u3200uUu0u3200uUu0u3200uUu0u32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("UUUUU61UUUUUUUUUUUUUUUU44444444444444444444453\\U0053\\U444444444444444444444                                                                                                                                                        ", ".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444453\\U0053\\U444444444444444444444                                                                                                                                                        " + "'", str2, "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444453\\U0053\\U444444444444444444444                                                                                                                                                        ");
    }

    @Test
    public void test38926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38926");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 7, "U61616161616161616161616161U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str3, "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test38927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38927");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Uuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "Uuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38928");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "11111111111111.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004 6\\\\uu  \\u004\\u004\\u00u6\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str3, " \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004 6\\\\uu  \\u004\\u004\\u00u6\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test38929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38929");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666", 288, "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0######\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u" + "'", str3, "222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0######\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u");
    }

    @Test
    public void test38930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38930");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\U000AAAAAAAAAAAAAA3200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U000AAAAAAAAAAAAAA3200U\\" + "'", str1, "\\U000AAAAAAAAAAAAAA3200U\\");
    }

    @Test
    public void test38931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38931");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        " + "'", str1, "                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        ");
    }

    @Test
    public void test38932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38932");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38933");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0200\\\\", (java.lang.CharSequence) " 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u", "                                                                                    222222222222222222222222222222222");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u", (int) 'c', "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u             " + "'", str3, "             3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u             ");
    }

    @Test
    public void test38936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                ##0U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n###                                 ", 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\\\n###                                 " + "'", str2, "U\\\n###                                 ");
    }

    @Test
    public void test38937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38937");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n\n\n\n\n\n\\u0055                                            ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0055" + "'", str2, "\\u0055");
    }

    @Test
    public void test38938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38938");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ", "                             6  6  6  6  6  uuu                            ", 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38939");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333", "uuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38940");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1 == '\n');
    }

    @Test
    public void test38941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38941");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aa        75                                          aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6..." + "'", str1, "AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...");
    }

    @Test
    public void test38943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38943");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("U5C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U5C" + "'", str1, "U5C");
    }

    @Test
    public void test38944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38944");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38945");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA" + "'", str1, "                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA");
    }

    @Test
    public void test38946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa", "777777777777777777777777777777777777777727777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("51", "         a          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "51" + "'", str2, "51");
    }

    @Test
    public void test38948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38948");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '0', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1161\\\\1u100201161\\\\1u10020116");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r" + "'", str2, "3\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test38950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38950");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!                                                                                   U0023                          ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '0', 48, 14);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test38951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("      AAAA...", 'U', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      AAAA..." + "'", str3, "      AAAA...");
    }

    @Test
    public void test38952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str1, "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test38953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38953");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38954");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " 11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38955");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 263);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaa                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa                                                 " + "'", str1, "aaaa                                                 ");
    }

    @Test
    public void test38957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38957");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...", 306);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38958");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0075", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "hi!", (int) ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach(" 61", strArray8, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("\\", strArray3, strArray8);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n", strArray8);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '2', 120, 117);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " 61" + "'", str13, " 61");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\" + "'", str14, "\\");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test38959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38959");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("23\\u0023\\u0023        75023\\u0023\\u00", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u0020", "               aaaaaaaaaaaaa3200\\a                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0020" + "'", str2, "u0020");
    }

    @Test
    public void test38961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38961");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38962");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...777777777777777777777777777777777777777777", "  \\005C  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38963");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                         !IH!IH!IH                                          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAA     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("c200U\\1400u\\00U\\c200U\\", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c200U\\1400u\\00U\\c200U\\" + "'", str2, "c200U\\1400u\\00U\\c200U\\");
    }

    @Test
    public void test38965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38965");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...hhhhhhhhh", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38966");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("1111111111111111111111111111111111111111111110u\\3000u\\3111111111111111111111111111111111111111111111", "...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("U6663\\u6623\\u6623\\u6623\\u6623\\u6623UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu662", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111110ua3000ua3111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111110ua3000ua3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test38967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38968");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 104);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test38969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38969");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("        61        61        6", "###\n\\u002                                         \n\n1           aaaaaaaaaaa", 886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38970");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38971");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                    222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38972");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "U0023\\U0##", (java.lang.CharSequence) "                                                                                   0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38973");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 'A');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38974");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test38975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38975");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("ChUUUUUUUUUUUUUUUUUUUhCUUUUUUuuuuuuuuuuuuuuuuuu\\4555555555555555555555555", " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...11111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38976");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...", "...11111111111111111111111111111111111111111111111111111111");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test38977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38977");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                           4300u\\", "                                  3200", 52);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("###\nu002", (java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                           4300u\\" + "'", str5, "                                                                                           4300u\\");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test38978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaa", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38979");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("61\\ 61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("3333333333333333333333333333333333                                                                             6u623\\U", 243, 306);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38981");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38982");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("666666      66666", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "666666      66666" + "'", str3, "666666      66666");
    }

    @Test
    public void test38983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("23\\u0023\\u0023        75023\\u0023\\u002", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023        75023\\u0023\\u002" + "'", str2, "23\\u0023\\u0023        75023\\u0023\\u002");
    }

    @Test
    public void test38984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38984");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("A 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "0000000000000000000000000000000000000000000000000000  2   0000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38987");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...                                                                                                                 ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("UUUUUUUUUUUUUUUUUUUUUUUUUUUU..", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUU.." + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUU..");
    }

    @Test
    public void test38989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38989");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                               \\u0035");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                               \\U0035" + "'", str1, "                                                                                                               \\U0035");
    }

    @Test
    public void test38991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38991");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '6', 45, (int) (short) -1);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "               " + "'", str4, "               ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test38992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38992");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                     ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......  77777777777777777777777777777777777777777777777777777777777777777777777" + "'", str1, "......  77777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test38993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38993");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\", 'h');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("#################################################", (java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6                                       ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...     61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\" + "'", str4, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\" + "'", str6, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\");
    }

    @Test
    public void test38994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("3333361                                         \n\n1                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3333361                                         \n\n1" + "'", str1, "3333361                                         \n\n1");
    }

    @Test
    public void test38995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38995");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaa    6aaaaaaaaaaaaa", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaa    6aaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaa    6aaaaaaaaaaaaa");
    }

    @Test
    public void test38996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38996");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38997");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("023\\U0023AAAAAAA", "U###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###U\\32                                                                             ", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38998");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test38999");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("000000000U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", 70, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             " + "'", str3, "                             ");
    }

    @Test
    public void test39000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest77.test39000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                     \\U0023\\U00\\u0           ...", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ..." + "'", str2, "  ...");
    }
}

