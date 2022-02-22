import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest100 {

    public static boolean debug = false;

    @Test
    public void test50001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50001");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".44444444444444444444444444444444A    4", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", ".0097.00true-1.00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50003");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444" + "'", str1, "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444");
    }

    @Test
    public void test50005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50005");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (long) 456);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 456L + "'", long2 == 456L);
    }

    @Test
    public void test50006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50006");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(".....4444444444444444444444444444...4444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".....4444444444444444444444444444...4444444444..." + "'", str1, ".....4444444444444444444444444444...4444444444...");
    }

    @Test
    public void test50007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50007");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "               true  ", (java.lang.CharSequence) "...aaaa...44444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test50008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("         ......00.7900.1-eurt00.79......aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......00.7900.1-eurt00.79......aaaa" + "'", str1, "......00.7900.1-eurt00.79......aaaa");
    }

    @Test
    public void test50009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50009");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 6, 17L, (long) 132);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6L + "'", long3 == 6L);
    }

    @Test
    public void test50010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                     aaaa0aaaaa                     ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                               ", (java.lang.CharSequence) "0444444444       44444A   hi!hi!0444444444       44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50012");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...aaaaaaaaaaaaaaTRUEa97aTRUEa97", "A         A         A         A         A         A         A         A         A         A   114", 72);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50013");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                            A    44");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                   rt00.7900.                   ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                               rt00.7900.                   A                   rt00.7900.                                          rt00.7900.                   44" + "'", str3, "                                                                                                               rt00.7900.                   A                   rt00.7900.                                          rt00.7900.                   44");
    }

    @Test
    public void test50014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50014");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                      hI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "                            ...    ue                            ...                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test50015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50016");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444" + "'", str1, "1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444");
    }

    @Test
    public void test50017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T" + "'", str2, "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
    }

    @Test
    public void test50018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50018");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "4444444444TRUE-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50019");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("a   HI!HI!HI!HI!HI!HI!H", "    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!......7900.1-EURT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   HI!HI!HI!HI!HI!HI!H" + "'", str2, "a   HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test50021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50021");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.00-1.0097.04444444444444444444444444444444A100.0hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaa", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(".");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test50024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           aaaa0aaaaa                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "   !    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           aaaa0aaaaa                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           aaaa0aaaaa                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444444444444444440TRUE-1.0097.0" + "'", str1, "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444444444444444440TRUE-1.0097.0");
    }

    @Test
    public void test50026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50026");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44 ...4A", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test50027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50027");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(826, 120, 292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test50028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50028");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...####################################...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50029");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0                                                 ATRUEA                                                 -                                                 A                                                 1                                                 A                                                 .                                                 A                                                 0097                                                 A                                                 .                                                 A                                                 0", "444444444 ...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50030");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("0true-1.0097.4444444444444444444444444444444444444444444440true-1.0097", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test50031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50031");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...               A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...               A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "...               A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test50032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "    A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", "       ...      a         a         a         a         a0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str3, "                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test50033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 403, "                     a        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                     a                             a                             a                             a                             a                             a                             a                             a                             a                             a                  " + "'", str3, "                                                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                     a                             a                             a                             a                             a                             a                             a                             a                             a                             a                  ");
    }

    @Test
    public void test50034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50034");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "a0000000000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test50035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444444444444444444444444                                                                                        100.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444                                                                                        100." + "'", str1, "444444444444444444444444                                                                                        100.");
    }

    @Test
    public void test50036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50036");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!HI", 967, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                       a44444444444444444444...4444                       a44444444444444444444...444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a44444444444444444444...4444 a44444444444444444444...444" + "'", str1, "a44444444444444444444...4444 a44444444444444444444...444");
    }

    @Test
    public void test50038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    ", "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    " + "'", str2, "     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    ");
    }

    @Test
    public void test50039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50039");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test50040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0 aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 aaa" + "'", str1, "0 aaa");
    }

    @Test
    public void test50041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50041");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!hi!hitttttti!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hitttttti!h" + "'", str1, "!hi!hitttttti!h");
    }

    @Test
    public void test50042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("##################################################################################################################################################################################################################################################################################### A rt0079001-eurt0079001-eurt0079001-eurt0A    A    A    A    A    A    A    A  ######################################################################################################################################################################################################################################################################################", "                       #A#44444444444444444444#...#444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("  A      A                            100.0                                                     AAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A      A                            100.0                                                     AAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50044");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                              ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.00...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                              444" + "'", str3, "                                                                                                              444");
    }

    @Test
    public void test50045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50045");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4444444", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("...44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-", strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "7.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 216, 123);
        java.lang.Class<?> wildcardClass10 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test50046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50046");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                              ...44444...true-1.4444444...97.4444444...4444444444444...4                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0000000000", 608);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50047");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                                                                  ##100.0###44444444444.0097.00true-1.0                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50048");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                 4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "        a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       4444444444444444444444444444444444444444444...4444444.79...4444444.1-EURT...44444444444444444444444444444444444444444444444444       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       ", 250);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50049");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...444###################################################44444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50050");
        char[] charArray11 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "97.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test50051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("      00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00" + "'", str1, "00");
    }

    @Test
    public void test50052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50052");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("A         A                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test50055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "74.4004eurt4-414.479004.4004rt4A474.4004eurt4-414.479004.4004rt4A" + "'", str2, "74.4004eurt4-414.479004.4004rt4A474.4004eurt4-414.479004.4004rt4A");
    }

    @Test
    public void test50056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50056");
        char[] charArray17 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444...7900.1-eurt044444444444444444", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("...44444...true-1.4444444...97.4444444...4444444444444...", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                ..", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a44444444444444444444...444444444444444444444444444444444444444444444", charArray17);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "   4444444...AAAAAAAAA44444444444444444444444444444444444444444", charArray17);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test50057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50057");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                               100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                               100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50058");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 523, 125L, 102L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 102L + "'", long3 == 102L);
    }

    @Test
    public void test50059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA", 655);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA" + "'", str2, "-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA");
    }

    @Test
    public void test50060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50060");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE97TRUE9444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (double) 561L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 561.0d + "'", double2 == 561.0d);
    }

    @Test
    public void test50061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50061");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                          ...7.044444444444444444444444444..                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50062");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50063");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("rue-1.0097.0", ".7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a", "                                                                                                                                              4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            " + "'", str3, "            ");
    }

    @Test
    public void test50065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("...4444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", "...44444...4444444...4...aaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str2, "...4444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test50066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50066");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50067");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "", 266);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "AAAA0AAAAA0AAAA0AAAAA0AAAA0AAAAA0AAAA0A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                        ...", strArray5, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str7, "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test50068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50068");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test50069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50069");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(15L, 561L, 250L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 561L + "'", long3 == 561L);
    }

    @Test
    public void test50070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "114");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50071");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 850 + "'", int1 == 850);
    }

    @Test
    public void test50072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50072");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                        44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!                                                                       0true-1.00", "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-EURT0Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50073");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                              ", "    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50074");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test50075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444             0true-10aaaa00970aaaa0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" TRUE - 1 . 97 . ", "A.7900.1-eurt0444444444444444444...", "44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " TRUE - 1 . 97 . " + "'", str3, " TRUE - 1 . 97 . ");
    }

    @Test
    public void test50077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50077");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
    }

    @Test
    public void test50078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50078");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA Aa         a                                                     1000    a         aa         a                                                     1000    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.00true-1.97.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 726);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50079");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "", 467);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
    }

    @Test
    public void test50080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50080");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 261, 30.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 261.0d + "'", double3 == 261.0d);
    }

    @Test
    public void test50081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50081");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test50082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50082");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test50083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50083");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444true-1a97a4444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                             0                  ", 652);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...               A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...               a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "...               a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    aa   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test50085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaa", "  A      A                            100.0                                                     aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50086");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "##44444444444444444444#...#44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50087");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0TRUE-1.0097.00T..0TRUE-1.0097.00T");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50088");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0TRUE-1.04444444...4444444...444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.04444444...4444444...444" + "'", str1, "0TRUE-1.04444444...4444444...444");
    }

    @Test
    public void test50089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50089");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", "#####################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", 539);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50090");
        int[] intArray6 = new int[] { 44, 3, 24, '4', ' ', 52 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[44, 3, 24, 52, 32, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test50091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "true-1. 97.  true-1. 97. ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50092");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ", 13);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 535, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test50093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str1, "4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test50094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("... AAAA0AAAAA##################################################################################################################################################################################################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... AAAA0AAAAA##################################################################################################################################################################################################################" + "'", str2, "... AAAA0AAAAA##################################################################################################################################################################################################################");
    }

    @Test
    public void test50095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50095");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50097");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444" + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
    }

    @Test
    public void test50098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50098");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                         444444...4444444444........4444444444444444444444444444.#######################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("           4    4     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4    4" + "'", str1, "4    4");
    }

    @Test
    public void test50100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444", "    a0a                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444" + "'", str2, "#a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444");
    }

    @Test
    public void test50101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                     0         ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     0         " + "'", str2, "                     0         ");
    }

    @Test
    public void test50103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50103");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00       000       000       0", 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50104");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                     ", "     A    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###################################################################################################################################################################################################################################################################################################################################################################################################...44444444444444444444444444444444444444444444444444444...###################################################################################################################################################################################################################################################################################################################################################################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################################################################################################################################################################################################################################################################################################################################################################################...44444444444444444444444444444444444444444444444444444...###################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "###################################################################################################################################################################################################################################################################################################################################################################################################...44444444444444444444444444444444444444444444444444444...###################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test50106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50106");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "..             ", (java.lang.CharSequence) "0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 926 + "'", int2 == 926);
    }

    @Test
    public void test50107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50107");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("..    0TRUE-1.00.00TRUE-1.00.00TRUE-1.00.00TR    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50108");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "44444444444444444444444A444444444444444444444444", 400);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50109");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440true-1.0097.0", "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.0" + "'", str3, "44444444444444444444444444444444444444444440true-1.0097.0");
    }

    @Test
    public void test50110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                              is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...4444444...4444444...4444444...4444444...---------------------------------------444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...0077.00...t744444444444444444..4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444...4444444...4444444...4444444...---------------------------------------444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...0077.00...t744444444444444444..4444444" + "'", str1, "...4444444...4444444...4444444...4444444...---------------------------------------444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...0077.00...t744444444444444444..4444444");
    }

    @Test
    public void test50112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("####################################################################################################################################################################################################################################################...t0...", "...444444444444444440true-1.0097...444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50113");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAA", "hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     #################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50114");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                hi4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "0aaaaa4a4A4A4A4A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0aaaaa4a4A4A4A4A" + "'", str2, "0aaaaa4a4A4A4A4A");
    }

    @Test
    public void test50116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50116");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444TRUE-1.97 1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444..", "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50117");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444", "4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaa", "A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A...     A    -EURT04444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444" + "'", str3, "0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444");
    }

    @Test
    public void test50118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...                                                   ...                                                   ...                                                   ...                                                   ...                                      ###    a   HI!HI!....                                                   ...                                                   ...                                                   ...                                                   ...                                       ", 656, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################################################...                                                   ...                                                   ...                                                   ...                                                   ...                                      ###    a   HI!HI!....                                                   ...                                                   ...                                                   ...                                                   ...                                       " + "'", str3, "###########################################################################################################################...                                                   ...                                                   ...                                                   ...                                                   ...                                      ###    a   HI!HI!....                                                   ...                                                   ...                                                   ...                                                   ...                                       ");
    }

    @Test
    public void test50119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0", 635, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0");
    }

    @Test
    public void test50120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                     AAAAAAAAAAAAAAAAAA       TRUE       TRUE       TRUE ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     AAAAAAAAAAAAAAAAAA       TRUE       TRUE       TRUE " + "'", str1, "                     AAAAAAAAAAAAAAAAAA       TRUE       TRUE       TRUE ");
    }

    @Test
    public void test50121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                     a A 1000 A A                                                                                                                                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr                                                                                     a A 1000 A A                                                                                                                                                                                                                                                      ", "####################################    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH#####################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50122");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4true4-44497", "444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-eurt04444444444444444444444444444444444...444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50123");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50124");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("    A         A                                                     100.0    A         A     ...", 38, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50125");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1AAAAAAAAAAA4444444...4444444...4444444...4    AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test50126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test50127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50127");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("444444444444444444...true-1.4444444", "0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50128");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                      100.0                                                     aaaa", "...aaaa", 93);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h##########################################hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h###########################################", "4444444444444444444444444444444444444444444TRUE-1.97.44444444444444444444444444444444444444444444#############################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "             rue-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50131");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                    444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                    444444444..." + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                    444444444...");
    }

    @Test
    public void test50132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50132");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test50133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50133");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4411111111111111111111111111111", "...4444444444444444444444444440t...", 275);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50134");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "##100.0###");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("IH  ", strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444" + "'", str6, "4444444");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test50135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                    1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr..." + "'", str1, "1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...");
    }

    @Test
    public void test50136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50136");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...44444...true-1.4444444...97.4444444...444444...44444...true-1.4444444...97.4444444...4444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50137");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444A A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444", "                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444" + "'", str2, "4444444");
    }

    @Test
    public void test50139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50139");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaa0aaaa                     ", "44444444444444444444444444444444444444444440TRUE-1.009...", 266);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(" ...", ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.00", 102);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ..." + "'", str3, " ...");
    }

    @Test
    public void test50141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50141");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "9744", "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   " + "'", str1, "a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   ");
    }

    @Test
    public void test50143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444444444444444444...true-1.4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                          4444444...4444444...4444444...4...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                          4444444...4444444...4444444...4..." + "'", str1, "                                                                                                                          4444444...4444444...4444444...4...");
    }

    @Test
    public void test50145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50145");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test50146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50146");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...                                                                                                                                               ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50147");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.", "4444444440097...##########################################0444###############...", 848);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50149");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                              A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50150");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444a444444444444444444444444", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444440true-1.00944444444444444444440true-1.00944444444444444444440true-1.00944444444444444444440true-1.00944444444444444444440true-1.0094444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test50151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50151");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 4.444444444444444E25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444444444444E25d + "'", double2 == 4.444444444444444E25d);
    }

    @Test
    public void test50152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50152");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("aaaa0aaaaa", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "true-1. 97. 444444444444444444444444444444444444444444 true-1. 97. 44444444444444444444444444", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0444444444444444444444444444444444444444444", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1 0097 044444444444444444444444444 4", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
    }

    @Test
    public void test50153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444TRUE-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444TRUE-1. 97" + "'", str1, "4444444444TRUE-1. 97");
    }

    @Test
    public void test50154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("00097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...true0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...-0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...10097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...00970097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...true0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...-0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...10097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...00970097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...0" + "'", str2, "00097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...true0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...-0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...10097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...00970097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...0");
    }

    @Test
    public void test50156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444440true-1.0097." + "'", str1, "4444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test50157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("a###ahi!hi!...###ahi!hi!...###", 259);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                  a###ahi!hi!...###ahi!hi!...###                                                                                                                   " + "'", str2, "                                                                                                                  a###ahi!hi!...###ahi!hi!...###                                                                                                                   ");
    }

    @Test
    public void test50158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50158");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4a4444444444444444444444...4444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50159");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test50160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50160");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50161");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", (int) ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test50162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50163");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-eurt0aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50164");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("               true                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 632);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               ", "004444a44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50166");
        long[] longArray1 = new long[] { 99L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[99]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 99L + "'", long3 == 99L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 99L + "'", long6 == 99L);
    }

    @Test
    public void test50167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##############################################0097.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("IH", "                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH" + "'", str2, "IH");
    }

    @Test
    public void test50169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50169");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...........................................................................................................................................................................", 968);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..........................................................................................................................................................................." + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...........................................................................................................................................................................");
    }

    @Test
    public void test50171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...." + "'", str1, "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi....");
    }

    @Test
    public void test50172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("Aaaaaaaaaaa44.                                  aaaa.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaa44.                                  aaaa." + "'", str1, "Aaaaaaaaaaa44.                                  aaaa.");
    }

    @Test
    public void test50173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...444444444444444444444444444444", "                                     100.0                                                     aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...444444444444444444444444444444");
    }

    @Test
    public void test50174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                                                                                                                                                                                                                                                                                                                     44444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test50175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50175");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                      A         A         A         A         A", ".44444444444444444444444444444444A    4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50176");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "0000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("         .");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.0097.00true-1.00", "                                                                                     4444444444444444444444444444444444444444444a.79a.1-eurta44444444444444444444444444444444444", "...A");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test50179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50179");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###", "444444444444444444440TRUE-    ...AAAA0AAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa a HI!HI!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###" + "'", str3, "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###");
    }

    @Test
    public void test50180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50180");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test50181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50182");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                       a                   TRUE-1.0097.0                       a                                           a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...4444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test50183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50183");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 959);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("a         A         A         A         A", 349);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a         A         A         A         A                                                                                                                                                                                                                                                                                                                    " + "'", str2, "a         A         A         A         A                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test50186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50186");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50187");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("ATT-------TTT-------TTT-------TT", (double) 744.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 744.0d + "'", double2 == 744.0d);
    }

    @Test
    public void test50188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50188");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", "", 116);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 12, 2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("444440true-1.0097...44444aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                      ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    " + "'", str9, "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    " + "'", str10, "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ");
    }

    @Test
    public void test50189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50189");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "A4a4a4a444444444444444444444444A44444444444444444444444...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAA", 734);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50190");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaaaaaaaaaaaaaaaaaaaaa                                 444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444", "                                                        44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!                                                                       0true-1.00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("########################4444444444444444444444440TRUE-1.009...", "A Aa         a                                                     1000    a         aa         a                                                     1000    a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################4444444444444444444444440TRUE-1.009..." + "'", str2, "########################4444444444444444444444440TRUE-1.009...");
    }

    @Test
    public void test50192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50192");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                    444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50193");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0444444444       444444444444444444", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", 841);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50194");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                     4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50195");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 10, (long) 887, (long) 173);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 887L + "'", long3 == 887L);
    }

    @Test
    public void test50196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("###########################################################", "0true-1.0097.04444444444444444444444444440aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################################" + "'", str2, "###########################################################");
    }

    @Test
    public void test50197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50197");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a         ...444###################################################444444444444444444444440097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a                    0097.0                       a          ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test50198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50198");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Aaaa...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50199");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                                                                    0true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.0444444444444444444444444444" + "'", str1, "0true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test50200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
    }

    @Test
    public void test50201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(".0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-", "044444444444444444444444444                                                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("    A     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    a     " + "'", str1, "    a     ");
    }

    @Test
    public void test50203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50203");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(4.4444445274066125E18d, (double) 216.0f, (double) 4444444);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4444445274066125E18d + "'", double3 == 4.4444445274066125E18d);
    }

    @Test
    public void test50204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("-1.0097.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0097.0" + "'", str1, "-1.0097.0");
    }

    @Test
    public void test50205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50205");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a                                  ...4444444...444444444...", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50206");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 650, (float) 534L, 78.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 650.0f + "'", float3 == 650.0f);
    }

    @Test
    public void test50207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50207");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50208");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                   ", 969.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 969.0f + "'", float2 == 969.0f);
    }

    @Test
    public void test50209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str1, "0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test50210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                                                                                                                                                                    444444444..", 60);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            " + "'", str2, "                                                            ");
    }

    @Test
    public void test50211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50211");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0true-1044440097044440                                                                                                                                       A    4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50212");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("4444444...", "4444444...");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("4444A44444", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "44444", 45);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("A4A4A4A444444444444444444444444a4...", strArray20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A", strArray11, strArray20);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A" + "'", str22, "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A");
    }

    @Test
    public void test50213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50213");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "true-1.4444444...97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "                       444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50215");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                     aaaaaaaaaa                     ", "                                                                                     a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aa...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test50216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                         aaaa0", "     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         aaaa0" + "'", str2, "                                                                         aaaa0");
    }

    @Test
    public void test50217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50217");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH A                                       74.4004true4-414.400974.4004tr4 4A4 44444444444444444444444444444444444444444444444444474.4004true4-414.400974.4004tr4 4A4", "                                      100.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                               100.0                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0" + "'", str1, "100.0");
    }

    @Test
    public void test50219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50219");
        float[] floatArray4 = new float[] { 29L, (byte) 1, 168.0f, 102L };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[29.0, 1.0, 168.0, 102.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 168.0f + "'", float5 == 168.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test50220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50220");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                            0TRUE-1.0097.044444444444444444444444444 ...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA0.001...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50221");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###" + "'", str1, "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###");
    }

    @Test
    public void test50222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50222");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                     0", "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444          TRUE  44444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test50223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50223");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A", "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50224");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "truea1.aa97.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "4...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50226");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(645L, (long) 127, (long) 111);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 111L + "'", long3 == 111L);
    }

    @Test
    public void test50227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50227");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                               0TRUE-1 0097 0                 ", 45, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                               0TRUE-1 0097 0                 " + "'", str3, "                                                                                                                                                               0TRUE-1 0097 0                 ");
    }

    @Test
    public void test50228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50228");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("100.0                                                     aaaa", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...........................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50229");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...                                                                                               a        hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.a a a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...        hi!hi!hi!hi!hi!...", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50230");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 330, 561.0f, 445.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 561.0f + "'", float3 == 561.0f);
    }

    @Test
    public void test50231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4a4444444444444444444444...4444444444444444444444444444444444444444444444", 570, (int) (short) 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test50232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50232");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test50233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50233");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".97.                                                                                       ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test50234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50234");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "A         A                                                     1000    A         A", 33, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", "...   #a#4444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50236");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("    aaaaa0aaaa                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    aaaaa0aaaa                 \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!hi!h!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!h!hi!h" + "'", str1, "!hi!h!hi!h");
    }

    @Test
    public void test50239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50239");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444440TRUE-1.0097...444444444444444444444444                                                                                        100.0TRUE-1.0aaaaA44444...", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50240");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 33.0f, (double) 58.0f, (double) 907L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 33.0d + "'", double3 == 33.0d);
    }

    @Test
    public void test50241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 111, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50242");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444true-1.00                                           true-1.97.                                                                                       ", 549, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444true-1.00                                           true-1.97.                                                                                       0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097." + "'", str3, "4444444true-1.00                                           true-1.97.                                                                                       0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.");
    }

    @Test
    public void test50243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "##############################################0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr####A#####0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr", (java.lang.CharSequence) "AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!.aaaaaa0aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI", "...!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI" + "'", str2, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI");
    }

    @Test
    public void test50245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50245");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a    4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50246");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUETRUEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                       444...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50247");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444444444444444444...true-1.4444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50248");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                                   0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... ...true-1. ...97. ... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ...                                                                                                                                                                                                                                                                                                                                                   ", "A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 346 + "'", int2 == 346);
    }

    @Test
    public void test50249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("900.1-EURT0444444444444444444444444444", "...      aaaa0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "900.1-EURT0444444444444444444444444444" + "'", str2, "900.1-EURT0444444444444444444444444444");
    }

    @Test
    public void test50250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                      100.0                                   ", "                                                                                                                                                                                                                                                                                                                          0444444444       444444444444444444                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      100.0                                   " + "'", str2, "                                      100.0                                   ");
    }

    @Test
    public void test50251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50251");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50252");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444", "...44444444444444444444444444444444440true-A...44444444444444444444444444444444440true-44444444444444444444444", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50253");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...44444444444444444444444444444444440TRUE-1.0097...", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test50254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...7.044444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...444444444444444444444444440.7..." + "'", str1, "...444444444444444444444444440.7...");
    }

    @Test
    public void test50255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50255");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("###    a   HI!HI!.", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50256");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test50257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50257");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                             aaaaaaaaaaaaaaaaa                                                                                                                                                                             ", "#########################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A", 245);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50258");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "Aaaa...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test50259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 " + "'", str2, "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
    }

    @Test
    public void test50260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50260");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("97..###############################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test50261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50261");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("a4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-EURT0Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444..a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444440.7900.1-eurt0aAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444..a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "A4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444..a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444440.7900.1-eurt0aAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAaAAAAAAAAAA4444444...4444444...4444444..a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test50262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50262");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097", "04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50263");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("044444444444444444444444444                                                                                    ", "                                                                                                                                                                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH ", 967);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50264");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                         AAAAAAAAAAAAAA", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test50265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50265");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("......4444444...4444444...4444444.....", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                         AAAAAAAAAAAAAA                                                           ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27 + "'", int15 == 27);
    }

    @Test
    public void test50266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(".0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900." + "'", str1, "RT00.7900.1-EURT00.7900.1-EURT00.7900.");
    }

    @Test
    public void test50267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50267");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                                                                                                                                                                                                             04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4" + "'", str1, "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
    }

    @Test
    public void test50268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50268");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50269");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaa hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... 0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 546 + "'", int2 == 546);
    }

    @Test
    public void test50270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("100.0#####100.0###", "44444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50272");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50273");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50274");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a004444444000444444400044444440");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50275");
        int[] intArray6 = new int[] { 44, 3, 24, '4', ' ', 52 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[44, 3, 24, 52, 32, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test50276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50276");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("    A");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test50277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50277");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("###0.001##                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50278");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a0aaaaa              0true-1.0097.0444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0aaaaa              0true-1.0097.0444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50279");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1A009AAA                                                                                                ", 468);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50281");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                ...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...00.7900.1-eurt00.79...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
    }

    @Test
    public void test50282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50282");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#########################################################################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50283");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a.a7900a.a1a-aeurta0#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("             aaaa0aaaaa    ", "ue-1.0097...444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             aaaa0aaaaa    " + "'", str2, "             aaaa0aaaaa    ");
    }

    @Test
    public void test50285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                         100.                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                         100.                                                          " + "'", str1, "                                                         100.                                                          ");
    }

    @Test
    public void test50286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50286");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("##########################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50287");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 .444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 97444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 .444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 4444444444444444444444444444444444444444444", "444444444444444440TRUE-1.0097...444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50288");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                       ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test50289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50289");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "   4444444...AAAAAAAAA44444444...");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.0...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 73 + "'", int4 == 73);
    }

    @Test
    public void test50290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("true-1971                                                                                                                                                           ", "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", "444444444444444440true-1.0097...444444444444444444444444#####################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1971                                                                                                                                                           " + "'", str3, "true-1971                                                                                                                                                           ");
    }

    @Test
    public void test50291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50291");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 44, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test50292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(".00", 47, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444.004444444444444444444444" + "'", str3, "4444444444444444444444.004444444444444444444444");
    }

    @Test
    public void test50293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50293");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                              ...44444...true-1.4444444...97.4444444...4444444444444...4                               ", (java.lang.CharSequence) "44...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50294");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("444444444444");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test50295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50296");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 534, 115);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test50297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50297");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "......", 77, 65);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444......44444444444444" + "'", str4, "44444444444444444444444444444444444444444444444444444444444444444......44444444444444");
    }

    @Test
    public void test50298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50298");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test50299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50299");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(" aaaa0aaaaa    ", ".79.1-eurt                                           00.1-eurt0", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50300");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50301");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 125, 253);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50302");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "    a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50303");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#", "A A A A A A A A A A A A A A A", 585);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50304");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("A A 0.001 444440444 A A 0.001 444440444 A A 0.001 444440444 A A 0.001 444440444 A A ...", "                                      4444400       0444444                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50305");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!", 124, 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50306");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaa0aaaaa", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test50307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50307");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRa0T...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                  ", "..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-eurt04444444444444444444444444444444444...444..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50308");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444AAAAAAAAAAAAAAAAAAAAAAAAA......", "                                                                                                                                                                                                                                          44444444444444444440true-1.0097", 628);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50309");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 554, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str3, "...    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test50310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50310");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...true0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...-0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...10097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...00970097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...0", "4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("A A A A A", 788, 670);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test50312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50312");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("true 1.  97. ", (long) 63);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test50313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50313");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...aaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test50315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50315");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                 ###0.001##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50317");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                     ...                 7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt04444444444444444444    a  .7900.1-eurt04444444444444444444444444444444444444444444", "...44                            A A A A ", 363);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50318");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444440true-1.00944444444444444444440true-1.00944444444444444444440true-1.00944444444444444444440true-1.00944444444444444444440true-1.0094444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...", 147);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 147 + "'", int2 == 147);
    }

    @Test
    public void test50319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50319");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(68, 29, 4444444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test50320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50320");
        long[] longArray2 = new long[] { (byte) 100, 12 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 12]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 12L + "'", long4 == 12L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test50321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50321");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...                                                                                                                                             ", "A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    ", 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aa..." + "'", str1, "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aa...");
    }

    @Test
    public void test50323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("######################################044444444444444444444444444######################################044444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   #######################################################################################044444444444444444444444444######################################0444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################044444444444444444444444444######################################044444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   #######################################################################################044444444444444444444444444######################################0444444444" + "'", str1, "######################################044444444444444444444444444######################################044444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   #######################################################################################044444444444444444444444444######################################0444444444");
    }

    @Test
    public void test50324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 260, 551);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("AE444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AE444444444444444444444" + "'", str2, "AE444444444444444444444");
    }

    @Test
    public void test50326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A" + "'", str1, "A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A");
    }

    @Test
    public void test50327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", "                                      100.0                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444497.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "04444444444444444444444444444444444444444440true-1.0097.0" + "'", str2, "04444444444444444444444444444444444444444440true-1.0097.0");
    }

    @Test
    public void test50329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50329");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...44444...4444444...4...aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50330");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444444444 0444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test50331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ", "                                                                                      4444444444                                                                                     ", "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test50332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50332");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 145, (double) 57L, 28.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 28.0d + "'", double3 == 28.0d);
    }

    @Test
    public void test50333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50333");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("97..###############################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97..###############################################################################################################################################" + "'", str1, "97..###############################################################################################################################################");
    }

    @Test
    public void test50334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          0004a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          ", 236);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          0004a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          " + "'", str2, "a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          0004a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          ");
    }

    @Test
    public void test50335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                    444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                    444444444..." + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                    444444444...");
    }

    @Test
    public void test50336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50336");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                        ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...4444444...444444444...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50337");
        double[] doubleArray2 = new double[] { 100, 3 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 3.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0d + "'", double3 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0d + "'", double4 == 3.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    }

    @Test
    public void test50338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                     4444444444444444444444444444444444444444444A.79A.1-EURTA44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50339");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaa                 ...                                                     444444444444444440true-1.0097...444444444444444444444444aaaaaaaaaaaaaaaaaaa", "0true-1.00", 28);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50340");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", "                                                   4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50341");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.009                                       tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.009", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50342");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444");
    }

    @Test
    public void test50343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50343");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444444444444444444444444...44444", "4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50344");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 527L, 179.0d, (double) 502);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 527.0d + "'", double3 == 527.0d);
    }

    @Test
    public void test50345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50345");
        short[] shortArray5 = new short[] { (byte) 10, (short) 4, (byte) 10, (short) 10, (short) 0 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 4, 10, 10, 0]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void test50346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#################################################################################aaaaaaaaaa##################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50347");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("TRUE-100970", "44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50348");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.00-1.0097.04444444444444444444444444444444444444444444", "44444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50349");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "...7.044444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...7.044444444444444444444444444..." + "'", str1, "...7.044444444444444444444444444...");
    }

    @Test
    public void test50350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50350");
        char[] charArray7 = new char[] { '4', '4', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("...0true-1.0097...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test50351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50351");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...                                                                                                                               ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50353");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50354");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                            ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                            " + "'", str2, "                                                                                                                                                            ");
    }

    @Test
    public void test50355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("True-1.  97", "##############################################0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr####A#####0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50356");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#####################################################...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void test50357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaa0aaaaaaaaaaaaa444444...", 670, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa0aaaaaaaaaaaaa444444...AHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI" + "'", str3, "aaaaaa0aaaaaaaaaaaaa444444...AHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI!HI!HI!HI!HI!HI!HI!HI!HI!HAHI");
    }

    @Test
    public void test50358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50358");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test50359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("100.0 AAAA0TRUE-1.0097.044444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0 AAAA0TRUE-1.0097.044444444444444444444444" + "'", str2, "100.0 AAAA0TRUE-1.0097.044444444444444444444444");
    }

    @Test
    public void test50360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50360");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("true4-4449744                                       ", "a     0trae-1.0097.00trae-1.0097.00trae-1.0097.00trhiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50361");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", 554, 418);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str3, "4444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test50362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50362");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa", 106, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50363");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                   .0097.00tr                   ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##############################################0097.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50364");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
    }

    @Test
    public void test50365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50365");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("           00#######000#######000#######0011           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50366");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50367");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444449744444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-44497", 660);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH", 359);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50369");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "...44444444444444444444444444444444440true-1.0097...");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("...", strArray3, strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                                                                                                                                                                                                                                                                                                                             444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "..." + "'", str8, "...");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test50370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                  0                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50371");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("###0a001##", "             aaaa0aaaaa    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50372");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                               0aaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!" + "'", str4, "44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test50373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50373");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444...7900.1-eurt044444444444444444");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                97.0", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444444444444444444444444a...a7900a.a1a-aeurta044444444444444444" + "'", str5, "444444444444444444444444a...a7900a.a1a-aeurta044444444444444444");
    }

    @Test
    public void test50374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50374");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                          !hi!h!hi!h44444444444440.7900.1-EURT04444444444444444444444444444444444444444444                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test50375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0true-1.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50376");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50377");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                            aaaaaaaaaaaaaaaaaaaaaaaa", "                                         ...      444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50378");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                ", "0 true - 1 ", 0, 403);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 true - 1 " + "'", str4, "0 true - 1 ");
    }

    @Test
    public void test50379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...A ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50380");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "TRUE-1.00TRUE-1.97.                                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50381");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("444444444...4444444444........44444444444", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                aaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test50382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50382");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50383");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444...4444444444444444444444444444444444444444444444444hi!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...4444444444444444444444444444444444444444444444444hi!" + "'", str2, "4444444...4444444444444444444444444444444444444444444444444hi!");
    }

    @Test
    public void test50385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...", "A0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!..." + "'", str2, "ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...");
    }

    @Test
    public void test50386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50386");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "############################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50387");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!################################", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 83, 123);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 83");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50388");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0.001", "                     aaaa0aaaaa    ", 52);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("4444.444444444.4444444444444444444444444444444444444444444444444444410004444.444444444.444444444             AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA  ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.001" + "'", str5, "0.001");
    }

    @Test
    public void test50389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50389");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("                                ", strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("A A A        ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test50390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!", "...44444...TRUE-1.4444444...97.4444444..    a0a                 ...44444...TRUE-1.4444444...97.4444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test50391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0true-1.0097.00true-1.0097.00true-1.0097.00tr A 00true-1.0097.00tr", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 00true-1.0097.00tr" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 00true-1.0097.00tr");
    }

    @Test
    public void test50392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50392");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444...44444444444444444444444444444444440true-1.0097...44", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "100.0", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 43 + "'", int15 == 43);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test50393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50393");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4                                                                                                                                                                                                                                                                           4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 44");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50394");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                       444...44444444444444444444444444444444440TRUE-1.0097", 527);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!#######################", "044444444444444444444444444....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!#######################" + "'", str2, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!#######################");
    }

    @Test
    public void test50396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50396");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0444...44444444444444444444444444444444440TRUE-1.0097...4", ' ');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    a     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T" + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    a     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
    }

    @Test
    public void test50399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                       A44444444444444444444aaa4444                       A44444444444444444444aaa444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       a44444444444444444444AAA4444                       a44444444444444444444AAA444" + "'", str1, "                       a44444444444444444444AAA4444                       a44444444444444444444AAA444");
    }

    @Test
    public void test50400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50400");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test50401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50401");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...........................................................................................0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                      ...........................................................................................", "##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50402");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50403");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "                                  aaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50404");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("44444444444444444440TRUE-1.0097HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A            4A4         4A4                                                     41004.404    4A4         4A4             4A4         4A4                                                     41004.404    4A4         4A4             4A4         4A4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50405");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Ahi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50406");
        short[] shortArray6 = new short[] { (byte) 100, (short) -1, (byte) -1, (short) 100, (byte) 10, (short) 10 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, -1, -1, 100, 10, 10]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void test50407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50407");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                               100.0                                                ", (int) (short) 100);
        java.lang.String[] strArray11 = new java.lang.String[] { "a", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" };
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", strArray11, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                            100.0", strArray4, strArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray18);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, "079001-eurt0", 570, 72);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str14, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                            100.0" + "'", str15, "                                            100.0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test50408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50408");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                                                                                                                                                                                a   hi!hi!...                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a   hi!hi!..." + "'", str1, "a   hi!hi!...");
    }

    @Test
    public void test50409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...                                                                                                                                             ", "                                                                                      4444444444                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                                                             " + "'", str2, "...                                                                                                                                             ");
    }

    @Test
    public void test50410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50410");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", "0true-1 0097 044444444444444444444444444 4", 130);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a0a", "                                                                               ...0...");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test50411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50411");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", 741);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test50412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50412");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444444444444                             a                        A A A A.79                             a                        A A A A.1-eurt                             a                        A A A A4444444444444444444444444444444444444444444", 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test50413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Aaaaaaaaaa", "4444444444444444444444444444444444444...                            4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50414");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", ".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaa0a4444444...                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0atruea-a1a.a00aaaa4444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50416");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaa...aaaaaaaaaaaa...", "1000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50417");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00tr A 00true-1.0097.00tr", "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ", 819);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444444444444444444444... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444447404444444444444444444444444444... 444444444444444440true-1.0097...444444444444444444444444... 44444444444444444444444444444444400       000       000       00a", "                                          ##100.0###                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444447404444444444444444444444444444... 444444444444444440true-1.0097...444444444444444444444444... 44444444444444444444444444444444400       000       000       00a" + "'", str2, "44444444444444444444444444444444444444444444444444444... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444447404444444444444444444444444444... 444444444444444440true-1.0097...444444444444444444444444... 44444444444444444444444444444444400       000       000       00a");
    }

    @Test
    public void test50419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50419");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0atrue 1.  97.a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aa", (java.lang.CharSequence) "...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.00");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0atrue 1.  97.a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aa" + "'", charSequence2, "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0atrue 1.  97.a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aa");
    }

    @Test
    public void test50420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "4000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4000" + "'", str1, "4000");
    }

    @Test
    public void test50421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50421");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50422");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) " ", (java.lang.CharSequence) "...1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "...1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50423");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...0...AAA0AAAAAAAAA0AAAAAAAAA0AAAA44444444444444444444444444444444444444", "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test50424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50424");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...aaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...aaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("..####0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..####0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str1, "..####0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test50426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50426");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 4, 266);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test50427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                               ", 169, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####                                                                                                                                                               #####" + "'", str3, "#####                                                                                                                                                               #####");
    }

    @Test
    public void test50428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50428");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444..." + "'", str6, "4444444...");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4444444..." + "'", str8, "4444444...");
    }

    @Test
    public void test50429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50429");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                              a0a                                                                                                                                                                                                                                                                                                                                              ", "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50430");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0" + "'", str1, "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
    }

    @Test
    public void test50431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50431");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("   A    44                                                                                            A    44", 145, 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("H!ih!h!ih!", "...             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!h!ih!" + "'", str2, "H!ih!h!ih!");
    }

    @Test
    public void test50433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50433");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...444444444444444440true-1.0097...444444444444444444444444", ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test50434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50434");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 400, (float) 99L, (float) 147L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
    }

    @Test
    public void test50435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("444444444444444  444444444444444", 414);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                               444444444444444  444444444444444                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                               444444444444444  444444444444444                                                                                                                                                                                               ");
    }

    @Test
    public void test50436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50436");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...4a444hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44", 670, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50437");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0true-1.0              ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0              ..." + "'", str1, "0true-1.0              ...");
    }

    @Test
    public void test50438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50438");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("     ...         aaaa0aaaaa44444", "0TRUE-1.0097.04444444444444444444444444440AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA", 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50439");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "         ......00.7900.1-eurt00.79......aaaa", 585);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50440");
        char[] charArray13 = new char[] { '4', '4', ' ' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      ...                                                     ", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4 0true-1.0097.044444444444444444444444444", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "true-1.  97", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "            444444444444444  444444444444444             ..", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                     100.0                                                     aaaa", charArray13);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37 + "'", int22 == 37);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test50441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50441");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50442");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true", "                                                                                     0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50443");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ", 149, "444444444444444444 0444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ");
    }

    @Test
    public void test50444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50444");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444", "                                                          444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .AAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("444440444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444440444" + "'", str2, "444440444");
    }

    @Test
    public void test50446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50446");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...44444...4444444...4...AAAAAA...", 131, "...444444444444444444444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444444444444444444444444444444444444444444444444444444444440true-1.009744444444444444444444444...44444...4444444...4...AAAAAA..." + "'", str3, "...444444444444444444444444444444444444444444444444444444444440true-1.009744444444444444444444444...44444...4444444...4...AAAAAA...");
    }

    @Test
    public void test50447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("h", "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..." + "'", str2, "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
    }

    @Test
    public void test50448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50448");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                  0aaaa                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0aaaa" + "'", str1, "0aaaa");
    }

    @Test
    public void test50449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("############################################# # #############################################", "...40true-1.0097.04444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################# # #############################################" + "'", str2, "############################################# # #############################################");
    }

    @Test
    public void test50450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50450");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...44444...true-1.4444444...97.4444444...4444444444444...", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.00-1.0097.04444444444444444444444444444444444444444444", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    a   HI!HI!", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test50451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("44444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097." + "'", str1, "44444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097.");
    }

    @Test
    public void test50452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50452");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 359, 578.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 578.0d + "'", double3 == 578.0d);
    }

    @Test
    public void test50453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                     AAAA0AAAAA              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50454");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.04444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".04444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("##########################################################", "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50456");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("1000                                                     aaaa", "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("A.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444", "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444" + "'", str2, "A.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444");
    }

    @Test
    public void test50458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50458");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                          4444444...4444444...4444444...4...", 533);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 533 + "'", int2 == 533);
    }

    @Test
    public void test50459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################44444444400    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", "A A A A ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################44444444400    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A" + "'", str3, "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################44444444400    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
    }

    @Test
    public void test50460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50460");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...AAAA0AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAA0AAAA" + "'", str1, "...AAAA0AAAA");
    }

    @Test
    public void test50462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50462");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                ...444444", (int) (short) 44, 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50463");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, true, (-1.0d), 0L, 97.0d };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat(objArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(objArray5, '4', 403, 667);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 403");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, true, -1.0, 0, 97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, true, -1.0, 0, 97.0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0true-1.0097.0" + "'", str6, "0true-1.0097.0");
    }

    @Test
    public void test50464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50464");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440true");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440true" + "'", str4, "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440true");
    }

    @Test
    public void test50465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50465");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR a ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...", "a A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ..." + "'", str2, "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...");
    }

    @Test
    public void test50467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50467");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#################################", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################" + "'", str3, "#################################");
    }

    @Test
    public void test50468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50468");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...44444444444444444444444444444444440true-1.0097...A...444444444          aaaatrue-1.0097...A...44444444444444444444444444444444440true-1.0097...", "    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50469");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "4 ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test50470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50470");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.", "a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0      A         A         A         A         A         A         A         A         A         A         A         A         A         A", '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444440true-140097", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444444444440true-140097" + "'", str8, "44444444444444444444444444444444440true-140097");
    }

    @Test
    public void test50471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                             ", "4true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                          rue-1.0097.0", "AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50473");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50474");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaa...44444", 638, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa...44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaa...44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", 93, 181);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A..." + "'", str3, "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
    }

    @Test
    public void test50476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50476");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0000000000000000000000000000000000000000000", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50477");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test50478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50478");
        float[] floatArray1 = new float[] { 58.0f };
        float float2 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[58.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 58.0f + "'", float2 == 58.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 58.0f + "'", float3 == 58.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 58.0f + "'", float4 == 58.0f);
    }

    @Test
    public void test50479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50479");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("0097.", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
    }

    @Test
    public void test50480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50480");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "444444444444444444444444...7900.1-eurt044444444444444444", 91);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....", strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                      ", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test50481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50481");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test50482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50482");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE97TRUE9444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50483");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("A 0true-1.0097.00true-1.00AAAAA 0true-1.0097.00true-1.009", "                                                     ...                                     aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE97TRUE97aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##############################################################4true4-4449744#######################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50485");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA 0true-1.00-1.0097.0444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test50486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50486");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", (int) (short) 100);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 608, 22);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test50487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50487");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test50488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50488");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40", 96, "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40" + "'", str3, "0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40");
    }

    @Test
    public void test50489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50489");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50490");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0TRUE-1.00-1.0097.0                                           ", 657);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50491");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("true                                         TRUE-1                                                                                                  44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true                                         TRUE-1                                                                                                  AAA" + "'", str2, "true                                         TRUE-1                                                                                                  AAA");
    }

    @Test
    public void test50493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50493");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "Hi4!", "aaaa0aaaaa ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test50494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   A    44                                                                                            A    44", "0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444true-1....4444497....444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   A    44                                                                                            A    44" + "'", str2, "   A    44                                                                                            A    44");
    }

    @Test
    public void test50495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str2, "4444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test50496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50496");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test50497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                         ", "a.a7900a.a1a-aeurta0#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4" + "'", str1, "4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4");
    }

    @Test
    public void test50500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest100.test50500");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...40TRUE-1.0097.04444444444444444444444444444444444...a a a a", "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat");
        org.junit.Assert.assertNotNull(strArray2);
    }
}

