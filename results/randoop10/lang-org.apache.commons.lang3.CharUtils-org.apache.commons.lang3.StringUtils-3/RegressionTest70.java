import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest70 {

    public static boolean debug = false;

    @Test
    public void test35001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35001");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "111111111111111111111U6111111111111111111111", (java.lang.CharSequence) "61\\\\U0020");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35002");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!i16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n", "\\u0023\\u00\\U0041\\u", 297, 22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!i16\\16\\16\\16\\16\\16\\16\\u0023\\u00\\U0041\\u" + "'", str4, "!i16\\16\\16\\16\\16\\16\\16\\u0023\\u00\\U0041\\u");
    }

    @Test
    public void test35003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("66666666666666666666666666666666666666666666666666666       22222\\U0023\\U00\\u0041\\U002322222", 161, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35004");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U0006", "           \n\n1", "\\u002                                         \n\n1");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "77777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "77777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test35006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    " + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
    }

    @Test
    public void test35007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\163200u\\" + "'", str1, "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\163200u\\");
    }

    @Test
    public void test35008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35008");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\161", "...U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U...", 234);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35009");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAA                                             ", 227, 685);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35010");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...                                       ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00         ...", "                  \\U0033\\U0033\\U0033\\U0033\\U0033\\U0033\\U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35011");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test35012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35013");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 146, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("###\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0###" + "'", str1, "###\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0###");
    }

    @Test
    public void test35015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                   3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "u 61..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str2, "                                                   3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test35016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35016");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0\\\\0020        ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", 562);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35017");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u23\\u23\\u23\\u23\\u23\\u23\\u23");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35018");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                             11111                              ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11111" + "'", str2, "11111");
    }

    @Test
    public void test35019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6" + "'", str1, "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
    }

    @Test
    public void test35020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("2............111111111111111111111111111111111111111111111..............................................................................................................................................................", "iiiiiaaaaaa                             iiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2............111111111111111111111111111111111111111111111.............................................................................................................................................................." + "'", str2, "2............111111111111111111111111111111111111111111111..............................................................................................................................................................");
    }

    @Test
    public void test35021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\40032", (int) 'a', 130);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\40032" + "'", str3, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\40032");
    }

    @Test
    public void test35022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   " + "'", str2, "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ");
    }

    @Test
    public void test35023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35023");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020                       ", "                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35024");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("3200U\\3200U\\u6623\\u6623\\u6623\\u6623\\u6623\\u6623U6663200U\\3200U\\3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\u6623\\u6623\\u6623\\u6623\\u6623\\u6623U6663200U\\3200U\\3" + "'", str1, "3200U\\3200U\\u6623\\u6623\\u6623\\u6623\\u6623\\u6623U6663200U\\3200U\\3");
    }

    @Test
    public void test35025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35025");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\161\\161\\161\\161\\161\\161\\u6                                 ", "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020", "uuuuuuuuuuuuuuuuuu\\4555555555555555555555555");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhh" + "'", str1, "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhh");
    }

    @Test
    public void test35028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("U0023\\U00\\u0041\\U002322222", "0023\\u0023\\u0023\\u0023\\u004444444444444 6A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35029");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\u0034                                                                                          ", "\\u0031");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "23\\U                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35031");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U" + "'", str1, "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
    }

    @Test
    public void test35032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35032");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("..                                                                                                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35033");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        " + "'", str1, "                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        ");
    }

    @Test
    public void test35034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35034");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\U00685555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U00685555555555555555555555555555555555555555555555555555555555555555555555" + "'", str1, "\\U00685555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test35035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35035");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1", " 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35036");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("23hi!hi!hi!                                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35037");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAA", "####A000U\\", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35038");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                       000u                       ", "iiiiiaaaaaa                             iiiiii");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35039");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0023\\0023\\0023\\ U", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35040");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("U0023#U0023#U0023#U0023#U0023#U0023#U0023");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35041");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                               \\u0035", 35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35042");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35043");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35044");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", 'A');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\     \\     \\     \\     \\       \\", 28, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\     \\     \\     \\     \\       \\" + "'", str3, "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\     \\     \\     \\     \\       \\");
    }

    @Test
    public void test35046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35046");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0031", "  ", (int) 'h');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006", 268, 41);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "                                                         u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", strArray5, strArray11);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concatWith("cccccccccccccccccccccccccccccccccc\n     ", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str16, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0031" + "'", str17, "\\u0031");
    }

    @Test
    public void test35047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                               \\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0                                  ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               \\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0                                  " + "'", str2, "                               \\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0                                  ");
    }

    @Test
    public void test35049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35049");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("       aaaaaaa", "6666AAAAAAAAAAAAAAAAAI6666AAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35050");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35051");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("###", "                                                                                                                                 16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\", "0000000000000000U00232222200000000000000000", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###" + "'", str4, "###");
    }

    @Test
    public void test35052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35052");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222", 85, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11111111111111111111111111222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222" + "'", str3, "11111111111111111111111111222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222");
    }

    @Test
    public void test35053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35053");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", "AAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 370);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    " + "'", str2, "                    ");
    }

    @Test
    public void test35055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35055");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("575757575757575757575757575757575757575757575757575111", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test35057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35057");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  2  ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                 ####a\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test35058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35058");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", "40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35059");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61########61########61########61########61########61########61########61########61########61########61########61########61###", 65, "A000U\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61########61########61########61########61########61########61########61########61########61########61########61########61###" + "'", str3, "61########61########61########61########61########61########61########61########61########61########61########61########61###");
    }

    @Test
    public void test35060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       ...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61                                          ...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61                                          ...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61                                          ...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61                                          ...H    H" + "'", str1, "                                       ...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61                                          ...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61                                          ...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61                                          ...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61                                          ...H    H");
    }

    @Test
    public void test35061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("11111111111111111111       111111111111111111111                                                                                           ", 57, "                    \n\n1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11111111111111111111       111111111111111111111                                                                                           " + "'", str3, "11111111111111111111       111111111111111111111                                                                                           ");
    }

    @Test
    public void test35062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35063");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u005c\\u0", "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...                                ", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\\');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "5555555                     ..");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u005c\\u0" + "'", str6, "\\u005c\\u0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u005c\\u0" + "'", str8, "\\u005c\\u0");
    }

    @Test
    public void test35064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "2U...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2U..." + "'", str1, "2U...");
    }

    @Test
    public void test35066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35066");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("IiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str3, "IiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test35067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 177);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        " + "'", str2, "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ");
    }

    @Test
    public void test35068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "111575757575757575757575757575757575757575757575757575757573200##0U##0\\##03200##0U##0\\##0320##0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35070");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('0', 393);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35071");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                             6u623\\U                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35072");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                           \\u005                                            3200u");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35073");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("61aaaaaaaaaaaaaaaaaaaaaa...", "\\u0069                                           \\6005c\\u0069");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a0U0023aaaaaaaaaaaaa", "iiiiiiiiiiiiiiiii23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0U0023aaaaaaaaaaaaa" + "'", str2, "a0U0023aaaaaaaaaaaaa");
    }

    @Test
    public void test35075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", 479);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                     3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                     3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                                                                                                                                                                                                                     ");
    }

    @Test
    public void test35076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35076");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("u61", 'U');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'h');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String[] strArray8 = null;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("111575757575757575757575757575757575757575757575757575757573200##0U##0\\##03200##0U##0\\##0320##0...", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "u61" + "'", str5, "u61");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "u61" + "'", str7, "u61");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "111575757575757575757575757575757575757575757575757575757573200##0U##0\\##03200##0U##0\\##0320##0..." + "'", str9, "111575757575757575757575757575757575757575757575757575757573200##0U##0\\##03200##0U##0\\##0320##0...");
    }

    @Test
    public void test35077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35077");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ", "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", 213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35078");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("        75");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35079");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35080");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUUUUUUUUUUUUUUUUUUUUU", "00000000000", 118);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\" + "'", str1, "1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\");
    }

    @Test
    public void test35082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35082");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("40032\\40032", "u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("uuuuu61uuuuuuuuuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444", "\r\r\r\r\r\r\r...                                      57");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("uuuuuuuuuuuu", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35085");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                 6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35086");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("6   U u\\32");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35087");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U003 111 ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuUuuuuuUuuuuuUuuuuuUuuuuuUuuuuuUuuuuuUuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35089");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                  I", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35090");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("222222222222222222222222222222222222222222222222222222222222u   6", "                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35092");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35093");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35094");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", "##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35095");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35096");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075", (java.lang.CharSequence) "u   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35097");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u0023\\U\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u005", "aaaaaaaaaaaaau6aaaaaaaaaaaaa", 433);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35098");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "61\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test35099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\\\\0020                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\u005c\\u003 u00\\u005c\\u003 u00\\u005c\\u003          3    \\u005c\\u003 u00\\u005c\\u003 u00\\u005c\\u003      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35102");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("000000000U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35103");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35104");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                        AAAAAAA    ", "        75");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                        AAAAAAA    " + "'", str3, "                                                                                                        AAAAAAA    ");
    }

    @Test
    public void test35105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u", "\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u" + "'", str2, "\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u");
    }

    @Test
    public void test35106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("3232323232323                                                  ", "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3232323232323                                                  " + "'", str2, "3232323232323                                                  ");
    }

    @Test
    public void test35107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35107");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0023\\u\\", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 13);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("1!h1", (java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0023\\u\\" + "'", str5, "\\u0023\\u\\");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0023\\u\\" + "'", str6, "\\u0023\\u\\");
    }

    @Test
    public void test35108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("UUU6 6 6 6 6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUU6 6 6 6 6" + "'", str1, "UUU6 6 6 6 6");
    }

    @Test
    public void test35109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 930);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35110");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......", "...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...h ", 297);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ..." + "'", str4, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...");
    }

    @Test
    public void test35111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "h          aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11h", "U6                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11h" + "'", str2, "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11h");
    }

    @Test
    public void test35113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("3200U", 42, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################3200U" + "'", str3, "#####################################3200U");
    }

    @Test
    public void test35114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test35115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35115");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a", 'A');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test35116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35116");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("uuuu61uuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUU61UUUU" + "'", str1, "UUUU61UUUU");
    }

    @Test
    public void test35117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35118");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAA4...4AAAAAA4                             4HHHHHHHHHHHHHHHHHAAAAAA4                             4HHHHHHHHHHHHHHHHH61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 268, 105);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35120");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi61iAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 404);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35122");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str1, "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test35124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35124");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...0u\\3114...0u\\31", "0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35125");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("3333333333333333333333333333333333                                                                             6u623\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3333333333333333333333333333333333                                                                             6U623\\u" + "'", str1, "3333333333333333333333333333333333                                                                             6U623\\u");
    }

    @Test
    public void test35126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35126");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                      61\\ 61\\61", "1\\6 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35127");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35128");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     " + "'", str1, "     ");
    }

    @Test
    public void test35129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhh", '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhh\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\  " + "'", str2, "u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhh\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\  ");
    }

    @Test
    public void test35130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35131");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1\\U00234                                      \\U0023\\U00\\u00");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("40032\\40032");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "40032\\40032" + "'", str1, "40032\\40032");
    }

    @Test
    public void test35133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35133");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002", "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35134");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35135");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002" + "'", str2, "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
    }

    @Test
    public void test35137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35137");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                 \\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35138");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "10hi!100", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35139");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("004", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 28);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35140");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0023\\U0023\\U0023\\U0023\\U0023\\U00", "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str3, "0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str4, "0023\\U0023\\U0023\\U0023\\U0023\\U00");
    }

    @Test
    public void test35141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35141");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...", 267);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35142");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("         ", 49, '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "66666666666666666666         66666666666666666666" + "'", str3, "66666666666666666666         66666666666666666666");
    }

    @Test
    public void test35144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35145");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...U0023\\U\\4003U0023\\U0023\\U0##########U0023U0023\\U00...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35146");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                     ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                     " + "'", str6, "                                                                                     ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                     " + "'", str7, "                                                                                     ");
    }

    @Test
    public void test35147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35148");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaaaaaaa u   6aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaau6aaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaau6aaaaaaaaaaaaa");
    }

    @Test
    public void test35149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35149");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61", "A000u\\000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                        Aauaa\\uAAAAAAAAAAAAA                                       ", 92, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        Aauaa\\uAAAAAAAAAAAAA                                       " + "'", str3, "                                        Aauaa\\uAAAAAAAAAAAAA                                       ");
    }

    @Test
    public void test35151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35151");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) '2');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '5', 113, 13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str4, "                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test35152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35152");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#61#6161\n\n\n\n\n\n\n\n", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35153");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", "\\UUU02\\... 3hi!hi!hi!                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35154");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                    \\u0023                                                                                     hi!hi!hi!                                                                                                    ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35155");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'C', '7');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'C' + "'", char2 == 'C');
    }

    @Test
    public void test35156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("1        61        615C    61        61        61", "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35157");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35158");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("666666666666...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000", "                                                                                      u\\32");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35159");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\n\n", 'i');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     " + "'", str2, "                                                                                     ");
    }

    @Test
    public void test35161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    " + "'", str1, "...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    ");
    }

    @Test
    public void test35162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 1AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35163");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("666666666666666666666666666666666666666666                                                                                                                                                              ...666666666666666666666666666666666666666666");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test35164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35164");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("3\\u0003\\u0111111111111111111111111111111111111111111111", 147, "\\iui0020");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3\\u0003\\u0111111111111111111111111111111111111111111111\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui" + "'", str3, "3\\u0003\\u0111111111111111111111111111111111111111111111\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui");
    }

    @Test
    public void test35165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                          ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35166");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                    ", "\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "               AAAAAAAAAAAAA3200\\A                                 ", "                                                                                             U23");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35168");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                           \\6005c", 25, 297);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61", 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35170");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) (byte) 0, 685);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAA51AAAAAAAA51AAAAAAA1\\U00234                                      \\U0023\\U00\\u0AAAA51AAAAAAAA51AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("222222222222222222222222222222222222222222222u                                           ", 157, 339);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "222222222222222222222222222222222222222222222u                                           " + "'", str3, "222222222222222222222222222222222222222222222u                                           ");
    }

    @Test
    public void test35173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("   ", (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test35174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35174");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023                                                   ", "HHHHHHHHHHHHH023\\U0023       AAAAAAAUUUUUUUUUHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35175");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("1111111111111");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("...023\\U0023\\U002375757575757575757575757575757575757575757575757575757575111", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35176");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "2                                         \n\n1", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "222223200U\\  ", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "6\\\\u0020", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023                                                   ", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test35177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("00000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000" + "'", str1, "00000000000");
    }

    @Test
    public void test35178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35178");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                                    16AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", "666u6                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
    }

    @Test
    public void test35180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35180");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u 61.", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0023\\u0...", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 18 + "'", int17 == 18);
    }

    @Test
    public void test35181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35181");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6\\\\u00206\\\\u00206", "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35182");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                   ", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35183");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "6666\r\r\r\r\r\r\r", 92);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("61                                         \n\n1", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test35184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35184");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         \n\n1                                         ", "\\61\\61\\61\\61\\u0023     ", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test35186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35186");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '1', 125);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test35187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35187");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "6666AAAAAAAAAAAAAAAAAI6666AAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35188");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("000000000000000000000000000000...                                                         ", "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000000000000000000000000000...                                                         " + "'", str2, "000000000000000000000000000000...                                                         ");
    }

    @Test
    public void test35190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35190");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\UUU02\\... 3hi!hi!hi!                                                                          ", "0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", 41);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "555555555555555555555555555555555555555555555555555555555555555555555555          aaaaaaa       CCCCCCCCCCCCCCCC55555555555555555555555555555555555555555555555555555555555555555555555");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test35191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35191");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("22222222222222222222222222222222222222222222222222222222222222222223\\u0023\\u0023\\u0023\\u0023\\u002", "\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35192");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u0023                                 6", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35193");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u0023\\u\\u", "    61        61 ...23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U    61        61 ... ", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35194");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                     HHHHHHHHHHHHHHHHH", "\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 340);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                     HHHHHHHHHHHHHHHHH" + "'", str4, "                     HHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test35195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35195");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("3333333333333333333333333", 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                         ...0023h\\huh0023h\\huh0023h                            ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35197");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "#####################################3200U", (int) '1');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35198");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 82 + "'", int2 == 82);
    }

    @Test
    public void test35199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35199");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\..." + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
    }

    @Test
    public void test35200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("200u\\3200u\\3200u\\", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3u61\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\16u3\\16u \\16 \\16 \\16 \\16 \\16  \\16u \\16 \\16 \\16 \\16 " + "'", str1, "U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\16u3\\16u \\16 \\16 \\16 \\16 \\16  \\16u \\16 \\16 \\16 \\16 ");
    }

    @Test
    public void test35202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35202");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...", "111111111111111111111       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("U0023\\u0... U", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U0023\\u0... U" + "'", str3, "U0023\\u0... U");
    }

    @Test
    public void test35204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35204");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                                                                                        aaaaaaa     ", " 61\\ ");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", '.');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray6, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                           ");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                     u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", strArray11, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 92");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str12, "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test35205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\r\r\r\r\r8", 27, 834);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35206");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("61\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", "                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                 \\u0030\\\\\\\\                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0030\\\\\\\\" + "'", str1, "\\u0030\\\\\\\\");
    }

    @Test
    public void test35208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35208");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                        a000u\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test35209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" 61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, " 61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test35210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U0023                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023                                                                                     hi!hi!hi!\\u0023                                   \\u0068\\u0023                                                                                     hi!hi!hi!\\u0023                                   " + "'", str1, "\\u0023                                                                                     hi!hi!hi!\\u0023                                   \\u0068\\u0023                                                                                     hi!hi!hi!\\u0023                                   ");
    }

    @Test
    public void test35211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35211");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (java.lang.CharSequence) "61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("61\\6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "                                                                                               555555555555555           ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str2, "61\\6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test35213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35213");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 ", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1616161616161616161161611616161616161616161");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35214");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                      u003                    ", '\\');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                 ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35216");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("3\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111", (-1));
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!ih!ih!ih                                                                                                                             300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u3200u                                                300u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih                                                                                                                             300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u3200u                                                300u" + "'", str1, "!ih!ih!ih                                                                                                                             300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u3200u                                                300u");
    }

    @Test
    public void test35218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35218");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", "5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55", 94);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", strArray4, strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161" + "'", str6, "3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test35219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35219");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###AU#################################################", (int) 'i', "111111111111111111111u61111111111111111111111123\\U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "111111111111111111111u61111111111111111111111123\\U1###AU#################################################" + "'", str3, "111111111111111111111u61111111111111111111111123\\U1###AU#################################################");
    }

    @Test
    public void test35220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35220");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("1\\U00234                                      \\U0023\\U00\\u00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                .\\16 ", 164);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111111111111111111111111111111111111111111111111111", 340, 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35222");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("5555555                     ...", "\\u0043");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35223");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 41, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35225");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                              5c");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test35226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35226");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                   ", "    61    ", (int) (short) 10);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\", "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A\\u0023AAAAAAAAAAAAA", strArray4, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '0', 20, 113);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A\\u0023AAAAAAAAAAAAA" + "'", str11, "A\\u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test35227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6");
    }

    @Test
    public void test35228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\U002066666666666666666666666666666666666666", "                                                \\i\\                       61\n                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\U002066666666666666666666666666666666666666" + "'", str2, "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\U002066666666666666666666666666666666666666");
    }

    @Test
    public void test35229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35229");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U0023\\U00\\u0041\\U", "          \\U000AAAAAAAAAAAAAA3200U\\A          ", 4);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("U0023\\U002375757575757575757575757575757575757575757575757575757575", 'i', '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U0023\\U002375757575757575757575757575757575757575757575757575757575" + "'", str3, "U0023\\U002375757575757575757575757575757575757575757575757575757575");
    }

    @Test
    public void test35231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("a                                                                                                 ", "       11111111111111..", "A...\\61\\61\\61\\61\\U0023     ...A");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35232");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "555555555555555...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35233");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray13 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                     ", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "41", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0041\\u00", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaa u   6aaaaaaaaaaaaa", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test35234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35234");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "                 \\u0030\\\\\\\\                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35235");
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa                                                ", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("\\u0031", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                           1\\U00234                                      \\U0023\\U00\\u0           ...", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAA32u\\A                                 ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test35236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u000a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U000A" + "'", str1, "\\U000A");
    }

    @Test
    public void test35237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35237");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("####au", "                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35238");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '.', 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test35239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35239");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005c", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (short) 10);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0075", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("                                      \\U0023\\U00\\u0041\\U00", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u005c" + "'", str7, "\\u005c");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test35240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35240");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1 == '\r');
    }

    @Test
    public void test35241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35241");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("1111111     ", strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.Class<?> wildcardClass13 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10hi!100" + "'", str6, "10hi!100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10hi!100" + "'", str11, "10hi!100");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test35242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35242");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\", 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35243");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HUUU02HUUU02HUUU02HAAAAAAAAAAAAA", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\61\\61\\61\\61\\u0023", 227);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35245");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                 A", "333336                                         \n\n                                         ", 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35246");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35247");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("u002322222                                                              ", "                                                                             23\\u0023\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("23\\u0023\\u0023\\u0023\\u0023\\u0023", 667, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35249");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA", ".....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35250");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                         \n\n1                 AAAA   61 AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         \n\n1                 AAAA   61 AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "                                         \n\n1                 AAAA   61 AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", 695);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\4aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("......77777777777777777777777777777777777777777777777777777777777777777777777", "hi!1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u0023                                 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......77777777777777777777777777777777777777777777777777777777777777777777777" + "'", str2, "......77777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test35255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35255");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0023\\U0023\\U0023\\U0023\\U0023\\U0044444444444444444444444444444444444444444444444444444444444...", "30\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "111111111111111 61..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35257");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u003            0023         ", "33333333333333333333333333333\\40032333333333333333333333333333333", 936);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("........", "\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35259");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray6);
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
    public void test35260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35260");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35261");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "U0023\\U0023\\U\\4003U0023\\U0023\\U0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\U0023\\U\\4003U0023\\U0023\\U0" + "'", str1, "u0023\\U0023\\U\\4003U0023\\U0023\\U0");
    }

    @Test
    public void test35262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35262");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u32057                                                                                                                             1", " 13");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35263");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1\\U0030uUu\\", 3, 508);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35264");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35265");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u", '7');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u" + "'", str4, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u" + "'", str6, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u");
    }

    @Test
    public void test35266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("22223200U\\1400u\\00U\\3200U", (int) (byte) 100, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "22223200U\\1400u\\00U\\3200U61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "22223200U\\1400u\\00U\\3200U61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35268");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str1, "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test35269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ", "111111111111111111111       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    " + "'", str2, "...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
    }

    @Test
    public void test35270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                      3200U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\1400u\\00U\\3200U\\" + "'", str1, "3200U\\1400u\\00U\\3200U\\");
    }

    @Test
    public void test35271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35271");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("61.####################################################################################################", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35272");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", "001!ih01", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35273");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...0023h\\huh0023h\\huh0023h...", " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...11111111111111", 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U0023                                   ", "222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U" + "'", str2, "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U");
    }

    @Test
    public void test35275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" 61..", "4444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35276");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "I!                                                                                   u003                          ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test35277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("3200u\\3200u\\3200u\\3200u\\3200u\\", 0, "1\\u00234                                      \\u0023\\u00\\U00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str3, "3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test35278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35278");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555", "                                       aaaaaaaaaaaaa\\\\\\");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "23\\U                                        ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555a......a555555" + "'", str7, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555a......a555555");
    }

    @Test
    public void test35279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555a......a555555");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\" + "'", str2, "61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
    }

    @Test
    public void test35280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0023         ", "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", 80);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023         " + "'", str3, "0023         ");
    }

    @Test
    public void test35281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35281");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", (int) 'i', '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\77777" + "'", str3, "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\77777");
    }

    @Test
    public void test35282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35283");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                ...", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuu", "0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000...", 135);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                ..." + "'", str4, "                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                ...");
    }

    @Test
    public void test35284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35284");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...", "...\r                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("a000u\\       UUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("666666666666666666666666666666666666666666666666666666666aaa", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "666666666666666666666666666666666666666666666666666666666aaa" + "'", str2, "666666666666666666666666666666666666666666666666666666666aaa");
    }

    @Test
    public void test35287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35287");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                          \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAA", "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444...023\\U0023\\U0023757");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35288");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", " 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("3333333333333333333333333361u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u333333333333333333333333333", 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3333333333333333333333333361u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u333333333333333333333333333" + "'", str2, "3333333333333333333333333361u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u333333333333333333333333333");
    }

    @Test
    public void test35290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35290");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35291");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\\\2\\\\\\\\\\2\\\\\\56156156156156156156156uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test35293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35293");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\n\n\n\n\n\n\n\n\n\n\\u0055                                            ", "", 54);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '5');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5555555555\\u00555555555555555555555555555555555555555555555 " + "'", str5, "5555555555\\u00555555555555555555555555555555555555555555555 ");
    }

    @Test
    public void test35294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35294");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'C', 'U');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'C' + "'", char2 == 'C');
    }

    @Test
    public void test35295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(".......................................1111111", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35296");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                                                                           61\n                       ", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test35297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35297");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...HH...", 566, "                           1\\U00234                                      \\U0023\\U00\\u0           ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                       ...HH..." + "'", str3, "                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                       ...HH...");
    }

    @Test
    public void test35299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...", '5');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test35300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35300");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\" + "'", str1, "H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\");
    }

    @Test
    public void test35301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######" + "'", str1, "######");
    }

    @Test
    public void test35302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" 66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6666666666666666666666666666663", "U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6666666666666666666666666666663" + "'", str2, " 66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6666666666666666666666666666663");
    }

    @Test
    public void test35303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35303");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35304");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test35305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       " + "'", str2, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test35306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35306");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("3300Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35307");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0026666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 91, 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35308");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhhh", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                     " + "'", str7, "                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhhh" + "'", str8, "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test35309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("222222U0023#U0023#U0023#U0023#U0023#U0023#U0023      222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "222222U0023#U0023#U0023#U0023#U0023#U0023#U0023      222222" + "'", str1, "222222U0023#U0023#U0023#U0023#U0023#U0023#U0023      222222");
    }

    @Test
    public void test35310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35310");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35311");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("    2222222222222222222222222222222222", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                     ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test35313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "1                                                 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1                                                 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 " + "'", str1, "1                                                 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 ");
    }

    @Test
    public void test35314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35314");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\                                                u                                                005                                                c", "\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35315");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1aaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      6\\16", (java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\U6      ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1aaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      6\\16" + "'", charSequence2, "16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1aaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      6\\16");
    }

    @Test
    public void test35316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35316");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '5', 192);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test35317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35317");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (int) '\\');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '5');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str4, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str6, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str9, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35318");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "75", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U005C", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     1\n\n                                                    1\n\n                                         ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUaaaaaaaaaaaaa\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U0032\\U0032\\U0032\\U0032\\U0032\\U0032", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test35319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35319");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   \n\\u002                                         \n\n1           ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35320");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\0033", (int) 'I');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35321");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\61\\61");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  UUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ UUU" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ UUU");
    }

    @Test
    public void test35324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35324");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                   \\U0033                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0033" + "'", str1, "\\U0033");
    }

    @Test
    public void test35325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" 61\\Aaaaaaaaaaaaa\\\\\\ ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... \\\\\\aaaaaaaaaaaaA\\16 " + "'", str1, "... \\\\\\aaaaaaaaaaaaA\\16 ");
    }

    @Test
    public void test35326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("777777777777777777777777777777777777777727777777777777777777777777777777777777777", 5, "61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "777777777777777777777777777777777777777727777777777777777777777777777777777777777" + "'", str3, "777777777777777777777777777777777777777727777777777777777777777777777777777777777");
    }

    @Test
    public void test35327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\\iui2\\4\n\n", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\iui2\\4\n\n                                                                                                  " + "'", str2, "\\iui2\\4\n\n                                                                                                  ");
    }

    @Test
    public void test35328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35328");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaa", "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35329");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35330");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0069", "...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h... ", "h61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\", 227);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0069" + "'", str4, "\\U0069");
    }

    @Test
    public void test35331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                        ...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "uu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35332");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 48, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str3, "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test35333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35333");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("3200U\\3200U\\\\i\\3200U\\3200U\\3", "1111111111111...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35334");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       UUUUUUU", "111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35335");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...............................................................................\\u0034", "1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35336");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                            3200                                                                                                                                                                                                                                                            ", (java.lang.CharSequence) "                            UUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 480 + "'", int2 == 480);
    }

    @Test
    public void test35337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35337");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                    ", "UUUUUUUUUUU6UUUUUUUUUUU                        ", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35338");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 356, 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 147);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU" + "'", str2, "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test35340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35340");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", "16U", 2);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny(".....", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                         uuuuuuuuuuuu                                  3200u", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6" + "'", str8, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
    }

    @Test
    public void test35341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35341");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", (int) 'C');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                            aaaaaaaaaaaaa3200\\a                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35343");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("61\\ 61\\ 6161\\ 61\\ 6161   61\\ 61\\ 6161\\ 61\\ 6161");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35344");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ......16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\" + "'", str1, "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ......16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\");
    }

    @Test
    public void test35345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                            1111111111111111111111111111111111111111110uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111110uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057" + "'", str1, "1111111111111111111111111111111111111111110uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
    }

    @Test
    public void test35346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("222222222222222222222222222222222222222222222222222222", 257);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                     222222222222222222222222222222222222222222222222222222                                                                                                      " + "'", str2, "                                                                                                     222222222222222222222222222222222222222222222222222222                                                                                                      ");
    }

    @Test
    public void test35348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  \\U005C  ", "        75                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\U005C  " + "'", str2, "  \\U005C  ");
    }

    @Test
    public void test35349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35349");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("1 61 6161 61 6161 61 6161 6", (int) '3', "...                          ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...         1 61 6161 61 6161 61 6161 6...         " + "'", str3, "...         1 61 6161 61 6161 61 6161 6...         ");
    }

    @Test
    public void test35350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                AAAA15AAAA                               ", "8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     \\U0023\\U0023\\U0023\\U0023\\U002     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35351");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35352");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!" + "'", str1, "HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!");
    }

    @Test
    public void test35353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6...", "11111111111u6111111111111111111111   2 11111111UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35354");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35355");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", 354, 136);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35356");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test35357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("IUI0020\\4\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IUI0020\\4" + "'", str1, "IUI0020\\4");
    }

    @Test
    public void test35358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("111111111111111111111u61111111111111111111111123\\U", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111u61111111111111111111111123\\U" + "'", str2, "111111111111111111111u61111111111111111111111123\\U");
    }

    @Test
    public void test35359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "2                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...                             AAAA15AAAA                                 AAAA15AAAA               ...", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                             AAAA15AAAA                                 AAAA15AAAA               ..." + "'", str2, "...                             AAAA15AAAA                                 AAAA15AAAA               ...");
    }

    @Test
    public void test35362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35362");
        char[] charArray11 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   U61    ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test35363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...                             ", "3333333333333333333333333333333333                                                                             6U623\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35364");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 55, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "555555uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu555555" + "'", str3, "555555uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu555555");
    }

    @Test
    public void test35365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35365");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (short) -1, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35366");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '\n', (int) (short) 10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("4", strArray7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test35367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35367");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "161\\ 61\\ 6161\\ 61\\ 6161\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35369");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("61\\ 61\\ 61");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test35370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35371");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61", 213, "                                                                             6u666");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61                                                                             6u666                                                                  " + "'", str3, " 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61                                                                             6u666                                                                  ");
    }

    @Test
    public void test35372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35372");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35373");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                  iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "aaaaaaaaaaaaaaaaaaaaaaaaaa3aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...061                                         \n\n1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0" + "'", str2, "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0");
    }

    @Test
    public void test35375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35375");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  \\     \\     \\     \\     \\     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35376");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35377");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ UUU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35378");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "       ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", " 61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("61", strArray9, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62 \\U0020\\U0020\\U0020\\U0020\\U0020\\U0", strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str7, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "61" + "'", str14, "61");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test35379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("23AAAAAAAAAAAAA0u0A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23AAAAAAAAAAAAA0u0A" + "'", str1, "23AAAAAAAAAAAAA0u0A");
    }

    @Test
    public void test35380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("i!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!" + "'", str2, "i!");
    }

    @Test
    public void test35381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ", "1\\ 61\\ 6 ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35382");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                      ", (java.lang.CharSequence) "1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                             23\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u" + "'", str1, "23\\u0023\\u");
    }

    @Test
    public void test35384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35384");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...                             ", "          ", "        75                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...        75                                                                                                                              " + "'", str3, "...        75                                                                                                                              ");
    }

    @Test
    public void test35385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35385");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaa                             ", "  2   ", 104);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U0023\\", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaa                             " + "'", str6, "aaaaaa                             ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test35386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U" + "'", str1, "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U");
    }

    @Test
    public void test35387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35387");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str1, "u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test35388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35388");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                    \\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaa                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAA                                                " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAA                                                ");
    }

    @Test
    public void test35390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35390");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666" + "'", str1, "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
    }

    @Test
    public void test35391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("23aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023", "61\\61\\61\\61\\6161\\61\\61\\61\\61\\61", "...uuuuuuuuuu...uuuuuuuuuu...uuuuuu                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                            \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      ...uuuuuuuuuu...uuuuuuuuuu...uuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023" + "'", str3, "23aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023");
    }

    @Test
    public void test35392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35392");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh", 'c');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35393");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("1111111     ", strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "    61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10hi!100" + "'", str6, "10hi!100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10hi!100" + "'", str14, "10hi!100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10hi!100" + "'", str15, "10hi!100");
    }

    @Test
    public void test35394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ", "000000000000000000000000000000...             000000000000000000041\\u00000000000000000000000000000000...             000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35395");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("61        61", 480);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    61        61" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    61        61");
    }

    @Test
    public void test35397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35397");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "16...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35398");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("U00234                                      \\U0023\\U00\\u0                    ..", "", 297, 127);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U00234                                      \\U0023\\U00\\u0                    .." + "'", str4, "U00234                                      \\U0023\\U00\\u0                    ..");
    }

    @Test
    public void test35399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!" + "'", str1, "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!");
    }

    @Test
    public void test35400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35400");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", "\n");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", strArray4, strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "11111");
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray17);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10hi!100" + "'", str6, "10hi!100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str15, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test35401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U" + "'", str2, "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
    }

    @Test
    public void test35402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("222222222222222222222222222222222222222222222u6       ...", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35403");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("U61", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "U" + "'", str6, "U");
    }

    @Test
    public void test35404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        " + "'", str1, "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ");
    }

    @Test
    public void test35405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35405");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", "  \\\\0020                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35406");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " \\u003 ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                        ...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                 ", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test35407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35407");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                  I", (java.lang.CharSequence) "...6\\66\\6\\66\\6\\66\\6\\6           \\u0\\u005                                                                                          \\u0\\u005");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test35408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35408");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "23\\u                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u                                        " + "'", str1, "23\\u                                        ");
    }

    @Test
    public void test35409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" 6...", (int) '6', 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC 6..." + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC 6...");
    }

    @Test
    public void test35410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", "uuuu6cuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\" + "'", str2, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
    }

    @Test
    public void test35411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35411");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("I0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................u\\uI0I0020\\4\n\n.............................................................................I0I0020\\4\n\n.....................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................u\\uI0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................." + "'", str1, "I0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................u\\uI0I0020\\4\n\n.............................................................................I0I0020\\4\n\n.....................................................");
    }

    @Test
    public void test35412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("111111116 \\16 \\16 \\16 \\16 \\16", 480, 86);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35413");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", "\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35414");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                           61\n                       ", "6\\ 6\\6uuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35415");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61", 61);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35416");
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23                                               ...", charArray16);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                 ...", charArray16);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 49 + "'", int27 == 49);
    }

    @Test
    public void test35417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("15 15 15 15 15 11111111", "                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      " + "'", str2, "                                                      ");
    }

    @Test
    public void test35418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "A 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6" + "'", str2, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
    }

    @Test
    public void test35419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35419");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "23\\u0023\\u...                                   ", 66);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35420");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '2');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061..." + "'", str3, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...");
    }

    @Test
    public void test35421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35421");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "111111111111111111111       ", (java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   c                                           \\u005");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test35422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...                                 ", 'c', '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                 " + "'", str3, "...                                 ");
    }

    @Test
    public void test35423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35423");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                      6u666", 460, 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2", "a                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2" + "'", str2, "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2");
    }

    @Test
    public void test35425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("###\n\\u002                                         \n\n1         1        61   ", "2uuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###\n\\u002                                         \n\n1         1        61   " + "'", str2, "###\n\\u002                                         \n\n1         1        61   ");
    }

    @Test
    public void test35426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35426");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n", "U535u5235u5235u5235u5235u523UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu52", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1", 532, "3AAAA51AAAA0023AAAA51AAAA0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\13AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA" + "'", str3, "3AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\13AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA");
    }

    @Test
    public void test35428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35428");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "#####aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa#####", (java.lang.CharSequence) "2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "#####aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa#####" + "'", charSequence2, "#####aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa#####");
    }

    @Test
    public void test35429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35430");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAAAAAAAAAAAA3200\\A", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ", "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...hUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 243);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...hUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...hUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test35433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35433");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\\\0020        ", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "U0023000000000000000000000000000000000000000000000", "23\\U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35435");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("001!ih01", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii 6\\\\u0020iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '0');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("\\UUU02\\... 3hi!hi!hi!                                                                          ", "0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", 41);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "555555555555555555555555555555555555555555555555555555555555555555555555          aaaaaaa       CCCCCCCCCCCCCCCC55555555555555555555555555555555555555555555555555555555555555555555555");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1!h1" + "'", str4, "1!h1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1!0h01" + "'", str6, "1!0h01");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test35436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                ...hhhhhhhhh", 685, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                ...hhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                ...hhhhhhhhh");
    }

    @Test
    public void test35437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35438");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "                                                                         23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35439");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("uuu0023                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuu0023" + "'", str1, "uuu0023");
    }

    @Test
    public void test35440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35440");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35441");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("U0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", "23hi!hi!hi!                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35442");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35443");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 104);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                      \\U0023\\U00\\u0041\\U0023", strArray4, strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray15);
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", strArray15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, 'C');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                      \\U0023\\U00\\u0041\\U0023" + "'", str14, "                                      \\U0023\\U00\\u0041\\U0023");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 77 + "'", int17 == 77);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "23C0023C0023C0023C0023C0023C0023C0023C0023C0023" + "'", str19, "23C0023C0023C0023C0023C0023C0023C0023C0023C0023");
    }

    @Test
    public void test35444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111110ua3000ua3111111111111111111111111111111111111111111111", "1hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000", 155);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35445");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("2", "", 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2" + "'", str9, "2");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016" + "'", str13, "016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016");
    }

    @Test
    public void test35446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35446");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "uuuuuuuuuuuu 3200u           ", "...3\\u0023\\u00231\\40032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test35447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35447");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0030\\\\\\\\", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6", 358);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35448");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                  61", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) '2');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "                                                                                                        aaaaaaa     ", (int) ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("1111111", strArray5, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  ......  77777777777777777777777777777777777777777777777777777777777777777777777", "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("        75                                                                                                           ", strArray9, strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'C');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111" + "'", str10, "1111111");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "        75                                                                                                           " + "'", str14, "        75                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str16, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test35449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35449");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("40032", "00u\\3200u\\3200u\\3200u\\3200u\\3200", 202);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\r\r\r\r\r\r", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii 6\\\\u0020iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35451");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", "44444444444444444444423\\u0023\\u444444444444444444444", "  575\\u0037200U", 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00" + "'", str4, "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
    }

    @Test
    public void test35452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35452");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "2                                         \n\n1", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "222223200U\\  ", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...hhhhhhhhhhhhhhhhhhhhhU61hhhhhhhhhhhhhhhhhhhhhhh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test35453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35453");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAA     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35454");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 178);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 178 + "'", int2 == 178);
    }

    @Test
    public void test35455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("00u\\1400", "   U61   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00u\\1400" + "'", str2, "00u\\1400");
    }

    @Test
    public void test35457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35457");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '1', 'U');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
    }

    @Test
    public void test35458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35458");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", "55555555555555555555555555555555555555555555555555555555555555555555555555555522222\\U0023\\U00\\u0041\\U002322222");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35459");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "    ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test35460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700", "001!ih01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700" + "'", str2, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700");
    }

    @Test
    public void test35461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("UUUUU61UUUUUUUUUUUUUUUU44444444444444444444453\\U0053\\U444444444444444444444                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuu61uuuuuuuuuuuuuuuu44444444444444444444453\\u0053\\u444444444444444444444                                                                                                                                                        " + "'", str1, "uuuuu61uuuuuuuuuuuuuuuu44444444444444444444453\\u0053\\u444444444444444444444                                                                                                                                                        ");
    }

    @Test
    public void test35462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35462");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111", "                        a", 349, 135);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111                        a" + "'", str4, "1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111                        a");
    }

    @Test
    public void test35463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35463");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", "................U0023                                            ................", 119, 113);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666................U0023                                            ................" + "'", str4, "66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666................U0023                                            ................");
    }

    @Test
    public void test35464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35464");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111    61        61 ...11111111111111111111111111111111111111111161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111    61        61 ...111111111111111111111111111111111111111111", "    16        16        16        16        16        16        16        16        16        16        16        16        16    ", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", "     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    " + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
    }

    @Test
    public void test35466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35466");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...", 32, 95);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\\\\\\\\\\\\\\\\\\\...HH..." + "'", str3, "\\\\\\\\\\\\\\\\\\\\...HH...");
    }

    @Test
    public void test35467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa" + "'", str1, "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa");
    }

    @Test
    public void test35468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "            23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023            " + "'", str1, "            23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023            ");
    }

    @Test
    public void test35469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35469");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAA HHHHHHHHHHHHHHHHH", 50);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("U00234                                      \\U0023\\U00\\u0                    ..", "111111111111111111111111111111111111\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...11111111111111111111111111111111111111111U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00234                                      \\U0023\\U00\\u0                    " + "'", str2, "00234                                      \\U0023\\U00\\u0                    ");
    }

    @Test
    public void test35471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                           \\6005c", 205, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c" + "'", str3, "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c");
    }

    @Test
    public void test35472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\U0023\\U00\\u0041\\U0023                         ", 116, "\\U0075");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0075\\U0075\\U0075\\U0075\\U0075\\U00\\U0023\\U00\\u0041\\U0023                         \\U0075\\U0075\\U0075\\U0075\\U0075\\U007" + "'", str3, "\\U0075\\U0075\\U0075\\U0075\\U0075\\U00\\U0023\\U00\\u0041\\U0023                         \\U0075\\U0075\\U0075\\U0075\\U0075\\U007");
    }

    @Test
    public void test35473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777", "\n\n\n\n\n1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777" + "'", str2, "7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test35474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35474");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("iiiiiiiiiii 6\\\\u0020iiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiii 6\\\\u0020iiiiiiiiiiii" + "'", str1, "iiiiiiiiiii 6\\\\u0020iiiiiiiiiiii");
    }

    @Test
    public void test35475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("61\\61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61" + "'", str1, "61\\61\\61");
    }

    @Test
    public void test35476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35476");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u0023                                            ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   u61    ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###\n\\u002                                         \n\n1           ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("0023\\u0023\\u0023\\u0023\\u0023\\u00", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test35477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35477");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111", "0\\u0020\\u00");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("20\\u0020\\u0020\\u0020\\u00   ", "                                                                             6u666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20\\u0020\\u0020\\u0020\\u00   " + "'", str2, "20\\u0020\\u0020\\u0020\\u00   ");
    }

    @Test
    public void test35479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("43\\0043\\0043\\0043\\0043\\0043\\0043\\0043U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "43\\0043\\0043\\0043\\0043\\0043\\0043\\0043U" + "'", str1, "43\\0043\\0043\\0043\\0043\\0043\\0043\\0043U");
    }

    @Test
    public void test35480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35480");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\4\n\n\n", "\\U0023                                                                                     HI!HI!HI!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...    ...", "             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ", 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u0020666666666U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  iii", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u0020666666666U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  iii" + "'", str10, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u0020666666666U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  iii");
    }

    @Test
    public void test35481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35481");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 71, (int) '6');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\", 349, '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" + "'", str3, "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
    }

    @Test
    public void test35483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35483");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                                                                                  61", "\\u005c", 4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0023", strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", "23hi!hi!hi!                                                                          ", 161);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      iiiii", strArray6, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("33333333        753333333333333333333333333", strArray11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      iiiii" + "'", str12, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      iiiii");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test35484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                 ");
    }

    @Test
    public void test35485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35485");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057", 29, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35486");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("               3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test35487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("IUI0020\\4\n\n.............................................................................", "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("23AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "023AAAA51AAAA0023AAAA51AAAA0023" + "'", str2, "023AAAA51AAAA0023AAAA51AAAA0023");
    }

    @Test
    public void test35489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35489");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("................U0023       ", 370, 173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                                     HI!HI!HI!aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("u\\3200u\\32", "U0023\\U0023\\U\\4003U0023\\U0023\\U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u\\3200u\\32" + "'", str2, "u\\3200u\\32");
    }

    @Test
    public void test35492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\n\n1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1                                                    \n\n1                                  61\\" + "'", str1, "1                                                    \n\n1                                  61\\");
    }

    @Test
    public void test35493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35493");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "A                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35494");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(" 1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\U 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\u 1" + "'", str1, " 1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\u 1");
    }

    @Test
    public void test35495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0                                                                                                                                                   ", "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0                                                                                                                                                   " + "'", str2, "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0                                                                                                                                                   ");
    }

    @Test
    public void test35496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAA      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", (int) '#', "  575\\u0037200U\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAA      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
    }

    @Test
    public void test35497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35497");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("3\\U00237575757575757575757575757575757575757575757", "0U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 95, 241);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3\\U002375757575757575757575757575757575757575757570U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str4, "3\\U002375757575757575757575757575757575757575757570U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test35498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35499");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                   0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", "...U0023\\U\\4003U0023\\U0023\\U0##########U0023U0023\\U00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\");
    }
}

