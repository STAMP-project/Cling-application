import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest82 {

    public static boolean debug = false;

    @Test
    public void test41001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41001");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                        61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa                                                        ", "                                                                              2  ", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                            AAAAAAAAAAAAA3100\\A                             6\\6\\66\\6\\66\\6\\66\\6...", "u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("1h!1", "001\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001\\u00" + "'", str2, "001\\u00");
    }

    @Test
    public void test41004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41004");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\61\\61\\61\\61\\61\\61", "U   6", 203);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("61", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61" + "'", str2, "61");
    }

    @Test
    public void test41006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("7777777777777777777777777770023\\u0...777777777777777777777777777", "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7777777777777777777777777770023\\u0...777777777777777777777777777" + "'", str2, "7777777777777777777777777770023\\u0...777777777777777777777777777");
    }

    @Test
    public void test41007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", "                          \\u0061\\u0061\\u\\U002a\\u0061\\u0061\\u0 AAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test41008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41008");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                     ......  77777777777777777777777777777777777777777777777777777777777777777777777", "UUUUUUUUUUUUUUUU...     32", 729);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                  ..", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  ..                  .." + "'", str2, "                  ..                  ..");
    }

    @Test
    public void test41010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("U###0u\\...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U###0u\\..." + "'", str2, "U###0u\\...");
    }

    @Test
    public void test41011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41011");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("2\\u0032\\u0032\\u0032", 135, "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n......\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n2\\u0032\\u0032\\u0032" + "'", str3, "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n......\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n2\\u0032\\u0032\\u0032");
    }

    @Test
    public void test41012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "U0023\\u0... U                                                                                              ", (java.lang.CharSequence) "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41013");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U61\\A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U", "23                                                                                                                                                  hi!hi!hi!", 297);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r", "                              ...\r                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41015");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", (int) (short) -1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("U6623\\U6623\\U6623\\U6623\\U6623\\U6623U666", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test41016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                   ", "  ......  \\u00410023\\U0023\\U0023\\U002                                               \\UUU                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055" + "'", str2, "aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055");
    }

    @Test
    public void test41017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41017");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Aaaaaaaaaaaaa\\\\", "222222222222222222222222222222222222222222U6                                          ", (int) (byte) 10, 88);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aaaaaaaaaa222222222222222222222222222222222222222222U6                                          " + "'", str4, "Aaaaaaaaaa222222222222222222222222222222222222222222U6                                          ");
    }

    @Test
    public void test41018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41018");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("533333333333333333333333333333\\40032333333333333333333333333333333C", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41019");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 110 + "'", int1 == 110);
    }

    @Test
    public void test41020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("           ...000000000000000000000000000000000000000000000000000000000000...", " \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004 6\\\\uu  \\u004\\u004\\u00u6\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ...000000000000000000000000000000000000000000000000000000000000..." + "'", str2, "           ...000000000000000000000000000000000000000000000000000000000000...");
    }

    @Test
    public void test41021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316131613161316", 60, (int) '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16 ", "222222222222222222222222222222222\\UUU02\\...222222222222222222222222222222222", 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16 " + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16 ");
    }

    @Test
    public void test41023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41023");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "23                                                                                     hi!hi!hi!", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "11111", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("###\n\\u002                                      ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test41024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41024");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                        2", 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test41025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("111111111111111111111111111111111111111111", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111111111111111111111111" + "'", str2, "111111111111111111111111111111111111111111");
    }

    @Test
    public void test41026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41026");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "        77777777777777777777700000000000000000000777777777777777777777\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ " + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
    }

    @Test
    public void test41028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41028");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                        0U\\                                                         ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test41029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", 54, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66" + "'", str3, "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
    }

    @Test
    public void test41030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41030");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 a\\U0023aaaaaaaaaaaaa", "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41031");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '2', 255);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test41032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "22222222222222222222uuu0023                                            222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0200U\\\\16", "        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        75");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0200U\\\\16" + "'", str2, "0200U\\\\16");
    }

    @Test
    public void test41034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41034");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\U0023\\U0##########.61uuuuuuuuuuuuuuuuuu3\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0##########.61uuuuuuuuuuuuuuuuuu3\\u0" + "'", str1, "\\U0023\\U0##########.61uuuuuuuuuuuuuuuuuu3\\u0");
    }

    @Test
    public void test41035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41035");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "UUUUUUUUUUUUUUUU...     32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\U0075", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ \\u0063 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ \\u0063 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ \\u0063 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ \\u0063 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ \\u0063 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0u  75" + "'", str3, "0u  75");
    }

    @Test
    public void test41038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41039");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  \\u0023\\u0023\\u0023\\u0023\\u0023\\16 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\16" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\16");
    }

    @Test
    public void test41040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41040");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                                       ", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###", '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\000u\\000u\\000u\\000u\\000u\\\n###" + "'", str2, "aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\000u\\000u\\000u\\000u\\000u\\\n###");
    }

    @Test
    public void test41042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41042");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...", '6');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'A' + "'", char2 == 'A');
    }

    @Test
    public void test41043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41043");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '2');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...                          ...");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "aaaaaaaaaaaaa\\\\\\", 0);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\4003");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("U0023                                            ", strArray2, strArray11);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str4, "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str6, "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str14, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "U0023                                            " + "'", str15, "U0023                                            ");
    }

    @Test
    public void test41044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41044");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("11111                             ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41046");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaa                                                ", "1\\U00234                                      \\U0023\\U00\\u0                    ..", "HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002HI23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa222222222222222222222222222222222222222222222222" + "'", str3, "aaaa222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test41047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41047");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41048");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("      61\\ 61\\ ", "                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41050");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41051");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "                                          \\0033                                         \\                                        \\0033                                         U                                        \\0033                                         005                                        \\0033                                         C                                        \\0033                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U002322222                                                              ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test41053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41053");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 54, "AAAA...AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAA                             HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA. 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str3, "AAAA. 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test41054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41054");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("222222222222222222222222222222222222222222222u6                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41055");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\r\r\r\r\r\r\r...                                      57");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41056");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("U0023\\u0... UU000u", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu", 300);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu" + "'", str2, "57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu");
    }

    @Test
    public void test41058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("AAAAAAAAAAAAA32u\\A                                 ", "1\\u00234                                      \\u0023\\u00\\U00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41059");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                            AAAAAAAAAAAAA3200u\\A  ...", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", 929);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41060");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("111111111111111111111U", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "                   uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test41062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\U0023\\U00\\U0041\\U", "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41063");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("11111111111111111111111111111111111", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41064");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                   00414444444444444444444444444444444444444444444444444444444444444", "\\u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test41065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41065");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", 21, (int) '\\');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057" + "'", str4, "                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
    }

    @Test
    public void test41066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                       ", "                                            3200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                       " + "'", str2, "                                                                                                       ");
    }

    @Test
    public void test41067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41067");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           \\u005c");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("...aaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("......  77777777777777777777777777777777777777777777777777777777777777777777777", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test41068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41068");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "aaaaaaaaa 61aaaaaaaaaaaaa5555555                                             ...aaaaaaaaa 61aaaaaaaaaaaaa");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1\\6 ", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\\6 " + "'", str7, "1\\6 ");
    }

    @Test
    public void test41069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41069");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023                                                                                     hi!hi!hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "11111", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test41070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("UUUUUUUUUUUUUUUUUUUUUUUUU...", "                            5a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUU..." + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUU...");
    }

    @Test
    public void test41071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41071");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("A000u\\000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test41072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41072");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                   20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 'D');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41073");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", '1');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("               3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test41075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test41076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41076");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         ...0023h\\huh0023h\\huh0023h                            ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("......  77777777777777777777777777777777777777777777777777777777777777777777777", "                                                                    U61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41078");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41079");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0075\\U0075\\U0075\\U0075\\U0075\\U00\\U0023\\U00\\u0041\\U0023                         \\U0075\\U0075\\U0075\\U0075\\U0075\\U007", "3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333", "!ih!ih!i", 155);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0075\\U0075\\U0075\\U0075\\U0075\\U00\\U0023\\U00\\u0041\\U0023                         \\U0075\\U0075\\U0075\\U0075\\U0075\\U007" + "'", str4, "\\U0075\\U0075\\U0075\\U0075\\U0075\\U00\\U0023\\U00\\u0041\\U0023                         \\U0075\\U0075\\U0075\\U0075\\U0075\\U007");
    }

    @Test
    public void test41080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("UUUUUUUUUUUUUUU0023UUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUU0023UUUUUUUUUUUUUUU" + "'", str1, "UUUUUUUUUUUUUUU0023UUUUUUUUUUUUUUU");
    }

    @Test
    public void test41081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41081");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n\n\n\n\n\n\n\n\n\n\n\n                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41082");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005c\\u00", "U61", (int) 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "       ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", strArray4, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "...UUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str10, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str11, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u005c\\u00" + "'", str13, "\\u005c\\u00");
    }

    @Test
    public void test41083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41083");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '6', 306);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test41084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41084");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41085");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                 ", "####AU   2");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41086");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                             aaa", "\\                                                u                                                005                                                c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                         ", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41088");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "2\\3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\320032", "uuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41089");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("IIIIIIIIIIIII...AAAA      ", '2');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41090");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u0023                                            ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   u61    ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                        aaaaaaa", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 61.", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test41091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41091");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                 \\u0036                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41092");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "UUUUUU 6\\\\U0020 6\\\\U0020 6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41093");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test41094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41094");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...", 'U');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '.' + "'", char2 == '.');
    }

    @Test
    public void test41095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("55          aaaaaaa       CCCCCCCCCCCCCCCC", "uuuuuuuuuuuu 3200", "h                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55          aaaaaaa       CCCCCCCCCCCCCCCC" + "'", str3, "55          aaaaaaa       CCCCCCCCCCCCCCCC");
    }

    @Test
    public void test41096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41096");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "                     ......  77777777777777777777777777777777777777777777777777777777777777777777777", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41097");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1", "HCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU  ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41098");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r", "aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                             u003u0023u0023u0023u0023u0023u0023", "1113");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             u003u0023u0023u0023u0023u0023u0023" + "'", str2, "                                                             u003u0023u0023u0023u0023u0023u0023");
    }

    @Test
    public void test41100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("222222222222222222222222222222222\\UUU02\\...222222222222222222222222222222222", 288, "hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhhhhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhh222222222222222222222222222222222\\UUU02\\...222222222222222222222222222222222hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhhhhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhh" + "'", str3, "hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhhhhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhh222222222222222222222222222222222\\UUU02\\...222222222222222222222222222222222hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhhhhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhh");
    }

    @Test
    public void test41101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\U000A", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U000A" + "'", str2, "\\U000A");
    }

    @Test
    public void test41102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("2\\u005c                                               ...", "                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41103");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\u0023\\u0023        75023\\u0023\\u002", "u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u", 27, 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0023\\u002u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0023\\u002" + "'", str4, "\\u0023\\u002u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0023\\u002");
    }

    @Test
    public void test41104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41104");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                            3200u", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41105");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("c5", '6');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                        ...", "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        ..." + "'", str2, "                                        ...");
    }

    @Test
    public void test41107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41107");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!ih!ih!ih                                                                                                                             300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u3200u                                                300u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41108");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "3200u\\3200u\\3200u\\3200u\\3200u\\\\u0032\\u0032\\u0032\\u0032\\u003", (java.lang.CharSequence) "U                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41109");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                             11111                              ", "\\ 61\\61", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41110");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("3", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test41111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41111");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                            ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("u                                  ", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test41112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41112");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                                3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41113");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hhhhhhhhhhhhh", "                                           ", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41114");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (int) '\\');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                     ", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str7, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test41115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41115");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004 6\\\\uu  \\u004\\u004\\u00u6\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", " 61\\ 61\\ 61...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0... 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41116");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("U61", "3200u\\3200", 167);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41117");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 929);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 929 + "'", int2 == 929);
    }

    @Test
    public void test41118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41118");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41119");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("23hh23hh23hh23hh23hh23hh23hh23hh23", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  \r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("6u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6u" + "'", str1, "6u");
    }

    @Test
    public void test41121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41121");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\U23\\U23\\U23\\U23\\U23\\U23\\U23");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U23\\U23\\U23\\U23\\U23\\U23\\U23" + "'", str1, "\\U23\\U23\\U23\\U23\\U23\\U23\\U23");
    }

    @Test
    public void test41122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41122");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U0023#U0023#U0023#U0023#U0023#U0023#U0023      ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023#U0023#U0023#U0023#U0023#U0023#U0023" + "'", str2, "U0023#U0023#U0023#U0023#U0023#U0023#U0023");
    }

    @Test
    public void test41123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41123");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 543 + "'", int1 == 543);
    }

    @Test
    public void test41124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100" + "'", str1, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100");
    }

    @Test
    public void test41125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41125");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("..");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "aaaaaaauuuuuuuuu 023\\u0023", 79, 356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 79");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41126");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     " + "'", str1, "                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
    }

    @Test
    public void test41128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41128");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333", "\\UUU02\\... 3hi!hi!hi!                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test41129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41129");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ", "AAAAAAAAAAAAAAAAAAAAAA...                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str3, "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test41130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41130");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u", "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test41131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41131");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhhhhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhh222222222222222222222222222222222\\UUU02\\...222222222222222222222222222222222hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhhhhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\i\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\i\\" + "'", str1, "\\i\\");
    }

    @Test
    public void test41133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41133");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("###\n###    61        61        615c    61        61        61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###\n###    61        61        615c    61        61        61" + "'", str1, "###\n###    61        61        615c    61        61        61");
    }

    @Test
    public void test41134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41134");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAu", "55          aaaaaaa       ", 460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41135");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(" 61\\\\u", 32, 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\\\", 80, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\\\\hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\\\\hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test41138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41138");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA", 25, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA" + "'", str3, "\\2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA");
    }

    @Test
    public void test41139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\4  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\4  " + "'", str1, "\\4  ");
    }

    @Test
    public void test41140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41140");
        char[] charArray23 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray23);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray23);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray23);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray23);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray23);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray23);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray23);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray23);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", charArray23);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ", charArray23);
        boolean boolean34 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", charArray23);
        int int35 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray23);
        boolean boolean36 = org.apache.commons.lang3.StringUtils.containsAny("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", charArray23);
        boolean boolean37 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray23);
        int int38 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...", charArray23);
        int int39 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "        \\u0034         ", charArray23);
        boolean boolean40 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "u                                                ", charArray23);
        boolean boolean41 = org.apache.commons.lang3.StringUtils.containsAny("...u0020u0020u0020u0020u0020u0020u0020u0020u0020...", charArray23);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test41141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41141");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...3\\u23\\u23U6\\UUU02\\UUU02\\UUU02\\aaaaaaaaaa...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaa", 563, 12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...3\\u23\\u23aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "...3\\u23\\u23aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41142");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "3333333333333333333333333333333aaaaaaaaa 61aaaaaaaaaaaaa5555555                                             ...aaaaaaaaa 61aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("575\\u0037200U", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              555555555555555555555555555555555555555555555555555555  ......  61555555");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "575\\u0037200U" + "'", str2, "575\\u0037200U");
    }

    @Test
    public void test41144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41144");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0Ucaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41145");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("  \\005c  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\005c" + "'", str1, "\\005c");
    }

    @Test
    public void test41146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                ...hhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41147");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626", (java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41148");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41149");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41150");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void test41151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41151");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "\\iui0020", 520);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41152");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "16161616161616161616161616");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ", 562, 173);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41154");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111", "I");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '6', 102, 57);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test41155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41155");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 6", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 6      " + "'", str2, "      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 6      ");
    }

    @Test
    public void test41157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaa                       \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rhhhh", 168);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         aaaaaa                       \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rhhhh          " + "'", str2, "         aaaaaa                       \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rhhhh          ");
    }

    @Test
    public void test41158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", 497);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str2, "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test41159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41159");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016", '0', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r16" + "'", str3, "161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r16");
    }

    @Test
    public void test41160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41160");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("77777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U", 94);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1", (int) '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1" + "'", str2, "1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1");
    }

    @Test
    public void test41162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", 87, "                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str3, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test41163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41163");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\", '\n');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41164");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...3u6              aaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41165");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                 A\\u0023AAAAAAAAAAAAA                                  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\..." + "'", str2, "                                                                                  23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...");
    }

    @Test
    public void test41167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41167");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("2", "1 1222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222", 157);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                           U                 61        61        61        ...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020...                                                                                           U                 61        61        61        6", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 339 + "'", int4 == 339);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test41169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...                                                                                                   ...", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii61\\ 61\\ 61", "10hi!100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                                   ..." + "'", str3, "...                                                                                                   ...");
    }

    @Test
    public void test41170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0023\\U0023\\U0023\\ u020\\U0020\\U0020\\U00", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                            AAAAAAAAAAAAA3200\\A                                 AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAA3200\\A                                 AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAA3200\\A                                 AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test41172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41172");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41173");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...00U\\3200U3200U##########0U\\3200U\\3200U3004\\U\\3200U...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41174");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAAA15AAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41175");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                AAAA15AAAA                 ", "1\\u1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......", "                              #                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......" + "'", str2, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......");
    }

    @Test
    public void test41177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...    ..." + "'", str1, "...    ...");
    }

    @Test
    public void test41178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa061", 60, 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41179");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaa                             ", "  2   ", 104);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaa                             " + "'", str4, "aaaaaa                             ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test41180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41180");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000uuuuuuuuuuuuuuuuuuuuuuuuu...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41181");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\\U0023AAAAAAAAAAAAA", (java.lang.CharSequence) "7777777777777777");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\U0023AAAAAAAAAAAAA" + "'", charSequence2, "\\U0023AAAAAAAAAAAAA");
    }

    @Test
    public void test41182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                       ", "000000000000000000000000000003200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A800000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                       " + "'", str2, "                                                       ");
    }

    @Test
    public void test41183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1", "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41184");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("23     ...", "#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\n\n1                                                                                         ", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n1                                                                                         " + "'", str2, "\n\n1                                                                                         ");
    }

    @Test
    public void test41186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("2............111111111111111111111111111111111111111111111..............................................................................................................................................................", "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             ", 280);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2............111111111111111111111111111111111111111111111.............................................................................................................................................................." + "'", str3, "2............111111111111111111111111111111111111111111111..............................................................................................................................................................");
    }

    @Test
    public void test41187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("uuuuuuuuuuuuuuuuu3\\u0...\\U00", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuu3\\u0...\\U00" + "'", str2, "uuuuuuuuuuuuuuuuu3\\u0...\\U00");
    }

    @Test
    public void test41188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41188");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", " 61\\\\u0020", "\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U0", 19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\" + "'", str4, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
    }

    @Test
    public void test41189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\000u\\000u\\000u\\000u\\000u\\\n###", 56);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 164);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test41191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41191");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, 'u');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41192");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("2.................................................................................................", "5c11111111111111111111111111 61\\ 111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41193");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", "", "3AAAA51AAAA0023AAAA51AAAA0023", 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r" + "'", str4, "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test41194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41194");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("2\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222", " 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 682);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41195");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\16");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaau6aaaaaaaaaaaaa", "A\\u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A\\u0023AAAAAAAAAAAAA" + "'", str2, "A\\u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test41197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "U   6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41198");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "uuuuuuuuuuuu                                  3200u", (java.lang.CharSequence) "\\3u30053c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test41199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41199");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test41200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("61\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                                         \\U0                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41201");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                   \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaa", 'u', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41203");
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "H                                                                ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test41204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "U0023                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ " + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
    }

    @Test
    public void test41205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41205");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 23", "11111111111111..", 20);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test41206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("61\\ 61\\61", 155);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\61                                                                                                                                                  " + "'", str2, "61\\ 61\\61                                                                                                                                                  ");
    }

    @Test
    public void test41207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                            3200u                            aaaaaaaaaaaaa3200\\a                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                            3200u                            aaaaaaaaaaaaa3200\\a                                 " + "'", str1, "                                            3200u                            aaaaaaaaaaaaa3200\\a                                 ");
    }

    @Test
    public void test41208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41208");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                            000000000000000000000000000000...             ", "aaaa                            ", "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u0020");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA", "00U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n16U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41210");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                            3200u                            aaaaaaaaaaaaa3200\\a                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0" + "'", str1, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0");
    }

    @Test
    public void test41212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41212");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("3AAAA51AAAA0023AAAA51AAAA0023", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 66);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(".3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.", "...AAAA      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00." + "'", str2, ".3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.");
    }

    @Test
    public void test41214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...0u\\314...0u\\311", "                                                                                                 A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0u\\314...0u\\311" + "'", str2, "...0u\\314...0u\\311");
    }

    @Test
    public void test41215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41215");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...\\61\\61\\61\\61\\U0023     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...\\61\\61\\61\\61\\U0023     ..." + "'", str1, "...\\61\\61\\61\\61\\U0023     ...");
    }

    @Test
    public void test41217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", "", 167);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
    }

    @Test
    public void test41218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0032                                                                       ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0032                                                                       " + "'", str2, "\\u0032                                                                       ");
    }

    @Test
    public void test41219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41220");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("75", ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1", strArray4, strArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("U0023\\U0023\\U\\4003U0023\\U0023\\U0", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "75" + "'", str9, "75");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test41221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41221");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(" 61\\ 61\\ ...", "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...", (int) 'C');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        " + "'", str2, "                          \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        ");
    }

    @Test
    public void test41223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41223");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\u0063");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0063" + "'", str1, "\\u0063");
    }

    @Test
    public void test41224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41224");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("      \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                         \\U0023\\U00\\u0041\\U                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41225");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("               hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test41226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau00", "22222222222261\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "23C0023C0023C0023C0023C0023C0023C0023C0023C0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41228");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("......A000u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......A000u\\" + "'", str1, "......A000u\\");
    }

    @Test
    public void test41229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41229");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 36, 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777" + "'", str1, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777");
    }

    @Test
    public void test41231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41231");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType(".....");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAA", strArray5, strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("5555555555555555aa        75", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AAAAAAA" + "'", str8, "AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test41232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hhhhhhhhhhhhhhhhhh   U61    ", "aAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh" + "'", str2, "aAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh");
    }

    @Test
    public void test41233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("5C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5C" + "'", str1, "5C");
    }

    @Test
    public void test41234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41234");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "u0020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0020" + "'", str2, "u0020");
    }

    @Test
    public void test41236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41236");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                    \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("IIIIIIIIIIIII...AAAA      ", "5555555                     ...                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIII...AAAA      " + "'", str2, "IIIIIIIIIIIII...AAAA      ");
    }

    @Test
    public void test41238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                               I!                                                                                                                                                                                                                  ", (int) '3');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                               I!                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                               I!                                                                                                                                                                                                                  ");
    }

    @Test
    public void test41239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("7777777777777777777                             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41240");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("0023", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                                      \\u0023\\u00\\u0041\\u0023", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test41241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41241");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u                                                 ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'U');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str5, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test41242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ", "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       " + "'", str2, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test41243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41243");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n3\\U                      ", 339, 192);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41244");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U002", "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\", "aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41246");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\                                        ", (java.lang.CharSequence) "                                ##0U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n###                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test41248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41248");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("55561\n5555", 75, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41249");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004", "                                23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41250");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", "22223200U\\1400u\\00U\\3200U", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41251");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test41252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41252");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 929);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41253");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###\nu002", "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41254");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\u00\\u00\\u00\\u00\\u00\\u00\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6" + "'", str2, "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
    }

    @Test
    public void test41256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41256");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaa                            UUUUUUUUUUUUUUUUUU", "                                                        ..       ", "\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 96);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaa                            UUUUUUUUUUUUUUUUUU" + "'", str4, "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaa                            UUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test41257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41257");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                   3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "1!0h01", "u061u061061u0061u061u061u061u061");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\" + "'", str3, "                                                   3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\3266u\\");
    }

    @Test
    public void test41258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41258");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" 61\\\\u0020                                                      ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61\\\\u0020" + "'", str4, "61\\\\u0020");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test41259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41259");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u1111111111111111111111111111111111111...", "                                                                                             U23", "\\u0023\\u0023\\u0023\\u0023\\u0023\\16");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41260");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "U0032\\U0032\\U0032\\U0032\\U0032\\U0032");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0032\\U0032\\U0032\\U0032\\U0032\\U0032" + "'", str1, "u0032\\U0032\\U0032\\U0032\\U0032\\U0032");
    }

    @Test
    public void test41261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41261");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61\n", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("uuuuuuu...", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "61\n" + "'", str6, "61\n");
    }

    @Test
    public void test41262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...00160000000016000000001600000000160000000016000000001600000000160000000016000000001", "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n......\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n2\\u0032\\u0032\\u0032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...00160000000016000000001600000000160000000016000000001600000000160000000016000000001" + "'", str2, "...00160000000016000000001600000000160000000016000000001600000000160000000016000000001");
    }

    @Test
    public void test41263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41263");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "  575\\u0037200U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test41265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("3333333333333333333333333333333333                                                                             6u623\\", "u1111111111111111111111111111111111111111111116");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3333333333333333333333333333333333                                                                             6u623\\" + "'", str2, "3333333333333333333333333333333333                                                                             6u623\\");
    }

    @Test
    public void test41266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "", "IUI0020\\4\n\n.............................................................................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str3, "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test41267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       231111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41268");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5", "\\iui2\\4\n\n                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41269");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0023\\u00\\U0041\\", 861);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41270");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###\n\\u002                                         \n\n1", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\4\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002" + "'", str2, "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002");
    }

    @Test
    public void test41274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " 11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41275");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("..                                                                                                                 ", 19, 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..                                                                                                                 " + "'", str3, "..                                                                                                                 ");
    }

    @Test
    public void test41276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "U6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test41277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" ##", (int) 'I', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ########################################################################" + "'", str3, " ########################################################################");
    }

    @Test
    public void test41278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41278");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test41279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41279");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("U0023#U0023#U0023#U0023#U0023#U0023#U0023      ", "                            aaaaaaaaaaaaa3200\\a                                 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41281");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                        aaaaaaa", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41282");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\" + "'", str2, "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test41283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00", "                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00" + "'", str2, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
    }

    @Test
    public void test41284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41284");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test41285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41285");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "61\\ 61\\ ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(".", "             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "ChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0020\\u0##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0020\\u0##" + "'", str1, "0020\\u0##");
    }

    @Test
    public void test41288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41288");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("23 u0023 u0023          3    23 u0023 u0023      ", "U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0  \nU0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41289");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################  2   #################################################", "                                                        ..        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test41290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444...", "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    IUI0020\\4\n\nIUI0020\\4\n\nIUI0020\\4\n\nIUI002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test41291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41291");
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
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              ", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("1\\U00234                                      \\U0023\\U00\\u00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray17);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\n\n\n\n\n                                                                                                                             0uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u32057                                                                                                                             1", charArray17);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test41292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("CC0041", "                                                                     u6623\\u6623\\u6623\\u6623\\u6623\\u6623u666", "\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CC0041" + "'", str3, "CC0041");
    }

    @Test
    public void test41293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41293");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", strArray5);
        java.lang.String[] strArray8 = null;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray5, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "    16        16        16        16        16        16        16        16        16        16        16        16        16    ");
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("55555555", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str9, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test41294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41294");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("22222U6                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\16120\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\16120\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           " + "'", str1, "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\16120\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ");
    }

    @Test
    public void test41296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41296");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                     u003                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u00232222" + "'", str1, "u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u00232222");
    }

    @Test
    public void test41298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("U0023#u0023#u0023#u0023#u0023#u0023#u0023", "222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222\\u0032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023#u0023#u0023#u0023#u0023#u0023#u0023" + "'", str2, "U0023#u0023#u0023#u0023#u0023#u0023#u0023");
    }

    @Test
    public void test41299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41299");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41300");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("6                                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\3200", "                            AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAA                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAA", "\\u0020");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\3200" + "'", str3, "3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\3200");
    }

    @Test
    public void test41302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("75                                                          ", 0, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r77777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "75                                                          " + "'", str3, "75                                                          ");
    }

    @Test
    public void test41303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41303");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("           \n\n", "23\\U0023\\U...                                   ", "II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAAII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           \n\n" + "'", str3, "           \n\n");
    }

    @Test
    public void test41304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41304");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41305");
        char[] charArray5 = new char[] { ' ' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "75", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a\\U0023AAAAAAAAAAAAAA000U\\", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test41306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41306");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                      75", "uuu  6  6  6  6  6  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                      uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                      ", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                      " + "'", str2, "                                                                      uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                      ");
    }

    @Test
    public void test41308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       61", 635, "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777723hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       6177777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777723hi!hi!hi!77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777723hi!hi!hi!777777777777777777777" + "'", str3, "6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       6177777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777723hi!hi!hi!77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777723hi!hi!hi!777777777777777777777");
    }

    @Test
    public void test41309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16", "!ih!ih!ih   2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2", "U00230023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16" + "'", str3, "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16");
    }

    @Test
    public void test41310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41310");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                  \\u0023\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                  \\u0023\\u0", 460);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41311");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                        Aauaa\\uAAAAAAAAAAAAA                                       ", 61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41312");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", '6');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str4, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test41313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "2\\u0032\\u0032\\u0032");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41314");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" 623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666  ", 459, "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323 623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666  " + "'", str3, "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323 623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666  ");
    }

    @Test
    public void test41315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!i16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n", "                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test41316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41316");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU... 61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161########61########61########61########61########61########61########61########61########61########61########61########61###61#####", (java.lang.CharSequence) "U00234                                      \\U0023\\U00\\U0                    ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test41317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41317");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                 \\u0036                                                                 ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa             U0023\\U002U0023\\U002U0023\\U002U0             U0023\\U002U0023\\U002U0023\\U002U0             U0023\\U002U0023\\U002U0023\\U002U0             U0023\\U002U0023\\U002U0023\\U002U0        ", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "23C0023C0023C0023C0023C0023C0023C0023C0023C0023", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002                                                          ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test41318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41318");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h", "023\\U0023AAAAAAA", "...AAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...                          ...", 83, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61...                          ..." + "'", str3, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61...                          ...");
    }

    @Test
    public void test41320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41320");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "0023", (-1));
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("         ", strArray6, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u0034", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "         " + "'", str12, "         ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test41321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41321");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("61\\ 61\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41322");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                                                                                                              ...", (java.lang.CharSequence) "                                                        61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa                                                        ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                                              ..." + "'", charSequence2, "                                                                                                                                                              ...");
    }

    @Test
    public void test41323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("777777777777777777777777777777777777777777", "                                AAAAAAAAAAAAAAAAAAAA                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "777777777777777777777777777777777777777777" + "'", str2, "777777777777777777777777777777777777777777");
    }

    @Test
    public void test41324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41324");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\", (int) '\r');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("UUUUUUUUUUUUUUUUUUUUUUUUU...", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         \\u005a         ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test41325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("UUUUUU61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", 460);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUU61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" + "'", str2, "UUUUUU61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
    }

    @Test
    public void test41326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41326");
        char[] charArray13 = new char[] { ' ' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("3", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray13);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray13);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2003200U\\3200U\\3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023200\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003200U\\3200U\\", charArray13);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "....................u0023\\u002.....................", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test41327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41327");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAu", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("3200u                            aaaaaaaaaaaaa3200\\a", 227);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                               3200u                            aaaaaaaaaaaaa3200\\a" + "'", str2, "                                                                                                                                                                               3200u                            aaaaaaaaaaaaa3200\\a");
    }

    @Test
    public void test41329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                   ...", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   ..." + "'", str2, "                   ...");
    }

    @Test
    public void test41330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u022222\\U0023\\U00\\u0041\\U002322222\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u022222\\U0023\\U00\\u0041\\U002322222\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u00" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u022222\\U0023\\U00\\u0041\\U002322222\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test41331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("               51               ", "                                                                      u003                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41332");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("           \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "iiiiiaaaaaa5iiiiii", 79);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41333");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ", "\\u0023                                                                                     ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  " + "'", str3, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ");
    }

    @Test
    public void test41334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41334");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "                                             ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("41", strArray7, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", strArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray10);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) (short) -1);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.endsWithAny("      ", strArray21);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.endsWithAny("\\", strArray21);
        int int24 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005", strArray21);
        java.lang.String[] strArray28 = org.apache.commons.lang3.StringUtils.split("", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 10);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray28);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray21, strArray28);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0023                                                                                                                                                  hi!hi!hi!", strArray10, strArray28);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.concatWith("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", (java.lang.Object[]) strArray10);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "41" + "'", str11, "41");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str30, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\u0023                                                                                                                                                  hi!hi!hi!" + "'", str31, "\\u0023                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "      " + "'", str32, "      ");
    }

    @Test
    public void test41335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41335");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhh", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41336");
        char[] charArray10 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23                                                                                     hi!hi!hi!", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u   ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test41337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41337");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (java.lang.Object[]) strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("1111111     ", strArray8);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "    61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0023                                                                                     ", strArray17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("3200u", strArray2, strArray17);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10hi!100" + "'", str10, "10hi!100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10hi!100" + "'", str11, "10hi!100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10hi!100" + "'", str12, "10hi!100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10hi!100" + "'", str13, "10hi!100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "3200u" + "'", str20, "3200u");
    }

    @Test
    public void test41338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41338");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", 60);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200UAAAAAAAAAAAAAA");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....       ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test41339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41339");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23i23i23i23iui31i23i23i23i23", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0023\\u0023\\u0023\\u0023\\u004444444444444 6A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075", "6116116116116116116116116116116116116116116116116116116116116116");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u004444444444444 6A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075" + "'", str2, "0023\\u0023\\u0023\\u0023\\u004444444444444 6A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
    }

    @Test
    public void test41341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41341");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41342");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\61\\61\\61\\61\\u0023     ", "\\61\\61\\61\\61\\61\\61aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "2\\u0032\\u0032\\u0032");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006", " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006" + "'", str2, "                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006");
    }

    @Test
    public void test41345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41345");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\\\0020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\0020" + "'", str2, "\\\\0020");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\\\0020" + "'", str3, "\\\\0020");
    }

    @Test
    public void test41346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41346");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str1, "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
    }

    @Test
    public void test41347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41347");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("11111111111U0023#U0023#U0023#U0023#U0023#U0023#U", "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41348");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41349");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '5', 929);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test41350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41350");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#u#005#c##u#00", "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U" + "'", str1, "##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U");
    }

    @Test
    public void test41352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41352");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("Aaaaaaa      ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "00u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test41353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41353");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA..." + "'", str1, "AAAA...");
    }

    @Test
    public void test41354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                        41                                                                                                                                                                         ", "2  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                        41" + "'", str2, "                                                                                                                                                                        41");
    }

    @Test
    public void test41355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034......   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41356");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("cccccccccccccccccccccccccccccccccc\n     ", "      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0", "A\\u0023AAAAAAAAAAAAA", 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cccccccccccccccccccccccccccccccccc\n     " + "'", str4, "cccccccccccccccccccccccccccccccccc\n     ");
    }

    @Test
    public void test41357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41357");
        char[] charArray8 = new char[] { '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u005c", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                         U0023\\U002U0023\\U002U0023\\U002U0", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                         ", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test41358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41358");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" 6\\\\u0020", "                                         AAAAAAA      ", 508);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41359");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...h ", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("023\\u0023aaaaaaa", "0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "023\\u0023aaaaaaa" + "'", str2, "023\\u0023aaaaaaa");
    }

    @Test
    public void test41361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41361");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 37 + "'", int3 == 37);
    }

    @Test
    public void test41362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                         161\\161\\161\\161\\161\\16177777777777777777777777777", "u 61..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         161\\161\\161\\161\\161\\16177777777777777777777777777" + "'", str2, "                                         161\\161\\161\\161\\161\\16177777777777777777777777777");
    }

    @Test
    public void test41363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0" + "'", str1, "A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0");
    }

    @Test
    public void test41364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41365");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "####AU   2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...      61\n                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...      61\n                       " + "'", str1, "...      61\n                       ");
    }

    @Test
    public void test41367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41367");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A\\U0023AAAAAAAAAAAAAA000U\\", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("000000000U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test41368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41368");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhhhhhhhhhhhhuuuuuuu", "                                         uuuuuuuuuuuu                                  3200u", 52);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 306);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                                                                                                                                                                                                                                                    " + "'", str2, "...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test41370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41370");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 61\\\\u0020                                                      ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\161", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 84 + "'", int4 == 84);
    }

    @Test
    public void test41371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41371");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U0##########\\U0023\\4003U0023\\U\\U0023\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n666U3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\326", (int) 'h');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41372");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA" + "'", str1, "AAAAAAA");
    }

    @Test
    public void test41373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41373");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "2                                         \n\n1", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "222223200U\\  ", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaa", charArray10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test41374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6", "                                                                                                                                                                                                                     3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                                                                                                                                                                                                                     ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41375");
        char[] charArray14 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "3\\u0...", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023\\U00\\U0041\\U", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "u003", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                    \n\n1", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u005c\\u003 u00\\u005c\\u003 u00\\u005c\\u003          3    \\u005c\\u003 u00\\u005c\\u003 u00\\u005c\\u003      ", charArray14);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test41376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("       5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "  575\\u0037200U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str2, "       5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test41377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                            ", "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41378");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("U003aaaaaa", (int) 'A', 22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U003aaaaaa" + "'", str3, "U003aaaaaa");
    }

    @Test
    public void test41379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a");
    }

    @Test
    public void test41380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41380");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                     6U3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32", "IIIIIIIIIIIII...AAAA      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test41381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41381");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                               i!                                                                                                                                                                                                                 ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41382");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U", "                               \\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0                                  ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("16 16 16", "...    23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41384");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ", "  2   ", (int) 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test41385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41385");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "U0##########\\U0023\\4003U0023\\U\\U0023\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("        77777777777777777777700000000000000000000777777777777777777777\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "77777777777777777777700000000000000000000777777777777777777777" + "'", str1, "77777777777777777777700000000000000000000777777777777777777777");
    }

    @Test
    public void test41387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41387");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("22222222222222222222222222222222222222241", "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    IUI0020\\4\n\nIUI0020\\4\n\nIUI0020\\4\n\nIUI002", 930);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\", 14, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\" + "'", str3, "61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
    }

    @Test
    public void test41389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                261aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2222222261aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2222222261aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41390");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("U0023\\U0023\\U\\4003U0023\\U0023\\U0", "0\\u0020\\u00", "u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41391");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh....................................................................................................", " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41392");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                               ", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...232U00232U002375757575757575757575757575757575757575757575757575757575333333333333");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test41393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068" + "'", str1, "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068");
    }

    @Test
    public void test41394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41394");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                           \\u003                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("5", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5" + "'", str2, "5");
    }

    @Test
    public void test41396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41396");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("61uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuuuuuu", "hi!1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u0023                                 6", 271, 46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u0023                                 6" + "'", str4, "61uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u0023                                 6");
    }

    @Test
    public void test41397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41397");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...H    H...", "\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   ", 31);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u", 227, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test41398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test41399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("22223200U\\1400u\\00U\\3200U61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "22223200U\\1400U\\00U\\3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "22223200U\\1400U\\00U\\3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test41400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41400");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "    61        61        61        61        61        61        61        61        61        61        61        61        61    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("23 u0023 u0023          3    23 u0023 u0023      ", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u005c" + "'", str3, "\\u005c");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test41401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020                       ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41402");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("61\\ 61\\ 61\\ 61\\ 61\\ 611111111..  UUU6  6  6  6  6  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 611111111..  UUU6  6  6  6  6" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 611111111..  UUU6  6  6  6  6");
    }

    @Test
    public void test41403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41403");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r");
    }

    @Test
    public void test41404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41404");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                              6u666", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757\\iui0020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              6u666" + "'", str2, "                                                                                              6u666");
    }

    @Test
    public void test41406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41406");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\", "       aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa          ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'i');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "666666666666666666666666666666666666666iAAAAAAAAAAAAA\\\\\\" + "'", str4, "666666666666666666666666666666666666666iAAAAAAAAAAAAA\\\\\\");
    }

    @Test
    public void test41407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61", (int) '7', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61" + "'", str3, "########0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61");
    }

    @Test
    public void test41408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41408");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("               \\", 30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41409");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 243);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 243 + "'", int2 == 243);
    }

    @Test
    public void test41410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41410");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("222222222222222222222222222222222222222222222U6                                          ", "u                                                ", 91);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\r');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "222222222222222222222222222222222222222222222U6                                          " + "'", str5, "222222222222222222222222222222222222222222222U6                                          ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "222222222222222222222222222222222222222222222U6                                          " + "'", str6, "222222222222222222222222222222222222222222222U6                                          ");
    }

    @Test
    public void test41411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41411");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str1, "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test41412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41412");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41413");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\n\n\n\n\n\n\n\n\n\n\n\\\\i\\                       61\n                       ", "                                                                                                                                                                                                      \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41414");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("0\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void test41415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41415");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u005c", "H", 263);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41416");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n0000000000000000000000000000000000000000000000000000000\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41417");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61", "H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...", 192, 255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 192");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41418");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("aAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void test41419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00" + "'", str2, "200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
    }

    @Test
    public void test41420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                 A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 A" + "'", str1, "                                                                                                 A");
    }

    @Test
    public void test41421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41421");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhh" + "'", str1, "hhhhhhhhhhhhh");
    }

    @Test
    public void test41422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41422");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U0", "\\5u50055c5\\5u500");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41423");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '6', 297);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test41424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41424");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("  6  6  6  6  6  uuu", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test41425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41425");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', (int) (byte) 0, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("00000000000", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16u\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u                   \\u0037                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000" + "'", str2, "00000000000");
    }

    @Test
    public void test41427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r16", "61......61\\61\\61\\61\\61\\61\\...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r16" + "'", str2, "161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r16");
    }

    @Test
    public void test41428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41428");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41429");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8", (java.lang.CharSequence) " 61\\ 61\\ 61...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0... 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...      3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("55                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("     \\0023\\00\\u0041\\0023     ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test41432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAAAAAAA...0u\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("61\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "61\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test41434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("############################################################################################################################################################################################\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", "2222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41435");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41436");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h                                                                ", charArray5);
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
    public void test41437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41437");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41438");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                             0uUu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41440");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) " 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...AAA                                             AAA       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\" + "'", str1, "\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\h\\");
    }

    @Test
    public void test41442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41442");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", "0023\\u0023\\u0023\\ U", "       111111111111111111111  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                           ", "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AAAAAAA", 'u');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", 297, 97);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u", strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith(" 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaa", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AAAAAAA" + "'", str10, "AAAAAAA");
    }

    @Test
    public void test41445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41445");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaa", "\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) 'A');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\\u002066666666666666666666666666666666666666", 250, 108);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test41446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41446");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ......16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\", (java.lang.CharSequence) "61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86 + "'", int2 == 86);
    }

    @Test
    public void test41447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                   ", 90, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444                                                   44444444444444444444" + "'", str3, "4444444444444444444                                                   44444444444444444444");
    }

    @Test
    public void test41448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41448");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("111111111111111111111111111111111111111111111111111                                                      ", "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200u", 178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                     61\\\\U0020                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\\\U0020" + "'", str1, "61\\\\U0020");
    }

    @Test
    public void test41450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41450");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("           16                                                  ", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "23AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41452");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16", "                     ......  7777777777777777777777777777777777777777777777777777777777777777777777761\\                     ......  77777777777777777777777777777777777777777777777777777777777777777777777", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41453");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "161\\16161\\161");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41454");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "22222222222222222222222222222222222222241AAAAAAAA", (java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ \\u0063 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ \\u0063 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ \\u0063 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ \\u0063 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ \\u0063 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41455");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5", "u0023                                            ", 56);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", (int) '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str9, "aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test41456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "51AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41457");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u003\\u003\\u0                                         \n\n1                                                    \n\n1    ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41458");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
    }

    @Test
    public void test41459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41459");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                        6u666u                                        ", "AAAAAA HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023     00U\\3200U\\3200U\\3200U\\3200U\\3200", "023\\u0023\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023     00U\\3200U\\3200U\\3200U\\3200U\\3200" + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023     00U\\3200U\\3200U\\3200U\\3200U\\3200");
    }

    @Test
    public void test41461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41461");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\3200", "u661616161");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41462");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "1\n\n                                         200u\n###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41463");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hhhhhhhhhhhhhhhhhhhhh23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hhhhhhhhhhhhhhhhhhhhhh", "                61..               ", 479);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41464");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("         ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAAAA   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhhaaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhh", "...232U00232U002375757575757575757575757575757575757575757575757575757575333333333333");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "3200U\\3200U\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200U\\3200U\\3200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41466");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   ", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41467");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuU", 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41468");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("11111111111u6111111111111111111111   2 11111111UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111", "\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n" + "'", str1, "61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n");
    }

    @Test
    public void test41471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41471");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00u\\0200u\\0200u\\0200u\\02", "u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           U5C", 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("... .hi!hi!hi!                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... .hi!hi!hi!" + "'", str1, "... .hi!hi!hi!");
    }

    @Test
    public void test41473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41473");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u" + "'", str1, "0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u");
    }

    @Test
    public void test41474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", 160);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\" + "'", str2, "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test41475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\IIIIIIII\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\IIIIIIII\\U" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\IIIIIIII\\U");
    }

    @Test
    public void test41476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test41477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("u                                  ", "          aaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u" + "'", str2, "u");
    }

    @Test
    public void test41479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41479");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("        #######    61        61        615c    61        61        61                                                                                                                                                                                                                                                                                                                                    ", "Aaaaaaa      ", 189);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        #######    61        61        615c    61        61        61                   Aaaaaaa                                                                                              " + "'", str3, "        #######    61        61        615c    61        61        61                   Aaaaaaa                                                                                              ");
    }

    @Test
    public void test41481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41481");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                 ...        ", 21, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 ...        " + "'", str3, "                                                 ...        ");
    }

    @Test
    public void test41482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("23hi!hi!hi!                                                                          ", "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...061                                         \n\n", "0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "", "\\61\\61\\61\\61\\u0023     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test41484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41484");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U 1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41485");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161\\", 'i', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161\\" + "'", str3, "161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161\\");
    }

    @Test
    public void test41486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41486");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("61uuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuu", 139);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41487");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  ......  77777777777777777777777777777777777777777777777777777777777777777777777", "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                         75                                                          ", 22, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                         ..", "...                                 ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 404);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41490");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41491");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                300u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "300u\\" + "'", str1, "300u\\");
    }

    @Test
    public void test41493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r161\r16");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41494");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u0020666666666U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  iii", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "333333333333333333333333333333333333333333333333333333333333333333333333333333310HI!100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41496");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "u003                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41497");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41498");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "           A\\u0023AAAAAAAAAAAAA                                       ", (java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 253 + "'", int2 == 253);
    }

    @Test
    public void test41499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'I');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41500");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

