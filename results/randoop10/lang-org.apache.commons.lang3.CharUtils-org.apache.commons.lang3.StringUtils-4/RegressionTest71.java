import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest71 {

    public static boolean debug = false;

    @Test
    public void test35501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAAAAA HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAA HHHHHHHHHHHHHHHHH" + "'", str1, "AAAAAA HHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test35502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35503");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", (java.lang.CharSequence) "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                                                                             6u666u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             6u666u" + "'", str2, "                                                                             6u666u");
    }

    @Test
    public void test35505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "............................                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35506");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 " + "'", str1, "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 ");
    }

    @Test
    public void test35507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35507");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...1...                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35509");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                         ", 930, 130);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35510");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6       ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh", "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh" + "'", str2, "      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test35512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", "100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100", "                             6  6  6  6  6  uuu                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ..." + "'", str3, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
    }

    @Test
    public void test35513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", '3', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6" + "'", str3, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
    }

    @Test
    public void test35514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35514");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "004", 178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35515");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", '6');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\u1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1" + "'", str3, "1\\u1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1");
    }

    @Test
    public void test35516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000", 46, '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000");
    }

    @Test
    public void test35517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test35518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                         \n\n1                                                    \n\n", 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         \n\n1                                                    \n\n" + "'", str2, "                                         \n\n1                                                    \n\n");
    }

    @Test
    public void test35519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35519");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           ", 93);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35520");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35521");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                         \\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35522");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 532, 227);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35523");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0023\\u0023\\u0023\\u0023\\u004444444444444 6A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35524");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "            1hi!1             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("2222222222222222222222222222222222222222222222222\r", 'c');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2222222222222222222222222222222222222222222222222\r" + "'", str2, "2222222222222222222222222222222222222222222222222\r");
    }

    @Test
    public void test35526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35526");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("            23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003", "\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35527");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 6");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c", 543, 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str3, "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test35529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35529");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuu                                  3200u", "5555555555555555aa        75                                          ", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35530");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "3200U\\3200U\\3200\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200", 930, 30);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test35531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u", "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U", "iiiiii                                                            iiiiii");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u");
    }

    @Test
    public void test35532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35532");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "                                                                                                        aaaaaaa", 4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("1\\hi!hi!hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0035", strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "23                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str9, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test35533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35533");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("11111111111111uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\111111111111111", "                                            3200", 380);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000\r\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000\r\\", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35535");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0033", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002\\\\\\\\", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 104 + "'", int15 == 104);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test35536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...1\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35537");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("u003                    ", "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test35538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35538");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u61 \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", "111111111aaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hCUUUUUUUU", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test35539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35539");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("               AAAAAAAAAAAAA3200\\A                                 ", (int) 'A');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35540");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...", 476, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 80, "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str3, "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test35542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35542");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                   ", (java.lang.CharSequence) "111111111111111111111u61111111111111111111111123\\U");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                   " + "'", charSequence2, "                                   ");
    }

    @Test
    public void test35543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", str1, "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test35544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                    61\\ 6161\\ 61\\ 6161\\ ", "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                    61\\ 6161\\ 61\\ 6161\\ " + "'", str3, "                                                                                    61\\ 6161\\ 61\\ 6161\\ ");
    }

    @Test
    public void test35545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35545");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'U', '5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'U' + "'", char2 == 'U');
    }

    @Test
    public void test35546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35546");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002", "hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("111111111111111111111U6111111111111111111111", "ccccccccccccc\\U0068cccccc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111U6111111111111111111111" + "'", str2, "111111111111111111111U6111111111111111111111");
    }

    @Test
    public void test35548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0023", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0000000000000000000000000000000000000000000uUu0u3200uUu0u3200uUu0u3200uUu0u3200uUu0u32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", 192, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  " + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  ");
    }

    @Test
    public void test35550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35550");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35551");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                ##0U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n###                                 ", "                    3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                     ", "000000000000000000000000000000.....");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000" + "'", str3, "00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000");
    }

    @Test
    public void test35552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35552");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\161\\161\\161\\161\\161\\161\\u6                                 ", "6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35553");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("11\\\\0020111111111111111111111111111111111111111111111111111111111111111111111111111111111", "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", "u004", 685);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11\\\\0020111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "11\\\\0020111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test35554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("23\\U", "aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\U" + "'", str2, "23\\U");
    }

    @Test
    public void test35555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35555");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("uuuuuuuuuuuuuuuuuuuuuuuuuu16\\16 \\16");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16");
    }

    @Test
    public void test35556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                 6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6" + "'", str1, "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6");
    }

    @Test
    public void test35557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35557");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test35558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6" + "'", str2, "U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6");
    }

    @Test
    public void test35559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35559");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                        aaaaaaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        aaaaaaa" + "'", str2, "                                                                                                        aaaaaaa");
    }

    @Test
    public void test35560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35560");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray11, strArray16);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("61", strArray11, strArray19);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061");
        boolean boolean24 = org.apache.commons.lang3.StringUtils.startsWithAny("U61", strArray23);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray19, strArray23);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23, 'h');
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray23);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.endsWithAny("   23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                                          ", strArray23);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23, '5');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str17, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "61" + "'", str20, "61");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str25, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\u0061" + "'", str27, "\\u0061");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\u0061" + "'", str31, "\\u0061");
    }

    @Test
    public void test35561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35561");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("3300Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3300Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "3300Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35562");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0020\\u0##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("3\\u003\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3\\u003\\" + "'", str1, "3\\u003\\");
    }

    @Test
    public void test35564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "3\\U0023\\U0023\\U0023\\U0023\\U00...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35565");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 404 + "'", int1 == 404);
    }

    @Test
    public void test35566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35566");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       61\n                       ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", 19);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35567");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u003\\u003\\u0                                         1                                                    1    ", 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35568");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1\\61\\61\\61\\61", "                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35569");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        \\U0023\\U0023\\U0023");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35570");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'u', 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test35571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("             u0023\\u002u0023\\u002u0023\\u002u0", "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             u0023\\u002u0023\\u002u0023\\u002u0" + "'", str2, "             u0023\\u002u0023\\u002u0023\\u002u0");
    }

    @Test
    public void test35572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35572");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("111111111111111111111111", "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u   6aaaaaaaaaaaaa", "                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "111111111111111111111111" + "'", str4, "111111111111111111111111");
    }

    @Test
    public void test35573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("              ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U" + "'", str2, "                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
    }

    @Test
    public void test35574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35574");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 202, (int) '7');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "00u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35576");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005c\\u0", "a         ", 92);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "\\");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u", strArray6, strArray18);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) (short) 1);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.endsWithAny("    61        61        61        61        61        61        61        61        61        61        61        61        61   ", strArray25);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.split("3000u\\3111111111111111111111111111111111111111111111", '6');
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.split("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEach("23\\u", strArray30, strArray32);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray25, strArray32);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEach("0020                                                                                     ", strArray6, strArray32);
        java.lang.String[] strArray38 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", " 61\\\\u002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16u\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u", strArray32, strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 105");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str14, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str15, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "23\\u0023\\u" + "'", str19, "23\\u0023\\u");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "23\\u" + "'", str33, "23\\u");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0020                                                                                     " + "'", str35, "0020                                                                                     ");
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test35577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35577");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ", "002300230023002300230023002300230a000u\\002300230023002...", 543);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ", 358);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35579");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1\\U0030uUu\\", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35580");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35581");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("    61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61        61        61        61        61        61        61        61        61        61        61        61        61" + "'", str1, "61        61        61        61        61        61        61        61        61        61        61        61        61");
    }

    @Test
    public void test35582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\r\r\r\r\r\r666661666661666U6666666661666661666\r\r\r\r\r\r\r", "AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r666661666661666U6666666661666661666\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r666661666661666U6666666661666661666\r\r\r\r\r\r\r");
    }

    @Test
    public void test35583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\                                               ", (int) ' ', 635);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               " + "'", str3, "                                               ");
    }

    @Test
    public void test35584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35584");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("023\\u0023aaaaaaa", "                                   ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35585");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("61\n", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ", "23\\u U   6");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35586");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                      61\\ 61\\61", " ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35587");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuu 3200", "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35588");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) 'h');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test35589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35589");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                                             \\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", '5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test35590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35590");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                   ######", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35591");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0023\\", "                                                                                                    \\u0023                                                                                     hi!hi!hi!                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35592");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...111111111111111111111111111111111111111111111" + "'", str1, "...111111111111111111111111111111111111111111111");
    }

    @Test
    public void test35593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35593");
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u005c\\u00", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray15);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                         \n\n1                                                    \n\n", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 41 + "'", int25 == 41);
    }

    @Test
    public void test35594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35594");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", 42, "                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test35595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35595");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35596");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("i!", 260, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35597");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...", "3\\u0003\\u0111111111111111111111111111111111111111111111\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h..." + "'", str2, "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
    }

    @Test
    public void test35599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "23aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 1623");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 1623" + "'", str1, "23aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 1623");
    }

    @Test
    public void test35601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35601");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a000u\\                                                                                                                                                              ", "  ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              " + "'", str2, "                                                              ");
    }

    @Test
    public void test35603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35603");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 263);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35604");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                      u003                    ", "61UUUUUUUUUU", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "cccccccccc###\n\\u002                                         \n\n1           aaaaaaaaaaacccccccccc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35606");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           \\\\U005C005c", "20\\u0020\\u0020\\u0020\\u00");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("000000000000000000000000000000000000000000000000000000000000", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test35607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35607");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "#", 97);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35608");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ", "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU", 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("u005CU0U005CU0U0023uU005CU0U005CU0", "\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35610");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6", "                                                                                                                                                                                                                     u003                    ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                        AAAAAAA    ", "        75");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("2  ", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 124 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                        AAAAAAA    " + "'", str8, "                                                                                                        AAAAAAA    ");
    }

    @Test
    public void test35611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...", (int) (short) 1, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51..." + "'", str3, "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...");
    }

    @Test
    public void test35612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "1uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35613");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuu", "...001600000000160000000016000000001600000000160000000016000000001600000000160000000016");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35614");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 'I', '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\" + "'", str3, "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
    }

    @Test
    public void test35615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh", (int) 'i', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh" + "'", str3, "AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test35616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35616");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "IIIIIIIIII0023\\u0...IIIIIIIIIII", (java.lang.CharSequence) "u61 \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "IIIIIIIIII0023\\u0...IIIIIIIIIII" + "'", charSequence2, "IIIIIIIIII0023\\u0...IIIIIIIIIII");
    }

    @Test
    public void test35617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", 92, "                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                     23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "                                                     23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test35618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\ 23\\U### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", "aaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35619");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "                                             ");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("5c", strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'A', 104, (int) (byte) 0);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("                                        A0u0023AAAAAAAAAAAAA                                       ", strArray5);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                hi!", strArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "      " + "'", str13, "      ");
    }

    @Test
    public void test35620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("55          aaaaaaa       CCCCCCCCCCCCCCCC", "\n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "55          aaaaaaa       CCCCCCCCCCCCCCCC" + "'", str2, "55          aaaaaaa       CCCCCCCCCCCCCCCC");
    }

    @Test
    public void test35621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35621");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuu  \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\  \\\\0020                                                            ", 40);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  " + "'", str1, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
    }

    @Test
    public void test35623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35623");
        char[] charArray10 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5C", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                           uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032                                                                                                                                                            ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 155 + "'", int14 == 155);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test35624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                   \\u0033                   ", 227, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   \\u0033                   UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "                   \\u0033                   UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test35625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35625");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "    u0034                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                   ", 0, 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n" + "'", str3, "\n\n\n\n\n\n\n");
    }

    @Test
    public void test35627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35627");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                        0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023    ...                                                           ", "IiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35628");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", '5');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100", strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", strArray3, strArray13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str12, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666" + "'", str14, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
    }

    @Test
    public void test35629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35629");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("222222222222222222222222222222222222222222222222222222222222U   66666666666666666666666666666666666", "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35630");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35631");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\" + "'", str1, "666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\");
    }

    @Test
    public void test35632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...", "                                         \n\n                                                     \n\n                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\U003 111", "222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222\\u0032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U003 111" + "'", str2, "\\U003 111");
    }

    @Test
    public void test35634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16U \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", (int) (byte) 100, "22222222222222222222                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16U \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16U \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test35635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35635");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void test35636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35636");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\4003266666666666666666", (java.lang.CharSequence) "UUUUUU 6\\\\U0020 6\\\\U0020 6              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35637");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('2', 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test35638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35638");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...020u0020u0020u0020u0020u0020u0020u0020...        ", "1616161616161616161161611616161616161616161", 91);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35639");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61", '1');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6");
    }

    @Test
    public void test35640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("U5C", 107, "...AAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...U5C...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA..." + "'", str3, "...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...U5C...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...");
    }

    @Test
    public void test35641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                   0041\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 61\\ 61\\ 61\\ 61\\ 61\\ ..." + "'", str1, "\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
    }

    @Test
    public void test35643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35643");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("33333333333333333333333333333333333333333333", "222222222222222222222222222222222\\UUU02\\...2222222222222222222222222222222222", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\        \\U0023\\U00\\u0041\\U                                   5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\        \\U0023\\U00\\u0041\\U                                   5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\         " + "'", str1, "5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\        \\U0023\\U00\\u0041\\U                                   5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\         ");
    }

    @Test
    public void test35645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "UUUUUUUUUU...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uUUUUUUUUU..." + "'", str1, "uUUUUUUUUU...");
    }

    @Test
    public void test35646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35646");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   U61   ", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1616161616161616161161611616161616161616161");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaa            ", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test35647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ UUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu");
    }

    @Test
    public void test35649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test35650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35650");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("5500\r\\", "U0023\\U00\\u0041\\U002322222", "                                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35651");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh", "\\6005c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("uuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuu..." + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test35653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35653");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111       ", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061..." + "'", str2, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...");
    }

    @Test
    public void test35655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", '\r', 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       " + "'", str3, "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
    }

    @Test
    public void test35656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35656");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\U0023\\U00\\U0041\\U", 7);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35657");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                         u0023\\u002u0023\\u002u0023\\u002u0", "23\\u0023\\u0023          3    23\\u0023\\u0023      ", 98);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("...                          ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test35658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35659");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                            aaaaaaaaaaaaa3200\\a                                ", 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test35660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35660");
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
    public void test35661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35661");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                300U", 97, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35662");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200", "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ", (int) '0');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\ 61\\ 61\\61u 61\\ 61\\610020", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 61\\ 61\\61u 61\\ 61\\610020" + "'", str2, "\\ 61\\ 61\\61u 61\\ 61\\610020");
    }

    @Test
    public void test35665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35665");
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
    public void test35666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("u......\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00", 532, 121);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u......\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00" + "'", str3, "u......\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00");
    }

    @Test
    public void test35667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35668");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", (java.lang.CharSequence) "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    " + "'", charSequence2, "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
    }

    @Test
    public void test35669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35669");
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
    public void test35670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                            5500u\\aaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA1111111111111111111111111111111111111111111111                                            5500U\\AAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA1111111111111111111111111111111111111111111111                                            5500U\\AAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35671");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", (java.lang.CharSequence) "AAAAAAA     \\u0041                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35672");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "u\\3200u\\32", 118, (int) 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test35673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35673");
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
    public void test35674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35674");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6", "  2  UUUUU", 667);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35675");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("300000", "222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35677");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c", "...                             AAAA15AAAA                                 AAAA15AAAA               ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35678");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...    ...uuuuu61uuuuuuuuuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test35679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\u0020                                        ", "\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020                                        " + "'", str2, "\\u0020                                        ");
    }

    @Test
    public void test35680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35680");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '1');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                   ######", 296, 124);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str4, "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test35681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35681");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("U 61.", 'h', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U 61." + "'", str3, "U 61.");
    }

    @Test
    public void test35682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35682");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "1\\U00234                                      \\U0023\\U00\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35683");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("000000000000000000000000000000000000000000000000000000000000", " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 161);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35684");
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
    public void test35685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU20\\u0020\\u0020\\u0020\\u00    20\\u0020\\u0020\\u0020\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35686");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0", 113, 54);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", "                                         \n\n1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35688");
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
    public void test35689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) " 61..11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35690");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("11111111111111111111 111111111111111111111", "U   6");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35692");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u01\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                           a             u6", "6                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35693");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...020u0020u0020u0020u0020u0020u0020u0020...        ", 267, 257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35694");
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
    public void test35695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35695");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("a", "u......\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test35697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 270, "             u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u" + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u");
    }

    @Test
    public void test35698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35698");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HHHHHHHHHHHHHUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U", "20u0020u0020u0020u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35699");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U", "                                                                                      u\\32");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35700");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("   2     ...                                ...    \\U002", "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35701");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (java.lang.CharSequence) "AAAAAA                             HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 497 + "'", int2 == 497);
    }

    @Test
    public void test35702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35702");
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
    public void test35703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35703");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u003", "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35704");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 111, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35705");
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
    public void test35706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ", "...111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("uuu  6  6  6  6  6  ", "u002322222                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6  6  6  6  6  " + "'", str2, "6  6  6  6  6  ");
    }

    @Test
    public void test35708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35708");
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
    public void test35709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35709");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "00U\\3200U\\3200U\\3200U\\3200U\\3200");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35710");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "aaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35711");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "\\400326666666666666666666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\4003266666666666666666666666666666666666666", 130);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35712");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("111111111111111111111111111111111111111111111111111111111111111111111111111111111111..", "1111111111111111111111111111111111111111111113\\U0003\\U0111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84 + "'", int2 == 84);
    }

    @Test
    public void test35713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35713");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000uuuuuuuuuuuuuuuuuuuuuuuuu...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35715");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6", "aaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35716");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "i!         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35717");
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
    public void test35718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35718");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                       0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n16U", "                  ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test35719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...", "11111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111", "   ...3\\u23\\u23U6    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\..." + "'", str3, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...");
    }

    @Test
    public void test35720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35720");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("      61\\ 61\\ ", 440, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35721");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '6' + "'", char2 == '6');
    }

    @Test
    public void test35722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35722");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", "\\u0023                                                                                     hi!hi!hi!                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35723");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###u\\32                                                                             ", "222222222222222222222222222222222\\UUU02\\...222222222222222222222222222222222", 306);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "AAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35725");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...      " + "'", str1, "...      ");
    }

    @Test
    public void test35726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35726");
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
    public void test35727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 173);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                      " + "'", str2, "                                                                      uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                      ");
    }

    @Test
    public void test35728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35728");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("cccccccccccccccccccccccccccccccccc\n     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cccccccccccccccccccccccccccccccccc" + "'", str1, "cccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test35729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35729");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\\UUU02\\... 3hi!hi!hi!                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\UUU02\\... 3hi!hi!hi!" + "'", str1, "\\UUU02\\... 3hi!hi!hi!");
    }

    @Test
    public void test35730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35730");
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
    public void test35731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35732");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35733");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", (java.lang.CharSequence) "\\U005C                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00" + "'", charSequence2, "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
    }

    @Test
    public void test35734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35734");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "0023\\U0023\\U0023\\U0023\\U0023\\U004444444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   \n\\u002                                   ...", "                                                                      u003                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   \n\\u002                                   ..." + "'", str2, "   \n\\u002                                   ...");
    }

    @Test
    public void test35736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                       aaaaaaaaaaaaa\\\\\\", "                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaaaaaaaa\\\\\\" + "'", str2, "                                       aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test35737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test35738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35739");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ", 136, 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      " + "'", str3, "      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ");
    }

    @Test
    public void test35740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("10hi!1", "                                                                                                        aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35741");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\", "8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     \\U0023\\U0023\\U0023\\U0023\\U002     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16 ", 243);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\" + "'", str4, "5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\   2  5700U\\");
    }

    @Test
    public void test35742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35742");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                     ......  77777777777777777777777777777777777777777777777777777777777777777777777", "200U\\3200U\\3200U");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "           \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35744");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35745");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "22222222222222222222222222222222222222241AAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35746");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\AAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 306, 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35747");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35748");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...", 5);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\\u003                                                ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test35749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35749");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC0023\\U0023\\U0023\\U0023\\U0023\\U00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", '#', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC0023\\U0023\\U0023\\U0023\\U0023\\U00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC0023\\U0023\\U0023\\U0023\\U0023\\U00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test35750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35750");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  \\u0023\\u0023\\u0023\\u0023\\u0023\\16 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35751");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\  \\\\0020                                                            ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    " + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    ");
    }

    @Test
    public void test35753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35753");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 ", "000000000000000000000000000000...             000000000000000000041\\u00000000000000000000000000000000...             000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35754");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00234                                      \\U0023\\U00\\u0                    ", "U0023\\U00\\u0041\\U0023", 192);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("       aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa" + "'", str1, "aaaaaaa");
    }

    @Test
    public void test35756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35756");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0200iui\\", 136, "aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                            5500u\\aaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                   0200iui\\" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                   0200iui\\");
    }

    @Test
    public void test35758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35758");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35759");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test35760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35760");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("u003                    ", (int) '\\', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u003                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "u003                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  " + "'", str1, "16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  ");
    }

    @Test
    public void test35762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "3\\u0023u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("u\\3200u\\32");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u\\3200u\\32" + "'", str1, "u\\3200u\\32");
    }

    @Test
    public void test35764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35764");
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
    public void test35765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35765");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "6\\6\\6\\6\\6\\6\\6\\6\\6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35766");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", '\\');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
    }

    @Test
    public void test35767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35767");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("33333333", "u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ", 4, 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3333u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   " + "'", str4, "3333u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ");
    }

    @Test
    public void test35768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "...aaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200uaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test35769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35769");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023................................");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U" + "'", str4, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U");
    }

    @Test
    public void test35770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35770");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("333333U0033#U0033#U0033#U0033#U0033#U0033");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '3' + "'", char1 == '3');
    }

    @Test
    public void test35771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa", 32, "...\\61\\61\\61\\61\\61\\...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa" + "'", str3, "aaaaaaaaaaA\\u0023AAAAAAAAAAAAAa000u\\aaaaaaaaaa");
    }

    @Test
    public void test35772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35772");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu    222222222222222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu    222222222222222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu    222222222222222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35773");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 635, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test35774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35774");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6", "\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35776");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("           161\\161\\161\\161\\161\\16177777777777777777777777777", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35777");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 121);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35778");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "1111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test35779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35779");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00", "65                                  5a5757575757575757575757575757575757575757575751115757575757575757575757575757575757575757575751115", 306);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("1\\ 61\\ ...                                A\\u2AAAAAAAAAAAAAau\\                                                                 A\\u", "      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35783");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0075", "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test35784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35784");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  UUU6  6  6  6  6  ", 'c');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("..                    0u\\00U\\3200U\\                                      43200U\\1                                         ", "  \\U005C  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh", "         0000000000000000000000000000000000000000000000000\\U0037         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh" + "'", str2, "ChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh");
    }

    @Test
    public void test35787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35787");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 112);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35788");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002", (java.lang.CharSequence) "   2     ...                                ...    \\U0023");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002" + "'", charSequence2, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002");
    }

    @Test
    public void test35789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hCUUUUUUuuuuuuuuuuuuuuuuuu\\4555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16" + "'", str1, "uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16");
    }

    @Test
    public void test35791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA", "3\\u0023\\u", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA" + "'", str3, "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA");
    }

    @Test
    public void test35792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35792");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35793");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                 \\ 0030                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35794");
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
    public void test35795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35795");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 130);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 130 + "'", int2 == 130);
    }

    @Test
    public void test35796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35796");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "#11#1111\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35797");
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
    public void test35798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35798");
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
    public void test35799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068", "                 \\u0030\\\\\\\\                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35800");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...", "23\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35801");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                     ", 237);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35802");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'U', 139);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 139 + "'", int2 == 139);
    }

    @Test
    public void test35803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("uuu6  6  6  6  6", "H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuu6  6  6  6  6" + "'", str2, "uuu6  6  6  6  6");
    }

    @Test
    public void test35804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35804");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ 6161\\ 61\\ 6161\\ 00u\\0200u\\\n16u    ", 'c');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35805");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                        \\U0023\\U00\\u0041\\U0023                         ", "AAAAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   AAAAAAAAAAAAAAAAAAAAAAAAA", 107);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" ...                         ", "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ...                         " + "'", str2, " ...                         ");
    }

    @Test
    public void test35807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35807");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003", 262);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35808");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("5555555                     ...", "                                                                                ", 1000, 147);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5555555                     ...                                                                                " + "'", str4, "5555555                     ...                                                                                ");
    }

    @Test
    public void test35809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35809");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "5c", (java.lang.CharSequence) " 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35810");
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
    public void test35811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35811");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2", 62, 91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n..." + "'", str3, "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...");
    }

    @Test
    public void test35812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35812");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                           001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................                                                                                           ", "533333333333333333333333333333\\40032333333333333333333333333333333C", 46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................                                                                                           " + "'", str3, "                                                                                           001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................                                                                                           ");
    }

    @Test
    public void test35813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\300 066666666666666666666666666666666666666", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\300 066666666666666666666666666666666666666" + "'", str2, "\\300 066666666666666666666666666666666666666");
    }

    @Test
    public void test35814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35814");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r  \n\n1                                         ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1 == '\r');
    }

    @Test
    public void test35815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35815");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("6u666", "\n\n\n\n\n\n\n\n\n\n\n\\\\i\\                       61\n                       ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                       aaaaaaaaaaaaa\\\\\\", "                                                                                                                                                                                                      \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaaaaaaaa\\\\\\" + "'", str2, "                                       aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test35817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000", (int) (short) 10, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000" + "'", str3, "00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000");
    }

    @Test
    public void test35818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35818");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("75", 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "2  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35820");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u", "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        ", "23\\U                                         ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35821");
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
    public void test35822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61\\uuuuuuuuuuuuuuuu6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61\\uuuuuuuuuuuuuuuu6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61\\uuuuuuuuuuuuuuuu6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       5C111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCChhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       5C111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str2, "       5C111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test35824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1", 339);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                   0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1                                                                                   " + "'", str2, "                                                                                   0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1                                                                                   ");
    }

    @Test
    public void test35825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35825");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...", "                    ...", (int) 'I', 393);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ..." + "'", str4, "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...");
    }

    @Test
    public void test35826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", str1, "...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test35827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35827");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("..............................");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0\\u0020\\u00", "                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0\\u0020\\u00" + "'", str2, "0\\u0020\\u00");
    }

    @Test
    public void test35829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35829");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000", (java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000" + "'", charSequence2, "                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000");
    }

    @Test
    public void test35830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  6  6  6  6  6  uuu", 393, "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAA  6  6  6  6  6  uuu" + "'", str3, "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAA  6  6  6  6  6  uuu");
    }

    @Test
    public void test35831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35831");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ih01001!ih0", "                                 0023\\u0023\\u0023\\ U020\\u0020\\u0020\\u00", "      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35832");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa", "                                                                                                                                                                                                                          11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35833");
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
    public void test35834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35834");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", (java.lang.CharSequence) "\\      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test35835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35835");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                  \\U0023\\U00\\u0041\\U                                   \\uhi!hi!hi!\\uhi!hi!hi!\\uhi!hi!", 440, 861);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35836");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 497);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35837");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "iiiiiiiiiiiiiiuuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuuiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    ", "u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    " + "'", str2, "...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    ");
    }

    @Test
    public void test35839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35840");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                 \\u0030\\\\\\\\                  ", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...", 54);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                              \\u003");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u003" + "'", str1, "\\u003");
    }

    @Test
    public void test35842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35842");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "         a          ", 120, 33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         a          " + "'", str4, "         a          ");
    }

    @Test
    public void test35843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...", 135, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h " + "'", str3, "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h ");
    }

    @Test
    public void test35844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35844");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aa                                          ", "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n210000000000000000000000000000000000000000000000000\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\0auu0", "                                                                                                        \\u0023\\u\\", 168);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aa                                          " + "'", str4, "aa                                          ");
    }

    @Test
    public void test35845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35845");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6" + "'", str1, "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6");
    }

    @Test
    public void test35846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35846");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u", '7');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test35847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35847");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("23\\U                                        ", 48, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("10hi!10010hi!161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U10hi!10010hi!1", "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35849");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" u004", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35850");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35852");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161\\", "u6      61        61        61        61", 354);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35853");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "ccccccccccccc\\U0068cccccc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35855");
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
    public void test35856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35856");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35857");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaa", 'C');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test35858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35859");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                        aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35860");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 92 + "'", int1 == 92);
    }

    @Test
    public void test35861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35861");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                                                                                                                                             ", "A000U\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61A000U\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61A000U\\", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "00U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n16U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", " aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    " + "'", str2, "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
    }

    @Test
    public void test35864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35864");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                  I!", "\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                  I!" + "'", str5, "                                                                                                  I!");
    }

    @Test
    public void test35865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35865");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("U   ", "UUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u61", "61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333", 157);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U   " + "'", str4, "U   ");
    }

    @Test
    public void test35866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35866");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("  ......  \\u00410023\\U0023\\U0023\\U002                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA  ......  \\u00410023\\U0023\\U0023\\U002", "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35867");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) '5', "                  \\U0033\\U0033\\U0033\\U0033\\U0033\\U0033\\U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35868");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("61\\\\U0020", " u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", (int) '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "         0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test35870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35870");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                   2                              ", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35871");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", "", 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test35872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35872");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("2\\3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\320032", "0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35873");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\\\\2\\\\\\\\\\2\\\\\\56156156156156156156156uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "UUUUUUUUUUu6UUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\2\\\\\\\\\\2\\\\\\56156156156156156156156uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "\\\\2\\\\\\\\\\2\\\\\\56156156156156156156156uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35874");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("    61        61 ...II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAAIIII\\U0023\\U0023\\U0023\\U0023\\U0023\\U0", "                                                                                      u\\32", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35875");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2", "       ", 91);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test35876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\u003\\u0023\\u0023\\u0023\\                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                \\3200u\\3200u\\3200u\\300u\\" + "'", str1, "                                                                                                                \\3200u\\3200u\\3200u\\300u\\");
    }

    @Test
    public void test35877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35877");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ", "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u0020", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          " + "'", str3, "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
    }

    @Test
    public void test35878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("uuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuu61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuu61" + "'", str1, "uuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuu61");
    }

    @Test
    public void test35879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35879");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 611111111..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35880");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("61uuu", "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "0\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320", 380);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61uuu" + "'", str4, "61uuu");
    }

    @Test
    public void test35881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "                                                                                                                      6u666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########" + "'", str2, "U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
    }

    @Test
    public void test35882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("3\\u0023u0023\\u0023\\u0023\\u0023\\u002", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\u0023u0023\\u0023\\u0023\\u0023\\u002             " + "'", str2, "3\\u0023u0023\\u0023\\u0023\\u0023\\u002             ");
    }

    @Test
    public void test35883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    " + "'", str1, "                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ");
    }

    @Test
    public void test35884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35885");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("300000", "                    3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\161", '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111" + "'", str2, "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111");
    }

    @Test
    public void test35887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35887");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("u6      61        61        61        61                                                            ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333", 7, 297);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u6     uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333" + "'", str4, "u6     uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333");
    }

    @Test
    public void test35888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35888");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35889");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ", "61uuuuuuuuuuuuhi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61uuuuuuuuuuuuu", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35890");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("iiiiiaaaaaa                             iiiiii", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '5');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "iiiiiaaaaaa5iiiiii" + "'", str7, "iiiiiaaaaaa5iiiiii");
    }

    @Test
    public void test35891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35891");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61", 76);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                         \n\n1                                                    \n\n1     ", 460);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                             \n\n1                                                    \n\n1     " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                             \n\n1                                                    \n\n1     ");
    }

    @Test
    public void test35894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35894");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35895");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("           161\\161\\161\\161\\161\\16177777777777777777777777777", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         161\\161\\161\\161\\161\\16177777777777777777777777777" + "'", str2, "                                         161\\161\\161\\161\\161\\16177777777777777777777777777");
    }

    @Test
    public void test35897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35897");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("U       aaaaaaa       aaaaaaa", "A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ", "61\\\\u0020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   " + "'", str2, "                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ");
    }

    @Test
    public void test35899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35899");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                             6u623\\U                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "161\\161\\161\\161\\161\\161\\U6                      \n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n", 73);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35900");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35901");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\\\\\\\\\\\\\\\\\\\...HH...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\...hh..." + "'", str1, "\\\\\\\\\\\\\\\\\\\\...hh...");
    }

    @Test
    public void test35902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35902");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\u005c\\u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\\\\\\\\\\\\\...", "6161");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\..." + "'", str2, "\\\\\\\\\\\\\\...");
    }

    @Test
    public void test35904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", "UUUUUUUUUUUUUUUUUUUUUUUUUUUU..55          aaaaaaa       CCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35905");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35906");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00", "A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("        75");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75" + "'", str1, "75");
    }

    @Test
    public void test35908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...1111111111111111111111111111111111111111...", 393);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...1111111111111111111111111111111111111111..." + "'", str2, "...1111111111111111111111111111111111111111...");
    }

    @Test
    public void test35909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35909");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              AAAAAAAAA", "                     u                         ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35910");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u", "   \n\\u002                                         \n\n1           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35911");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                      ", "\\u0030\\\\\\\\", 32);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                      " + "'", str5, "                                      ");
    }

    @Test
    public void test35912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35912");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("      \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                               ", 29, (int) '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  " + "'", str3, "                                                  ");
    }

    @Test
    public void test35914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35914");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                    222222222222222222222222222222222", "6\\6\\6\\6\\6\\6\\6\\6\\6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35915");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                     u                         ", " U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35916");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny(" 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test35917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333" + "'", str1, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333");
    }

    @Test
    public void test35918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 61\\61" + "'", str1, "\\ 61\\61");
    }

    @Test
    public void test35919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35919");
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
    public void test35920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U", "hhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35921");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u" + "'", str1, "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
    }

    @Test
    public void test35922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35922");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("##############################################.16 ", 356, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555##############################################.16 5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555" + "'", str3, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555##############################################.16 5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test35923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                         " + "'", str1, "                                                                                                                                                         ");
    }

    @Test
    public void test35924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc", 'U', '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc" + "'", str3, "ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc");
    }

    @Test
    public void test35925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35925");
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
    public void test35926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35926");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "IIIIIIIIIIIII...AAAA      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35928");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "23hh23hh23hh23hh23hh23hh23hh23hh23");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23hh23hh23hh23hh23hh23hh23hh23hh23" + "'", str1, "23hh23hh23hh23hh23hh23hh23hh23hh23");
    }

    @Test
    public void test35929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35929");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0" + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
    }

    @Test
    public void test35930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("3\\u0...", "aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                            5500u\\aaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa", "\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3..." + "'", str3, "3...");
    }

    @Test
    public void test35932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35932");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###\n\\u003\\u0023\\u0023\\u0023\\###", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\163200u\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35933");
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
    public void test35934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35934");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        \\U0023\\U0023\\U0023", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", 370);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35935");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "", (int) (short) 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str6, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test35936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test35937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35937");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35938");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510HI!100", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U", 26);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test35939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35939");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                ##0U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n###                                 ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test35940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555", "6   U u\\32");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555" + "'", str2, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555");
    }

    @Test
    public void test35941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35941");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("u003                    111111111111111", "10HI!100", "23\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                              23\\u0023\\u0023\\u002                                                       ", "\n\n1                        23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35943");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                             U002322222                                             ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                        2  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                        2  " + "'", str1, "                                                                                                                                                                                                                                                                        2  ");
    }

    @Test
    public void test35945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35945");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0023u0023\\u0023\\u0023\\u0023\\u0023\\u003\\u\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023u0023\\u0023\\u0023\\u0023\\u0023\\u003\\u\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\" + "'", str1, "0023u0023\\u0023\\u0023\\u0023\\u0023\\u003\\u\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\");
    }

    @Test
    public void test35946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35946");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("222222222222222222222222222222222222222222222u6", "     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35947");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  ......  ", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                 ", "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35949");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "  U6                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35950");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("3200U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35951");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test35952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c", "#61#6161\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c" + "'", str2, "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c");
    }

    @Test
    public void test35953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35953");
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
    public void test35954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35954");
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
    public void test35955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuu 3200u", "600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u1111111111111111111111111111111111111...", "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35956");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                 a                                                                                                                                              ", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", (int) '\\', 103);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                 a                                          61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U                                                                                         " + "'", str4, "                                                 a                                          61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U                                                                                         ");
    }

    @Test
    public void test35957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\U23\\U23\\U23\\U23\\U23\\U23\\U23", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U23\\U23\\U23\\U23\\U23\\U23\\U23" + "'", str2, "\\U23\\U23\\U23\\U23\\U23\\U23\\U23");
    }

    @Test
    public void test35958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35958");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       ", "                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...", 369);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35959");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih   2    2    2  ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("U###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###U\\32                                                                             ", "\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###U\\32                                                                             " + "'", str2, "U###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###U\\32                                                                             ");
    }

    @Test
    public void test35961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35961");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 250, 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35962");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("UUUUUU 6\\\\U0020 6\\\\U0020 6              ", 146, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test35963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35963");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35964");
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
    public void test35965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("261                                                                                                                    ", 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "261                                                                                                                    " + "'", str2, "261                                                                                                                    ");
    }

    @Test
    public void test35966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35967");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("6u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6u" + "'", str1, "6u");
    }

    @Test
    public void test35968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35968");
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
    public void test35969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35969");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "\\u0023                                                                                                                                                  hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35970");
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
    public void test35971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35971");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  \\     \\     \\     \\     \\     ", "... \\\\\\aaaaaaaaaaaaA\\16 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\     \\     \\     \\     \\     " + "'", str2, "  \\     \\     \\     \\     \\     ");
    }

    @Test
    public void test35973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35973");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...      \n\n1           ...                                                                                              ", "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuu", (int) '.');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35974");
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
    public void test35975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35975");
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
    public void test35976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35976");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0" + "'", str1, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0");
    }

    @Test
    public void test35977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111" + "'", str1, "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111");
    }

    @Test
    public void test35978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("  \\U005C  ", "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u0022361.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\U005C  " + "'", str2, "  \\U005C  ");
    }

    @Test
    public void test35979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                   1\\61\\6161\\61\\6161\\61\\6161\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\61\\6161\\61\\6161\\61\\6161\\" + "'", str1, "1\\61\\6161\\61\\6161\\61\\6161\\");
    }

    @Test
    public void test35980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("533333333333333333333333333333\\4003233333333333333333333333333333", "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "533333333333333333333333333333\\4003233333333333333333333333333333" + "'", str2, "533333333333333333333333333333\\4003233333333333333333333333333333");
    }

    @Test
    public void test35981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35981");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!ih!ih!i", "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61", "\\U0023\\U00\\U0041\\U", 189);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!ih!i" + "'", str4, "!ih!ih!i");
    }

    @Test
    public void test35982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("u0023\\u002u0023\\u002u0023\\u002u0", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " u0023\\u002u0023\\u002u0023\\u002u0 " + "'", str2, " u0023\\u002u0023\\u002u0023\\u002u0 ");
    }

    @Test
    public void test35983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35983");
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
    public void test35984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35984");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "5500u\\", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35985");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35986");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                      u003                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35987");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...", 'C');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu..." + "'", str3, " 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test35988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\u005c\\u00666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100666666666666666666666100023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u\\3200016666666666666666666660013200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32000166666666666666666666600u\\c500u\\" + "'", str1, "3200u\\3200016666666666666666666660013200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32000166666666666666666666600u\\c500u\\");
    }

    @Test
    public void test35989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("23\\u                                                                                      ", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35990");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...", "#####aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa#####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35991");
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
    public void test35992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  575\\u0037200U\\", "500u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\U\\3200u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  575\\u0037200U\\" + "'", str2, "  575\\u0037200U\\");
    }

    @Test
    public void test35993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35993");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              hi!123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35994");
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
    public void test35995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                              11111                                ...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\" + "'", str1, "11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\");
    }

    @Test
    public void test35996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35996");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U", "                                 0023\\u0023\\u0023\\ U020\\u0020\\u0020\\u00", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" 61\\ 61\\ 61...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0... 61\\ 61\\ 61\\", "\\61\\61\\61\\61\\61\\61aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0... 61\\ 61\\ 61\\" + "'", str2, " 61\\ 61\\ 61...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0... 61\\ 61\\ 61\\");
    }

    @Test
    public void test35998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35998");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAAAA   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhhaaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhh" + "'", str3, "         ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAAAA   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhhaaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test35999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35999");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\U0069", "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test36000");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                                                                                                                                             ", (java.lang.CharSequence) "...3\\u23\\u23U6              c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

