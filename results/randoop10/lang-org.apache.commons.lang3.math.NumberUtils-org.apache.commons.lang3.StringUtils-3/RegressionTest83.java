import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest83 {

    public static boolean debug = false;

    @Test
    public void test41501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41501");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("44444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test41502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41502");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 557 + "'", int2 == 557);
    }

    @Test
    public void test41503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A");
    }

    @Test
    public void test41504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41504");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "444444444444444444444444444444444444444", 62);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str4, "0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test41505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41505");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                       A                       A                      ...", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test41506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41506");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(665, 667, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 667 + "'", int3 == 667);
    }

    @Test
    public void test41507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaa000true000-00000000097000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                0.001                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41509");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                                                     0aaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41510");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444", "0       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41511");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...44444444444...                                                                                                                                                                                                       ", 465);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41512");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                            0TRUE-1.0097.044444444444444444444444444 ...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA0.001...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", 237, "                                                               0aaa                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str3, "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test41514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41514");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A44444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("       444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444" + "'", str1, "444444444444444444");
    }

    @Test
    public void test41516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa", 545, "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaaaTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa " + "'", str3, "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaaaTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa ");
    }

    @Test
    public void test41517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41517");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("TRUETRUE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", 0, 957);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRUETRUE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str3, "TRUETRUE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test41518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41519");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41520");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                           ", "    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         true-1        true-1        true-1        true-1        true-1        true-1        true-1      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444          ", "true-1.00                                           true-1.97.true-1.00                                           true-1.97.true-1.00                                           true-1.97.4444444...444444           AAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444          " + "'", str2, "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444          ");
    }

    @Test
    public void test41523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41523");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
    }

    @Test
    public void test41524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41524");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 384, 21.0d, 86.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21.0d + "'", double3 == 21.0d);
    }

    @Test
    public void test41525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41525");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", ".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih ", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41526");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    a  ", "                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...0TRUE-1.0097...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41528");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA                                                                                                         ", "...44444...4444444...4...ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) '#', 131);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA                                                                                                         " + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA                                                                                                         ");
    }

    @Test
    public void test41529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41529");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...####################################..", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41530");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAA100.", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41531");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aAAAAAAAAAAAAAAAA...", (java.lang.CharSequence) "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41532");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                       a44444444444444444444...444444444444444444444444444444444444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "A A A");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    ", strArray2, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test41533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", "######################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444" + "'", str2, "####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
    }

    @Test
    public void test41534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41534");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("a0044444440004444444000444444400");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaa", "4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479", 841);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a0044444440004444444000444444400" + "'", str4, "a0044444440004444444000444444400");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a0044444440004444444000444444400" + "'", str11, "a0044444440004444444000444444400");
    }

    @Test
    public void test41535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaa000true000-00000000097000000", 79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test41536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41536");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 19L, (float) 22L, (float) 113L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 113.0f + "'", float3 == 113.0f);
    }

    @Test
    public void test41537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41537");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test41538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                   AAAAAAAAAA                    ", 449);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   AAAAAAAAAA                    " + "'", str2, "                   AAAAAAAAAA                    ");
    }

    @Test
    public void test41539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41539");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test41540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "4444404444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test41541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    ", "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    " + "'", str2, "             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    ");
    }

    @Test
    public void test41542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (byte) 100, "...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0444444444444444444444444444444444444444444", "44...7900.1-eurt04444444444444444444444444444444444...444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0444444444444444444444444444444444444444444" + "'", str2, "0444444444444444444444444444444444444444444");
    }

    @Test
    public void test41544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41544");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", 56);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" ", ".....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                                                                                              hi!                                                                                                                                                                                                                                                                                                                                              ", strArray5, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                                                                                                                                                              hi!                                                                                                                                                                                                                                                                                                                                              " + "'", str9, "                                                                                                                                                                                                                                                                                                                                              hi!                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test41545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444", "       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444a0aaaaa       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444" + "'", str2, "...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444");
    }

    @Test
    public void test41546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ", 92, "###################################    a   HI!HI!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     " + "'", str3, "44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ");
    }

    @Test
    public void test41547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue444...44444444444444444444444444444444440TRUE-1.0097...44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41548");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("        a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...", "44444444444444...7900.1-eurt044444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t..." + "'", str2, "hi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
    }

    @Test
    public void test41550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41550");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.0097.", "Ahi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str1, "true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test41552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41552");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                                    ", 15, 167);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                        " + "'", str3, "                                                                                                                                                        ");
    }

    @Test
    public void test41553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41553");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                                                                                                                               " + "'", str1, "...                                                                                                                                               ");
    }

    @Test
    public void test41555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("00.1-eurt044444444444444444444444444444", "0097.00T");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41557");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41558");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 109, 840);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("A A A A A A A A A A A A A A A A A A A A A A A A 4479     000       000       09700       000       0", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " A 4479     000       000       09700       000       0" + "'", str2, " A 4479     000       000       09700       000       0");
    }

    @Test
    public void test41560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41560");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", "                     aaaa0aaaaa              ", (int) (short) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("A         A                                  ", (java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "04440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444444444444444444444444...4444444444444444444444444444444444A         A                                  TRUE-1.A         A                                  A         A                                  97...444444444444444444444444" + "'", str5, "444444444444444444444444...4444444444444444444444444444444444A         A                                  TRUE-1.A         A                                  A         A                                  97...444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "444444444444444444444444...444444444444444444444444444444444404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444TRUE-1.044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044497...444444444444444444444444" + "'", str7, "444444444444444444444444...444444444444444444444444444444444404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444TRUE-1.044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044497...444444444444444444444444");
    }

    @Test
    public void test41561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.", "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test41562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41562");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "     ...0TRUE-1.0097...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41563");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...44444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41564");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     ", "aaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41565");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "            0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444", "0true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.0" + "'", str2, "0true-1.0097.0");
    }

    @Test
    public void test41567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41567");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...0TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.0" + "'", str1, "...0TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.0");
    }

    @Test
    public void test41569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("A      ...", "TRUE-100970");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41570");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41571");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ", ".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("7900.1-eurt0444100.0A00       000       000       0A00       000 ", "A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41573");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00  ", "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444", 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41574");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                97.0                                                                                                97.0                                                                                                97.0                                                                                                97.0                                            444                                                                                                97.0                                                                                                97.0                                                                                                97.0                                                                                                97.0                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97.0                                                                                                97.0                                                                                                97.0                                                                                                97.0                                            444                                                                                                97.0                                                                                                97.0                                                                                                97.0                                                                                                97.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 190, 130);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         true-1        true-1        true-1        true-1        true-1        true-1        true-1      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         true-1        true-1        true-1        true-1        true-1        true-1        true-1      " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         true-1        true-1        true-1        true-1        true-1        true-1        true-1      ");
    }

    @Test
    public void test41577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41577");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "44444444444444444444444444444444444444444AAAAAAAAA...4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41578");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#####\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41579");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test41580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "44444444444444444444 !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test41581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("00 0", "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat", 630);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00 0" + "'", str3, "00 0");
    }

    @Test
    public void test41582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                 444444444444444444444444444444444444444444", "0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                       A0                                                                                                                                                                                       ", 292);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                       A0                                                                                                           " + "'", str2, "                                                                                                                                                                                       A0                                                                                                           ");
    }

    @Test
    public void test41585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41585");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a00       000       000       00", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "A44444");
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444" + "'", str4, "aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test41586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41586");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi                                                                                                                                  0aaaa                                                                                                                                  ", (java.lang.CharSequence) "A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41587");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", "44444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     " + "'", str2, "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
    }

    @Test
    public void test41589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("... AAAA0AAAAA##################################################################################################################################################################################################################", "444##444440true-1.0097...4444444444444444444440true-1#0097###44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... AAAA0AAAAA##################################################################################################################################################################################################################" + "'", str2, "... AAAA0AAAAA##################################################################################################################################################################################################################");
    }

    @Test
    public void test41590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41590");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test41591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str1, "444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
    }

    @Test
    public void test41592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41592");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                   rt00.7900.                   ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41593");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                         000                                                    ", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         000                                                    " + "'", str3, "                                         000                                                    ");
    }

    @Test
    public void test41594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41594");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0097.00true-1.00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test41595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41595");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(265, 2, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test41596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41596");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444...44444444444444444444444444444444440true-1.0097...44", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                  aaaa0                                                                                                                                  ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test41597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                    " + "'", str1, "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                    ");
    }

    @Test
    public void test41598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41598");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(797, 444, 895);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 444 + "'", int3 == 444);
    }

    @Test
    public void test41599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41599");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(544, 190, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 544 + "'", int3 == 544);
    }

    @Test
    public void test41600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41600");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "4444a44444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test41601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41601");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T", 0, 53);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097." + "'", str3, "0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.");
    }

    @Test
    public void test41603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41603");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", (java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("100.0                                                     aaaa", strArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                                                                                                                                                                            0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A                                 100.0                                                     aaaa..                                                                                                                                                                                            ", 623, 614);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test41604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41604");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444444444444...true-1.4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444...true-1.4444444" + "'", str1, "444444444444444444...true-1.4444444");
    }

    @Test
    public void test41605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0TRUE-1.009...", "...44444...TRUE-1.4444444...97.4444444...4444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.009..." + "'", str2, "0TRUE-1.009...");
    }

    @Test
    public void test41606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41606");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 826.0f, (double) 665L, (double) 124);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 826.0d + "'", double3 == 826.0d);
    }

    @Test
    public void test41607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAAAA0AAAAAAA", "Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAA0AAAAAAA" + "'", str2, "AAAAAA0AAAAAAA");
    }

    @Test
    public void test41608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaa0aaaa0.7900.1-eurt04444444444444444... 44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa0aaaa0.7900.1-eurt04444444444444444... 44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "aaaaaa0aaaa0.7900.1-eurt04444444444444444... 44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test41609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(".1-eurt00.7900.1-eurt", 648);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".1-eurt00.7900.1-eurt                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, ".1-eurt00.7900.1-eurt                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test41610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41610");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41611");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 656, 5L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test41612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41612");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A                                 100.0                                                     aaaa..", "44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                                                           4444a44444                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444a44444" + "'", str1, "4444a44444");
    }

    @Test
    public void test41614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41614");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.", "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...a", "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097." + "'", str3, "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.");
    }

    @Test
    public void test41615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41615");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444", "                     aaaaa0aaaa                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...444                                                   ", 732);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444                                                   " + "'", str2, "...444                                                   ");
    }

    @Test
    public void test41618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41618");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00       000       000       00aa44444444444444444444...444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                            100.01aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...444444", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test41619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41619");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...1-eurt00.7900.1-eurt", "##############################################0097.", 95);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aa                100.0aaaa                 ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 1-eurtaa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 1-eurt" + "'", str5, "aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 1-eurtaa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 aa                100.0aaaa                 1-eurt");
    }

    @Test
    public void test41620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41620");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaa0aaaaa                                             aaaa0a                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "444...44444444444444444444444444444444440TRUE-1.0097...44444...444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test41622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41622");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0AAAA A 0AAAA", (java.lang.CharSequence) "##########################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", 130);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A 0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test41624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41624");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                0.001                                               ", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a4true4-44497", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                         AAAA0AAAAA", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 43 + "'", int19 == 43);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 41 + "'", int23 == 41);
    }

    @Test
    public void test41625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41626");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaa    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     a    40true-1.0097.     a    40true-1.0097.  a    4aaaaaaa!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaa    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a" + "'", str1, "!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     a    40true-1.0097.     a    40true-1.0097.  a    4aaaaaaa!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaa    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a");
    }

    @Test
    public void test41627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Aaaaaaaaaa", "4                                                 100.0                                                                             AAAA0AAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaa" + "'", str2, "Aaaaaaaaaa");
    }

    @Test
    public void test41628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     AAAAAA0AAAAAAAAAAAAA444444...                                                                                                                                                                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  " + "'", str1, "                                  ");
    }

    @Test
    public void test41630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41630");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                        4444444444444444444444444444444444444444444444444444444444", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                      aaaa", "                          44444444444444444444444a", "...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444...aaaa0aaaaa44444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41633");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4               #######    a   HI!HI!...0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4               #######    a   HI!HI!...0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str3, "4               #######    a   HI!HI!...0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test41634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41634");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("rue-1.0097.00tr", "a   HI!HI!..    a   HI!HI!..    a   HI!HI!..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41635");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#A#44444444444444444444#...#444444444444444444444444444444444444444444444     ", 188);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 188 + "'", int2 == 188);
    }

    @Test
    public void test41636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41636");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr44A4", "...a..############################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaa                              0                     ", 545);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaa                              0                     " + "'", str2, "AaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaa                              0                     ");
    }

    @Test
    public void test41638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                  000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41639");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAA                         ", "0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41641");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....!", "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test41643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41643");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                               A                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4444444###4444444###4444444###4###", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444###4444444###4444444###4###" + "'", str2, "4444444###4444444###4444444###4###");
    }

    @Test
    public void test41645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41645");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-44497", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(" 44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "#############################################...0...AAA0AAAAAAAAA0AAAAAAAAA0AAAA44444444444444444444444444444444444444##############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, " 44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test41647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41647");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444   00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test41648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41648");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("true-1.0097.00true-1.0097.00true-1.0097.00trA0t");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test41649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0TRUE-1009700TRUE-1009700TRUE-1009700TRUE-1009700TRUE-1009700TRUE-1009700TRUE-100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1009700TRUE-1009700TRUE-1009700TRUE-1009700TRUE-1009700TRUE-1009700TRUE-100" + "'", str1, "0TRUE-1009700TRUE-1009700TRUE-1009700TRUE-1009700TRUE-1009700TRUE-1009700TRUE-100");
    }

    @Test
    public void test41650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41650");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 541L, 16.0f, 4.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.0f + "'", float3 == 4.0f);
    }

    @Test
    public void test41651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41651");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("1                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41652");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("       ", 141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 141 + "'", int2 == 141);
    }

    @Test
    public void test41653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                    97atrue-1.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                    97atrue-1." + "'", str1, "                                                    97atrue-1.");
    }

    @Test
    public void test41654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41654");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "true 1.  97.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41655");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("    a                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    a                     \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                     ...                                                     4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                     ...                                                     4444444444444444444444444 TRUE - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 TRUE - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 TRUE - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 TRUE - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 TRUE - 1 . 97 . 4444444444444444444444444444444444444444444" + "'", str1, "                                     ...                                                     4444444444444444444444444 TRUE - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 TRUE - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 TRUE - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 TRUE - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 TRUE - 1 . 97 . 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test41657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" ", "...........................................................................................0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41658");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                       A44444444444444444444aaa4444                       A44444444444444444444aaa444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                       A44444444444444444444aaa4444                       A44444444444444444444aaa444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41659");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("true 1.  97. ", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test41660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41660");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test41661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41661");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", ".. A..", 22);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "0       000       00790       000       000       00-0       00eurt0       00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...aaaa...", "1AAAAAAAAAAA4444444...4444444...4444444...4    AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaa" + "'", str2, "...aaaa");
    }

    @Test
    public void test41664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41664");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("###########################################true-197############################################", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################true-197############################################" + "'", str2, "###########################################true-197############################################");
    }

    @Test
    public void test41666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41666");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41667");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("#true-#.############################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                            0aaa", "A         A                                                     100.0    A         A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            0aaa" + "'", str2, "                                                            0aaa");
    }

    @Test
    public void test41669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41669");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41670");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41671");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444...7900.1-eurt044444444444444444", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("...44444...true-1.4444444...97.4444444...4444444444444...", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  4                   ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence2, charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                        0.0010.0hi                                                                                                                                                                                                                                                                                                                                         ", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                      41004.404                                                ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test41672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41672");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444", "4444444444444444444444444444444444444444444 TRUE-1. 97. 444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41673");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4, 623, 554);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 623 + "'", int3 == 623);
    }

    @Test
    public void test41674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41674");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41675");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!HI!HI!HI!HI!HI!HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41676");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) ".");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RUE-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str1, "RUE-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test41678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                            ...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0T");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test41680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41680");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1aaaaaaaaaaa.........");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test41681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41681");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...4444444...", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test41682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444...44a1a4444444...4444444...44...a144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444...44a1a4444444...4444444...44...a14444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444...44a1a4444444...4444444...44...a14444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("a                             ###    a   HI!HI!...###    a   HI!HI!...###", "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a                             ###    a   HI!HI!...###    a   HI!HI!...###" + "'", str2, "a                             ###    a   HI!HI!...###    a   HI!HI!...###");
    }

    @Test
    public void test41684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA         A         A        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA         A         A        ..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA         A         A        ...");
    }

    @Test
    public void test41685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41685");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 468, 550.0f, (float) 449);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 550.0f + "'", float3 == 550.0f);
    }

    @Test
    public void test41686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A", 625);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A");
    }

    @Test
    public void test41687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41687");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                            100.0");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A", "    A     ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "0true-1.0097.0", (int) ' ', (int) (byte) 0);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", strArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", strArray8);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray8);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "#A#44444444444444444444#...#444444444444444444444444444444444444444444444", 895, 181);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.split("0true-1.00", 'a');
        boolean boolean25 = org.apache.commons.lang3.StringUtils.endsWithAny("    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", strArray24);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.stripAll(strArray24, "444...44444444444444444444444444444444440true-1.0097...44");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("                                              aaaaaaaaa.", strArray3, strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test41688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...aaaa...444444444", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", "0444444444       444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a" + "'", str2, "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a");
    }

    @Test
    public void test41690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41690");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test41691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41691");
        long[] longArray4 = new long[] { 'a', (byte) 100, 52L, 44 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[97, 100, 52, 44]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 44L + "'", long5 == 44L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 44L + "'", long8 == 44L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 44L + "'", long9 == 44L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test41692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                              aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa", "0true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa" + "'", str2, "                                                              aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa");
    }

    @Test
    public void test41693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41693");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "     A44444      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41694");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", 819);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41695");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
    }

    @Test
    public void test41696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(".001                                      ...", 236);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                               .001                                      ..." + "'", str2, "                                                                                                                                                                                               .001                                      ...");
    }

    @Test
    public void test41697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41697");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a                             ###    A   hi!hi!...###    A   hi!hi!...###", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   #################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41698");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.444444444444444E26d + "'", double1 == 4.444444444444444E26d);
    }

    @Test
    public void test41699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41699");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh", "00.0                                                     aaaa0true-1.0097.044444444444444444444444", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh");
    }

    @Test
    public void test41700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41700");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41701");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.", "444444A444444444444444444", "HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41702");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                            a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                              ", 236, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41703");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44" + "'", str4, "...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
    }

    @Test
    public void test41704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                 aaaa0aaaaa    ", "A A A A                        a                       ...aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 449);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##", "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##" + "'", str2, "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##");
    }

    @Test
    public void test41707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4000                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4000" + "'", str1, "4000");
    }

    @Test
    public void test41708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41708");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41709");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", "                                                                                                                                                                                                                                                                                         rue-1.0097.0                                                                                                                                                                                                                                                               ", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41710");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0.0010.0hi", "                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A       44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41711");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi                                                                                                                                  0aaaa", 109, 256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41712");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444", "0true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 4                                                                                              0097..0true-1.0097.040true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.0", 664);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                   ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test41713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41713");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", "44444444444true444444444444444444444444444444444444444", 445);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi..444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.", 400);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi..444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097." + "'", str2, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi..444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test41715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41715");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     A    ", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.Object[]) strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "...........................................................................................................................................................................");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "                                                                                                                                  aaaa0                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test41716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("true-1.97.", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1.97." + "'", str2, "true-1.97.");
    }

    @Test
    public void test41717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41717");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a", "44444444444444444444444444444444444444444440", 92);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41718");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41719");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaa", "true-1.       ...97true-1.       ...97");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaa");
    }

    @Test
    public void test41722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41722");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444", "                                      A                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41723");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0         aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0         aaa" + "'", str1, "0         aaa");
    }

    @Test
    public void test41724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41724");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test41725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41725");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 732);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41726");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaa0aaaa0.7900.1-eurt04444444444444444...HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41727");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUERT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT00TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                      aaaa 0 aaaaa               ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41728");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("###0.001##", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".............................................", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################aaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test41729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41729");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace(" ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41730");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaa0a4444444...                            ", 557, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa0a4444444...                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaa0a4444444...                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41731");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test41733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00trA", 850);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00trA" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00trA");
    }

    @Test
    public void test41734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("true-1. 97", 179, 551);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41735");
        long[] longArray1 = new long[] { 99L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[99]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 99L + "'", long3 == 99L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 99L + "'", long6 == 99L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 99L + "'", long7 == 99L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 99L + "'", long8 == 99L);
    }

    @Test
    public void test41736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41736");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444true-1.97" + "'", str2, "4444444444444444444444444444444444444444444true-1.97");
    }

    @Test
    public void test41738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41738");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("....4444444444444444444444444444..", 548, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444.." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444..");
    }

    @Test
    public void test41739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41739");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 35.0f, (double) 56, (double) 655.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test41740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41740");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("      a         a         a         a         a", "                     aaaa0aaaaa                     #A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
    }

    @Test
    public void test41742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41742");
        double[] doubleArray2 = new double[] { 100, 3 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 3.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0d + "'", double3 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test41743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41743");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test41744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41744");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...44444444444444444444444444444444440true-1.0097", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444444444444444444" + "'", str2, "...4444444444444444444");
    }

    @Test
    public void test41745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41745");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                           0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                           0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                           0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test41746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41746");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444 ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test41747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41747");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("...            ...            ...            ...            ...            ...            ...         ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test41748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41748");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "         A         A         A         A         A         A         ", (java.lang.CharSequence) "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "         A         A         A         A         A         A         " + "'", charSequence2, "         A         A         A         A         A         A         ");
    }

    @Test
    public void test41749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41749");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", "0aaa", 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41750");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...7.044444444444444444444444444..", 535);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                          ...7.044444444444444444444444444..                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                          ...7.044444444444444444444444444..                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test41752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444                                                   44444444444444444444444444444444444444444444444444444444444444444444444444444", "                                          aaaaaa                                                                ...44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-", 34, "       aaaa0aaaaa                     ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-" + "'", str3, "44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-");
    }

    @Test
    public void test41754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41754");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00." + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00.");
    }

    @Test
    public void test41755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                   aaaaa0aaaa                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                            0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0                                               41004.404" + "'", str1, "0true-1.0                                               41004.404");
    }

    @Test
    public void test41757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41757");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                        true-1....97true-1....97     ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test41758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41758");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("00       000       000       00a", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("A00       000       000       00", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                       #a######################...##############################################", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 23 + "'", int17 == 23);
    }

    @Test
    public void test41759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41760");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test41761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41761");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaa", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaa" + "'", charSequence2, "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaa");
    }

    @Test
    public void test41762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41762");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                      ...                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                      ...                                                    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41763");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0aaaaa0aaaaa0aaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41764");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "0 ", "...a..############################################################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41766");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A   \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41767");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41768");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444...                            ", "...44444444444444444444444444444444440true-1.0097...4444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", "                                                                                                                                       0aaaa                                                                                                                                  A                                                                                                                                  0aaaa                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4" + "'", str2, "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4");
    }

    @Test
    public void test41770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 178);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                  ");
    }

    @Test
    public void test41771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41771");
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0atrue 1.  97.a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aa", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test41772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41772");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 557, 131.0f, (float) 638L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 638.0f + "'", float3 == 638.0f);
    }

    @Test
    public void test41773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41773");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790" + "'", str1, "a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790");
    }

    @Test
    public void test41775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41775");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(".44444444444444444444444444444444a    4", "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41776");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("    a  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test41777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41777");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .AAAA", "a4444444444444444444444444444444", ".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .AAAA" + "'", str3, "444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .AAAA");
    }

    @Test
    public void test41778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41778");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("true-1.00true-1.97.", "ue");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41779");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" ", '4');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("4479", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("rT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("9744", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test41780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41780");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test41781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41781");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                     ", 106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test41782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41782");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaa444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###44aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test41783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41783");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                          ###################################################", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41784");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444..444444444444444440Ta0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tra0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test41785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41785");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("h", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test41786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("..0true-1.0097.00true-1.0097.00true-1.0097.00tr", 164, "                                                                                                            00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                            00true-1...0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str3, "                                                                                                            00true-1...0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test41787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444", "aaTRUE-1.  97.aa", "     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41788");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray5, strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray5);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "##100.0###");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.endsWithAny(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", strArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("4", strArray5, strArray19);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, '#');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str11, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4" + "'", str22, "4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4444444" + "'", str24, "4444444");
    }

    @Test
    public void test41789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41789");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41790");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(750, 854, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 854 + "'", int3 == 854);
    }

    @Test
    public void test41791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                       A0                                                                                                                                                                                       ", 265, 578);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                       A0                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                       A0                                                                                                                                                                                       ");
    }

    @Test
    public void test41792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                10000#####10000###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                10000#####10000##" + "'", str1, "                                                                                10000#####10000##");
    }

    @Test
    public void test41793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41793");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                                                                                          44444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444440true-1.0097." + "'", str1, "44444444444444444440true-1.0097.");
    }

    @Test
    public void test41794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "true - 97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41795");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 349L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 349L + "'", long2 == 349L);
    }

    @Test
    public void test41796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41796");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("A A A                              ", "UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU44444444444", "AHI!", 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A A A                              " + "'", str4, "A A A                              ");
    }

    @Test
    public void test41797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41797");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444a", "44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0true-1.0097.044444444444444444444444444444444444444444", 49, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA                                                                                                         ", "4444444444444444444444444444444444444444444 true - 1 . 97 . 444444444444444444444444444 ... 4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("a                   TRUE-1.0097.0                       a                                                                                                                                                                                                                                                                                                                                                                                          ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.04444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a                   TRUE-1.0097.0                       a                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "a                   TRUE-1.0097.0                       a                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test41800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41800");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a.79a.1-eurta44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41801");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "0000000000000000000000000000000000000000000", (java.lang.CharSequence) "4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0000000000000000000000000000000000000000000" + "'", charSequence2, "0000000000000000000000000000000000000000000");
    }

    @Test
    public void test41802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaa...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", "-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaa...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaa...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
    }

    @Test
    public void test41803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 229);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test41804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41804");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("......................", " A", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......................" + "'", str3, "......................");
    }

    @Test
    public void test41805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41805");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", "4479", 448);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41806");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "044444444444444444444444444444444444444444" + "'", str1, "044444444444444444444444444444444444444444");
    }

    @Test
    public void test41807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41807");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41808");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0       000       00790       000       000       00-0       00eurt0       00", "                                                                                                  0                                                                                                                                 ", 51);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41809");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("a#a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 159);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41810");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4444444444444444444444444444   aaaaaaa", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444att-------ttt-------ttt-------t");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41811");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "             aaaa0aaaaa    ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 256);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41813");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                       ###0.001##       ", "                                                                                                                                                                                                                                                                                                                                                                                                                        ######...                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41814");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...4444....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 9, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI" + "'", str3, "I!HI");
    }

    @Test
    public void test41816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41816");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                             A                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             a                                                 " + "'", str1, "                                             a                                                 ");
    }

    @Test
    public void test41817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41817");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444440true-1009744", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41818");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41819");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...A .....44444...true-1.4444444...97.4444444...4444444444444...                  4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test41820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41820");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("#a######################...##############################################", "A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "           A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.79", "    4444444444444444444444444444   aaaaaaa", 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.79" + "'", str3, "0.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.79");
    }

    @Test
    public void test41823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41823");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 52L, (float) 134);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test41824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41824");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                       A44444444444444444444...4444                       A44444444444444444444...444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41825");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41826");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.001");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaa0aaaa                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...A", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...A" + "'", str2, "...A");
    }

    @Test
    public void test41829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41829");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("    a   HI!HI!...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "aa..", "                                                                                                                                                                                                                                                                                                                                                                                                                               hI!", 55);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    a   HI!HI!...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str4, "    a   HI!HI!...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test41830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("00       000       000       00aa44444444444444444444...444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00       000       000       00aa44444444444444444444...444444444444444444444444444444444444444444444" + "'", str1, "00       000       000       00aa44444444444444444444...444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41831");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                           ...      ", "...4a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 4...7900.1-EURT04444444444444444444444444444444444...4440", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test41832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41832");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("I!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test41833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41833");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "####", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test41834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41834");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt044444444444444", "                A A ###################################                 ", 84);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 0, 14);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a" + "'", str7, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test41835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41835");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                      hI!HI!HI!HI!HI!HI!HI!HI!Htrue-1.00                                           true-1.97.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41836");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", ".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41838");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0aaa", 614, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41839");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                      100.0", "...aaaaaaaaaaaaaaTRUEa97aTRUEa97", "...444444444444444440true-1.0097...444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41840");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", (double) 216L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 216.0d + "'", double2 == 216.0d);
    }

    @Test
    public void test41841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41841");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...aaaaaaaaaaaaaaTRUEa97aTRUEa97", "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41842");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444", "aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa     ", (int) 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa", "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.", 23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 23");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test41843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41844");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41845");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", "..4444444...4444444...4444444...4444444...4444444...4444444...4444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41846");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                         0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41847");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...", 187, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...444444444444444444444444444444");
    }

    @Test
    public void test41848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097", "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4A hi!hi!hi!hi!hi!hi!hi!hi!hi         000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097" + "'", str2, "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test41849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444...true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41851");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("          true -   97  ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41852");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("        a4444444444444444444444444444444         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41853");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test41854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" true-1.  97. ", "a   HI!HI!..    a   HI!HI!..    a   HI!HI!..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " true-1.  97. " + "'", str2, " true-1.  97. ");
    }

    @Test
    public void test41855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE" + "'", str2, "A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE");
    }

    @Test
    public void test41856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41856");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "-1.0097.0", (java.lang.CharSequence) "44444AAAAAAAAAAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test41857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41857");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       rue-1.0097.0", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41858");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
    }

    @Test
    public void test41859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("97..######################################97atrue-1.#########################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97..######################################97atrue-1.#########################################" + "'", str1, "97..######################################97atrue-1.#########################################");
    }

    @Test
    public void test41860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41860");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                            a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                              ", "#########################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi########", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41861");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test41862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41862");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "4 ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', 250, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test41863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41863");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("..7900", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test41864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41864");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A         A                                  ", "    a   HI!HI!...", 8);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!I", strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test41865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41865");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                     aaaa      a         a         a         a         aaaaaa    ", 623, 479);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41866");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUETRUEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41867");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444                  ", "a4a4a4a444444444444444444444444A44444444444444444444444...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAA", "                                                                                                                                                                                                                                                                                                                                   ..true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444                  " + "'", str3, "                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444                  ");
    }

    @Test
    public void test41868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444...4444444...4444444...4", "444##444440true-1.0097...4444444444444444444440true-1#0097###44", 232);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!hi!hi!1hi!hi!hi!.hi!hi!hi!0097hi!hi!hi!...hi!hi!hi!44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41870");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "a         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", 149, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     " + "'", str3, "4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
    }

    @Test
    public void test41872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41872");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE" + "'", str1, "A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE");
    }

    @Test
    public void test41874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41874");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test41875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44" + "'", str1, "...4A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
    }

    @Test
    public void test41876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41876");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                 ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41877");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray16 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444444444444444444444444444444444444444", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...444###################################################44444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 45 + "'", int20 == 45);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test41878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41878");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test41879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41879");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(841, 314, 449);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 841 + "'", int3 == 841);
    }

    @Test
    public void test41880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("44444444440.7900.1-EURT0", "                                      4444400       0444444                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444440.7900.1-EURT0" + "'", str2, "44444444440.7900.1-EURT0");
    }

    @Test
    public void test41881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            ", "                     AAAA0AAAAA                     ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test41882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41882");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 93L, 4.4444444444444443E49d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4444444444444443E49d + "'", double3 == 4.4444444444444443E49d);
    }

    @Test
    public void test41883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41883");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444..." + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
    }

    @Test
    public void test41884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaa...44444444444444444444444444444444hi4!aaaaaaaaaa", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41885");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "", 841);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test41886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41886");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41887");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aa100.0aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa100.0aaaa" + "'", str1, "aa100.0aaaa");
    }

    @Test
    public void test41888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41888");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 265L, (double) 88, (double) 136.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 265.0d + "'", double3 == 265.0d);
    }

    @Test
    public void test41889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41889");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', 46, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 46 + "'", int3 == 46);
    }

    @Test
    public void test41890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("44...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", 47, 147);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444...4444444...4444444...4444444...4444444..." + "'", str3, "44444...4444444...4444444...4444444...4444444...");
    }

    @Test
    public void test41891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41891");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 833L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 833L + "'", long2 == 833L);
    }

    @Test
    public void test41892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41892");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI", 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41893");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("       AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41894");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("...aaaaaaaaaaaaaaaaaaaaaaaaaa                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41895");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41896");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "0TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) " TRUE - 1 . 97 . ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", charSequence2, "0TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41897");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     A     HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ...      A     " + "'", str3, "     A     HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ...      A     ");
    }

    @Test
    public void test41898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41898");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 138L, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 138.0d + "'", double3 == 138.0d);
    }

    @Test
    public void test41899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41899");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "1aaaaaaaaaaa.........", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE97TRUE97aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "1aaaaaaaaaaa........." + "'", charSequence2, "1aaaaaaaaaaa.........");
    }

    @Test
    public void test41900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41900");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 80, "0AAA079001-EURT0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0AAA079001-EURT00AAA079001-EURT00AAA079001-EURT00AAA079001-EURT00AAA079001-EURT0" + "'", str3, "0AAA079001-EURT00AAA079001-EURT00AAA079001-EURT00AAA079001-EURT00AAA079001-EURT0");
    }

    @Test
    public void test41901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41902");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                         ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                         ...                                                    ", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         ...                                                    " + "'", str3, "                                         ...                                                    ");
    }

    @Test
    public void test41905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41905");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444444444444444444444444444...4444444.79...4444444.1-eurt...44444444444444444444444444444444444444444444444444T00.7900");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41906");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("##100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41907");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                           0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0", "Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41908");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...aaaa...44444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("    00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00" + "'", str2, "    00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00");
    }

    @Test
    public void test41910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40", 113);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40" + "'", str2, "0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40");
    }

    @Test
    public void test41911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41911");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4444444444", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41912");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41913");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444", 53, 538);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41914");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################00   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAtrueAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41915");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41916");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...#####...true-1.#######...97.#######...#############...                  #0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000########", 750, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41917");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("444444 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 444444  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41918");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444444444444444444444444444444444444", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aa...", "                               0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      AAAA AAAAAAAAA AAAAAAAAA AAA                                                                                                                                                                                                                                                                       " + "'", str3, "                                      AAAA AAAAAAAAA AAAAAAAAA AAA                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test41919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41919");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "####################################    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH#####################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41921");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a4000                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a", " 4A4 4rt4004.479004.414-4eurt4004.479004.414-4eurt4004.479004.414-4eurt40", "4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                       444...44444444444444444444444444444444440TRUE-1.0097", 545);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       444...44444444444444444444444444444444440TRUE-1.0097" + "'", str2, "                                       444...44444444444444444444444444444444440TRUE-1.0097");
    }

    @Test
    public void test41923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41923");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("100.0                                                                                      100.0                                                                                      100.0                                            ...", 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41924");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00" + "'", str3, "0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00" + "'", str4, "0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00");
    }

    @Test
    public void test41925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41925");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                    ", 363);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41926");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                     aaaa      a         a         a         a         aaaaaa    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                     aaaa      a         a         a         a         aaaaaa    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0.7900.1-EURT0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41928");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test41929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41929");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41930");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(539, 0, 344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 539 + "'", int3 == 539);
    }

    @Test
    public void test41931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41931");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("##100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "##100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41932");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...7900.1-eurt0", "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0", 25);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...7900.1-eurt0" + "'", str5, "...7900.1-eurt0");
    }

    @Test
    public void test41933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41933");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                            A    44", "4444a44444", 96);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                            A    44" + "'", str5, "                                                                                            A    44");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test41934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41934");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("I!HI");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test41935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41935");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                         AAAAAAAAAAAAAA                                                           ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test41936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41936");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                              ", "                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr", 841);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0true-1.00-1.0097.04444444444444444444444444444444444444444444", 153);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.00-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "0true-1.00-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test41938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41938");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41939");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0aaaaa4a4A4A4A4A", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(".0097.00true-1.0097.00trA0t...", "4444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41941");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00  ", 444, "AAA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1 0097   AA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00  " + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00  ");
    }

    @Test
    public void test41942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41942");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       444...44444444444444444444444444444444440true-1.0097", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41943");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                     4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444                                                                                     ", "0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", 797, 84);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                    0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       " + "'", str4, "                                                                                    0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test41944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41944");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("0aaaa", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                 ...                                                     ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "     A44444      Aaaaaaaaaaa4444444...4444444...4444444...4", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test41945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41945");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.044", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                      0TRUE-1.0  0true-1.0097.0aaaa0aaaaa...                      0TRUE-1.0  " + "'", str3, "...                      0TRUE-1.0  0true-1.0097.0aaaa0aaaaa...                      0TRUE-1.0  ");
    }

    @Test
    public void test41946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41946");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4A hi!hi!hi!hi!hi!hi!hi!hi!hi         000", 243, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4A hi!hi!hi!hi!hi!hi!hi!hi!hi         000###############################################################################################################" + "'", str3, "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4A hi!hi!hi!hi!hi!hi!hi!hi!hi         000###############################################################################################################");
    }

    @Test
    public void test41947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41947");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444...", "                                                                                                                                                                                                                                                                                                                                              hi!                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test41949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...44", 548);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41950");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("100.0aaaa", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                     ...", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 24 + "'", int14 == 24);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test41951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "                                       444...44444444444444444444444444444444440true-1.0097...44444...44444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str2, ".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
    }

    @Test
    public void test41952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                     ", 842);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41954");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...aaaa...44444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("            444444444444444  444444444444444             ..", "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444  444444444444444             .." + "'", str2, "444444444444444  444444444444444             ..");
    }

    @Test
    public void test41956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41956");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test41957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41957");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("A         A                                                     100.0    A         A0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a4444444444444444444444444444444444444444", 138);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41958");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 359, 608.0f, (float) 56L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 608.0f + "'", float3 == 608.0f);
    }

    @Test
    public void test41959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41959");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4    4A4     404true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004t", "ATT-------TTT-------TTT-------TT");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41960");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                        44...7900.1-eurt04444444444444444444444444444444444...444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa", 656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41961");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                          4444444...4444444...4444444...4...", "444...44444444444444444444444444444444440TRUE-1.0097...44", (-1));
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                          " + "'", str4, "                                                                                                                          ");
    }

    @Test
    public void test41962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41962");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                97.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test41963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41963");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41964");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi...", "                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41965");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97", 667, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41966");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                       a44444444444444444444...444444444444444444444444444444444444444444444", (long) 444);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 444L + "'", long2 == 444L);
    }

    @Test
    public void test41967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41967");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      1...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41968");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 895);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41969");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     ...         aaaa0aaaaa44444", "......................");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("#...#4                       #a#4#...#4                       #a#4#...#4                       #a#4                     4#...#4                       #a#4#...#4                       #a#4#...#4#a#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#...#4                       #a#4#...#4                       #a#4#...#4                       #a#4                     4#...#4                       #a#4#...#4                       #a#4#...#4#a#" + "'", str1, "#...#4                       #a#4#...#4                       #a#4#...#4                       #a#4                     4#...#4                       #a#4#...#4                       #a#4#...#4#a#");
    }

    @Test
    public void test41971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41971");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41972");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                        4444444444444444444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", 544);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41973");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test41974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41974");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" 44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41975");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                    0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA         A         A        ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41976");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test41977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41977");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0097...4");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test41978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41978");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444497.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41979");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa", (java.lang.CharSequence) "...44444...4444444...4...aaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                          #...#4#A#", 232, 205);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41981");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "444444444444444440true-1.0097...444444444444444444444444", 7);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str5, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test41982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#########################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                        44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!                                                                       0true-1.00", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                        44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!                                                                       0true-1.00" + "'", str3, "                                                        44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!                                                                       0true-1.00");
    }

    @Test
    public void test41984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41984");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "", 57);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 53, 1);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...4444444...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test41985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "7900.1-EURT0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test41986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41986");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41987");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("a A 1000 A A", 660);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41988");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "... A A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41989");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                   0         aaa                                                           0         aaa                                                           0         aaa                                                           0         aaa                                                           0         aaa                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41991");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("rue-1.0097.0", "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", 224);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("4444444...aaaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test41992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41992");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...4...4444444..#########.                                                   ...4...4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444...4...                                                   .#########..4444444...4..." + "'", str1, "...4444444...4...                                                   .#########..4444444...4...");
    }

    @Test
    public void test41993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41993");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4444444444444444444444444444444444444444444.79.1-eurt444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41994");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0true-1.0097", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test41995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41995");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                 ...", "true-1.00                                           true-1.97.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 ..." + "'", str2, "                 ...");
    }

    @Test
    public void test41996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) ".7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".7900.1-eurt0" + "'", str1, ".7900.1-eurt0");
    }

    @Test
    public void test41997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41997");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAA...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                       rue-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test41999");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                             ", (java.lang.CharSequence) "                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest83.test42000");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(259L, 18L, (long) 668);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 18L + "'", long3 == 18L);
    }
}

