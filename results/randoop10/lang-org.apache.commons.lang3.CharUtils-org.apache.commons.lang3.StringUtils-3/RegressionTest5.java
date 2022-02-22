import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" 61\\ 61\\61", 117, "u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, " 61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaa", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("U0023                                            ", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0023\\u0023\\u0023\\u0023\\u0023\\u00", (int) 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\n\n1", "\\U005C");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n1" + "'", str2, "\n\n1");
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...111111111111111111111111111111111111111111111111111111111", 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("U6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U6" + "'", str1, "U6");
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("    61        61        615c    61        61        61", "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                        a000u\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("23hi!hi!hi!", "U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23hi!hi!hi!" + "'", str2, "23hi!hi!hi!");
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\r", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '\r');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r" + "'", str1, "\r");
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6" + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...    ...", (int) 'A', 64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 48, "U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005" + "'", str2, "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                       aaaaaaaaaaaaa\\\\\\", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", (java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("22222\\U0023\\U00\\u0041\\U002322222", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U00\\u0041\\U002322222" + "'", str2, "U0023\\U00\\u0041\\U002322222");
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("       aaaaaaa", "aaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   2  ", "                                         \n\n1                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 98, "75");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575" + "'", str3, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "U6", "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("10hi!100", "\\u0061");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '6' + "'", char1 == '6');
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\400326666666666666666666666666666666666666666666", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                 a                                                  ", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("A\\u0023AAAAAAAAAAAAAa000u\\", (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575", "23                                                                                     hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575" + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", "        75                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " 61\\\\u0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("             ", "0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("u", "u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u" + "'", str2, "u");
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("               ", "aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", 92);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A\\u0023AAAAAAAAAAAAA", "61\\ 61\\ 61", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A0u0023AAAAAAAAAAAAA" + "'", str3, "A0u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111110u\\3000u\\3111111111111111111111111111111111111111111111" + "'", str1, "1111111111111111111111111111111111111111111110u\\3000u\\3111111111111111111111111111111111111111111111");
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\u0041", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "\n\n1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "U6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('A');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 0, "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("             u0023\\u002u0023\\u002u0023\\u002u0", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         u0023\\u002u0023\\u002u0023\\u002u0" + "'", str2, "                                                         u0023\\u002u0023\\u002u0023\\u002u0");
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str1, "0023\\u0023\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1111111      ", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                        aaaaaaa     ", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                                  61", "\\u003");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\u000d", "23                                                                                     hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaa                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\u000a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u000a" + "'", str1, "\\u000a");
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("23                                               ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("610000000000000000000000000000000000000000000000000                                  0auu0", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "A0u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...", "\\4003");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ..." + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...");
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023" + "'", str2, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023");
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("             ", "\\u0055");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             " + "'", str2, "             ");
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", '3');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("41", "    61        61        61        61        61        61        61        61        61        61        61        61        61   ", (int) '5');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) '0', 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111", 85, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111");
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" 61\\\\u0020", "\n\n1", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\\\u0020" + "'", str3, " 61\\\\u0020");
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) 'U');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U" + "'", str1, "U");
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "23\\u0023\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa                             ", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", "23                                                                                     hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6" + "'", str2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("1111111111111111111111111111111111111111111113\\u0...", "                                         \n\n1                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111113\\u0..." + "'", str2, "1111111111111111111111111111111111111111111113\\u0...");
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", (java.lang.CharSequence) "...                          ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\" + "'", charSequence2, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                               \\u0035", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", (int) '2');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", '0');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                        ", (java.lang.CharSequence) " 61\\ 61\\61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                    ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                        aaaaaaa     ", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("        75                                                                                                           ", "23\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6" + "'", str1, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6");
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", "\\40032");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str1, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\u0041", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("610000000000000000000000000000000000000000000000000                                  0auu0", '3');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "610000000000000000000000000000000000000000000000000                                  0auu0" + "'", str2, "610000000000000000000000000000000000000000000000000                                  0auu0");
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("5", "", "23\\u0023\\u");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               " + "'", str2, "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ");
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) '4', " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ " + "'", str3, " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                           U", "61616161616161616161616161");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", (java.lang.CharSequence) "  ......  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) " 61\\ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 61\\ " + "'", str1, " 61\\ ");
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("1111111", " 61\\ 61\\61", "                                       aaaaaaaaaaaaa\\\\\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111" + "'", str3, "1111111");
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("     \\U0023\\U00\\u0041\\U0023     ", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     \\U0023\\U00\\u0041\\U0023     " + "'", str2, "     \\U0023\\U00\\u0041\\U0023     ");
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\n\n\n\n\n1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "A0u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A0u0023AAAAAAAAAAAAA" + "'", str1, "A0u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", 'u');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '2' + "'", char2 == '2');
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '\n');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10hi!100" + "'", str4, "10hi!100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10hi!100" + "'", str5, "10hi!100");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '0', "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6", "       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("2                                                                                                                    ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2                                                                                                                    " + "'", str2, "2                                                                                                                    ");
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u003", "a         ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", "      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("    61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\r", "...    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r" + "'", str2, "\r");
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents(charSequence0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str2, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       " + "'", str2, "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                 ..." + "'", str1, "                                                 ...");
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!", 0, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u0032", " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("23                                                                                     hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23                                                                                     hi!hi!hi!" + "'", str1, "23                                                                                     hi!hi!hi!");
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) 'a', "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\");
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "57");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "57" + "'", str1, "57");
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u005c\\u0", (int) 'U', (int) '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", "\\u0075", (int) (byte) 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                  75");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str5, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("61616161616161616161616161", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10hi!100" + "'", str5, "10hi!100");
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006" + "'", str1, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006");
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", "U61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2" + "'", str1, "2");
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "" + "'", charSequence2, "");
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0023\\U0023\\U0023\\U0023\\U0023\\U00", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str2, "0023\\U0023\\U0023\\U0023\\U0023\\U00");
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('3');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0033" + "'", str1, "\\u0033");
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('0');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("1111111     ", (int) '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111     " + "'", str2, "1111111     ");
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                        a000u\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                            3200u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        a000u\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "                                        a000u\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" 61\\\\u0020", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u0023                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str1, "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("57");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "57" + "'", str1, "57");
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("    61        61        61        61        61        61        61        61        61        61        61        61        61   ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      61        61        61        61        61        61        61        61        61        61        61        61   " + "'", str2, "      61        61        61        61        61        61        61        61        61        61        61        61   ");
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "A0u0023AAAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('5');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("    61        61        615c    61        61        61", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                           U");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 92 + "'", int1 == 92);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "u0023                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("        75", (int) '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("61", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("A000U\\", "1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("A0u0023AAAAAAAAAAAAA", "61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0u0023AAAAAAAAAAAAA" + "'", str2, "A0u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                             ", "\\u0020");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" 61\\\\u0020", '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 6\\\\u0020" + "'", str2, " 6\\\\u0020");
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("      ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      " + "'", str2, "      ");
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray5, strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("\r", strArray5, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "23                                                                                     hi!hi!hi!", 52, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r" + "'", str15, "\r");
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("5c", "                                           \\u005c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("61\n", "4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('A', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("A000U\\", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000U\\" + "'", str2, "A000U\\");
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", charSequence2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\n", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "2                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       " + "'", str2, "                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ");
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...", "aaaaaaa      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0033", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0033" + "'", str2, "\\u0033");
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 104);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                      \\U0023\\U00\\u0041\\U0023", strArray3, strArray11);
        java.lang.Class<?> wildcardClass14 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                      \\U0023\\U00\\u0041\\U0023" + "'", str13, "                                      \\U0023\\U00\\u0041\\U0023");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "h", (java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "h" + "'", charSequence2, "h");
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("u0023\\u002u0023\\u002u0023\\u002u0", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111113\\u0..." + "'", str1, "1111111111111111111111111111111111111111111113\\u0...");
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("u", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 81, 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str4, "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("U0023\\U00\\u0041\\U002322222", "610000000000000000000000000000000000000000000000000                                  0auu0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U00\\u0041\\U002322222" + "'", str2, "U0023\\U00\\u0041\\U002322222");
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '6', 'A');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '6' + "'", char2 == '6');
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('0');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 0, 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str4, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                           \\u005c", "               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "23\\U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "u61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u005c\\u00", "5");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u00c\\u00" + "'", str2, "\\u00c\\u00");
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "1111111111111111111111111111111111111111111113\\u0...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\4003", "\\u0041                                                                                           ", "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\4003" + "'", str4, "\\4003");
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0055", 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', '5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("...                          ...", 'h');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '.' + "'", char2 == '.');
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "...                          ...", (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                            3200u", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '6', '5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '6' + "'", char2 == '6');
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("1111111     ", " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "      61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      61        61        61        61        61        61        61        61        61        61        61        61   " + "'", str1, "      61        61        61        61        61        61        61        61        61        61        61        61   ");
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "1111111      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u0061", "57", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "2                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character a is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "  2   ", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ", 28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" 6\\\\u0020", "\\u0055");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\u0041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("U6", "", 4, (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U6" + "'", str4, "U6");
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('h');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                        aaaaaaa", " 61\\\\u0020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        aaaaaaa" + "'", str2, "                                                                                                        aaaaaaa");
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue('0');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('6');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("2                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2                                                                                                                    " + "'", str1, "2                                                                                                                    ");
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", "c5", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "    61    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("5700u\\", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("16U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16U" + "'", str1, "16U");
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('6');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('6');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6" + "'", str1, "6");
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("23hi!hi!hi!", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "23hi!hi!hi!" + "'", str6, "23hi!hi!hi!");
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("16U", "", 0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                hi!", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                       ", (int) (short) 1, "...                          ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                       " + "'", str3, "                                                       ");
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100" + "'", str2, "100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100");
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", "\\40032", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       " + "'", str3, "                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ");
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023", "                                                                                                    ", (int) (byte) 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0020", strArray4, strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0020" + "'", str10, "\\u0020");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10hi!100" + "'", str11, "10hi!100");
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", "\\u0036");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                               \\u0035", "", "\n\n\n\n\n1");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "U0023\\U00\\u0041\\U002322222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\4003", 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaa      ", " 61\\ ", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                           \\u005c", "", "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           \\u005c" + "'", str3, "                                           \\u005c");
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0075", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "hi!", (int) ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach(" 61", strArray4, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 61" + "'", str9, " 61");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str10, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", "                                      \\U0023\\U00\\u0041\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16" + "'", str2, "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16");
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "1", "", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str4, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\u0033", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 1, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAu0033" + "'", str4, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAu0033");
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str3, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", "u61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  " + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...", (java.lang.CharSequence) "\\u005c\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77 + "'", int2 == 77);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                             ", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str1, "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('U');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    " + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "    61        61        61        61        61        61        61        61        61        61        61        61        61    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                 a                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ", "\n\n1", "A\\u0023AAAAAAAAAAAAAa000u\\");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("23                                                                                     hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23                                                                                     hi!hi!hi!" + "'", str1, "23                                                                                     hi!hi!hi!");
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("    61        61        615c    61        61        61", 6, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    61        61        615c    61        61        61" + "'", str3, "    61        61        615c    61        61        61");
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c", "U61", (int) '\r');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("   2  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                  61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                  61" + "'", str1, "                                                                                                  61");
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '1');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("        75                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75" + "'", str1, "75");
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                     ", "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                     " + "'", str3, "                                                                                     ");
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", 55, "...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  " + "'", str3, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ");
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("5", " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", (int) '3');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuu                                  3200u" + "'", str2, "uuuuuuuuuuuu                                  3200u");
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("       ", (int) (short) -1, (int) '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       " + "'", str3, "       ");
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\\u000d", (java.lang.CharSequence) "\\u00c\\u00");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\u000d" + "'", charSequence2, "\\u000d");
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('5');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("1111111", (int) (short) 1, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11111" + "'", str3, "11111");
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "161\\ 61\\ 6161\\ 61\\ 6161\\ 6" + "'", str2, "161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "               ", "\\u005c\\u0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str3, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#", "57");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\u0055                                            ", "                                                                                     ", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                  75");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) '3', "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "61uuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\n\n\n\n\n1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" 61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('.');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0033", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                        aaaaaaa     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", (int) (byte) 100, "                                                 ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          " + "'", str3, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          ");
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                         u0023\\u002u0023\\u002u0023\\u002u0", "\\u0034");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         u0023\\u002u0023\\u002u0023\\u002u0" + "'", str2, "                                                         u0023\\u002u0023\\u002u0023\\u002u0");
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", "22222\\U0023\\U00\\u0041\\U002322222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\" + "'", str2, "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (int) '\n', 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111" + "'", str3, "1111111111111");
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', '\\');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005" + "'", str1, "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ", (int) 'h', (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", '\r', '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " 61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 117 + "'", int1 == 117);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", (int) '4', 64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa" + "'", str3, "aaaa");
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        char[] charArray6 = new char[] { ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaa", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\\u0035");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0035" + "'", str1, "\\u0035");
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\u0055");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...    ..." + "'", str1, "...    ...");
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100" + "'", str1, "100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100");
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "61\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "       aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                        aaaaaaa    ", "u0023\\u002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        aaaaaaa    " + "'", str2, "                                                                                                        aaaaaaa    ");
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("57", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0034" + "'", str1, "\\u0034");
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\r", "23hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str1, "0023\\U0023\\U0023\\U0023\\U0023\\U00");
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("u0023\\u002", "                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023\\u002" + "'", str2, "u0023\\u002");
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###" + "'", str1, "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '0', 92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  " + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ");
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", "\\u0023                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...                          ...", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 85, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757" + "'", str3, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757");
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                        a000u\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "u0023                                            ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 60);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                        aaaaaaa", "\\u0033");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('0');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\r');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u0055", "#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0055" + "'", str2, "\\u0055");
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                         \n\n1                                         ", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         \n\n1           " + "'", str2, "                                         \n\n1           ");
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u0036", (java.lang.CharSequence) "                                                                                                        aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("16U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16u" + "'", str1, "16u");
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("23hi!hi!hi!", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23hi!hi!hi!                                                                          " + "'", str2, "23hi!hi!hi!                                                                          ");
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str1, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaa", '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa" + "'", str2, "aaaa");
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'A');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 6, 86);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###" + "'", str2, "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\u000d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u000d" + "'", str1, "\\u000d");
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", "uuuuuuuuuuuu                                  3200u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        char[] charArray5 = new char[] { ' ' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", "1111111     ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\\u000a", "\\u0033");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u000a" + "'", str2, "\\u000a");
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaa", (int) '6', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa" + "'", str3, "aaaaaaa");
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("a000u\\", 77, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0020", 'U');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 43, 117);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 43");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("u61", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61        61        61        61        61        61        61        61        61        61        61        61        61", "1111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("75", ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1", strArray3, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '.', 48, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 48");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "75" + "'", str8, "75");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", "...h    h...", "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666" + "'", str3, "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666");
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006", (int) (byte) 1, (int) 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061..." + "'", str3, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...");
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("a", "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          " + "'", str1, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '6');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '6' + "'", char1 == '6');
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                       aaaaaaaaaaaaa\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       aaaaaaaaaaaaa\\\\\\" + "'", str1, "                                       aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("             u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                         \n\n1           ", "", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAu0033", "                                        a000u\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\40032", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  " + "'", str2, "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  ");
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#", "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 10, 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\u005c\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005c\\u0" + "'", str1, "\\u005c\\u0");
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('h');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "23                                                                                     hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23                                                                                     hi!hi!hi!" + "'", str1, "23                                                                                     hi!hi!hi!");
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '3', (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\400326666666666666666666666666666666666666666666", "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", (java.lang.CharSequence) "23\\u0023\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 136 + "'", int2 == 136);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("610000000000000000000000000000000000000000000000000                                  0auu0", (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (java.lang.Object[]) strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("1111111     ", strArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("11111", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10hi!100" + "'", str10, "10hi!100");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10hi!100" + "'", str12, "10hi!100");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("             u0023\\u002u0023\\u002u0023\\u002u0", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             u0023\\u002u0023\\u002u0023\\u002u0" + "'", str2, "             u0023\\u002u0023\\u002u0023\\u002u0");
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("61\n", 60, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u0036", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 \\u0036                                                                 " + "'", str2, "                                                                 \\u0036                                                                 ");
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" 6\\\\u0020", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (int) '.', "23                                               ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("        75                                                                                                           ", 52, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        75                                                                                                           " + "'", str3, "        75                                                                                                           ");
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", '3', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002" + "'", str3, "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002");
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (int) '\\');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str6, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 1, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str2, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0023", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023" + "'", str2, "0023");
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\u003");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("1111111111111", "16u", (int) '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111" + "'", str3, "1111111111111");
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "\\40032", (int) '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032" + "'", str3, "\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032");
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("57", (int) (byte) 1, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7" + "'", str3, "7");
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("61\n", "......");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('6');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("75");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75" + "'", str1, "75");
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\u0055                                            ", "\\400326666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0055                                            " + "'", str2, "\\u0055                                            ");
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', (int) '\\', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\r', 89, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 89");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("......", '1');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '1');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "......" + "'", str4, "......");
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("u61", "6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ..." + "'", str1, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...");
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("23\\u0023\\u", (int) '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444423\\u0023\\u444444444444444444444" + "'", str3, "44444444444444444444423\\u0023\\u444444444444444444444");
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  " + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ");
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\u0023", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023" + "'", str2, "\\u0023");
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...", "     \\U0023\\U00\\u0041\\U0023     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\\u0020", "aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020" + "'", str2, "\\u0020");
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100", 'u');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\n", "", (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u005c\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\u0041                                                                                           ", "                                                                                                        aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '1');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                     " + "'", str3, "                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                                     " + "'", str5, "                                                                                                                     ");
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("......", 117, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str3, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("61\n", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 61\n" + "'", str2, "                                                 61\n");
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "                                             ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("41", strArray4, strArray7);
        java.lang.String[] strArray9 = null;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("57", strArray7, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "41" + "'", str8, "41");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "57" + "'", str10, "57");
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 52, "      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                 ...", "    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\u00c\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...    ...", " 61\\ 61\\61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 98 + "'", int1 == 98);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", 3, 136);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ " + "'", str3, " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\" + "'", str1, "61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("     \\U0023\\U00\\u0041\\U0023     ", "16u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     \\U0023\\U00\\u0041\\U0023     " + "'", str2, "     \\U0023\\U00\\u0041\\U0023     ");
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0023\\u0023\\u0023\\u0023\\u0023\\u00", "1111111     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "23hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U6                                          ", "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                 \\u0036                                                                 ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("c5", "                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c5" + "'", str2, "c5");
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\n1", "1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("U6", 5, (int) '3');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '2', 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                       aaaaaaaaaaaaa\\\\\\", (java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", (int) '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666" + "'", str2, "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666");
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("1111111111111111111111111111111111111111111110u\\3000u\\3111111111111111111111111111111111111111111111", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", "aaaaaaaaaaaaa\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  " + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("U0023\\U00\\u0041\\U002322222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0023\\U00\\u0041\\U002322222" + "'", str1, "U0023\\U00\\u0041\\U002322222");
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...", 117, "                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061..." + "'", str3, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...");
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                           \\u005c", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('3');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3" + "'", str1, "3");
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("A0u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A0u0023AAAAAAAAAAAAA" + "'", str1, "A0u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('3');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0023\\u0023\\u0023\\u0023\\u0023\\u00", (int) '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str2, "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "\\u0075");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("U61", strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("2", "", 100);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray8, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1", strArray4, strArray8);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int20 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!", strArray19);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.startsWithAny("\\U0023", strArray19);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("0023\\U0023\\U0023\\U0023\\U0023\\U00", strArray4, strArray19);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str14, "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str24, "0023\\U0023\\U0023\\U0023\\U0023\\U00");
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("U61", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U61" + "'", str2, "U61");
    }
}

