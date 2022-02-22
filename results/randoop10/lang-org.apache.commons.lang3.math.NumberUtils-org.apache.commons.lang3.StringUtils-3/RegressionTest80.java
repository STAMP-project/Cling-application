import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest80 {

    public static boolean debug = false;

    @Test
    public void test40001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                   ...", "AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a44444444444444444444...444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                     aaaa0aaaaa   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     AAAA0AAAAA   " + "'", str1, "                     AAAA0AAAAA   ");
    }

    @Test
    public void test40004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("      a         a         a         a         a                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa" + "'", str1, "aaaaa");
    }

    @Test
    public void test40006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40006");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("####################################...####################################...####################################...####################################...                                     100.0                                                     aaaa                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", 561, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaa...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaa...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
    }

    @Test
    public void test40008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40008");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("true-1.       ...97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40009");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1000");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt", 173);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("44444444444444444444444a", "aaaaa0aaaa                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40012");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa     ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) " 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40014");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444440TRUE-1.009...", 817, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test40015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                     aaaa0aaaaa                     ", 349, 841);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     aaaa0aaaaa                     " + "'", str3, "                     aaaa0aaaaa                     ");
    }

    @Test
    public void test40016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40016");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test40017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40017");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40018");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("100.0###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0##" + "'", str1, "100.0##");
    }

    @Test
    public void test40019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40019");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 191, (long) 136);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test40020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40020");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                  a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A a                                                                                                                                                                                                                                                                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40022");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       0", ' ');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test40023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40023");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("......4444444...4444444...4444444.....", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444440aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "790041-eurt044410040", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test40024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40024");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                      aaaa 0 aaaaa               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaa" + "'", str1, "aaaa0aaaaa");
    }

    @Test
    public void test40025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44...7900.1-eurt04444444444444444444444444444444444...444", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   1000    .         .         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   1000    .         .         " + "'", str2, "   1000    .         .         ");
    }

    @Test
    public void test40029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40029");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0true-1.0              ...", "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40030");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.79aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.1-eurtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA4444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40031");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
    }

    @Test
    public void test40032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40033");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################", "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40034");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...##############################################......##############################################...AE444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40035");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 30.0f, (double) 113.0f, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test40036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40037");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4             ", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0tr", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "             " + "'", str5, "             ");
    }

    @Test
    public void test40038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40039");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "TRUE-1.0097.0", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "true............44444444444444444444444444444444444444444440true-1.0097.a44444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097...", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 14 + "'", int19 == 14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 62 + "'", int22 == 62);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test40040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40040");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", "0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444...Aa4a4a4a444444444444444444444444", 245);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "                       4a4444444444444444444444...4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "    A     .7900.1-eurt0444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A     .7900.1-eurt0444444444444444444..." + "'", str2, "    A     .7900.1-eurt0444444444444444444...");
    }

    @Test
    public void test40043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40043");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 " + "'", str1, "                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ");
    }

    @Test
    public void test40044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40045");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444..974");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test40046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40046");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ", strArray5, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", strArray5);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               " + "'", str9, "                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test40047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("ue", "44444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40048");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                               aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......", "...t0444444444444444444444444444", 541);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40049");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test40050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40050");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("true-1.  97", (int) (byte) 0, "...........................................true-97...........................................true-97................................................................................true-97...........................................true-97......................................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1.  97" + "'", str3, "true-1.  97");
    }

    @Test
    public void test40051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40051");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40052");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4A4 4rt4004.479004.414-4eurt4004.479004.414-4eurt4004.479004.414-4eurt4", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444...4444444...4444444...4...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40055");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0", 257);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40056");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) ".7900.1-eu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 290 + "'", int2 == 290);
    }

    @Test
    public void test40057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40057");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("        a                     44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA444444444", "0aaaaa    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        a                     44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "        a                     44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test40058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444", "true-1.00true-1.97.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444" + "'", str2, "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test40059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                                                                                                             Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0                                                                                                                                                                              ", "...44                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                             Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                             Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0                                                                                                                                                                              ");
    }

    @Test
    public void test40060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444                  44444a4444                 ", 982, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444444444                  44444a4444                 " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444444444                  44444a4444                 ");
    }

    @Test
    public void test40062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40062");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444A44444", "0");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, ' ', 891, 841);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00tr A", (java.lang.Object[]) strArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444...444444           aaaaaaaaaaa", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444A44444" + "'", str7, "4444A44444");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4444A44444" + "'", str14, "4444A44444");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test40063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40063");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                          " + "'", str1, "                                          ");
    }

    @Test
    public void test40064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40064");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(181L, 73L, (long) 16);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 181L + "'", long3 == 181L);
    }

    @Test
    public void test40065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40065");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", "                                                                                                aaaa");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray9, strArray12);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     A    44", strArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("                                         AAAA0AAAA", strArray4, strArray9);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("                     44                                                                                                                                                                                                                                                                                                                                                                                                               a0a                                          a0a                                          a0a...       ", strArray4, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0" + "'", str13, "100.0");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                         AAAA0AAAA" + "'", str17, "                                         AAAA0AAAA");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test40066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40066");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test40067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40067");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                               a                        44444444444444444444                        ...                        444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               a                        44444444444444444444                        ...                        44444444444444444444444444444444444444444444" + "'", str1, "                                               a                        44444444444444444444                        ...                        44444444444444444444444444444444444444444444");
    }

    @Test
    public void test40068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "AAAAAA0AAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAA0AAAAAAA" + "'", str1, "AAAAAA0AAAAAAA");
    }

    @Test
    public void test40069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("###########################################################################################################################################################################################################################00.1-eurt0", 842);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                  ###########################################################################################################################################################################################################################00.1-eurt0                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                  ###########################################################################################################################################################################################################################00.1-eurt0                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test40070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40070");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("###################################    a   hi!hi!...", "100.097.044444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40071");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test40072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40072");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40073");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                         ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40074");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa", "                                                                                                ", "AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40075");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa", (double) 144L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 144.0d + "'", double2 == 144.0d);
    }

    @Test
    public void test40076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40076");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str1, "...0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test40077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 252, "0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40078");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40079");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40080");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...44444444444444444444a", "                       a44444444444444444444...4444                       a44444444444444444444...4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       a44444444444444444444...4444                       a44444444444444444444...4444" + "'", str2, "                       a44444444444444444444...4444                       a44444444444444444444...4444");
    }

    @Test
    public void test40082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40082");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444...", "00.1-eurt00.7900", 652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40083");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "########################4444444444444444444444440TRUE-1.009...", (java.lang.CharSequence) "                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test40084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40084");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 18.0f, (double) 2, (double) 119);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 119.0d + "'", double3 == 119.0d);
    }

    @Test
    public void test40085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 " + "'", str1, "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test40086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40086");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test40087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40087");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("TRUE-1.  97.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test40088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4444444##############4true-1.4497.4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40089");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "    a                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 145, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..", 750);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test40092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1A009AAA                                                                                                ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1A009AAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1A009AAA");
    }

    @Test
    public void test40093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40093");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...444###################################################44444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "97.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test40095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444444444 ...          ", (int) (short) 10, 817);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...          " + "'", str3, "...          ");
    }

    @Test
    public void test40096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40097");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                                                     0aaaa", 136L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 136L + "'", long2 == 136L);
    }

    @Test
    public void test40098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444440097...#############################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                         100.                                                          ", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         100.                                                          " + "'", str2, "                                                         100.                                                          ");
    }

    @Test
    public void test40100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "100.0                                                     aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40101");
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  ...", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("..                          ...", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "            444444444444444  444444444444444             ..", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                              4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa                                                                                                                                              ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 169 + "'", int21 == 169);
    }

    @Test
    public void test40102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40102");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 62, 84);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40103");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "... aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... aaaa0aaaaa" + "'", str1, "... aaaa0aaaaa");
    }

    @Test
    public void test40104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...A     ...", "  A    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...A     ..." + "'", str2, "...A     ...");
    }

    @Test
    public void test40105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaa", "974444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaa" + "'", str2, "aaaaaaaaa");
    }

    @Test
    public void test40106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40106");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("......");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40107");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0true-100970");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    A", 32, "A         A                                                                  ...A         A  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A         A                    A" + "'", str3, "A         A                    A");
    }

    @Test
    public void test40109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40109");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(628, 537, 416);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 628 + "'", int3 == 628);
    }

    @Test
    public void test40110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40110");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                     0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaa0aaaa                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa0aaaa" + "'", str1, "aaaaa0aaaa");
    }

    @Test
    public void test40112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40112");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44aAAAAAA4440true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA", "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40113");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...44444444444..");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test40114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A", 79, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A" + "'", str3, "00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A");
    }

    @Test
    public void test40115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40115");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...!ih!ihA", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     ", 329);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40116");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40117");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                              0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr    A     0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr", "444444444444444444444444...7900.1-eurt044444444444444444", "...###################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr    A     0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr" + "'", str3, "                                              0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr    A     0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr");
    }

    @Test
    public void test40118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("       ...", "aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test40119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40119");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("#########################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi########", "100.0aaaa100100.0aaaa.100.0aaaa0100.0aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40120");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000...44444444444444444444444444444444440true-1.0097...44444", (double) 651);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 651.0d + "'", double2 == 651.0d);
    }

    @Test
    public void test40121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", 630, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str3, "#####################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test40122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str2, "#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test40123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40123");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("###################################    a   HI!HI!", "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097." + "'", str1, "44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.");
    }

    @Test
    public void test40125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40125");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "444444444444444444444444...7900.1-eurt044444444444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("                                                ", 'a');
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("0TRUE-1.00-1.0097.04444444444444444444444444444444444444444444", strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", strArray4, strArray10);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.79aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.1-eurtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA4444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaa", strArray10, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 145");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str5, "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                " + "'", str13, "                                                ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444" + "'", str14, "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test40126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40126");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("        A                             ", "44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "###########################################################################################################################################################################################################################00.1-eurt0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########################################################################################################################################################################################################################00.1-eurt0" + "'", str1, "###########################################################################################################################################################################################################################00.1-eurt0");
    }

    @Test
    public void test40128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            44444444444444444444444444                                               100.0                                                ", ".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            44444444444444444444444444                                               100.0                                                " + "'", str2, "                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            44444444444444444444444444                                               100.0                                                ");
    }

    @Test
    public void test40129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40129");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444TRUE-1.97.44444444444444444444444444444444444444444444", 841, 589);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444TRUE-1.97.44444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444TRUE-1.97.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test40130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40130");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...            ...            ...            ...            ...            ...            ...         ...4#444hi!hi!hi!h############################...44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... ... ... ... ... ... ... ...4#444hi!hi!hi!h############################...44" + "'", str1, "... ... ... ... ... ... ... ...4#444hi!hi!hi!h############################...44");
    }

    @Test
    public void test40131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40131");
        char[] charArray7 = new char[] { '4', '4', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaa", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       0970aaaaaa0aaaaaaaaaaaaa444444...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test40132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40132");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444", "Aaaa                                                     0.001                            A      A  ", "eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 444444444444444444444444444444444444444444" + "'", str3, "79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 444444444444444444444444444444444444444444");
    }

    @Test
    public void test40133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40133");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                  aaaa0                                                                                                                                 ", "...                                                   ...                                                   ...                                                   ...                                                   ...                                      ###    a   HI!HI!....                                                   ...                                                   ...                                                   ...                                                   ...                                       ", 656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40134");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40135");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40136");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(34, 106, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 106 + "'", int3 == 106);
    }

    @Test
    public void test40137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40137");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("            0000000", "444444444444444444444440.7900.1-eurt0aaaa                                                     0.001", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444444440TRUE-    ...AAAA0AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444440TRUE-    ...AAAA0AAAA" + "'", str1, "444444444444444444440TRUE-    ...AAAA0AAAA");
    }

    @Test
    public void test40139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40139");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAA", "44444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40140");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray6, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", strArray17);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444A44444");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", strArray17, strArray20);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     " + "'", str21, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
    }

    @Test
    public void test40141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "a         a                                                     1000    a         a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test40142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40142");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                             A                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40143");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("97..###############################################################################################################################################", "0TRUE-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40144");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA ", "...44444444444444444444444444444444440TRUE-1.0097...         a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a    ...44444444444444444444444444444444440TRUE-1.0097...", 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("    A         A                                                     100.0    A         A     ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test40145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "    4444444444444444444444444444   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40146");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40147");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                     ...                                                     4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444                 a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               ", (long) 109);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 109L + "'", long2 == 109L);
    }

    @Test
    public void test40148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.04444444444444444444444444", "a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.04444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.04444444444444444444444444");
    }

    @Test
    public void test40149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40149");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                      Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40150");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                       0AAAA                                                                                                                                  A                                                                                                                                  0AAAA                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40151");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0097.", "          ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test40152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test40153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("true                 ...                                                                      ...                                                                      ...                                                                      ...                            44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ", 359);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true                 ...                                                                      ...                                                                      ...                                                                      ...                            44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-" + "'", str2, "true                 ...                                                                      ...                                                                      ...                                                                      ...                            44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-");
    }

    @Test
    public void test40154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40154");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                          rue-1.0097.0", "0097...");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("###########################################################################################################################################################################################################################00.1-eurt0                                                                                                    ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test40155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40155");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...44444444444444444444444                 ...                                                     ", "#########################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40156");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444...TRUE", "                                                       true-1.00                                           true-1.97.                                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("44444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt04444444444444444444444444444444444444444444", "", "4 .44444444444444444444444444444444A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt04444444444444444444444444444444444444444444" + "'", str3, "44444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt04444444444444444444444444444444444444444444");
    }

    @Test
    public void test40158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40158");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0097.00T", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 840);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40159");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray4, strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                                                                                                                                                                                                   ..true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444", (java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0" + "'", str8, "100.0");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test40160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40160");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(145.0d, (double) 608.0f, (double) 13.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.0d + "'", double3 == 13.0d);
    }

    @Test
    public void test40161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40161");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("     ...44                                 ", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     ...##                                 " + "'", str3, "     ...##                                 ");
    }

    @Test
    public void test40162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40162");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444                                                   ", 544);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40163");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40164");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0true-1.00                                           true-1.97.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40165");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test40166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40166");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A A 1000 A A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("             AAAA0AAAAA    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAA0AAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40168");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0097...", "                                      100.0                                                      ", 52);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test40169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000", 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("97.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0", "                                                                                            A    44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0" + "'", str2, "97.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0");
    }

    @Test
    public void test40171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40171");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("          aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test40172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40172");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 20, (long) 557, (long) 29);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 557L + "'", long3 == 557L);
    }

    @Test
    public void test40173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40173");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIA", 628, 850);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hI", "                                              ...0true-1.0097...                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI" + "'", str2, "hI");
    }

    @Test
    public void test40175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40175");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray3, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str9, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test40176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40176");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", (java.lang.CharSequence) "A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test40177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA" + "'", str2, "AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA");
    }

    @Test
    public void test40178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                 A A A A                        a                                                                                              ", "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 A A A A                        a                                                                                              " + "'", str2, "                                                                 A A A A                        a                                                                                              ");
    }

    @Test
    public void test40179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40179");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                     ", ".97.", 434);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40181");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#0044444440004444444000444444400", "aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa", "4000                                                                                                                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...         444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4000                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa" + "'", str2, "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa");
    }

    @Test
    public void test40183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 625, "                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("9744");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9744" + "'", str1, "9744");
    }

    @Test
    public void test40185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40185");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40186");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                ", "                   ...", 551);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40187");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40188");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      ...                                                     ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4 0true-1.0097.044444444444444444444444444", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                     AAAA0AAAAA              ", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUERT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT00TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("...44444444444...                                                                                                                                                              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test40189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40189");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("##################################################################################################################################################################################################################################################################################### A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  #############################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40190");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '4', '4', ' ' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence6, charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "              ", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444AAAA0AAAAA", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("A A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444", charArray13);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("#########################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi########", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test40191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", "hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...", "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40192");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 5, (float) 43, (float) 64);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 64.0f + "'", float3 == 64.0f);
    }

    @Test
    public void test40193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40193");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440trueaaaaaaaaaaaaaaa", 999, "                                                                                  ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                  ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444                                                                                                                                                         A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440trueaaaaaaaaaaaaaaa" + "'", str3, "                                                                                  ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444                                                                                                                                                         A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440trueaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40194");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 262L, 51.0f, 173.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 262.0f + "'", float3 == 262.0f);
    }

    @Test
    public void test40195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40195");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 10, -1, 10, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test40196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...                aaaaa0aaaa                     ", 292);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                         ...                aaaaa0aaaa                                                                                                                                              " + "'", str2, "                                                                                                                         ...                aaaaa0aaaa                                                                                                                                              ");
    }

    @Test
    public void test40197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40197");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, 578, 744);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test40198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                 ", "                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                0 true - 1 . ", "RT0000EURT0000EURT0000EURT0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40200");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("TRUE-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test40201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str1, "4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test40202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40202");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                           aaaa0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "aahaa", 465);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40203");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                  4                  ", "", 38);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40204");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("true-1....", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40206");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...A .....44444...true-1.4444444...97.4444444...4444444444444...                  4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40207");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0444...44444444444444444444444444444444440TRUE-1.0097...4", 46, 608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 384, 71);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40209");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444a0000000000...a000000000044444444444444444444444444444444440a0000000000truea0000000000-a00000000001a0000000000.a00000000000097a0000000000...a000000000044");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 156 + "'", int1 == 156);
    }

    @Test
    public void test40210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40210");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAA", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...    0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...    0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str1, "...    0true-1.0097.00true-1.0097.00true-1.0097.00t");
    }

    @Test
    public void test40212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40212");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test40213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40213");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A    ", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                      0.001                                               ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 24 + "'", int14 == 24);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test40214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40214");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "                                                                                                                                  0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                    ", 750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                     AAAA0AAAAA                     ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     AAAA0AAAAA                     ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "                     AAAA0AAAAA                     ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test40216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                                                  0AAAA                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40217");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test40218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40218");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(".. A...", 502);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40219");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "0true-1.0097.0444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str3, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test40220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "#########.                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test40221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40221");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "      A         A         A         A         A");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A a" + "'", str6, "a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A a");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test40222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40222");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAAAAAAAAA       TRUE       TRUE       TRUE ", "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 27);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40223");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40224");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("A A A A                        a", "                                                                                                                                              0TRUE-1 0097 0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40225");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "444444444444444440true-1.0097...444444444444444444444444", 7);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("                                      100.0                                                     ", (java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test40226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40227");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 0, 461);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 461 + "'", int3 == 461);
    }

    @Test
    public void test40228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str2, "4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test40229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40229");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Aaaa0aa00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0" + "'", str1, "    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0");
    }

    @Test
    public void test40231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40231");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444!", "      a     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40232");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                      100.0                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40233");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                      100.0", "aaaaaaaaaaa", 416);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40234");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("rT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E", "4000                                                                                                                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...         444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4000                                                                                                                                              ", 110);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4A4 4rt4004.479004.414-4eurt4004.4744444444444444444444444444444444444444444444444" + "'", str2, "4A4 4rt4004.479004.414-4eurt4004.4744444444444444444444444444444444444444444444444");
    }

    @Test
    public void test40236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################" + "'", str1, "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################");
    }

    @Test
    public void test40237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40237");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                      00       000       000       00                                                                                                                                                                                                                                                                                                                      ", "                 aaaa0aaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40238");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("H!ih!h!ih!", "A   hi!hi!...truea   hi!hi!...-a   hi!hi!...a   hi!hi!...a   hi!hi!...97a   hi!hi!...a   hi!hi!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40239");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AE444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aE444444444444444444444" + "'", str1, "aE444444444444444444444");
    }

    @Test
    public void test40240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40240");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40241");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test40242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40242");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40243");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                           ", 65, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           " + "'", str3, "                                                                                           ");
    }

    @Test
    public void test40245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40245");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa                                                                                                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40246");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "#############AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...###################################################################################################################################################################################hI!###############################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097." + "'", str1, "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.");
    }

    @Test
    public void test40248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...000     ..", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...000     .." + "'", str2, "...000     ..");
    }

    @Test
    public void test40249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40249");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAAA0AAAA0.7900.1-EURT04444444444444444", "                                                                                                                                                                                       A0                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40250");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                        ...0TRUE-1.0097...                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                        ...0TRUE-1.0097...                            " + "'", str1, "                                                                                                                                                                                                                                        ...0TRUE-1.0097...                            ");
    }

    @Test
    public void test40251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40251");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "  0000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("        0aaaa         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"        0aaaa         \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40253");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444 44444 4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444 44444 4444444444444444444444444" + "'", str1, "444 44444 4444444444444444444444444");
    }

    @Test
    public void test40254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40254");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444444444444", "                                                                                  ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444                                                                                                                                                         A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440trueaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444");
    }

    @Test
    public void test40256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40256");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test40257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test40258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 138);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40259");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    .         .                                                     1000    .         .         ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                    ...aaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test40260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                             ", (int) (short) 100, "                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                             " + "'", str3, "                                                                                                                             ");
    }

    @Test
    public void test40261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40261");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str3, "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test40262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("444...44444444444444444444444444444444440true-1.0097...44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444...44444444444444444444444444444444440true-1.0097...44\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40263");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0TRUE-1.00-1.0097.0                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "......44444444444444444444444444444444440TRUE-1.0097...         a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a    ...44444444444444444444444444444444440TRUE-1.0097...4444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", "44444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A" + "'", str2, "7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A");
    }

    @Test
    public void test40266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                  a4a                   ", "                                                                                                          HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  a4a                   " + "'", str2, "                  a4a                   ");
    }

    @Test
    public void test40267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40267");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                 ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 60, 31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 170, 557);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 170");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test40268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40268");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 461, (long) 72, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 461L + "'", long3 == 461L);
    }

    @Test
    public void test40269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40269");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                     100.0                                                     AAAA                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0                                                     AAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40270");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray17 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     a    ", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4true-1.4497.4444444444444444444444444444", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A    ", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                           ", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("4444A44444", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray17);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "a   HI!HI!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 44 + "'", int20 == 44);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test40271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 11, "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test40272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40272");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444", "                                                                                                                                                                                                               44444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40273");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444440TRUE-1.0097.                                                                      ", "0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40274");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test40275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4ue-1.0097...444444444444444444444444########################################################################################100.44", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4ue-1.0097...444444444444444444444444########################################################################################100.44" + "'", str2, "4ue-1.0097...444444444444444444444444########################################################################################100.44");
    }

    @Test
    public void test40276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40276");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, 257);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40279");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                              0                     ", 632, "AaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaa                              0                     " + "'", str3, "AaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaa                              0                     ");
    }

    @Test
    public void test40280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("a440true-1.0097.044444444444444444444444444aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a440true-1.0097.044444444444444444444444444aa" + "'", str1, "a440true-1.0097.044444444444444444444444444aa");
    }

    @Test
    public void test40281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40281");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0000000000", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...", (int) ' ', "        a4444444444444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!..." + "'", str3, "44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
    }

    @Test
    public void test40283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40283");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                       ##44444444444444444444#...#444444444444444444444444444444444444444444444", "", "444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40284");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40285");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A         A                                  ", "                                                                                                  ", 216);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test40286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40286");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444440true-1.0097", "   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test40287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40287");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("TRUE-100970", "aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444" + "'", str1, "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
    }

    @Test
    public void test40289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40289");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40290");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4444444444444444444444444444444444444444444.79.1-eurt444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test40291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40291");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40292");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40293");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                          ...                                                                                                                                                                                                                                                                                            ", "7.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                          ...                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                          ...                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test40295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "####################################...####################################...####################################...####################################...                                     100.0                                                     aaaa                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40296");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("000", "                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a4000                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a", 76);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "000" + "'", str5, "000");
    }

    @Test
    public void test40297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40297");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                   ", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                  0aaaa                                                                                                                                  ", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimeToLive of -1 is less than 0: 0true-1.0097.00t..0true-1.0097.00t0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        0true-1.0097.00t..0true-1.0097.00t0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        0true-1.0097.00t..0true-1.0097.00t0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              0aaaa0true-1.0097.00t..0true-1.0097.00t0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        0true-1.0097.00t..0true-1.0097.00t0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        0true-1.0097.00t..0true-1.0097.00t0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test40298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("A A ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A A " + "'", str1, "A A ");
    }

    @Test
    public void test40299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40299");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test40300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40300");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", (java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "HI!", 56, 47);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("                     aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                         ", strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test40301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40301");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("TRUE", "0AAAA4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40302");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi..444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40303");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 10, -1, 10, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test40304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40304");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                A A ###################################                 ", 655, 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40305");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 850L, (float) 657L, (float) 150);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 150.0f + "'", float3 == 150.0f);
    }

    @Test
    public void test40306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40306");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "7.44444444444444444444444444444444A    4", 817);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                         0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                                                                         ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test40307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40307");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA ", (java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test40308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40308");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                      ...                           ", "44444444444444444440TRUE-1.0097.                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40310");
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                      100.0                                                     aaaa", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hI!", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("444444444444.", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("                   0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                  0                                                                                                                                 ", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test40311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40311");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(205L, (long) 256, 167L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 167L + "'", long3 == 167L);
    }

    @Test
    public void test40312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Aaaa                                                     0.001                            A      A  ", "#########################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaa                                                     0.001                            A      A  " + "'", str2, "Aaaa                                                     0.001                            A      A  ");
    }

    @Test
    public void test40313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40313");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...4444...                       a                       a                       a                       a                       a                       a  ", 236);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40314");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                    00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "                     44                                                                                                                                                                                                                                                                                                                                                                                                               a0a                                          a0a                                          a0a...       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40315");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40316");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...!hi!hi!hi!hi!hi!hi!", (double) 86L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 86.0d + "'", double2 == 86.0d);
    }

    @Test
    public void test40317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...", "4444444444444444444444444444444444444444444...44444true-1....4444497....444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0..." + "'", str2, "44444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...");
    }

    @Test
    public void test40318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40318");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40319");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A                             ###    A   hi!hi!...###    A   hi!hi!...###", "...    0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40320");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40321");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                      0.001                                                                                     0.", "0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test40322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40322");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("7900.1-eurt0444100.0A00       000       000       0A00       000 ", 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ue-144444444444444444444444444444444########################################################################################144444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40324");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...aaaa0      .0097.00      .0097.00      .0097.00  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40325");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40326");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A ...", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", 741);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                           aaaa0aaaaa                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                           aaaa0aaaaa                  " + "'", str1, "                           aaaa0aaaaa                  ");
    }

    @Test
    public void test40328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40328");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A", "0true-1.0097.00true-1.0097.00true-1.0097.00tr A ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444                  \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("A0000000000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A0000000000" + "'", str1, "A0000000000");
    }

    @Test
    public void test40331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                      100.0", 47, 645);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40332");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40333");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444...7900.1-eurt044444444444444444", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("...........................................................................................................................................................................", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A         A", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...00true-1.0097.00tru...", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                            100.0                                                     aaaa", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test40334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40334");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0097..", 732, 445);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40335");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "A A A A ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40336");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                          a                                 a   HI!HI!...    a   HI!HI!...", "0true-1.0097.044444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40337");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...........................................................................................0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      ...........................................................................................");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40338");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test40339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40339");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("########################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################################..." + "'", str1, "########################################...");
    }

    @Test
    public void test40340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40340");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("########################4444444444444444444444440TRUE-1.009...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("rue-1.0097.0                                       ", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################rue-1.0097.0                                       4444444444444444444444440rue-1.0097.0                                       TRUErue-1.0097.0                                       -rue-1.0097.0                                       1rue-1.0097.0                                       .rue-1.0097.0                                       009rue-1.0097.0                                       ..." + "'", str3, "########################rue-1.0097.0                                       4444444444444444444444440rue-1.0097.0                                       TRUErue-1.0097.0                                       -rue-1.0097.0                                       1rue-1.0097.0                                       .rue-1.0097.0                                       009rue-1.0097.0                                       ...");
    }

    @Test
    public void test40341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40341");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                      ...                                                     ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "..", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4true4-4449744", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 38 + "'", int12 == 38);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test40342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4A444444444444444444", 124, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4A444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4A444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40343");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444", "a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa", 0, 79);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444" + "'", str4, "a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444");
    }

    @Test
    public void test40344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40344");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40345");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444TRUE-1.00TRUE-1.97.", 671, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                  4444444TRUE-1.00TRUE-1.97.                                                                                                                                                                                                                                                                                                                                   " + "'", str3, "                                                                                                                                                                                                                                                                                                                                  4444444TRUE-1.00TRUE-1.97.                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test40347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40347");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00trA", "                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40348");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaa", 625);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40349");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                         0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                         0" + "'", str1, "                                                                                                                                                                                                                                                                         0");
    }

    @Test
    public void test40350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40350");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                          44444444444444444440true-1.0097HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40351");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...44444444444...                                                                                                                                                                                                       ", (java.lang.CharSequence) "                          rue-1.0097.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 190 + "'", int2 == 190);
    }

    @Test
    public void test40352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40352");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444                                                   ", "00000e0000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40353");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 290, (float) 451, (float) 797);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 290.0f + "'", float3 == 290.0f);
    }

    @Test
    public void test40354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40354");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 445L, (float) 91, (float) 170);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 91.0f + "'", float3 == 91.0f);
    }

    @Test
    public void test40355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ", "                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444444###################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40357");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444", "    A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT04444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT04444444444444444444444444444444444444444444");
    }

    @Test
    public void test40359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.00", "                                                                                                                                     ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.00" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.00");
    }

    @Test
    public void test40360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40360");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test40361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0 true - 1 . ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " . 1 - eurt 0" + "'", str1, " . 1 - eurt 0");
    }

    @Test
    public void test40362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40362");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa", 545, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40363");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("ahi!hi!...", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test40364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40364");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    4444444444444444444444444444444444444", 45, "0444444444       444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    4444444444444444444444444444444444444" + "'", str3, "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    4444444444444444444444444444444444444");
    }

    @Test
    public void test40365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40365");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0true-1.0097.044444444444444444444444444 ", "...........");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40366");
        long[] longArray1 = new long[] { (short) 100 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test40367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40367");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         ", "44444444444444444444444444444444440true-140097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40368");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0TRUE-1.0097.0", "44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444", "00       000       000       00aa44444444444444444444...444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40369");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaa.", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test40370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40370");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.0444444444444444444444444444444444444444444", "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...44444444444444444444444444444444440true-1.0097...", "", 181);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111", strArray3, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111" + "'", str8, "A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "...44444444444444444444444444444444440true-1.0097..." + "'", str9, "...44444444444444444444444444444444440true-1.0097...");
    }

    @Test
    public void test40371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40372");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4               #######    a   HI!HI!...0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4               #######    a   HI!HI!...0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str1, "4               #######    a   HI!HI!...0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test40373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40373");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                   ", "                                                                 A A A A                        a                                                                                              ", 69);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40374");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 638, (long) 69, (long) 290);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 69L + "'", long3 == 69L);
    }

    @Test
    public void test40375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 671);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                             100.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0" + "'", str1, "100.0");
    }

    @Test
    public void test40377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40377");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 754L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 754L + "'", long2 == 754L);
    }

    @Test
    public void test40378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40378");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("AaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40379");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                        ", "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40380");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence4, charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                               100.0", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("  A      A                            100.0                                                     aaaa", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "000                                        ...000     ..000                                         ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test40381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40381");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...T0444444444444444444444444444...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.00true-1.97.", 127);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40382");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    ...44444444444444444444444444444444440true-1.0097...a...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...a...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...a...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...a...44444444444444444444444444444444440true-1.0097...         " + "'", str1, "    ...44444444444444444444444444444444440true-1.0097...a...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...a...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...a...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...a...44444444444444444444444444444444440true-1.0097...         ");
    }

    @Test
    public void test40383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                            100.0                                                     aaaa..", "                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aaaa.." + "'", str2, "      aaaa..");
    }

    @Test
    public void test40384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40384");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("A A A        ", "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40385");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40386");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...4444...44....t..4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40387");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0                                                                                                                                                                                                                                                                          ", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test40388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40389");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 11L, (float) 329L, (float) 131);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 329.0f + "'", float3 == 329.0f);
    }

    @Test
    public void test40390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40390");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", "00       000       000       0", 615);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU44444444444" + "'", str1, "UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU44444444444");
    }

    @Test
    public void test40392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40392");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                       A0                                                                                                                                                                                       ", 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262 + "'", int2 == 262);
    }

    @Test
    public void test40393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "         a        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test40394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40394");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40395");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                      a         a         a         a         a      ", "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a                                                                                                                                                                      ", 721);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40396");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40397");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40398");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(" 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444", "                      aaaa 0 aaaaa               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40399");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("40true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "                             ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44" + "'", str2, "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44");
    }

    @Test
    public void test40401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40401");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444" + "'", charSequence2, "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test40402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444TRUE-1.00TRUE-1.97.", "4...44444444444444444444a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444TRUE-1.00TRUE-1.97." + "'", str2, "4444444TRUE-1.00TRUE-1.97.");
    }

    @Test
    public void test40403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40403");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444...", "...44444444444...                                                                                                                                                        ", 175);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                            00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                            00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "                                                                                                            00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test40405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097", "0true-1.0097.4444444444444444444444444444444444444444444440true-1.009");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097" + "'", str2, "44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097");
    }

    @Test
    public void test40406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40406");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            ", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 104");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test40407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40407");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("00#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40408");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                      100.0                                                                                                          ", 57, "4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      100.0                                                                                                          " + "'", str3, "                                      100.0                                                                                                          ");
    }

    @Test
    public void test40410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40410");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("UU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40411");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                         ", "                       a                       a                      ...", "...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ..");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40412");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                          ...                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 441 + "'", int1 == 441);
    }

    @Test
    public void test40413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "                A A ###################################                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40414");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444444444444444444444444444444440true-1.0097.", "UE", 957);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 46 + "'", int3 == 46);
    }

    @Test
    public void test40415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40415");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                 ...4444444...444444444...", 145, "...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a                                  ...4444444...444444444..." + "'", str3, "...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a                                  ...4444444...444444444...");
    }

    @Test
    public void test40416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40416");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                       a                             ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...44444444444444444444444444444444", ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1.0097.04444444444444444444444444", strArray2, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '#', 190, 479);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 190");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0097.04444444444444444444444444" + "'", str8, "1.0097.04444444444444444444444444");
    }

    @Test
    public void test40417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40418");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("AAA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1 0097   AA                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ue-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true" + "'", str2, "ue-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true");
    }

    @Test
    public void test40420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40420");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "             AAAA0AAAAA    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                        0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 135);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                        0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                                                                                                                                                                                        0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40422");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40423");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test40424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...", "   a         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ..." + "'", str2, "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...");
    }

    @Test
    public void test40425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40425");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaa", "IH", 32);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "     a    ");
        java.lang.String[] strArray9 = null;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                     AAAAAA0AAAAAAA              ", strArray5, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaa" + "'", str8, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaa");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                     AAAAAA0AAAAAAA              " + "'", str10, "                     AAAAAA0AAAAAAA              ");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test40426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40426");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A           " + "'", str1, "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A           ");
    }

    @Test
    public void test40427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40427");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40428");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("true-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..." + "'", str2, "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
    }

    @Test
    public void test40430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                     ...                 7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt04444444444444444444    a  .7900.1-eurt04444444444444444444444444444444444444444444                            ...                                                                      ...                                                                      ...                                                                      ...                 eurt", "h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40432");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                              4 A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                              ", 671);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40433");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 216L, (double) 91L, (double) 36);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 216.0d + "'", double3 == 216.0d);
    }

    @Test
    public void test40434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40434");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...a" + "'", str1, "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...a");
    }

    @Test
    public void test40435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 444, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test40437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("true-1.  97", "                                                                        44444                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1.  97" + "'", str2, "true-1.  97");
    }

    @Test
    public void test40438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40438");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("04444444444444444444444444");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test40439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40439");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("############################################# # #############################################", "######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################", 548);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40440");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      a         a         a         a         a", "###########################################true-1.97.############################################", (int) (byte) 100);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 94, 12);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("444444444444444444444444...44444true - 97", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test40441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4044444444444444444444444444                                                                                    0TRUE-1.0097.044444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4044444444444444444444444444                                                                                    0TRUE-1.0097.044444444444444444444444444" + "'", str2, "4044444444444444444444444444                                                                                    0TRUE-1.0097.044444444444444444444444444");
    }

    @Test
    public void test40442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40442");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "0                                                                                                                                                                                                                                                                          ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test40443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40443");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test40444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40444");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444...AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40445");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40446");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...                             is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                 ", (int) (byte) 0, 589);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                 " + "'", str3, "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                 ");
    }

    @Test
    public void test40448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40448");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test40449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40449");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", (int) (byte) 100, (int) (byte) -1);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444A44444", "0");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", strArray9, strArray16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("a4444444444444444444444444444444", strArray6, strArray9);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444" + "'", str19, "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a4444444444444444444444444444444" + "'", str20, "a4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test40450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40450");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                          0true-1.0097.044444444444444444444444444 ...#########################...#################0.001##...#########################...##############                                                                                                                                                                                                                                                                                                                                                          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40452");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA", "rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40453");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaa", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "079001-eurt0", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test40454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("I!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test40455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40455");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test40456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40456");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a", 732);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40457");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test40458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40458");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440trueaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test40459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40459");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("     a    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40460");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                         ...      444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 951);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40461");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("HI!H4444404444HI!HI.A A A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!H4444404444HI!HI.A A A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40462");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi                                                                                                                                  0aaaa", "aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40463");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) " aaaa0aaaaa                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " aaaa0aaaaa                                                                                                      " + "'", str1, " aaaa0aaaaa                                                                                                      ");
    }

    @Test
    public void test40464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40464");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40465");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ", " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ", "aaaaaaaaaaaaaaaaaaa                 ...                                                     444444444444444440true-1.0097...444444444444444444444444aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40466");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4 ", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAA4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           AAAAAAAAAAA", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 44 + "'", int16 == 44);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test40467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40467");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                      ...                                                     ", 93);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##100.0###", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", strArray5, strArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "...                                                                                                                                 ");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "4444444..0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "##100.0###" + "'", str9, "##100.0###");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "##100.0###" + "'", str11, "##100.0###");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str12, "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test40468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40468");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...aaaaaaaaaaaaaaaaaaaaaaaaa", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40469");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                            100.0", "                            100.0                                                     aaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "rue-1.0097.0                                       ", 25, 657);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("####...444444440tr...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####...444444440tr..." + "'", str1, "####...444444440tr...");
    }

    @Test
    public void test40471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("#...#4                       #a#4#...#4                       #a#4#...#4                       #a#4                     4#...#4                       #a#4#...#4                       #a#4#...#4#a#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#...#4 #a#4#...#4 #a#4#...#4 #a#4 4#...#4 #a#4#...#4 #a#4#...#4#a#" + "'", str1, "#...#4 #a#4#...#4 #a#4#...#4 #a#4 4#...#4 #a#4#...#4 #a#4#...#4#a#");
    }

    @Test
    public void test40472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", "a a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a a                                        44...7900.1-eurt04444444444444444444444444444444444...444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444" + "'", str2, "####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
    }

    @Test
    public void test40473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40473");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 15, 138L, 907L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 907L + "'", long3 == 907L);
    }

    @Test
    public void test40474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...                                                                             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", ".1-EURT00.7900.1-EURT", "A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                              4 A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                              ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40476");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40477");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("TRUE97TRUE9", ".##################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40478");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40479");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                           a         ", (java.lang.CharSequence) "....414-4eurt40");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40480");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444################################################################################################", (double) 542.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 542.0d + "'", double2 == 542.0d);
    }

    @Test
    public void test40481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40481");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40482");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TRUE-1.  97.", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                        ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("444440true-1.0097.0100.0", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test40483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40483");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40484");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A", "    A     ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "0true-1.0097.0", (int) ' ', (int) (byte) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", strArray3, strArray8);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a', 279, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa" + "'", str15, "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test40485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40485");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                            ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40487");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 545, (long) 833, 116L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 116L + "'", long3 == 116L);
    }

    @Test
    public void test40488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40488");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", "aaaaa 44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    " + "'", str2, "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ");
    }

    @Test
    public void test40490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40490");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444...", (java.lang.CharSequence) "4444444444444444444444444444444                                                   4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 186 + "'", int2 == 186);
    }

    @Test
    public void test40491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40491");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "  .79  .1-EURT  .79  .1-EURT  .79  .1-EURT ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test40492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40492");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################444444444", "...44444...TRUE-1.4444444.....4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444...TRUE-1.4444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40493");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", (java.lang.CharSequence) "0TRUE-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444." + "'", charSequence2, "44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
    }

    @Test
    public void test40494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                              aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa", "                                                                                                                                           0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa" + "'", str2, "                                                              aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa");
    }

    @Test
    public void test40495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h####################################################################################################", "0true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444A   hi!hi!hi!h####################################################################################################" + "'", str2, "4444444444444444444444444444444A   hi!hi!hi!h####################################################################################################");
    }

    @Test
    public void test40496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40496");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A   114");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test40497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                     100.0                                                     4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                     100.0                                                     4444" + "'", str1, "                                     100.0                                                     4444");
    }

    @Test
    public void test40498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "00       000       000       00a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40500");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }
}

