import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest85 {

    public static boolean debug = false;

    @Test
    public void test42501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42501");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...23\\u0023\\u002375757575757575757575757575757575757575757575757575757575");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 73 + "'", int1 == 73);
    }

    @Test
    public void test42502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42502");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("1111111111111111111111111111111111111111110uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42503");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 77 + "'", int1 == 77);
    }

    @Test
    public void test42504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42504");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("... .hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                                                                                                                                                                                                                                                    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                                                                                                                                                                                                                                                    " + "'", str2, "...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test42506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42506");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("U0023", "IUI0020\\4\n\n.............................................................................IUI0020\\4\n\n....................................................u61IUI0020\\4\n\n.............................................................................IUI0020\\4\n\n.....................................................", 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42507");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...3\\U0##########", (int) 'U', "\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n...3\\U0##########" + "'", str3, "\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n...3\\U0##########");
    }

    @Test
    public void test42509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU162UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU162UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU162UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test42510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42510");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U" + "'", str3, "                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
    }

    @Test
    public void test42512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42512");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6h6h6", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42513");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023 HI!HI!HI!aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '6' + "'", char1 == '6');
    }

    @Test
    public void test42514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...", 79, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...aaaaaaaaaaaaaaa" + "'", str3, "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...aaaaaaaaaaaaaaa");
    }

    @Test
    public void test42515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "1161\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0020\\u0020\\u0020\\u0020\\u0020\\u...", (int) 'I');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u..." + "'", str2, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u...");
    }

    @Test
    public void test42517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\U002322222", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42518");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          \\U0023\\U00\\U0041\\U          ", "u6      61        61        61        61      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...00U\\3200U3200U##########0U\\3200U\\3200U3004\\U\\3200U...", "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...00U\\3200U3200U##########0U\\3200U\\3200U3004\\U\\3200U..." + "'", str2, "...00U\\3200U3200U##########0U\\3200U\\3200U3004\\U\\3200U...");
    }

    @Test
    public void test42520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\4aaa", 58, "61\\ 61\\61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\4aaa61\\ 61\\6161\\ 61\\6161\\ 61\\6161\\ 61\\6161\\ 61\\6161\\ 61\\6" + "'", str3, "\\4aaa61\\ 61\\6161\\ 61\\6161\\ 61\\6161\\ 61\\6161\\ 61\\6161\\ 61\\6");
    }

    @Test
    public void test42521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42521");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("..111111116 \\16 \\16 \\16 \\16 \\16");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '.' + "'", char1 == '.');
    }

    @Test
    public void test42522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42522");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n3\\U                      ", 'I');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42523");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\", "...h...32U\\32U\\32U\\32U\\32U\\32U\\32U\\...h ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U" + "'", str2, "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U");
    }

    @Test
    public void test42525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test42526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                  0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                   16u \\16 444444444444400u\\3200u\\3200u\\3200u\\3200                                                                                                                                                                                                                                                  " + "'", str1, "                                                                                                                                                                                                                                                   16u \\16 444444444444400u\\3200u\\3200u\\3200u\\3200                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test42527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...h61\\h61\\h610000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "33333333333AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA333333333333");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "33333333333AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA333333333333" + "'", str2, "33333333333AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA333333333333");
    }

    @Test
    public void test42528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42528");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "61\\ 61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42529");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                     222222222222222222222222222222222222222222222222222222                                                                                                      ", 349, 508);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42530");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "  \\005C                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  \\005C                                                                                                                                                                      " + "'", str1, "  \\005C                                                                                                                                                                      ");
    }

    @Test
    public void test42531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42531");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42532");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaa3200\\a", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "uuuuuuuuuaaaaaaa       3200u\\32", 17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaa3200\\a" + "'", str4, "aaaaaaaaaaaaa3200\\a");
    }

    @Test
    public void test42533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("UUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161" + "'", str2, "UUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test42534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42534");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                              ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test42535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("3200U\\3200U\\320023aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 358);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U\\3200U\\320023aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "3200U\\3200U\\320023aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42536");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                       aaaaaaaaaaaaa3200u\\a                                      ", '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test42537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test42538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("023\\u0023\\u0023", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "023\\u0023\\u0023" + "'", str2, "023\\u0023\\u0023");
    }

    @Test
    public void test42539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42539");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                                     HI!HI!HI!aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "000000000000000000000000000000000000000000000000\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 1\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42541");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n", (java.lang.CharSequence) "   ...3\\u23\\u23U6    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42542");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("      61\\ 61\\ ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42543");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "  ......  555555555555555555555555555555555555555555555555555555", (java.lang.CharSequence) "       111111111111111111111  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test42544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "                                 A\\u0023AAAAAAAAAAAAA                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666" + "'", str2, "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
    }

    @Test
    public void test42545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42545");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                    23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23", 14, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                    23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23" + "'", str3, "23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                    23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23");
    }

    @Test
    public void test42546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42546");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("        \\u0034         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42547");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...0##0230##\\0##U0##00230##\\0##U0##002375757575757575757575757575757575757575757575757575757575111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42548");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 103 + "'", int1 == 103);
    }

    @Test
    public void test42549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("UUUUUU 6\\\\U0020 6\\\\U0020 6", 'a', 'D');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6" + "'", str3, "UUUUUU 6\\\\U0020 6\\\\U0020 6");
    }

    @Test
    public void test42550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42550");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("11111111111u6111111111111111111111", "A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "666666666666666666666666666666666666666\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\AAAAAAAAAAAAA   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42553");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("3200U\\3200U\\3200\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200", "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\" + "'", str1, "61\\");
    }

    @Test
    public void test42555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42555");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...6666666666666666666666666666666666666666666", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U", 635);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42556");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", "1\\hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u003                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U003                                                " + "'", str1, "\\U003                                                ");
    }

    @Test
    public void test42558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016", "23\\u                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42559");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                             23\\u###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u", "AAAAAAAAAAAAAAAAAAAA", 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42560");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "1\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\i\\\\U0023\\U0023    3\\U0023\\U0023\\i\\\\U0023\\U0023...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42561");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                              11111                                ", "                                 0023\\u0023\\u0023\\ U020\\u0020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\\u0030", "cccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0030" + "'", str2, "\\u0030");
    }

    @Test
    public void test42563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023          ", "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023          " + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023          ");
    }

    @Test
    public void test42564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42564");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", (int) ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "23\\0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\60023\\" + "'", str5, "23\\0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\60023\\");
    }

    @Test
    public void test42565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("UUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", 339, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test42566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42566");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                           1400u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42567");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("11111111111111uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...111111111111111", "a000u\\                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a000u\\                                                                                                                                                              " + "'", str2, "a000u\\                                                                                                                                                              ");
    }

    @Test
    public void test42569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42569");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0055                   23\\u0023\\u0023        75023\\u0023\\u001111111111111111111111111", '6');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test42570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42570");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u###                     ", "\\\\hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "u002                                         \n\n1");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test42571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42571");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(" \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004 6\\\\uu  \\u004\\u004\\u00u6\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "23\\U                         ", 173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42572");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####A000U\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42573");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###\n\\u003\\u0023\\u0023\\u0023\\###");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "002aaaaaaa\\002aaaaaaa\\002aaaaaaa\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", (int) (short) 1, 339);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42574");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                 ", 147, '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                 " + "'", str3, "000000000000000000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                 ");
    }

    @Test
    public void test42575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42575");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'c', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("#################", "AAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################" + "'", str2, "#################");
    }

    @Test
    public void test42577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42577");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHH3200U\\3200U\\3200U\\3200U\\3200U\\                        " + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHH3200U\\3200U\\3200U\\3200U\\3200U\\                        ");
    }

    @Test
    public void test42578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42578");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...\\61\\61\\61\\61\\u0023     ...", "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42579");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "                                      \\U0023\\U00\\u0                    ..4                           1\\U0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42580");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("iiiiiiiiiii 6\\\\u0020iiiiiiiiiiii");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42581");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                         ...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", "...AAAAAAAAAAAAA000U\\", "ccccccccccccc\\U0068ccccccccccccc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000" + "'", str3, "000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000");
    }

    @Test
    public void test42584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42584");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('C', 543);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543 + "'", int2 == 543);
    }

    @Test
    public void test42585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42585");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444423\\u0023\\u444444444444444444444", "            1HI!1             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42586");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4", "23                                                                                     hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test42587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\U0043", "1\\\\4003261\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0043" + "'", str2, "\\U0043");
    }

    @Test
    public void test42588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42588");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                     222222222222222222222222222222222222222222222222222222                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42589");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("A 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 62, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42590");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " \\u003 ", (java.lang.CharSequence) "   61        61                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test42591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test42592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42593");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...h61\\h61\\h610000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "Ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...", "                                                                                                   h");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test42594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42594");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("40032", "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("11111111111U0023#U0023#U0023#U0023#U0023#U0023#U", "a11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11111111111U0023#U0023#U0023#U0023#U0023#U0023#U" + "'", str3, "11111111111U0023#U0023#U0023#U0023#U0023#U0023#U");
    }

    @Test
    public void test42596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42596");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...UUUUUUUUUUUUUUUUU                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...UUUUUUUUUUUUUUUUU                   " + "'", str1, "...UUUUUUUUUUUUUUUUU                   ");
    }

    @Test
    public void test42598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...3\\u23\\u23U6              c", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        ...3\\u23\\u23U6              c" + "'", str2, "                                                                                        ...3\\u23\\u23U6              c");
    }

    @Test
    public void test42599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023757575757                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "222222222222222222222222222222222222222222222222222222222222222222222222222222 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              2222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023757575757                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str2, "111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023757575757                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test42600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42600");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200", 63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42601");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42602");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'C');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test42603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42603");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IIIIIIIIII0023\\u0...IIIIIIIIIII", '2');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42604");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("3333361                                         \n\n1", 'A');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'c', 59, 50);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test42605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "2...........................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42606");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42607");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih!ih!ih   2    2    2  ...", strArray3);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test42608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42608");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                             6u666", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555\\U23\\U23\\U23\\U23\\U23\\U23\\U23                                                  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 78 + "'", int5 == 78);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test42609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42609");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu162uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (java.lang.CharSequence) "                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42610");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaa\\u0055                                                           \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00aaaaaaaaaa\\u0055                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                         ...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         u0023\\u002u0023\\u002u0023\\u002u0", "...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...hUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42612");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test42613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42613");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 a", "\\1111111111111111111111111111u11111111111111111111111111110020");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42614");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...3\\u23\\u23aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...3\\u23\\u23aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...3\\u23\\u23aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42615");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa", 135, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42616");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("1\\u00234                                      \\u0023\\u00\\U0", "ccccccccccccccccccccccccccccccccccccccccccccccccc 6...", "", 241);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1\\u00234                                      \\u0023\\u00\\U0" + "'", str4, "1\\u00234                                      \\u0023\\u00\\U0");
    }

    @Test
    public void test42617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                                                                        7777777777777777                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42618");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                      \\U\\\\23\\U\\\\\\u\\                    ..4                           0\\U\\\\23");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023u6                                       ", 221, '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023u6                                       \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str3, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023u6                                       \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test42620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00", 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00" + "'", str2, "200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
    }

    @Test
    public void test42621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
    }

    @Test
    public void test42622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "   2     ...                                ...    \\U002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6                                                                                                                                                                                                                        ", "                                                                             11111111111111111111111111111111111                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42624");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "...3\\U0##########333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42625");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "hi!", (int) ' ');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test42626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42626");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42627");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                         \n\n1                                                    \n\n", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAA HHHHHHHHHHHHHHHHH", 54, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAAAA HHHHHHHHHHHHHHHHH" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAAAA HHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test42629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42629");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...", "U6");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       UUUUUUU", "\\u0023                                                                                                                                                  hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", 'A');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test42632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42632");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  uuuuuuuuuuuu 3200u           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuu 3200u" + "'", str1, "uuuuuuuuuuuu 3200u");
    }

    @Test
    public void test42634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42634");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test42635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0000000000000000000000000000000000000000000uUu0u3200uUu0u3200uUu0u3200uUu0u3200uUu0u32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "14");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0000000000000000000000000000000000000000000uUu0u3200uUu0u3200uUu0u3200uUu0u3200uUu0u32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0000000000000000000000000000000000000000000uUu0u3200uUu0u3200uUu0u3200uUu0u3200uUu0u32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test42636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("5c11111111111111111111111111 61\\ 1111111111111111111111", 227);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                            5c11111111111111111111111111 61\\ 1111111111111111111111" + "'", str2, "                                                                                                                                                                            5c11111111111111111111111111 61\\ 1111111111111111111111");
    }

    @Test
    public void test42637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\uu0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "    61        61 ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\uu0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str2, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\uu0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test42638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("A\\U0023\\U00\\U0041\\A", "\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test42639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42639");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                              ...\r                               ", "22222222222222222222uuu0023                                            222222222222222222222", 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42640");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str1, "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test42641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42641");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\U0023\\U...");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test42642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42642");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\", (java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test42643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", "222222222222222222222222222222222\\UUU02\\...222222222222222222222222222222222", 480);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057" + "'", str3, "                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
    }

    @Test
    public void test42644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\" + "'", str1, "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test42645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test42646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                300u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test42647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42647");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...      3...      3...      3...      3...      3...      3...      3...      aaaaaaaa...      3...      3...      3...      3...      3...      3...      3...      3", "                              20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aa                                          ", "61\\ 61\\ 61\\ 61\\ 61\\ 611111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa                                          " + "'", str2, "aa                                          ");
    }

    @Test
    public void test42649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(".....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....." + "'", str1, ".....");
    }

    @Test
    public void test42650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42650");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "23\\U0023\\U002", (java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "23\\U0023\\U002" + "'", charSequence2, "23\\U0023\\U002");
    }

    @Test
    public void test42651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42651");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("1");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test42652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42652");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0", 263);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA....AAAAAAAAAAAAAAAAAAAAAAAAA.......................AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....", "    222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA....AAAAAAAAAAAAAAAAAAAAAAAAA.......................AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA....." + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA....AAAAAAAAAAAAAAAAAAAAAAAAA.......................AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....");
    }

    @Test
    public void test42654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42654");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("22223200U\\1400U\\00U\\3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUU", "3\\u0023u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\iui0020\\4", "u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42656");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\", "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", 83, 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AA1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str4, "AA1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test42657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42657");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("23                                                                                     hi!hi!hi!", "\n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                        ..        ", '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                        ..        " + "'", str2, "                                                        ..        ");
    }

    @Test
    public void test42659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42659");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42660");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                 \\U0023\\U00\\u0041\\U                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42661");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaa                                                ", "                                                                     u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", "20\\u0020\\u0020\\u0020\\u00                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa222222222222222222222222222222222222222222222222" + "'", str3, "aaaa222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test42662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42662");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###\n\\u002                                         \n\n1         1        61   ", "222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0######\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test42663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42663");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\U0023\\U0023\\U0023\\U0023\\U0023", "AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              AAAAAAAAA", 532);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "   ...                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\", 33, 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\" + "'", str3, "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test42666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42666");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 245, (int) '0');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161                                                                                          ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa      " + "'", str5, "aaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaaaaa      " + "'", str10, "aaaaaaa      ");
    }

    @Test
    public void test42667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42667");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    ", " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42668");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", "A000u\\");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("U0023\\U00\\u0041\\U", strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777A\\u0023AAAAAAAAAAAAAa000u\\", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "16116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116" + "'", str9, "16116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test42669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
    }

    @Test
    public void test42670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...                                             136u66136u", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                             136u66136u                    " + "'", str2, "...                                             136u66136u                    ");
    }

    @Test
    public void test42671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42671");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...    ...uuuuu61uuuuuuuuuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", 202, 126);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test42672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42672");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42673");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("11111111111111111111       111111111111111111111                                                                                           ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa222222222222222222222222222222222222222222222u6                                         ", "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11111111111111111111       111111111111111111111                                                                                           " + "'", str3, "11111111111111111111       111111111111111111111                                                                                           ");
    }

    @Test
    public void test42675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42675");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\300 066666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42676");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                         \n\n1                                                    \n\n", "U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U0006");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test42677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "0023\\u0023\\u0023\\ U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                            uuuuuuuuuuuuuuuuuu", "2  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42679");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test42680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("61        61        615c    61        61        61", 'C', 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61        61        615c    61        61        61" + "'", str3, "61        61        615c    61        61        61");
    }

    @Test
    public void test42681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42682");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "000000000U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("2\\u005c                                               ...", (int) 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2\\u005c                                               ..." + "'", str2, "2\\u005c                                               ...");
    }

    @Test
    public void test42684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42684");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("UUUUUUUUUUUUUUUU...     32", '#', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUU...     32" + "'", str3, "UUUUUUUUUUUUUUUU...     32");
    }

    @Test
    public void test42685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42685");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", 13, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r" + "'", str3, "61\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test42686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42686");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("1111111111111111111111111111111111111111111111", 634, 87);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test42687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42687");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0043", "", (int) (byte) 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0043" + "'", str5, "\\u0043");
    }

    @Test
    public void test42688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42688");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0041", "...0u\\314...0u\\311", 263);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42689");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "       UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test42690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("c111111111111111111111111111111111111111111111111111111111111111111111111111111111...", 92, 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...11111111111111111111111111111111111..." + "'", str3, "...11111111111111111111111111111111111...");
    }

    @Test
    public void test42691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\n\n......\n\n", 566);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            \n\n......\n\n" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            \n\n......\n\n");
    }

    @Test
    public void test42692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42692");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "6\\\\u0020                                                                     ", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "6\\\\u0020                                                                     " + "'", charSequence2, "6\\\\u0020                                                                     ");
    }

    @Test
    public void test42693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...11111111111111111111111111111111111...", 108, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "111111111111111111111111111111111...11111111111111111111111111111111111...1111111111111111111111111111111111" + "'", str3, "111111111111111111111111111111111...11111111111111111111111111111111111...1111111111111111111111111111111111");
    }

    @Test
    public void test42694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42694");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("2\\3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\320032", 26, 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "023\\U0023\\U0023\\U0023" + "'", str3, "023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test42695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA", "55555555555555555555555555555555555555555555555555555555555555555555555555555522222\\U0023\\U00\\u0041\\U002322222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA" + "'", str2, "AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA");
    }

    @Test
    public void test42696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42696");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...", 79, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n..." + "'", str3, "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...");
    }

    @Test
    public void test42697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42697");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           \\61\\61\\61\\61\\61\\61", 8);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaaaaaaaaaaaaaaaa3aaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str5, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test42698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\" + "'", str2, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\");
    }

    @Test
    public void test42699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42699");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n                                           aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42700");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("               \\", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 67);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaa", "aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa" + "'", str2, "aaa");
    }

    @Test
    public void test42702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42702");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\r\r\r\r\r\r\r...                                      57", "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42703");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\U###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0##", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU... 61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42704");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAAAAAAAAAAAAAAAAAA", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6..", 59);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test42705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "        #######    61        61        615c    61        61        61                   Aaaaaaa                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                    \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42707");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                 A\\u0023AAAAAAAAAAAAA                                  ", "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "Aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'i', 456, 6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test42708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("555555555555555555555555555555555555555555555555555555  ......  ", "uUUUUUUUUU...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\u0030\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0030\\\\\\\\" + "'", str2, "\\u0030\\\\\\\\");
    }

    @Test
    public void test42710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42710");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test42711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42711");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42712");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...10020\\...", 480);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61UUUUUUUUUUUUHI!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61UUUUUUUUUUUUU", "0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test42714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42714");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u", "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...", 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42715");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\ 61\\ 61\\61u 61\\ 61\\610020", "111111111111111111111       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42716");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U0023\\U002375757575757575757575757575757575757575757575757575757575", '0');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0023\\U00 61\\ 61\\61\n\n\n\n\n\n\n\n", "AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\U00 61\\ 61\\61\n\n\n\n\n\n\n\n" + "'", str2, "0023\\U00 61\\ 61\\61\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test42718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42718");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("60u0UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0U060\\\\0u000200U060\\\\0u000200U06", 459, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42719");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "u\\3200u\\32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42720");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n666U3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\326");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42722");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("u003                    ", "u003                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U", "aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U" + "'", str2, "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U");
    }

    @Test
    public void test42724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" 61\\ 61\\ ", "   23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61" + "'", str2, " 61\\ 61");
    }

    @Test
    public void test42725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "    UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42726");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u005c\\u001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                \\3200u\\3200u\\3200u\\300u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                \\3200u\\3200u\\3200u\\300u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                \\3200u\\3200u\\3200u\\300u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test42728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("61\\ 61\\", "               51               ", "Iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6i\\I6i\\" + "'", str3, "6i\\I6i\\");
    }

    @Test
    public void test42729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "U003                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test42730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " 61.##########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42731");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "aaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42732");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034", 113);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42733");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 506 + "'", int1 == 506);
    }

    @Test
    public void test42734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42734");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "\\i\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42735");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih!ih   2    2    2  ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "\\u0032", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42736");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\u0023                                                                                     hi!hi!hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42737");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...", "                                         !IH!IH!IH                                          ", "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test42738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                  16u                                   ", 729);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  16u                                   " + "'", str2, "                                  16u                                   ");
    }

    @Test
    public void test42739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42739");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        " + "'", str1, "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
    }

    @Test
    public void test42740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42740");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\61\\61\\61\\61\\61\\61", "aaaaaa                             ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny(" 0## 0## 0## 0## 0## 0## 0## 0## 0##23\\U                                          0## 0## 0## 0## 0## 0## 0## 0## 0## ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test42741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\\aa\\a", "3333361                                         \n\n1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Uu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", 634, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
    }

    @Test
    public void test42743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42743");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("i!                                                                                   U002", "61UUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...61UUUUUUUUUUUUUU", 121, 192);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!                                                                                   U00261UUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...61UUUUUUUUUUUUUU" + "'", str4, "i!                                                                                   U00261UUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...61UUUUUUUUUUUUUU");
    }

    @Test
    public void test42744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42744");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", "\\u002366666666666666");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", (int) 'D');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test42746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42746");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("          \n\n1", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA061", "Aaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \n\n1" + "'", str3, "          \n\n1");
    }

    @Test
    public void test42747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42747");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "u0034\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 29);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 2, 115);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test42749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42749");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                      00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u", "                            AAAAAAAAAAAAA3200u\\A                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42750");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "    \n     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("777777777777777777777777777777777777777777    61    7777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "777777777777777777777777777777777777777777    61    7777777777777777777777777777777777777777777" + "'", str1, "777777777777777777777777777777777777777777    61    7777777777777777777777777777777777777777777");
    }

    @Test
    public void test42752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                         \\U0023\\U00\\u0041\\U                                                                                                                                            ", 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                         \\U0023\\U00\\u0041\\U                       " + "'", str2, "                                                                                                         \\U0023\\U00\\u0041\\U                       ");
    }

    @Test
    public void test42754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "A\\U0023\\U00\\U0041\\A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61", "aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...", "111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test42756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42756");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("333333333333333333333333333333333333333333333333333333333333333333333333333333310HI!100", "                                                                                                              ", 65);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42757");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...10020\\...", '2');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                 \\uhi!hi!hi!                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42760");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str4, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test42761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42761");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", 129, 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42762");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61        61        61        61        61        61        61        61        61        61        61        61        61   " + "'", str2, "61        61        61        61        61        61        61        61        61        61        61        61        61   ");
    }

    @Test
    public void test42763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42763");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test42764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42764");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', 300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 300 + "'", int2 == 300);
    }

    @Test
    public void test42765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###" + "'", str2, "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
    }

    @Test
    public void test42766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\\u0068", 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                      \\u0068" + "'", str2, "                                                                                                      \\u0068");
    }

    @Test
    public void test42767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                      uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                      ", (java.lang.CharSequence) "uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42770");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaa", (java.lang.Object[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023757575757                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test42771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42771");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.###################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42772");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaa                             ", "  2   ", 104);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...", "", 339);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("U000A16 16 16 16 16 16 16 16 16 16 16 U000A16 16 16 16 16 16 16 16 16 16 16 U000A", strArray6, strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...", strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "U000A16 16 16 16 16 16 16 16 16 16 16 U000A16 16 16 16 16 16 16 16 16 16 16 U000A" + "'", str11, "U000A16 16 16 16 16 16 16 16 16 16 16 U000A16 16 16 16 16 16 16 16 16 16 16 U000A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test42773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U", "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test42774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU..." + "'", str2, "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
    }

    @Test
    public void test42775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("A...\\61\\61\\61\\61\\U0023     ...A", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A...\\61\\61\\61\\61\\U0023     ...A" + "'", str2, "A...\\61\\61\\61\\61\\U0023     ...A");
    }

    @Test
    public void test42776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42776");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "ii\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaaii");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42777");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...261\\261\\261\\261\\261\\261\\261\\2...", 936);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42778");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...3200U\\3200U\\\\i\\3200U\\3200U\\3    3200U\\3200U\\\\i\\3200U\\3200U\\3...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 650);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...3200U\\3200U\\\\i\\3200U\\3200U\\3    3200U\\3200U\\\\i\\3200U\\3200U\\3...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "...3200U\\3200U\\\\i\\3200U\\3200U\\3    3200U\\3200U\\\\i\\3200U\\3200U\\3...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test42780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\aaaaaaaaaaaaa\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\aaaaaaaaaaaaa\\\\" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\aaaaaaaaaaaaa\\\\");
    }

    @Test
    public void test42781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", "3AAAA51AAAA0023AAAA51AAAA0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "575\\u0037200U", "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "                              uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test42783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42783");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str1, "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test42784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42784");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ##", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42785");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42787");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61", "51AAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42788");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("111111111111111111111111111111111111111111111111111111111111111111111111111111111111..", 59);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42789");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6", "  ......  \\u00410023\\U0023\\U0023\\U0023\\U0023\\U001\\u0041\\u00", 54);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42790");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 91 + "'", int1 == 91);
    }

    @Test
    public void test42791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42791");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42793");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\n\n\n\n\n                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" 0023\\U0023\\U0023\\U0023\\0023\\U0023 ...11111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\U0023\\U0023\\U0023\\0023\\U0023 ...11111111111111" + "'", str1, "0023\\U0023\\U0023\\U0023\\0023\\U0023 ...11111111111111");
    }

    @Test
    public void test42795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6", "U61", 126);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\U61\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6" + "'", str3, "1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\U61\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6");
    }

    @Test
    public void test42796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42796");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "6  6  6  6  6");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test42797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42797");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 570");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 570" + "'", str1, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 570");
    }

    @Test
    public void test42799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42799");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111     ", 'U');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6h6h6", 497);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6h6h6                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6h6h6                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test42801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42801");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...10020\\...", "23\\U                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 886);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                         \n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                         \n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test42803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test42804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42804");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA", "a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test42805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42805");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\", (java.lang.CharSequence) "16U");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", charSequence2, "hhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test42806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "00u\\1400", (java.lang.CharSequence) "                  Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42807");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                       AAAAAAAAAAAAA3200u\\A                          ...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "666666666666666666666666666666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1666666666666666666...                          A\\u0023AAAAAAAAAAAAA                                       " + "'", str1, "666666666666666666666666666666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1666666666666666666...                          A\\u0023AAAAAAAAAAAAA                                       ");
    }

    @Test
    public void test42808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("     ", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test42809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42809");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              hi!123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6 hi!123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6 23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6" + "'", str1, "123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6 hi!123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6 23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6");
    }

    @Test
    public void test42810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi", "AAAAAAAAAAAAA3200u\\A                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi" + "'", str2, "10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi");
    }

    @Test
    public void test42811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42811");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "1111111");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test42812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42812");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("###\nu002                                         \n\n1", "U0023                                                                                                                                                                                UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42813");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "               AAAAAAAAAAAAA3200\\A                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a000u\\       ", "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42815");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAA32u\\A", "             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test42816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42816");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\n");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test42817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaa                             ", 93, '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000aaaaaa                             " + "'", str3, "0000000000000000000000000000000000000000000000000000000000aaaaaa                             ");
    }

    @Test
    public void test42818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test42819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "1111111111111...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42820");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...", "                                                                         23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...3\\u0023\\u00231\\40032", 59, "                                                         U0023\\U002U0023\\U002U0023\\U002U0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  ...3\\u0023\\u00231\\40032                  " + "'", str3, "                  ...3\\u0023\\u00231\\40032                  ");
    }

    @Test
    public void test42822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", (int) 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        " + "'", str2, "                                                                                                        ");
    }

    @Test
    public void test42823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42823");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "000000000U0023\\U0023\\U0023\\U...", (java.lang.CharSequence) "1AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test42824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42824");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", "...                                      57", 146);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
    }

    @Test
    public void test42825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("5u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5u" + "'", str1, "5u");
    }

    @Test
    public void test42826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42826");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(" U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U" + "'", str1, "U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U");
    }

    @Test
    public void test42828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42828");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 'U');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test42829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42829");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" u61                                           ", "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                     3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                                                                                                                                                                                                                     ", 449, "u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                     3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                                                                                                                                                                                                                     " + "'", str3, "                                                                                                                                                                                                                     3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                                                                                                                                                                                                                     ");
    }

    @Test
    public void test42831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\", "6                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("... AAAA15AAAA AAAA15AAAA ...", "           A\\u0023AAAAAAAAAAAAA                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... AAAA15AAAA AAAA15AAAA ..." + "'", str2, "... AAAA15AAAA AAAA15AAAA ...");
    }

    @Test
    public void test42834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42834");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray4, strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
    }

    @Test
    public void test42835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                       61\n                       ", "u ...... \\u004...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       61\n                       " + "'", str2, "                       61\n                       ");
    }

    @Test
    public void test42836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        ", "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6h6h6                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        " + "'", str2, "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        ");
    }

    @Test
    public void test42837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                 \\U0023\\U00\\u0041\\U                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42838");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "222222222222222222222222222222222222222222222u6       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42839");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h" + "'", str1, "                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
    }

    @Test
    public void test42840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42840");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray14 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                     ", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "41", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0041\\u00", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaa u   6aaaaaaaaaaaaa", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test42841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       11111111111111..", "U6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       11111111111111.." + "'", str2, "       11111111111111..");
    }

    @Test
    public void test42842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42842");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 380);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 380 + "'", int2 == 380);
    }

    @Test
    public void test42843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("10hi!1###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi!1###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ##" + "'", str1, "10hi!1###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ##");
    }

    @Test
    public void test42844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...", "000000000000000000000000000000     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42845");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####", 172);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "U###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###U\\32                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42847");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hhhhhhhhhhhhh", "1111111      ", (int) (short) -1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhhhhhhhh" + "'", str4, "hhhhhhhhhhhhh");
    }

    @Test
    public void test42848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaa23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6              aaaaaaaaa", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaa23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6 " + "'", str2, "aaaaaaaaa23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6 ");
    }

    @Test
    public void test42849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42849");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa222222222222222222222222222222222222222222222u6", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                     0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6..", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test42850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n", 1000, (int) '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test42851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        ", "", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test42852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     \\U0023\\U0023\\U0023\\U0023\\U002     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     \\u0023\\u0023\\u0023\\u0023\\u002     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8" + "'", str1, "8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     \\u0023\\u0023\\u0023\\u0023\\u002     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8");
    }

    @Test
    public void test42854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42854");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("cccccccccccccccccccccccccccccccccc\n     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("5555555\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r", " 61\\ ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r" + "'", str2, "5555555\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r");
    }

    @Test
    public void test42856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                 cccccccccccccccccccccccccccccccccc\n     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cccccccccccccccccccccccccccccccccc" + "'", str1, "cccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test42857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42857");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u01\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                           a             u6", "555555555555555555555555555555555555555555555555555555555", 138);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u01\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                           a             u6" + "'", str4, "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u01\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                           a             u6");
    }

    @Test
    public void test42858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42858");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                  \\\\\\aaaaaaaaaaaaa\\3200U\\3200U\\3200U\\", (int) (short) 1, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  \\\\\\aaaaaaaaaaaaa\\3200U\\3200U\\3200U\\" + "'", str3, "                  \\\\\\aaaaaaaaaaaaa\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test42859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("3200U", "                                                                                                                                                                                                                                                                 ####a\n");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test42860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aa        75", "\\0u00020");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test42862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("a                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A                                                                                                 " + "'", str1, "A                                                                                                 ");
    }

    @Test
    public void test42863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42863");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                           ...                                                                                                                                                                                                                          ", "AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42865");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 113, "                                                 61\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 61\n                                                             " + "'", str3, "                                                 61\n                                                             ");
    }

    @Test
    public void test42866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42866");
        char[] charArray17 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray17);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  2   ", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U0023", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "22222222222222222222222222222222222222241AAAAAAAA", charArray17);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray17);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                             23\\u0023\\u", charArray17);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39 + "'", int27 == 39);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test42867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42867");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("23                                                                                                                                                  hi!hi!hi!", (int) 'A', 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23                                                                                                                                                  hi!hi!hi!" + "'", str3, "23                                                                                                                                                  hi!hi!hi!");
    }

    @Test
    public void test42868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42868");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AA1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42869");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("U\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "", 936);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test42870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42870");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2............................................................................................................................................................................................................................................................................................................................................................", "61uuu");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'h');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\r', 67, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2............................................................................................................................................................................................................................................................................................................................................................" + "'", str6, "2............................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test42871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42871");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                      \\U\\\\23\\U\\\\\\u\\                    ..4                           0\\U\\\\23");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U\\\\23\\U\\\\\\u\\ ..4 0\\U\\\\23" + "'", str1, "\\U\\\\23\\U\\\\\\u\\ ..4 0\\U\\\\23");
    }

    @Test
    public void test42872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42872");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("65 5a5757575757575757575757575757575757575757575751115757575757575757575757575757575757575757575751115", "            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42873");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("UUUUUUUUUUUUUUUUUUUUUUUUUUUU..", "U0023\\u0..  6\\\\u0020                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42874");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                         75                                      ...", charArray14);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 77 + "'", int21 == 77);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test42875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\n\n\n\n\n\n\n\n\n\n\n\n0000000000000000000000000000000000000000000000000000000\n\n\n\n\n\n\n\n\n\n\n\n\n", (int) '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000000000\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str2, "000000000000\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test42876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42876");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "A                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42877");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                     0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6..", "\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003...3\\u0023\\u00231\\40032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003...3\\u0023\\u00231\\40032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003" + "'", str1, "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003...3\\u0023\\u00231\\40032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003");
    }

    @Test
    public void test42879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42879");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1\\6 u0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test42880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                      \\u0023\\u00\\u0041\\u0023", "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023\\u00\\u0041\\u0023" + "'", str2, "u0023\\u00\\u0041\\u0023");
    }

    @Test
    public void test42881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42881");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\7777", (java.lang.CharSequence) "666666661\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\7777" + "'", charSequence2, "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\7777");
    }

    @Test
    public void test42882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               ", "3200U\\3200U\\\\i\\3200U\\3200U\\3");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               " + "'", str2, "...0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               ");
    }

    @Test
    public void test42883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42883");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...6666666666666666661AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA666666666666666666666666666666");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\u003\\u0023\\u0023\\u0023\\", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\" + "'", str2, "\\u003\\u0023\\u0023\\u0023\\");
    }

    @Test
    public void test42886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42886");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42887");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  6  6  6  6  6  uuu", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '5', (int) (byte) 1, 695);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  6  6  6  6  6  uuu" + "'", str5, "  6  6  6  6  6  uuu");
    }

    @Test
    public void test42888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test42889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42889");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...H    H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...H    H..." + "'", str1, "...H    H...");
    }

    @Test
    public void test42890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42890");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaa u   6aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaa u   6aaaaaaaaaaaaa" + "'", charSequence2, "aaaaaaaaaaaaa u   6aaaaaaaaaaaaa");
    }

    @Test
    public void test42891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42891");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuu3\\u0...\\U0023\\U0##########", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 215 + "'", int2 == 215);
    }

    @Test
    public void test42892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42892");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1", "16\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("      ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...", " 61\\\\u0020");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      " + "'", str3, "      ");
    }

    @Test
    public void test42894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42894");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "6666\r\r\r\r\r\r\r");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111161\\", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test42895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42895");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\\U23\\U23\\U23\\U23\\U23\\U23\\U23                                                  ", "  575\\u0037200U\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42896");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("UUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6 161\\161\\161\\161\\161\\161", 'D');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'U' + "'", char2 == 'U');
    }

    @Test
    public void test42897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42897");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\\u003 ", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U0023", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test42898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...", "111111111aaaa\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6..." + "'", str2, "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...");
    }

    @Test
    public void test42899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42899");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("3000u\\3111111111111111111111111111111111111111111111", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("cccccccccccccccccccccccccccccccccccccccccccccccccccccc", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test42900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42900");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "   61        61                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42901");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("000000000000000000000000000003200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A800000000000000000000000000000", "                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42902");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\u0032                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0032                                                                      " + "'", str1, "\\u0032                                                                      ");
    }

    @Test
    public void test42904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42904");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("41AAAAAAAA", "                                       aaaaaaaaaaaaa\\\\\\", (int) 'u');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("a000u\\", 'h');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", strArray5, strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "41AAAAAAAA" + "'", str7, "41AAAAAAAA");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a000u\\" + "'", str11, "a000u\\");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str12, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test42905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                            \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      ", 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      A                                                            \\                                       A                                       \\                                       " + "'", str2, "                      A                                                            \\                                       A                                       \\                                       ");
    }

    @Test
    public void test42906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("U00230023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U00230023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str3, "U00230023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test42907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("2  U  2  U  2  U  2  U  ", "\r\r\r\r\r8");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("    61        61        615c    61        61        61", "0U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    61        61        615c    61        61        61" + "'", str2, "    61        61        615c    61        61        61");
    }

    @Test
    public void test42909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42909");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" uuuuuuuuuuU6uuuuuuuuuuu                         ", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "...261\\261\\261\\261\\261\\261\\261\\2...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("3\\u0..  6\\\\u0020                                                              ", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              020..  6\\\\u03\\u" + "'", str2, "                                                              020..  6\\\\u03\\u");
    }

    @Test
    public void test42912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42912");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6");
    }

    @Test
    public void test42913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42913");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42914");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                               555555555555555                                                                                               ", "222223200U\\  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42915");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("22222a2aaUa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u003\\u0023                                        ", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42917");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("  61\\61\\61", "   u61    ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42918");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("111111116 \\16 \\16 \\16 \\16 \\16111111116 \\16 \\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", "                                \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ", "2\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222", 89);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "111111116 \\16 \\16 \\16 \\16 \\16111111116 \\16 \\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    " + "'", str4, "111111116 \\16 \\16 \\16 \\16 \\16111111116 \\16 \\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
    }

    @Test
    public void test42919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42919");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "u23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test42920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42920");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0068", "...0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               ", 137);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "11111111111u6111111111111111111111");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test42921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42921");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 667);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 667 + "'", int2 == 667);
    }

    @Test
    public void test42922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42922");
        char[] charArray14 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "3\\u0...", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023\\U00\\U0041\\U", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "u003", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                    \n\n1", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                                                                                                                                                                  ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#################################################  2   #################################################", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test42923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u", '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u" + "'", str2, "             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
    }

    @Test
    public void test42924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", 354, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ");
    }

    @Test
    public void test42925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42925");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaa                            ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42926");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u0023" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u0023");
    }

    @Test
    public void test42927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42927");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                  ...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "\\U0032\\U0032\\U0032\\U0032\\U0032\\U0032");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\u005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232", "", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23004\\13200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001666666666666666666666666666666666666623004\\", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "23004\\13200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001666666666666666666666666666666666666623004\\" + "'", str8, "23004\\13200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001666666666666666666666666666666666666623004\\");
    }

    @Test
    public void test42928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42928");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                         \n\n1                        2D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002             ", "                             7777777777777777777", "\\U23\\U23\\U23\\U23\\U23u6              aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\n1\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\2D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\n1\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\2D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002D\\u002\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test42929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42929");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...  16        16        16        16        16        16        16        16        16", 213, 460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42930");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("57", "\\u000a");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '2', 124, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "57" + "'", str8, "57");
    }

    @Test
    public void test42931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ", "  UUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     " + "'", str2, "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ");
    }

    @Test
    public void test42932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 369);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test42933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42934");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("  \\u0023\\u0023\\u0023\\u0023\\u0023\\16 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42935");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "a         ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("                             ", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   " + "'", str8, "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ");
    }

    @Test
    public void test42936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                             11111                              ", "                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             11111                              " + "'", str2, "                             11111                              ");
    }

    @Test
    public void test42937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42937");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 172);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42938");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42939");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8" + "'", str1, "3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8");
    }

    @Test
    public void test42940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42940");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("61\\61\\61\\61\\6161\\61\\61\\61\\61\\61", "3\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42941");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'i', 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test42942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("uuuuuuuuuuuu                                  3200u", 270, "AAAAAAAAAAAAA3200u\\A                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAA3200u\\A                                 AAAAAAAAAAAAA3200u\\A                                 AAAuuuuuuuuuuuu                                  3200uAAAAAAAAAAAAA3200u\\A                                 AAAAAAAAAAAAA3200u\\A                                 AAAA" + "'", str3, "AAAAAAAAAAAAA3200u\\A                                 AAAAAAAAAAAAA3200u\\A                                 AAAuuuuuuuuuuuu                                  3200uAAAAAAAAAAAAA3200u\\A                                 AAAAAAAAAAAAA3200u\\A                                 AAAA");
    }

    @Test
    public void test42943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42943");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiii................U0023                                            ................iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii###########U005cu0u005cu0u0023Uu005cu0u005cu0###########", (java.lang.CharSequence) "6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 550 + "'", int2 == 550);
    }

    @Test
    public void test42944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42944");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("2", " ", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\r', 506, 12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test42945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42945");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("       h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test42946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42946");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...3\\u23\\u23U6", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              555555555555555555555555555555555555555555555555555555  ......  61555555", "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3\\u23\\u23U" + "'", str3, "3\\u23\\u23U");
    }

    @Test
    public void test42947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih!ih!ih 300u 300u 300u 300u 300u 300u 300u 300u3200u 300u", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....       ", "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ihu300uu300uu300uu300uu300uu300uu300uu300u3200uu300u" + "'", str3, "!ih!ih!ihu300uu300uu300uu300uu300uu300uu300uu300u3200uu300u");
    }

    @Test
    public void test42948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42948");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42949");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii", "###\nu002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test42951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42951");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0037", "4444444444444444444                                                   44444444444444444444", 83);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("51AAAA", "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        \\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "51AAAA" + "'", str2, "51AAAA");
    }

    @Test
    public void test42953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42953");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii                                  ", "   2");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42954");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhh", (java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42955");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\7777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("533333333333333333333333333333\\40032333333333333333333333333333333c", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "533333333333333333333333333333\\432333333333333333333333333333333c" + "'", str2, "533333333333333333333333333333\\432333333333333333333333333333333c");
    }

    @Test
    public void test42957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U...", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test42958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...111111111111111111111111111111111111111111111111111111111", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...111111111111111111111111111111111111111111111111111111111" + "'", str2, "...111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test42959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42959");
        char[] charArray18 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray18);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray18);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray18);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray18);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray18);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray18);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray18);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                           \\u005c", charArray18);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray18);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "11111111111u0023#u0023#u0023#u0023#u0023#u0023#u", charArray18);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\...", charArray18);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                         \n\n1                                                    \n\n1                                  61\\", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 43 + "'", int27 == 43);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 39 + "'", int28 == 39);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test42960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUU", "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUU" + "'", str2, "hhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUU");
    }

    @Test
    public void test42961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42961");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "11111111111111111111111111111...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u......\\u004...u", "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    IUI0020\\4\n\nIUI0020\\4\n\nIUI0020\\4\n\nIUI002");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test42962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "aaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str2, "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test42963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("u005cu0u005cu0u0023Uu005cu0u005cu0", "        \\u0034         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u005cu0u005cu0u0023Uu005cu0u005cu0" + "'", str2, "u005cu0u005cu0u0023Uu005cu0u005cu0");
    }

    @Test
    public void test42964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42964");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("i!                                                                                   U0023                           ", 100, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   ..." + "'", str3, "...   ...");
    }

    @Test
    public void test42965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42965");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (int) '\\');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261", (java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("002300230023002300230023002300230A000U\\002300230023002300230023002300230", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str7, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str8, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test42966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "22222222222222222\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222", "       111111111111111111111  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test42967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AAAAAA HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("   2 ", "                                                                                                                                                                        41");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test42969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("22222222222222222\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222", (int) 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22222222222222222\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str2, "22222222222222222\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test42970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42970");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhh" + "'", str1, "hhhhhhhhhhhhh");
    }

    @Test
    public void test42972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42972");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...02...", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42973");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                           ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("uuuu6cuuuu", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuu" + "'", str3, "uuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuuuuuu6cuuuu");
    }

    @Test
    public void test42974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42974");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42975");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\\u005c\\u0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "UUUUUUUUUUu6UUUUUUUUUUU", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42976");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42977");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...h    h...                                                                                            ", 69, "51");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...h    h...                                                                                            " + "'", str3, "...h    h...                                                                                            ");
    }

    @Test
    public void test42978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42978");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                       ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '0');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '4');
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("\r");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", strArray14, strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", strArray7, strArray14);
        java.lang.Class<?> wildcardClass20 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0000000000000000000000000000000000000000000000000000000" + "'", str5, "0000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U" + "'", str18, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020" + "'", str19, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test42979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("  uuuuuuu                                                    ", "333333333333333333333333333333333333333333333333333333333333333333333333333333310HI!100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  uuuuuuu                                                    " + "'", str2, "  uuuuuuu                                                    ");
    }

    @Test
    public void test42980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42980");
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023002", charArray15);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test42981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42981");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 227);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("U0023                                            66666666666666666666666666666666666666666666666666666666666666666666", "Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023                                            66666666666666666666666666666666666666666666666666666666666666666666" + "'", str2, "U0023                                            66666666666666666666666666666666666666666666666666666666666666666666");
    }

    @Test
    public void test42983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42983");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00000000000033u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u3\n06u", "                                                   3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("  uuuuuuuuuuuu 3200u           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuu 3200u" + "'", str1, "uuuuuuuuuuuu 3200u");
    }

    @Test
    public void test42985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "16u    \n   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test42986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42987");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61", "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", (int) (byte) 10);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\U002322222", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("a000u\\", (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " 61" + "'", str7, " 61");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "61" + "'", str9, "61");
    }

    @Test
    public void test42988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42988");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test42989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", 234);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                                                                                                                                                                                    " + "'", str2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                                                                                                                                                                                    ");
    }

    @Test
    public void test42990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("20\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20\\U0020\\U0020\\U0020\\U00" + "'", str1, "20\\U0020\\U0020\\U0020\\U00");
    }

    @Test
    public void test42991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "uuu0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "23\\u0023\\u002", (java.lang.CharSequence) "                   \\U0033                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                         61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...                         ", "ua61a\na\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...                         " + "'", str2, "                         61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...                         ");
    }

    @Test
    public void test42994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42994");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u0023\\u0023323\\u0023\\u0023", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", 30);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("u\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test42995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42995");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42996");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n6161\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n6161\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61", "                                               HUUU02HUUU02HUUU02HAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42997");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("1111111111111111111111111111111111111111111110ua3000ua3111111111111111111111111111111111111111111111", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test42998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("6u666u", 356);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6u666u" + "'", str2, "6u666u");
    }

    @Test
    public void test42999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test42999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AUAAAAAAAAAAAAAAU", "                                            3200u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AUAAAAAAAAAAAAAAU" + "'", str2, "AUAAAAAAAAAAAAAAU");
    }

    @Test
    public void test43000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest85.test43000");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("  2  ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

