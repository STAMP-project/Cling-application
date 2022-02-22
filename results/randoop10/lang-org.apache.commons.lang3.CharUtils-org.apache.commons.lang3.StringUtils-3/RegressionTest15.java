import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       " + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ");
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 60, "                                                 ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 ...        " + "'", str3, "                                                 ...        ");
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\u0030", "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0", (java.lang.CharSequence) "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 306, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", " 61\\ ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U0023                                            ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       22222\\U0023\\U00\\u0041\\U002322222", 92, '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U00\\u0041\\U002322222" + "'", str3, "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U00\\u0041\\U002322222");
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ", "...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("i!                                                                                   U0023                           ", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!                                                                                   U0023                           " + "'", str2, "i!                                                                                   U0023                           ");
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa");
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" 61");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n1");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                         \n\n1                                                    \n\n1                                  61\\", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("    \n     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "111111111aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...11111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 59 + "'", int1 == 59);
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n", 94, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...", "                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "61616161616161616161616161");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "                                           \\\\0033005c");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "                                                                                                        aaaaaaa     ", (int) ' ');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("  ......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u0023                                 6", strArray1, strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u0023                                 6" + "'", str8, "hi!1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u0023                                 6");
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("61                                         \n\n1                                         ", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("    61        61        61        61        61        61        61        61        61        61        61        61        61   ", 339, "                                                                                           U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U             " + "'", str3, "                                                                                           U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U             ");
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(" 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            " + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ");
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("23                                                                                     hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23                                                                                     hi!hi!hi!" + "'", str1, "23                                                                                     hi!hi!hi!");
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0\\u0020\\u00", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("400u\\00U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "400u\\00U\\3200U\\" + "'", str1, "400u\\00U\\3200U\\");
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                  \\U0023\\U00\\u0041\\U                                   ", "uuuuu61uuuuuuuuuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  \\U0023\\U00\\u0041\\U                                   " + "'", str2, "                                  \\U0023\\U00\\u0041\\U                                   ");
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5C11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "5C11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61                                         \n\n1", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", 50);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\4003", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\4003" + "'", str2, "\\4003");
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0", (java.lang.CharSequence) " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                        \\0033                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAA", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00", 44, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00" + "'", str3, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                              23\\u0023\\u0023\\u002   ", "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", (int) '3');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray6, strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("75", ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1", strArray13, strArray16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray6, strArray13);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222", strArray13, strArray24);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "75" + "'", str18, "75");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str20, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str21, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222" + "'", str25, "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222");
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" 61");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'i', 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                         75                                                          ", "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaa                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA                            " + "'", str1, "AAAA                            ");
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444", 44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("222222222222222222222222222222222222222222222U6                                          ", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "222222222222222222222222222222222222222222222U6                                          " + "'", str2, "222222222222222222222222222222222222222222222U6                                          ");
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                            AAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA" + "'", str1, "AAAAAAA");
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                      ..", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      .." + "'", str2, "                                                                                      ..");
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "10hi!10010hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 42, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        aaaaaaa      ", "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\n\n1                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32000\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32\\", "", 886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 297 + "'", int3 == 297);
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023    ...  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...       ", "11111111111111111111       111111111111111111111", 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...       " + "'", str3, "...       ");
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '3');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '3' + "'", char1 == '3');
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", str1, "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", "\n");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", strArray4, strArray14);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10hi!100" + "'", str6, "10hi!100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str15, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", '2', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3" + "'", str3, "u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3");
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("5u", (int) '1', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\u0055", " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                       AAAAAAAAAAAAA3200u\\A                                      ", 60);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0055" + "'", str4, "\\u0055");
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("i!                                                                                   U0023                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!                                                                                   U0023" + "'", str1, "i!                                                                                   U0023");
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("  2   ", "                                                  75", (int) (short) 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                 ...        ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("5c", "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("       aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa" + "'", str1, "aaaaaaa");
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 24, 77);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "1111111111111111111111111111111111111111111110u\\3000u\\3111111111111111111111111111111111111111111111", 39);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue('5');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("1111111111111111111111111111", 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0041                                                                                           ", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAu0033");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAu0033" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAu0033");
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("u003                                                ", "23\\u0023\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                  \\U0023\\U00\\u0041\\U                                   ", "61\\ 61\\ 61\\ 61\\ 61\\ 611111111...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...", "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("10hi!10010hi", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10010hi" + "'", str2, "10hi!10010hi");
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161", 54, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161" + "'", str3, "11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161");
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1111111111111111111111111111", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111" + "'", str2, "1111111111111111111111111111");
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("  \\U005C  ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\U005C  " + "'", str2, "  \\U005C  ");
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'U', 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86 + "'", int2 == 86);
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u0030\\\\\\\\", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 \\u0030\\\\\\\\                  " + "'", str2, "                 \\u0030\\\\\\\\                  ");
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61", "\\u0023                                                                                     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("   00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    " + "'", str2, "   00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ");
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "7");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", "11111", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 111 + "'", int1 == 111);
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", (int) '\r', 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666" + "'", str3, "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116", "a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", 98, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0000000000000000000000000000000000000000000000000000000", 20, "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000" + "'", str3, "0000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u0023                                                                                     hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023                                                                                     HI!HI!HI!" + "'", str1, "\\U0023                                                                                     HI!HI!HI!");
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('i', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                A\\u0023AAAAAAAAAAAAAa000u\\                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", "                                                                                                        ", 929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\u0035", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61                                         \n\n1                                         ", 92, '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3333361                                         \n\n1                                         " + "'", str3, "3333361                                         \n\n1                                         ");
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("      AAAA...", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA..." + "'", str2, "      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...");
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "      61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("AAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA..." + "'", str1, "AAAA...");
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61" + "'", str1, "61\\ 61\\ 61");
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                     ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", (int) '.', 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6", 306, "\n\n\n\n\n\n\n\n\n\n\\u0055                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   " + "'", str3, "\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   ");
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("###\n\\u002                                         \n\n1", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###\n\\u002                                         \n\n1" + "'", str2, "###\n\\u002                                         \n\n1");
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '5', '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '5' + "'", char2 == '5');
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                            ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", 189);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" 23", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 23" + "'", str2, " 23");
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("5c", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...                                                         ", "161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                         " + "'", str2, "...                                                         ");
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\16177777777777777777777777777", 57, 929);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           161\\161\\161\\161\\161\\16177777777777777777777777777" + "'", str3, "           161\\161\\161\\161\\161\\16177777777777777777777777777");
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "           161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           161\\161\\161\\161\\161\\16177777777777777777777777777" + "'", str1, "           161\\161\\161\\161\\161\\16177777777777777777777777777");
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("c5", "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("A\\u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A\\u0023AAAAAAAAAAAAA" + "'", str1, "A\\u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\\u0034", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0034                                                                                           " + "'", str2, "\\u0034                                                                                           ");
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("11111111111111111111111111111...", (int) 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11111111111111111111111111111..." + "'", str2, "11111111111111111111111111111...");
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1111111111111...", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020" + "'", str1, "\\u0020");
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "777777777777777777777777777777777777777727777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "\\u0023                                                                                                                                                  hi!hi!hi!", 90, 54);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61" + "'", str4, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61");
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0023\\u0023\\u0023\\u0023\\u0023\\u00", "11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                        aaaaaaa    ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 109 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaa", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ", "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa" + "'", str3, "aaaaaa");
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 32, " 61\\\\u0020                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                              23\\u0023\\u0023\\u0023\\U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("  2   ", "1111111     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...       ", "   U61    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       " + "'", str2, "...       ");
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("2  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("a         ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "23\\u0023\\u0023          3    23\\u0023\\u0023      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 77, "        75");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", str1, "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaa                             ", "23hi!hi!hi!                                                                          ", "", 62);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaa                             " + "'", str4, "aaaaaa                             ");
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('0');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 0, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("AAAA15AAAA", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA" + "'", str2, "AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA");
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u003 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U003 " + "'", str1, "\\U003 ");
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        char[] charArray9 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "61\\ 61\\61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\u0020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020" + "'", str1, "\\u0020");
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaa", "                                                       ", "                                        A0u0023AAAAAAAAAAAAA                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa" + "'", str3, "aaaaaa");
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "    61        61        615c    61        61        61", (java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "    61        61        615c    61        61        61" + "'", charSequence2, "    61        61        615c    61        61        61");
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "1111111...", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "1111111..." + "'", charSequence2, "1111111...");
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "222222222222222222222222222222222222222222222U6                                          aaaaaaaaaaaaaaa", "23\\u0023\\u0023        75023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                    \n                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 49, (int) 'U');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          ", "......");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "\\400326666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                             6u666u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                         75                                                          ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "75                                                          " + "'", str2, "75                                                          ");
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200uu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u0020", "                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200uu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u0020" + "'", str2, "\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200uu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u0020");
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("66666666666666666666666666666666666666666666666666666       22222\\U0023\\U00\\u0041\\U002322222", "1\\hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000", (int) '3');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......");
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\\u0032                                                                       ", "...111111111111111111111111111111111111111111111111111111111", "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0032                                                                       " + "'", str3, "\\u0032                                                                       ");
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", 43, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h" + "'", str3, "                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) " 61..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                      \\U0023\\U00\\u0041\\U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U00\\u0041\\U0023" + "'", str1, "\\U0023\\U00\\u0041\\U0023");
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "                                                                                                  61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str2, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("57");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "57" + "'", str1, "57");
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "uuuuuuuuuuuu                                  3200u", (java.lang.CharSequence) "\\1111111111111111111111111111u11111111111111111111111111110020");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "uuuuuuuuuuuu                                  3200u" + "'", charSequence2, "uuuuuuuuuuuu                                  3200u");
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAA     ", 61, "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str3, "AAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "                                                         \\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6", 54, "                                                                             136u66136u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6" + "'", str3, "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "61\n", "......");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", " 61\\\\u0020");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        char[] charArray11 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "41", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1\\hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("U6                                          ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U6                                          " + "'", str2, "U6                                          ");
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "10hi!10010hi!10010h\\400310hi!10010hi!10010hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "1\\U00234                                      \\U0023\\U00\\u00", (java.lang.CharSequence) "23\\U                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ", 929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16", "                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                                        aaaaaaa      ", "                                                                                                        aaaaaaa    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('3', 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", 297);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             " + "'", str2, "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\n\n\n\n\n1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\400326666666666666666666666666666666666666666666", (java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\u0068", "                                           \\\\0033005c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", " 11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("23hi!hi!hi!                                                                          ", "23\\u                                                                                      ", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                           \\u005                                            3200u", "u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           \\u005                                            3200u" + "'", str2, "                                           \\u005                                            3200u");
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", "a", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                        aaaaaaa     ", "\\u0055                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        aaaaaaa     " + "'", str2, "                                                                                                        aaaaaaa     ");
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                        aaaaaaa     ", "uuuuuuuuuuuu                                  3200u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        aaaaaaa     " + "'", str2, "                                                                                                        aaaaaaa     ");
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  \\\\0020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  \\\\0020" + "'", str1, "  \\\\0020");
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ", "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\u000a", "    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1111111111111111111111111111111111111111111113\\u0...", "\\      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAA", "...11111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0036", "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                    ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u" + "'", str1, "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555" + "'", str2, "5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555");
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ", 8, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             " + "'", str3, "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " 61..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6", "...11111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "23\\u                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                       61\n                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       61\n                       " + "'", str1, "                       61\n                       ");
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                    ", "\\u005c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "    3    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                            3200u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", 60, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str3, "0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                             ", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             " + "'", str2, "                                             ");
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("1111111", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111" + "'", str2, "1111111");
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 'A');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaa                                                 ", 94, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUaaaa                                                 " + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUaaaa                                                 ");
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", 94, 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  U6                                            ", 59, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("u 61..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u 61.." + "'", str1, "u 61..");
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aa                                          ", (java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 191 + "'", int2 == 191);
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (int) (byte) 10, '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "...111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " 61\\ 61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (byte) -1, "                                           \\\\0033005c");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "...h    h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...h    h..." + "'", str1, "...h    h...");
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                 2  ", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              2  " + "'", str2, "                                                                              2  ");
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                hi!", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...    ...", "");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("22222\\U0023\\U00\\u0041\\U002322222", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...    ..." + "'", str5, "...    ...");
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", "      \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                              23\\u0023\\u0023\\u002   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75" + "'", str3, "        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75");
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("5u", "                              23\\u0023\\u0023\\u002                                                       ", (int) 'A');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                     ", "0\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 32, " 61\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002" + "'", str3, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                      \\u0023\\u00\\u0041\\u0023", "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        char[] charArray9 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU..." + "'", str2, "...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...");
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("           161\\161\\161\\161\\161\\16177777777777777777777777777", 85, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", str1, "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '.');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '.' + "'", char2 == '.');
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "\\u0035");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0041", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "    61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " u004 " + "'", str3, " u004 ");
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\u0037", "\\u23\\u23\\u23\\u23\\u23\\u23\\u23                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                         \n\n1           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         \n\n1           " + "'", str1, "                                         \n\n1           ");
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("a", (int) 'U', 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "1111111111111111111111111111111111111111111110u\\3000u\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111110u\\3000u\\3111111111111111111111111111111111111111111111" + "'", str1, "1111111111111111111111111111111111111111111110u\\3000u\\3111111111111111111111111111111111111111111111");
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '0');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0030" + "'", str1, "\\u0030");
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                             23\\u0023\\u", (int) 'h', "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\u" + "'", str3, "61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\u");
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16", " 11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\U0023\\U002" + "'", str2, "23\\U0023\\U002");
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                             ", "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 5);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                             " + "'", str4, "                                             ");
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("    \n     ", "A000U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    \n     " + "'", str2, "    \n     ");
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("5c", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5c" + "'", str2, "5c");
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", "   ...                                                                                           ", "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("    3    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    3    " + "'", str1, "    3    ");
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("61u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u" + "'", str2, "61u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u");
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("023\\u0023aaaaaaa", (int) '\\', '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "023\\u0023aaaaaaa2222222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str3, "023\\u0023aaaaaaa2222222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" \\u003 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u003" + "'", str1, "\\u003");
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("a000u\\", "a000u\\", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\\u0032                                                                       ", "                                                                                      ..", 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str4, "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", "\r");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\n', (int) 'u', 35);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u005c", strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "11111111111111111111       111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                             23\\u0023\\u", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                 " + "'", str2, "                                                                                 ");
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\40032");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\40032" + "'", str1, "\\40032");
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\u005c\\u00", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 929, 104);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005c\\u001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "\\u005c\\u001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                        ", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'u' + "'", char1 == 'u');
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\u003 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "                        ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                      ..", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUaaaa                                                 ", "u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                      .." + "'", str3, "                                                                                      ..");
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", "\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("   2  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   2 " + "'", str1, "   2 ");
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", " 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "1\\hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("   2 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   2" + "'", str1, "   2");
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", "      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...u0020u0020u0020u0020u0020u0020u0020u0020u0020...", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        \\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("1 61 6161 61 6161 61 6161 6", 52, (int) 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                         75                                                          ", "", "20\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                         75                                                          " + "'", str3, "                                                         75                                                          ");
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("61\\ 61\\61", " 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", "23\\u0023\\u0023          3    23\\u0023\\u0023      ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                A\\u0023AAAAAAAAAAAAAa000u\\                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("    3    ", "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\\0033", "u0023\\u002u0023\\u002u0023\\u002u0                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0033" + "'", str2, "\\0033");
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111                                                                   ", "       aaaaaaa          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\u0037");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0037" + "'", str1, "\\u0037");
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   ", (int) '\\', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...                                                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "UUUU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                         " + "'", str3, "...                                                         ");
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                 \\u0030\\\\\\\\                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 \\u0030\\\\\\\\                  " + "'", str1, "                 \\u0030\\\\\\\\                  ");
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("41", "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "    61    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaa", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa" + "'", str2, "aaaaaaa");
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('7', 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ", "  2   ", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "33333333333333333333333333333\\40032333333333333333333333333333333");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 0, "  \\\\0020");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 115, "\\400326666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\\\400326666666666666666666666666" + "'", str3, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\\\400326666666666666666666666666");
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        char[] charArray9 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAA", "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", '\\', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U0023#U0023#U0023#U0023#U0023#U0023#U0023" + "'", str3, "U0023#U0023#U0023#U0023#U0023#U0023#U0023");
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u005c\\u0", "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", (int) '3', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\u0041", "    16        16        16        16        16        16        16        16        16        16        16        16        16    ", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("U0023#U0023#U0023#U0023#U0023#U0023#U0023", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023#U0023#U0023#U0023#U0023#U0023#U0023      " + "'", str2, "U0023#U0023#U0023#U0023#U0023#U0023#U0023      ");
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("U0023\\U0023\\U\\4003U0023\\U0023\\U0", "aaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("    61    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61" + "'", str1, "61");
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                 ", " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("U0023\\U00\\u0041\\U00232222", "3", " 61");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "       aaaaaaa          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("###\n\\u002                                         \n\n1           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###\n\\u002                                         \n\n1" + "'", str1, "###\n\\u002                                         \n\n1");
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116", "75                                                          ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\U0023\\U00\\u0041\\U", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", (int) '\r');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "                       61\n                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA" + "'", str2, "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("3", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUU                                                                                                        aaaaaaa     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1111111      ", 80, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("3333361                                         \n\n1                                         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                 ...        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("h", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("    \n     ", "...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    \n     " + "'", str2, "    \n     ");
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "75                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75                                                          " + "'", str1, "75                                                          ");
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...", 508, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("      \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '3');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaa\\\\\\", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "\\u0030\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str2, "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                       ", 103, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                       " + "'", str3, "                                                                                                       ");
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        char[] charArray9 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u00", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "161\\ 61\\ 6161\\ 61\\ 6161\\ 6", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...111111111111111111111111111111111111111111111111111111111" + "'", str1, "...111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61        61        61        61        61        61        61        61        61        61        61        61        61", "       aaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                      A\\u0023AAAAAAAAAAAAA                                       ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("###\n\\u002                                         \n\n1", 30, 86);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    \n\n1" + "'", str3, "                    \n\n1");
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "00U\\3200U\\3200U\\3200U\\3200U\\3200", (java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\" + "'", str1, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\");
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A000U\\", (int) (byte) 0, "AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000U\\" + "'", str3, "A000U\\");
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a", "\\u0023                                                                                     hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                             6u666u", "UUUUUUUUUUUUUUU0023UUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             6u666u" + "'", str2, "                                                                             6u666u");
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\05c0000000000000000000000000000000000000000000000000", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("A0u0023AAAAAAAAAAAAA", "66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", 566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "23\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" 61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 29, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, " 61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u002e", '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u002e" + "'", str2, "\\u002e");
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("23\\u0023\\u0023\\u002", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u002" + "'", str2, "23\\u0023\\u0023\\u002");
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1 61 6161 61 6161 61 6161 6", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                     " + "'", str2, "                                                                                                                     ");
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\16177777777777777777777777777", "                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", "\\u0023                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\16177777777777777777777777777" + "'", str3, "161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\16177777777777777777777777777");
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                         u0023\\u002u0023\\u002u0023\\u002u0", "                                         \n\n1                                                    \n\n1     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 5, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("i!                                                                                   ", 11, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!                                                                                   " + "'", str3, "i!                                                                                   ");
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ", "                              23\\u0023\\u0023\\u002   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("22222\\U0023\\U00\\u0041\\U002322222", "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U00\\u0041\\U002322222", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "   2  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...", (java.lang.CharSequence) "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "1111111111111111111111111111111111111111111113\\u0..." + "'", charSequence2, "1111111111111111111111111111111111111111111113\\u0...");
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AAAAAAA      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("000000000000000000000000000000...                                                         ", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "A\\U0023AAAAAAAAAAAAAA000U\\");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("222222222222222222222222222222222222222222222U6                                          aaaaaaaaaaaaaaa", "...h    h...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                              23\\u0023\\u0023\\u002   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u002" + "'", str1, "23\\u0023\\u0023\\u002");
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                           \\u005                                            3200u", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\U0075", "                                                                                                 2  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111", (int) (byte) 1, "                                                                                                        aaaaaaa    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111");
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("5c11111111111111111111111111 61\\ 111111111111111111111111111", 57, 98);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5c11111111111111111111111111 61\\ 111111111111111111111111111" + "'", str3, "5c11111111111111111111111111 61\\ 111111111111111111111111111");
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaa                            ", "23\\u", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  " + "'", str2, "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", " 61.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                               \\u0035", "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("222222222222222222222222222222222222222222222U6                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "222222222222222222222222222222222222222222222u6                                          " + "'", str1, "222222222222222222222222222222222222222222222u6                                          ");
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("23\\U                                                                                             ", "                                  AAAAAAAAAAAAA3200u\\A                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\" + "'", str1, "                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", " 61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 6);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'i', 98, 81);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068", "61                                         \n\n1                                         ", "AAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8" + "'", str3, "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8");
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("5C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5C" + "'", str1, "5C");
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("002300230023002300230023002300230a000u\\002300230023002300230023002300230", "5C", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("2", " ", 0);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("777777777777777777777777777777777777777727777777777777777777777777777777777777777", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("61                                         \n\n1", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("11111", "................U0023                                            ................", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11111" + "'", str3, "11111");
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\U0075");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("U6                                          ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U6                                          " + "'", str2, "U6                                          ");
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("      61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", "                                                 a                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 a                                                  " + "'", str2, "                                                 a                                                  ");
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "002300230023002300230023002300230a000u\\002300230023002300230023002300230", (java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "002300230023002300230023002300230a000u\\002300230023002300230023002300230" + "'", charSequence2, "002300230023002300230023002300230a000u\\002300230023002300230023002300230");
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "10hi!10010hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61", (java.lang.CharSequence) "\\u0023                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                       ", "AAAAAAA     ", 90);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("             ", "\\U0023\\U00\\u0041\\U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666iiiiiiiiiii", "  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "000000000000000000000000000000...                                                         ", 886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str1, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("61uuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuu", (int) '1', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uu" + "'", str3, "uu");
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161" + "'", str1, "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("61\\ 61\\61", "###\n###", "\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32", 62);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61\\ 61\\61" + "'", str4, "61\\ 61\\61");
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...u0020u0020u0020u0020u0020u0020u0020u0020u0020...", 64, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020..." + "'", str3, "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...");
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "111111111111111111111U6111111111111111111111");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005c\\u00", "U61", (int) 'a');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "       ");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", strArray8, strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                     ", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str14, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str15, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                     " + "'", str16, "                                                                                     ");
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                       ", " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", "", (int) '6');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\\u00c\\u00");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6..." + "'", str7, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...");
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                A\\u0023AAAAAAAAAAAAAa000u\\                                 ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2");
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                             136u66136u", (int) (byte) 1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                             136u66136u" + "'", str3, "                                                                             136u66136u");
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaa\\\\\\", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\U002322222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                   " + "'", str2, "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                   ");
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("    ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\u0033");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0033" + "'", str1, "\\u0033");
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "   2", "               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray4, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "    3    ", (int) '\r', 339);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0\\u0020\\u00", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 20, '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33333333333333333333" + "'", str3, "33333333333333333333");
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 6\\\\u0020", " 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    61        61        61        61        61        61        61        61        61        61        61        61        61   ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("002300230023002300230023002300230a000u\\002300230023002300230023002300230", "                                         uuuuuuuuuuuu                                  3200u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "002300230023002300230023002300230a000u\\002300230023002300230023002300230" + "'", str2, "002300230023002300230023002300230a000u\\002300230023002300230023002300230");
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" 61UUUUUUUUUU", "6666\r\r\r\r\r\r\r", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "0000000000000000000000000000000000000000000000000000000", (int) '7');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u", "\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u" + "'", str2, "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\\U002322222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U002322222" + "'", str1, "\\U002322222");
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", "16U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\U0055", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                 2  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "61u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                     ", "      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("u003                                                u0023u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                                                                                             hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u003                                                u0023u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                                                                                             hi!hi!hi!" + "'", str1, "u003                                                u0023u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                                                                                             hi!hi!hi!");
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "  ......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                  AAAAAAAAAAAAA3200u\\A                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  AAAAAAAAAAAAA3200u\\A                                 " + "'", str1, "                                  AAAAAAAAAAAAA3200u\\A                                 ");
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("10hi!10010hi!10010h\\400310hi!10010hi!10010hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi!10010hi!10010h\\400310hi!10010hi!10010hi" + "'", str1, "10hi!10010hi!10010h\\400310hi!10010hi!10010hi");
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 81 + "'", int1 == 81);
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "u                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0000000000000000U00232222200000000000000000", "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000U00232222200000000000000000" + "'", str2, "0000000000000000U00232222200000000000000000");
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\u0035", "\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                  61", "                                           \\\\0033005c", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  61" + "'", str3, "                                                                                                  61");
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "777777777777777777777777777777777777777727777777777777777777777777777777777777777", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("111111111aaaa", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

