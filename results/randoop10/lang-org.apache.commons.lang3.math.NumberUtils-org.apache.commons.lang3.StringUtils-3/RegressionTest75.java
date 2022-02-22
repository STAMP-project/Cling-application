import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest75 {

    public static boolean debug = false;

    @Test
    public void test37501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                             Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0                                                                                                                                                                              ", "...t0444444444444444444444444444...", "-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr" + "'", str2, ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr");
    }

    @Test
    public void test37504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#...#4                       #a#4#...#4                       #a#4#...#4                       #a#4                     4#...#4                       #a#4#...#4                       #a#4#...#4#a#", "  a    TRUETRUETRUET");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#...#4                       #a#4#...#4                       #a#4#...#4                       #a#4                     4#...#4                       #a#4#...#4                       #a#4#...#4#a#" + "'", str2, "#...#4                       #a#4#...#4                       #a#4#...#4                       #a#4                     4#...#4                       #a#4#...#4                       #a#4#...#4#a#");
    }

    @Test
    public void test37505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37505");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("A A A A                        A                             ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test37506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaa 44444", "...000     ...                                                                                                                                                                                                                                                                                                                                                                                  ", "...0aAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaa 44444" + "'", str3, "aaaaa 44444");
    }

    @Test
    public void test37507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("###    a   HI!HI!...", 665);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ###    a   HI!HI!..." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ###    a   HI!HI!...");
    }

    @Test
    public void test37509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ahi       TRUE!       TRUEhi       TRUE!       TRUEhi       TRUE!       TRUEhaaaaaaaaaaaaaaa       TRUE44444       TRUEaaaaaaaaaaaaaaaaaaaaaaaa", "A A A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi       TRUE!       TRUEhi       TRUE!       TRUEhi       TRUE!       TRUEhaaaaaaaaaaaaaaa       TRUE44444       TRUEaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "ahi       TRUE!       TRUEhi       TRUE!       TRUEhi       TRUE!       TRUEhaaaaaaaaaaaaaaa       TRUE44444       TRUEaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37510");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("....4444444444444444444444444444...", 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....4444444444444444444444444444..." + "'", str3, "....4444444444444444444444444444...");
    }

    @Test
    public void test37511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", 848);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
    }

    @Test
    public void test37512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37512");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44                             ", 236, 820);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A  ", 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A  " + "'", str2, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A  ");
    }

    @Test
    public void test37514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37514");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("00#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######0", "0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37515");
        long[] longArray1 = new long[] { (short) 100 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test37516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37516");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test37517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37517");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 99, 820);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37519");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("####################aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ######################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37520");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444440097...##########################################0444##############################################4444444444444...###########################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37521");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test37522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37522");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test37523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37523");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("   A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", 83, 657);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h" + "'", str3, "   A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
    }

    @Test
    public void test37524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37524");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                hi4!", (float) 30);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 30.0f + "'", float2 == 30.0f);
    }

    @Test
    public void test37525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444 97.0 true-1.0 44444444444444444444444444444444444444444440" + "'", str2, "4444444444444444444444444444444444444444444 97.0 true-1.0 44444444444444444444444444444444444444444440");
    }

    @Test
    public void test37526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", "                                                                         aaaa0aaaaa    ", "...                aaaaa0aaaa                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0..." + "'", str3, "AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
    }

    @Test
    public void test37527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37527");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                              0                     ", "                                            AAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", "0097...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################444444444" + "'", str2, "4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################444444444");
    }

    @Test
    public void test37529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37529");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("097.0                       a                    ", 250, 645);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37530");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("44444...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test37531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37531");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...", "0 tru...ue-1.0097.044444444444444444444444444444444...4444");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", (int) (byte) 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A" + "'", str8, "7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A");
    }

    @Test
    public void test37532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37532");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("11111111111111111111111111111111111111111", "44444aaaaa0aaaa         ...     ", 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...A..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37534");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37535");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...44444444444444444444444444444444440TRUE-1.0097...", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   1000    .         .        ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 14 + "'", int22 == 14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test37536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("00       000       000       00aa44444444444444444444...444444444444444444444444444444444444444444444", "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00       000       000       00aa44444444444444444444...444444444444444444444444444444444444444444444" + "'", str2, "00       000       000       00aa44444444444444444444...444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4                                                                                                                                                                                                                                                                           4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 44", (java.lang.CharSequence) "44444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37538");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37539");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test37540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37540");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAAAAAAAAAAAAAAAAAAAAAAA...", "                                                                            0097.                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37541");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0", "a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 891);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test37542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440", "Arrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440" + "'", str2, "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440");
    }

    @Test
    public void test37543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test37544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37544");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 82, (float) 56L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test37545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaa    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaa    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A" + "'", str1, "!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaa    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
    }

    @Test
    public void test37546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37546");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "                                       444...44444444444444444444444444444444440true-1.0097...44444...44444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37547");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 57.0f, (double) 33.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test37548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37548");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("A         A                                                     100.0    A         A0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a4444444444444444444444444444444444444444", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37549");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "...aaaaaaaaaaaaaaaaaaaaaaaaaa", 645);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37550");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444..4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444..44444" + "'", str1, "4444..44444");
    }

    @Test
    public void test37551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37551");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0aaaa                                                                                                                                  A                                                                                                                                  0aaaa", "...         aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37552");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0aaaaa    ", 479, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440aaaaa    4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440aaaaa    4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37553");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.", "                                         AAAA0AAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37554");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...........................................true-97...........................................true-97................................................................................true-97...........................................true-97......................................", "44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37556");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                         AAAA0AAAA", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test37557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37557");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                           aaaa0aaaaa                  ", 146);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                              100.0                                                     aaa", (int) 'a', 53);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test37558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                              ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444444444444444444444444444444440TRUE-1.0097..." + "'", str1, "...44444444444444444444444444444444440TRUE-1.0097...");
    }

    @Test
    public void test37559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37559");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                            4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "#########################################################################################################################################################                                                                                                                                  0AAAA                                                                                                                                  #########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################################################################################################################                                                                                                                                  0AAAA                                                                                                                                  #########################################################################################################################################################" + "'", str1, "#########################################################################################################################################################                                                                                                                                  0AAAA                                                                                                                                  #########################################################################################################################################################");
    }

    @Test
    public void test37561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37561");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", "                         AAAAAAAAAAAAAA                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37562");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(191, 750, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 750 + "'", int3 == 750);
    }

    @Test
    public void test37563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("        ", "                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        " + "'", str2, "        ");
    }

    @Test
    public void test37564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             " + "'", str1, "EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
    }

    @Test
    public void test37565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444", "                                                                                    0.001                                                            44444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444" + "'", str2, "44444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444");
    }

    @Test
    public void test37566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37566");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1aaaaaaaaaaa4444444...4444444...4444444...4", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", 534);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("      a     ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test37567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37567");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
    }

    @Test
    public void test37568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37568");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(19, 188, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test37569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37569");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                            100.0                                                     aaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test37570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37570");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "a0aaaaa              0true-1.0097.00true-1.0097.00trAaaaaaaaaaa4444444...4444444...4444444...4a0aaaaa              0true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test37571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(".7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a", "                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a" + "'", str2, ".7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a");
    }

    @Test
    public void test37572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                                                         rue-1.0097.0                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                         rue-1.0097.0                                                                                                                                                                                                                                                              " + "'", str1, "                                                                                                                                                                                                                                                                                         rue-1.0097.0                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test37573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("   1000    .         .         ", 461);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", "0true-1.00                               0                                                      0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A" + "'", str2, "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
    }

    @Test
    public void test37575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37575");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test37576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     " + "'", str1, "     ");
    }

    @Test
    public void test37577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37577");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("A A A A                        a                       ...aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "                                                                                                                                           0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0", 534);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A A A A                        a                       ...aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true" + "'", str4, "A A A A                        a                       ...aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true");
    }

    @Test
    public void test37578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa0.001...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", "44444..4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa0.001...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa0.001...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa");
    }

    @Test
    public void test37579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A", "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test37580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37580");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test37581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37581");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 741, (long) 256, (long) 625);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 741L + "'", long3 == 741L);
    }

    @Test
    public void test37582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37582");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(655.0f, (float) 1, (float) 632);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 655.0f + "'", float3 == 655.0f);
    }

    @Test
    public void test37583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37583");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "###    a   HI!HI!..", (java.lang.CharSequence) "..    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###    a   HI!HI!.." + "'", charSequence2, "###    a   HI!HI!..");
    }

    @Test
    public void test37584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37584");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 819);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444444444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37586");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                    4                                                 100.0                                                                             aaaa0aaaaa       ...                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test37587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37587");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" TRUE - 1 . 97 . ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"TRUE - 1 . 97 .\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37588");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097", "4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37589");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A", "44444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37590");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.0");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray6, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...4444...", strArray2, strArray6);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "...44444", 982, 132);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str12, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "...4444..." + "'", str16, "...4444...");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test37591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37591");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37592");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...A .....44444...true-1.4444444...97.4444444...4444444444444...                  4", "               ...", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa" + "'", str1, "aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
    }

    @Test
    public void test37594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...4444444444444444...", "    ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37596");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".044444444444444444444444444", " ...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA0.001...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA4                                                                                                                                                                                                                                                                                                            0TRUE-1.0097.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("#0044444440004444444000444444400");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#0044444440004444444000444444400" + "'", str1, "#0044444440004444444000444444400");
    }

    @Test
    public void test37598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37598");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!I");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37599");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("     A    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", 614);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37600");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "Ahi!hi!hi!haaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444" + "'", str1, "44444444444444444444444444");
    }

    @Test
    public void test37602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37602");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(" . 97 . ", 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test37603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37603");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37604");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...44444444444444444444444444444444440true-A...44444444444444444444444444444444440true-", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 585 + "'", int2 == 585);
    }

    @Test
    public void test37605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaA" + "'", str1, "aaaaaaaaA");
    }

    @Test
    public void test37607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37607");
        double[] doubleArray1 = new double[] { 34L };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[34.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.0d + "'", double2 == 34.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test37608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37608");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A0true-1.0097.00true-1.0097.00true-1.0097.00tr", "    a   HI!HI!..", 19);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test37609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0097.00T", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097.00T" + "'", str2, "0097.00T");
    }

    @Test
    public void test37610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37610");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(" ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("444444444444444440TRUE-1.0097...444444444444444444444444", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444", strArray2, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 344, 441);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 344");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444" + "'", str8, "44444444444444444444444444");
    }

    @Test
    public void test37611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 650);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37612");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4 0true-1.0097.044444444444444444444444444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a        ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4 0true-1.0097.044444444444444444444444444" + "'", str2, "4 0true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test37613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37613");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 42, 614.0d, (double) 147L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 614.0d + "'", double3 == 614.0d);
    }

    @Test
    public void test37614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37614");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "7900.1-EURT0", (java.lang.CharSequence) "7900.1-eurt0444100.0A00       000       000       0A00 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test37615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37615");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAA0AAAAA", "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         ", 4444444);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A        ", (java.lang.Object[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("a a a a a", strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0", strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                ", strArray6, strArray12);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAAA0AAAAA" + "'", str7, "AAAA0AAAAA");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str15, "true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test37616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37616");
        char[] charArray8 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...AAAA0AAAA", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test37617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37618");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4    4A4     404true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004t", 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4    4A4     404true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004t" + "'", str3, "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4    4A4     404true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004t");
    }

    @Test
    public void test37620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37620");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37621");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37622");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 ");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("##############################true-1.97.############################################", strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str4, "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test37623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37623");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAA", "!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37624");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aa...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4411111111111111111111111111111", "   4444444...AAAAAAAAA44444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aa..." + "'", str3, "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aa...");
    }

    @Test
    public void test37626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       ", 557, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test37627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", "                       ##44444444444444444444#...#444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A" + "'", str2, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
    }

    @Test
    public void test37628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " 0044444440004444444000                         00444444400044444440004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37629");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...........#######################################################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test37630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37630");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Aaaaaaaaaaa44.                                  aaaa.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37631");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 165, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4...44444444444444444444a                       ", "                                      ...                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4...44444444444444444444a" + "'", str2, "4...44444444444444444444a");
    }

    @Test
    public void test37633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37633");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37634");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                     AAAA0AAAAA           ", (float) 111);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 111.0f + "'", float2 == 111.0f);
    }

    @Test
    public void test37635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37635");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "...44444444444444444444444444444444440true-1.0097...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test37636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("####################################                                         AAAA0AAAAA####################################", "...........................................................................................0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA", "444444444..444444444444..444444444444..444444444444..444444444444..444444444444..444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37637");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI", "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 957);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444", 170, 848);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37638");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "Aaaaaaa a a a a aaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37639");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37640");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ", "0aaaa", 895);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "...44444444444...");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 " + "'", str5, "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 " + "'", str7, "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
    }

    @Test
    public void test37641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37641");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                0.001                                      ...", 73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37642");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444##444440true-1.0097...4444444444444444444440true-1#0097###44", "..00.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37643");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaa0aaaaaaaaaaaaa444444...", (long) 15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test37644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37644");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0", ".1-eurt00.7900.1-eurt", 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37645");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
    }

    @Test
    public void test37646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37646");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                            AAAA", 570);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 645);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37649");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "TRUE-1.0097.0", (java.lang.CharSequence) "true-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "TRUE-1.0097.0" + "'", charSequence2, "TRUE-1.0097.0");
    }

    @Test
    public void test37650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444440097...#############################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h" + "'", str2, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
    }

    @Test
    public void test37651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444440true-1.0097...44444", 819, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37652");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097..." + "'", str1, "0TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...");
    }

    @Test
    public void test37654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37654");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                    444...44444444444444444444444444444444440TRUE-1.0097...44                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444...44444444444444444444444444444444440TRUE-1.0097...44" + "'", str1, "444...44444444444444444444444444444444440TRUE-1.0097...44");
    }

    @Test
    public void test37655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("true 1.  97.", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "truea1.aa97." + "'", str3, "truea1.aa97.");
    }

    @Test
    public void test37656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa100aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444AAAAAAAAAAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa100aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa100aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37657");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...44444...4444444...4...aaaaaa...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test37658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", "     444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0" + "'", str2, "100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0");
    }

    @Test
    public void test37659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.00-1.0097.04444444444444444444444444444444AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                    " + "'", str1, "0TRUE-1.00-1.0097.04444444444444444444444444444444AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                    ");
    }

    @Test
    public void test37660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37660");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "    A         A                                                     100.0    A         A         ", 86);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                                                                                                                                                                                                                                                                                                    444444444..");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test37661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37661");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi", "               true  ", 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37663");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("...44444444444444444444444444444444440true-1.0097");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("...aaaa0aaaaa44444", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444" + "'", str2, "...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444");
    }

    @Test
    public void test37665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 419, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str3, "4444444444true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test37666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37666");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                               ...", (java.lang.CharSequence) "                                                               AAAA0AAAA                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test37667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37667");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37668");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test37669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444          " + "'", str1, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444          ");
    }

    @Test
    public void test37670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 4, "                             ...0TRUE-1.0097...                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37671");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                ..", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37672");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0                                             100.0                                                     aaaa                                                                                                                                                                                                                                                                                   ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                  44444a4444                 ", 101, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444                  44444a4444                 " + "'", str3, "44444444444444444444444444444444444444444444444444444444                  44444a4444                 ");
    }

    @Test
    public void test37674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test37675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37675");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test37676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37676");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test37677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37677");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(4.444404224E9d, 13.0d, (double) 83L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.444404224E9d + "'", double3 == 4.444404224E9d);
    }

    @Test
    public void test37678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37678");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 52, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37679");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444aaaaaaaaaaaaaaaaaa", "true-1.0097.0444444444444444444", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37680");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "4444444###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37681");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test37682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37682");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "    A     .7900.1-eurt0444444444444444444...", (java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37683");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                                                                                                                                                          ", "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37684");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 58L, (float) 216, 167.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 216.0f + "'", float3 == 216.0f);
    }

    @Test
    public void test37685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37687");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ", "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("100.0                                                     4444", "                                                                                                                                                                                                                                                                                                               444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0                                                     4444" + "'", str2, "100.0                                                     4444");
    }

    @Test
    public void test37689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37689");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ue-1.0097...444444444444444444444444                                                                                        100.", (java.lang.CharSequence) "44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...44444444444..", (int) (byte) 1, 54);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444.." + "'", str3, "...44444444444..");
    }

    @Test
    public void test37691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37691");
        long[] longArray1 = new long[] { (short) 100 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test37692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...00true-1.0097.00tru...", "    a  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...#####...true-1.#######...97.#######...#############...                  #0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000########", "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa                              ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#####...true-1.#######...97.#######...#############...                  #0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000########" + "'", str3, "...#####...true-1.#######...97.#######...#############...                  #0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000########");
    }

    @Test
    public void test37694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37694");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  0000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000000000000000000000000000000" + "'", str1, "0000000000000000000000000000000000000000000");
    }

    @Test
    public void test37695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37695");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37696");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...                                                                                              0aaaa                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37697");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444", "A4A4A4A444444444444444444444444a4...");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray9, strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray9);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray21, "##100.0###");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray23);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.endsWithAny(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", strArray23);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("4", strArray9, strArray23);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "aaa");
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEach("0TRUE-1.0097.04444444444444444444444444440AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0", strArray3, strArray9);
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str15, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4" + "'", str26, "4");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0TRUE-1.0097.04444444444444444444444444440AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0" + "'", str29, "0TRUE-1.0097.04444444444444444444444444440AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0");
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test37698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37698");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Ahi!hi!hi!haaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("          TRUE  ", "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str2, "..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
    }

    @Test
    public void test37701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", "true-1.00                                           true-1.97.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37702");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                 ...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a...                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 216 + "'", int1 == 216);
    }

    @Test
    public void test37703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37703");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 4444444444444444444444444444444444444444444", 797);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37704");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                     aaaa0aaaaa                     ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    ", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ...", charArray15);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test37705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37705");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", (int) 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", str3, "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test37706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "0TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test37707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37707");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("A A ", "true-1.00                                           true-1.97.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test37709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37709");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                     ...                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test37710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37710");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444...7900.1-eurt044444444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("...44444...true-1.4444444...97.4444444...4444444444444...", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  4                   ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 4444444444444444444444444444444444444444444", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test37711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAAAAA", 36, 150);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444", 44, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444");
    }

    @Test
    public void test37713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37713");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "A .7ee444ee44440.7ee444ee44440.7ee444ee44440.7e");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "4444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444" + "'", str4, "44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44444444444444444444444444" + "'", str5, "44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "44444444444444444444444444" + "'", str7, "44444444444444444444444444");
    }

    @Test
    public void test37714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#########################                                                                               ...0...#########################", 30, "....414-4eurt40");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################                                                                               ...0...#########################" + "'", str3, "#########################                                                                               ...0...#########################");
    }

    @Test
    public void test37715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444444                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444                                                                " + "'", str1, "4444444444444444444                                                                ");
    }

    @Test
    public void test37716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("####################################################################################################################################################################################################################################################...t0444444444444444444444444444...", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################..." + "'", str2, "########################################...");
    }

    @Test
    public void test37717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37717");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                       0                                                                                                                                 ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test37718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...                                                                                                                                                                             ...", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa", "h!ih!h!ih!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                                                                                                             ..." + "'", str3, "...                                                                                                                                                                             ...");
    }

    @Test
    public void test37720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37720");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37721");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("..0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str1, "..0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test37722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37722");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", 262, 173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37723");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("     444444444444444444444444444444444444444444", "", "4true4");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37724");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("    A         A         A  A         A        rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", 156, "4444444444444444444444444444444444444444444 0.79 0.1-eurt 04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    A         A         A  A         A        rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str3, "    A         A         A  A         A        rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test37725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37725");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 30, (double) 4, (double) 625);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 625.0d + "'", double3 == 625.0d);
    }

    @Test
    public void test37726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37726");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444true-1.00                                           true-1.97.                                                                                       ", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444true-1.00                                           true-1.97.                                                                                       " + "'", str3, "4444444true-1.00                                           true-1.97.                                                                                       ");
    }

    @Test
    public void test37727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37727");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                     ...                 7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt04444444444444444444    a  .7900.1-eurt04444444444444444444444444444444444444444444                            ...                                                                      ...                                                                      ...                                                                      ...                 eurt", "                           ", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test37728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("100.0aaaa", "                                                                                                                     0                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37729");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test37730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37730");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...0aaaa0aaaaa44444444444444444444444444444444...", 969, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ...0aaaa0aaaaa44444444444444444444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ...0aaaa0aaaaa44444444444444444444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test37731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0097.00T44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444...4444444.79...4444444.1-eurt...44444444444444444444444444444444444444444444444444T00.7900" + "'", str1, "4444444444444444444444444444444444444444444...4444444.79...4444444.1-eurt...44444444444444444444444444444444444444444444444444T00.7900");
    }

    @Test
    public void test37733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("044444444444444444444444444                                                                                    ", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "044444444444444444444" + "'", str2, "044444444444444444444");
    }

    @Test
    public void test37734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37734");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  4                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37735");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 277, (float) 201, (float) 957L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 201.0f + "'", float3 == 201.0f);
    }

    @Test
    public void test37736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37736");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH ");
    }

    @Test
    public void test37737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("a         a    0001                                                     a         a", "a444444444444444444444444                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a         a    0001" + "'", str2, "a         a    0001");
    }

    @Test
    public void test37738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("    A         A         A  A         A        rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444.79.1-eur        A         A  A         A         A    " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444.79.1-eur        A         A  A         A         A    ");
    }

    @Test
    public void test37739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37739");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test37740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               !hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    " + "'", str2, "                                                               !hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ");
    }

    @Test
    public void test37742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37742");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("           a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test37743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37743");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 741 + "'", int1 == 741);
    }

    @Test
    public void test37744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37744");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                                                     ", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37745");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444", (float) 127L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test37746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37746");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("97..###############################################################################################################################################", (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test37747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37747");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("true444...44444444444444444444444444444444440TRUE-1.0097...44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true444...44444444444444444444444444444444440TRUE-1.0097...44" + "'", str1, "true444...44444444444444444444444444444444440TRUE-1.0097...44");
    }

    @Test
    public void test37748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37748");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444true-1a97a4444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A..." + "'", str2, "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
    }

    @Test
    public void test37750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37750");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaa.", "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37751");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...", "true                                         TRUE-1                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37753");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444A444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test37754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37754");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("....4444444444444444444444444444..", "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0tr", 12);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("TRUETRUE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 655 + "'", int5 == 655);
    }

    @Test
    public void test37755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37755");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split(".....4444444444444444444444444444...4444444444...", "444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 49);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("0atruea-a1a.a0097a.a0", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                        ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test37756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37756");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444...", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                         AAAA0AAAAA", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test37757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37757");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#...#4#a#", "                                             A                                                 ", 12);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                     4444444444444444444444444444444444444444444a.79a.1-eurta44444444444444444444444444444444444", 132, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test37758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A 0true-1.0097.00true-1.00AAAAA 0true-1.0097.00true-1.009");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37759");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                               ...", 59);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37760");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444", "aaaaaaa      a         a         a         a         aaaaaaaa", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37761");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444", 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37762");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaa                                                     0.001                            A      A  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 133);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 133 + "'", int2 == 133);
    }

    @Test
    public void test37763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("e7.04444ee444ee7.04444ee444ee7.04444ee444ee7. A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e7.04444ee444ee7.04444ee444ee7.04444ee444ee7. A" + "'", str1, "e7.04444ee444ee7.04444ee444ee7.04444ee444ee7. A");
    }

    @Test
    public void test37764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#########...##########........###########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########...##########........###########" + "'", str1, "#########...##########........###########");
    }

    @Test
    public void test37765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37765");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                             ...                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                              ...                            is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                             " + "'", str3, "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                             ");
    }

    @Test
    public void test37767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37767");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("A .7ee444ee44440.7ee444ee44440.7ee444ee44440.7e", "a    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37768");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00  ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "444...44444444444444444444444444444444440true-1.0097...44");
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test37769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37769");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test37770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37770");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa" + "'", str2, "aaaaaaaaaa");
    }

    @Test
    public void test37771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37771");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 957, 982);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37772");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                      100.0                                                     aaaa", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444440444", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("            ...                                   ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test37773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...44444444444...                                                                                                                                                        ", "44444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444...                                                                                                                                                        " + "'", str2, "...44444444444...                                                                                                                                                        ");
    }

    @Test
    public void test37774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37774");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                           ", 173, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37775");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ", 848);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37776");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...........................................................................................0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA", "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 545);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37777");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37778");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                 ", "4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37779");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0.0010.0hi");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("444444444...4444444444........444444444444444444", (java.lang.Object[]) strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "A A A A A");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!.....", 132, 400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440010444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440444444444...4444444444........444444444444444444hi" + "'", str5, "0444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440010444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440444444444...4444444444........444444444444444444hi");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test37780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "A A A A                        A                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################", "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ", "0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################" + "'", str3, "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################");
    }

    @Test
    public void test37783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37783");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                     a   hi!hi!...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test37784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37784");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                  a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A a                                                                                                                                                                                                                                                                                  ", "...                                                   ...                                                   ...                                                   ...                                                   ...                                      ###    a   HI!HI!....                                                   ...                                                   ...                                                   ...                                                   ...                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37785");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("########################################...", "444444444444444444       4444444440", "100.0#####100.0###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################..." + "'", str3, "########################################...");
    }

    @Test
    public void test37786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37786");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A", 667, "                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00  " + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00  ");
    }

    @Test
    public void test37788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Aaaaaaaaaaaa", 9, 59);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa" + "'", str3, "aaa");
    }

    @Test
    public void test37789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37789");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", 141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37790");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444 true-1. 97. 444444444444444444444444444444444444444444", "0ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A0444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37791");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "A", 5);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test37792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    " + "'", str1, "             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    ");
    }

    @Test
    public void test37793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37793");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test37794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37794");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37795");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("44444444444444444444444444444444444444444440true-1.0097.A44444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A44444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444440true-1.0097.A44444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A44444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           ", (-1), 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           " + "'", str3, "true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           ");
    }

    @Test
    public void test37797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37797");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(".0097.00TRUE-1.0097.00TRUE-1.0097.00TR.0097.00TRUE-1.0097.00TRUE-1.0097.00TR.0097.00TRUE-1.0097.00TRUE-1.0097.00TR.0097.00TRUE-1.0097.00T0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("true-1971");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE-1971" + "'", str1, "TRUE-1971");
    }

    @Test
    public void test37799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                        ...ue-1.0097.044444444444444444444444444444444...                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        ...ue-1.0097.044444444444444444444444444444444...                        " + "'", str2, "                        ...ue-1.0097.044444444444444444444444444444444...                        ");
    }

    @Test
    public void test37800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37800");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                 4A4                                                ", "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37801");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37802");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37803");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 46, "00aaaaaaaaaaaaa...aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test37804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37804");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                            100.0");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 12, 0);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("true            ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test37805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("true -   97", 12, 253);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true -   97" + "'", str3, "true -   97");
    }

    @Test
    public void test37806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37806");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      ...                                                     ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4 0true-1.0097.044444444444444444444444444", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                     AAAA0AAAAA              ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
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
    public void test37807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37807");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                       0aaaa                                                                                                                                  A                                                                                                                                  0aaaa                                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37808");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0true-1.00###########################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true-1.00###########################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097", 153, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097" + "'", str3, "44444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test37810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37810");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ", "...t0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37811");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA", "a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444", "...40TRUE-1.0097.04444444444444444444444444444444444...a a a a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444");
    }

    @Test
    public void test37814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37814");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 116 + "'", int1 == 116);
    }

    @Test
    public void test37815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("true-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................79...1-eurt" + "'", str1, ".............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................79...1-eurt");
    }

    @Test
    public void test37816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444444444444444444444TRUE44444444444444444444444444444444444", "                                                                                                                                          ###################################################", "4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444TRUE44444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444TRUE44444444444444444444444444444444444");
    }

    @Test
    public void test37817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37817");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0true-1.0097.0444444444444444444", "AAAAAA0AAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37818");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                   .0097.00tr                   ", "444444444444444444444444...44444", 119);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   .0097.00tr                   " + "'", str3, "                   .0097.00tr                   ");
    }

    @Test
    public void test37819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37819");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a440true-1.0097.044444444444444444444444444aa", 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test37820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37820");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("       aaaa0aaaaa                     ...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test37821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaa#########.                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37822");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAA0AAAAA0AAAA0AAAAA0AAAA0AAAAA0AAAA0A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "97.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37823");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("100.0aaaa", 533, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37824");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test37825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37825");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("    aaaaa0aaaa                                                                         ", "  . 444444444444444444444444444444444444444444       .    . 44444444444444444444444444");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("ahi!hi!...", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test37826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37826");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00       0", "A     0true-1 0097 00true-1 0097 00true-1 0097 00tr");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37827");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(842.0f, (float) 895L, (float) 445);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 445.0f + "'", float3 == 445.0f);
    }

    @Test
    public void test37828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37828");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.04444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37829");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 632, (long) 205, 170L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 170L + "'", long3 == 170L);
    }

    @Test
    public void test37830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", 651, "                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A" + "'", str3, "                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
    }

    @Test
    public void test37831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37831");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37832");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaa...", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaa..." + "'", str3, "...0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaa...");
    }

    @Test
    public void test37833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37833");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37834");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4                                                   ", "Aaaaaaaaaaa44.                                  aaaa.", 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37835");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444444444444444444444444444444444444", "                                                                               ...0...", "Ahi!hi!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("            0 ", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            0 " + "'", str2, "            0 ");
    }

    @Test
    public void test37837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37837");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test37838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37838");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test37839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37839");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                          #...#4#a#", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37840");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("...4a444hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44", (float) 842);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 842.0f + "'", float2 == 842.0f);
    }

    @Test
    public void test37841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             a     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test37842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37843");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37844");
        char[] charArray14 = new char[] { '4', '4', ' ' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444444444444444444444", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "              ", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "TRUE97TRUE97", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444444444444...", charArray14);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "00       0true00       0-00       000                                                       ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 43 + "'", int19 == 43);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test37845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37845");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aa...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test37846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37847");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a.a7900a.a1a-aeurta0#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 657);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37848");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("h", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " aaaa0aaaaa                                                                                                      ", charArray8);
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
    public void test37849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37849");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 363, (long) 40, 741L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 40L + "'", long3 == 40L);
    }

    @Test
    public void test37850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ", "...444###################################################44444444444444444444444", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ...444###################################################44444444444444444444444              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ...444###################################################44444444444444444444444              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              " + "'", str3, "              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ...444###################################################44444444444444444444444              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ...444###################################################44444444444444444444444              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ");
    }

    @Test
    public void test37851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("a00       000       000       00", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     000       00" + "'", str2, "     000       00");
    }

    @Test
    public void test37852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37852");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", "...      aaaa0a", "0       00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a" + "'", str3, "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a");
    }

    @Test
    public void test37853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", "a0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test37854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                         ih0.0100.0                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37855");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444...4444444...4444444...4...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", 330);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test37858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("974444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "974444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                           TRUE 1.  97                                                                                                                                                                                                                                                                            444444444" + "'", str1, "974444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                           TRUE 1.  97                                                                                                                                                                                                                                                                            444444444");
    }

    @Test
    public void test37859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37859");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 44, (double) 969.0f, (double) 15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 969.0d + "'", double3 == 969.0d);
    }

    @Test
    public void test37860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37860");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a   HI!HI!..    a   HI!HI!..    a   HI!HI!..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37861");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (float) 754);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 754.0f + "'", float2 == 754.0f);
    }

    @Test
    public void test37862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("A         A         A         A         A         A         A         A         A         A   114", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37864");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".............................................");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                              a                        A A A A                                                                 ", "4444400       0444444                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              a                        A A A A                                                                 " + "'", str2, "                                                                                              a                        A A A A                                                                 ");
    }

    @Test
    public void test37866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37866");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444", "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37867");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37868");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444", 650);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "00#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37870");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test37871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444", "hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37872");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                         ...      444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 269, 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...00true-1.0097.00true-1.0097.00tr", "a     0trae-1.0097.00trae-1.0097.00trae-1.0097.00trhiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahh", "                                                          ...####################################..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...00true-1.0097.00true-1.0097.00tr" + "'", str3, "...00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test37875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A00       000       000       00", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", 187, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", str3, "44444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test37877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ATT-------TTT-------TTT-------TT", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ATT-------TTT-------TTT-------TT" + "'", str2, "ATT-------TTT-------TTT-------TT");
    }

    @Test
    public void test37878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37878");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test37879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37879");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  Etrue-1.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E97.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E4444444444444444444444444444444444444444444", (java.lang.CharSequence) "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A           ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "4444444444444444444444444444444444444444444RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  Etrue-1.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E97.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E4444444444444444444444444444444444444444444" + "'", charSequence2, "4444444444444444444444444444444444444444444RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  Etrue-1.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E97.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E4444444444444444444444444444444444444444444");
    }

    @Test
    public void test37880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                               !hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", "aaaaaaa      a         a         a         a         aaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                    ", "                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test37882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37882");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("..44440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444HI HI HI HI HI HI HI HI HI HI...4444a44444444", "4044444444444444444444444444                                                                                    0TRUE-1.0097.044444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                        ...0TRUE-1.0097...                             ", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              ..." + "'", str2, "                              ...");
    }

    @Test
    public void test37884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.0..." + "'", str2, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.0...");
    }

    @Test
    public void test37885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AAAAA", 732);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                           AAAAA                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                           AAAAA                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test37886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0 tru...ue-1.0097.044444444444444444444444444444444...4444", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 tru...ue-1.0097.044444444444444444444444444444444...4444" + "'", str2, "0 tru...ue-1.0097.044444444444444444444444444444444...4444");
    }

    @Test
    public void test37887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37887");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TRUE-1.  97.", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h####################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test37888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37888");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh###############################################################################", 165);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("iAi irti00i!i!900i!i1i-ieurti00i!i!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii iAi irti00i!i!900i!i1i-ieurti00i!i!                                       A HIhHIhHIhHAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iAi irti00i!i!900i!i1i-ieurti00i!i!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii iAi irti00i!i!900i!i1i-ieurti00i!i!                                       A HIhHIhHIhHAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "iAi irti00i!i!900i!i1i-ieurti00i!i!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii iAi irti00i!i!900i!i1i-ieurti00i!i!                                       A HIhHIhHIhHAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37890");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(49L, (long) 269, (long) 51);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 49L + "'", long3 == 49L);
    }

    @Test
    public void test37891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#########################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################" + "'", str2, "#########################################################");
    }

    @Test
    public void test37892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...", "4444444444444444444444444444444444444444444 97.0 true-1.0 44444444444444444444444444444444444444444440");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr..." + "'", str2, "1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...");
    }

    @Test
    public void test37893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...4#444hi!hi!hi!h############################...44", 671);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ...4#444hi!hi!hi!h############################...44" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ...4#444hi!hi!hi!h############################...44");
    }

    @Test
    public void test37894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAA", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                      AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                                                                      AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37895");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...t0444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37896");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", 95);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test37897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                                                                                                                                  44444444444444444440true-1.0097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444440true-1.0097" + "'", str1, "44444444444444444440true-1.0097");
    }

    @Test
    public void test37898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444444444440TRUE-1.0097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444440TRUE-1.0097" + "'", str1, "444444444444444440TRUE-1.0097");
    }

    @Test
    public void test37899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37899");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0", "..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", 84);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37900");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("...44444...TRUE-1.4444444.....4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444...TRUE-1.4444444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...44444...TRUE-1.4444444.....4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444...TRUE-1.4444444...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                      aahI!aa                                                                                                                                                                                                                                                                                                                                       ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                      aahI!aa                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "                                                                                                                                                                                                                                                                                                                                      aahI!aa                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test37902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37902");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", "                             ...0TRUE-1.0097...                             ", 819);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37903");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.", "####################################...", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37904");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test37905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37905");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "", 170);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test37906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37906");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                 ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaa0aaaaa", "                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444###44444444444444444444444444444444440true-1#0097###44", strArray2, strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaa0aaaaa" + "'", str7, "aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "444###44444444444444444444444444444444440true-1#0097###44" + "'", str8, "444###44444444444444444444444444444444440true-1#0097###44");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test37907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0true-1.0097.044444444444444444444444444..", 424, 542);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                        0true-1.0097.044444444444444444444444444.." + "'", str3, "                                                                                                                                                                                                        0true-1.0097.044444444444444444444444444..");
    }

    @Test
    public void test37908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37908");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0444", "    .         .                                                     1000    .         .         ", "0true-1.0097.4444444444444444444444444444444444444444444440true-1.009");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0444" + "'", str3, "0444");
    }

    @Test
    public void test37909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37909");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...4...4444444...4444444...4444444                      0", (java.lang.CharSequence) "A A A A ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37910");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test37911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37911");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444 0.79 0.1-eurt 04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37912");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###################    a   HI!HI!...#################", (java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("444444444444444  444444444444444", "444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "aaa0                                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444  444444444444444" + "'", str3, "444444444444444  444444444444444");
    }

    @Test
    public void test37914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37914");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", 87, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A..." + "'", str3, "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
    }

    @Test
    public void test37915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37915");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4", ".                                  aaaa.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                     a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "0true-1.0A A A A                        a44444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37917");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000", "", "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000" + "'", str3, "0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000");
    }

    @Test
    public void test37918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaa0aaaa                     ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0                     " + "'", str2, "0                     ");
    }

    @Test
    public void test37920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37920");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A" + "'", str3, "A");
    }

    @Test
    public void test37921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444..0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi", "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37923");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...44a44444                       ...", "                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37924");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("######################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#################################################################################################################################################################################################################################################################################################################################################################################################", "A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("A0000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A0000000000" + "'", str1, "A0000000000");
    }

    @Test
    public void test37926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                      100.0                                                ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      100.0                                                " + "'", str2, "                                      100.0                                                ");
    }

    @Test
    public void test37927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", str2, "44444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test37928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                    .001                                                                                                                                                                                  ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".001" + "'", str2, ".001");
    }

    @Test
    public void test37929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37929");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIA", "0true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("00000e0000", 657, 245);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000e0000" + "'", str3, "00000e0000");
    }

    @Test
    public void test37931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaa", "...4444                                                              ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37932");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test37933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097..." + "'", str2, "...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...");
    }

    @Test
    public void test37934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37934");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 10, -1, 10, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test37935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("      aaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      aaaaaaaaa..." + "'", str1, "      aaaaaaaaa...");
    }

    @Test
    public void test37936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37936");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("a#4#...", "0                                                                                                                                                                                                                                                                          0                                                               A A A A A0                                                                                                                                                                                                                                                                          0                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##" + "'", str1, "##");
    }

    @Test
    public void test37938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37938");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#A#44444444444444444444#...#444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#A#44444444444444444444#...#444444444444444444444444444444444444444444444" + "'", str1, "#A#44444444444444444444#...#444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37939");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...aaaa...444444444", "                           aaaa0aaaaa                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37940");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "HI");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test37941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test37942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("       ...      a         a         a         a         a", 156, 245);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ...      a         a         a         a         a" + "'", str3, "       ...      a         a         a         a         a");
    }

    @Test
    public void test37943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37943");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                       A0                                                                                                                                                                                       ", 267, "TRUE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                       A0                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                       A0                                                                                                                                                                                       ");
    }

    @Test
    public void test37944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37944");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.", (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test37945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37945");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37946");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                           0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 999 + "'", int1 == 999);
    }

    @Test
    public void test37947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 132);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           " + "'", str2, "          aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ");
    }

    @Test
    public void test37948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37949");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444447900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                            100.0                ...                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "44444444444444444444444444444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.0" + "'", str1, "44444444444444444444444444444444444444444440TRUE-1.0097.0");
    }

    @Test
    public void test37951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-10097" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-10097");
    }

    @Test
    public void test37952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Ahi!hi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!ih!ihA" + "'", str1, "...!ih!ihA");
    }

    @Test
    public void test37953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI..." + "'", str2, "HI!HI...");
    }

    @Test
    public void test37955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37955");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                               AAAA0AAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37956");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37957");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 618, 4.44444443E11f, (float) 170);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.44444443E11f + "'", float3 == 4.44444443E11f);
    }

    @Test
    public void test37958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37958");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37959");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "aaaa                                                     0.001                            A      A  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAhI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################", (int) (short) 1, 159);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaa" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaa");
    }

    @Test
    public void test37961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37961");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("             rue-1.0097.0", "                                                         100.                                                          ", 999);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "A 0true-1.0097.00true-1.00AAAAA 0true-1.0097.00true-1.009");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aahaa", 229, ".....4444444444444444444444444444...4444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahaa.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........44444444444444444444444" + "'", str3, "aahaa.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........44444444444444444444444");
    }

    @Test
    public void test37964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "A A A A                        a                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37965");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HI", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37966");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 134, "44444444440.7900.1-EURT0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444444444444444444aaaaaaaaaaaaaaaaaa", "00aaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444aaaaaaaaaaaaaaaaaa" + "'", str2, "4444444444444444444aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37968");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1", "4                                                   ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
    }

    @Test
    public void test37969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                             A                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37970");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            44444444444444444444444444                                               100.0                                                ", "####                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37971");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...4444444...4444444...4444444...44444...", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37972");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A                                               ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37973");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "               true                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37974");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    1000    .         .             1000    .         .          ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37975");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37976");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                       a                   TRUE-1.0097.0                       a                    ", "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAAAAAAAAAAAAAAAA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test37977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37977");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###################    a   HI!HI!...#################", 36, "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################    a   HI!HI!...#################" + "'", str3, "###################    a   HI!HI!...#################");
    }

    @Test
    public void test37978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37978");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                          ", 667);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 667 + "'", int2 == 667);
    }

    @Test
    public void test37979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37979");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0true-1.0097.044444444444444444444444444 ...a                               ", 0, 279);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37980");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                          ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("A44444", "true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A44444" + "'", str2, "A44444");
    }

    @Test
    public void test37982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37982");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00tr A", 967, "#A#44444444444444444444#...#444444444444444444444444444444444444444444444     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#44444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00tr A#A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#44444444444444444" + "'", str3, "#A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#44444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00tr A#A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#44444444444444444");
    }

    @Test
    public void test37983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37983");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                      aaaa 0 aaaaa               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaa 0 aaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37984");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 216, (float) 545, (float) 630L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 630.0f + "'", float3 == 630.0f);
    }

    @Test
    public void test37985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37985");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("444", "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa", 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37986");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("444444444444444440true-1.0097...a0aaaaa0true-1.0097.0444100.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444440true-1.0097...a0aaaaa0true-1.0097.0444100.0" + "'", str1, "444444444444444440true-1.0097...a0aaaaa0true-1.0097.0444100.0");
    }

    @Test
    public void test37987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37987");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0true-1.0097.00true-1.0097.0", "...444###################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37988");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "true-1....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37989");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4 ", 732, "A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                              4 A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                              " + "'", str3, "A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                              4 A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                              ");
    }

    @Test
    public void test37990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37990");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444..");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test37991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str2, "#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test37992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37992");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                                                                                                                                                                                      44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444                                                                                                                                                                                                                                                                       ", "###    a   HI!HI!...", 252);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37993");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37994");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37995");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37996");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(741, 15, 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test37997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("000                                                                                                                                                                                                                                                                                                                                                                                       ", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "000                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test37998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37998");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                  ", "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                  " + "'", str3, "                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test37999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37999");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0097..###############################################################################################################################################", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "44444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test38000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test38000");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

