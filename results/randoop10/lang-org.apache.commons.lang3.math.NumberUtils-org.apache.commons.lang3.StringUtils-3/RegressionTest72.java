import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest72 {

    public static boolean debug = false;

    @Test
    public void test36001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36001");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                       A                             ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                       A                             " + "'", str4, "                       A                             ");
    }

    @Test
    public void test36002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36002");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...7900...7900...7900...7900");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test36003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                         AAAAAAAAAAAAAA                                                          ", "04444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         AAAAAAAAAAAAAA                                                          " + "'", str2, "                         AAAAAAAAAAAAAA                                                          ");
    }

    @Test
    public void test36004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 115);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr        " + "'", str2, "       0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr        ");
    }

    @Test
    public void test36005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36006");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 4, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test36007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                          0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                          0true-1.0097.044444444444444444444444444 ...#########################...#################0.001##...#########################...##############                                                                                                                                                                                                                                                                                                                                                          " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                          0true-1.0097.044444444444444444444444444 ...#########################...#################0.001##...#########################...##############                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test36008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("             AAAA0AAAAA    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"             AAAA0AAAAA    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36009");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aa0aaaaaaaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36010");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                          " + "'", str1, "                                                                                                                          ");
    }

    @Test
    public void test36012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36012");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(841.0d, (double) ' ', 19.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 841.0d + "'", double3 == 841.0d);
    }

    @Test
    public void test36013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                       a44444444444444444444...444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a44444444444444444444...444444444444444444444444444444444444444444444" + "'", str1, "a44444444444444444444...444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("        a                     44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 554, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        a                     44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "        a                     44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36016");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test36017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36017");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("......4444444...4444444...4444444.....");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test36018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36018");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test36019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36019");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(891, 181, 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 891 + "'", int3 == 891);
    }

    @Test
    public void test36020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36020");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", "...aaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", (int) (short) 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     ", "                                                                                                                                                                                                                                                                                                            0TRUE-1.0097.044444444444444444444444444 ...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA0.001...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...t0444444444444444444444444444.....#...#4#a#", 0, "...0TRUE-1.0097...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...t0444444444444444444444444444.....#...#4#a#" + "'", str3, "...t0444444444444444444444444444.....#...#4#a#");
    }

    @Test
    public void test36023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36023");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test36024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36024");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      A         A         A         A         A", "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444   00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ", 625);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36025");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444444444444444444444444444444444444444444444444 !");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test36026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36026");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                            ###    A   hi!hi!.                                                                              ", "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36027");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                               true  ", 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("00aaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00aaaaaaaaaaaaa..." + "'", str1, "00aaaaaaaaaaaaa...");
    }

    @Test
    public void test36030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("a   HI!HI!...truea   HI!HI!...-a   HI!HI!...a   HI!HI!...a   HI!HI!...97a   HI!HI!...a   HI!HI!...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   HI!HI!...truea   HI!HI!...-a   HI!HI!...a   HI!HI!...a   HI!HI!...97a   HI!HI!...a   HI!HI!..." + "'", str2, "a   HI!HI!...truea   HI!HI!...-a   HI!HI!...a   HI!HI!...a   HI!HI!...97a   HI!HI!...a   HI!HI!...");
    }

    @Test
    public void test36031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36031");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444..974", "", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444." + "'", str1, "44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
    }

    @Test
    public void test36033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36033");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A A A A A");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36034");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("       0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr        ", "0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... ...true-1. ...97. ... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ...", 46);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36035");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...    0true-1.0097.00true-1.0097.00true-1.0097.00t", 21, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str3, "...    0true-1.0097.00true-1.0097.00true-1.0097.00t");
    }

    @Test
    public void test36036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("    ...44444444444444444444444444444444440true-1.0097...A...444444444          aaaatrue-1.0097...A...44444444444444444444444444444444440true-1.0097...         ", "true444...44444444444444444444444444444444440TRUE-1.0097...44                                                                                        ", "                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    ...44444444444444444444444444444444440true-1.0097...A...444444444          aaaatrue-1.0097...A...44444444444444444444444444444444440true-1.0097...         " + "'", str3, "    ...44444444444444444444444444444444440true-1.0097...A...444444444          aaaatrue-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
    }

    @Test
    public void test36037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36037");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                     99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", "                                                                                                                                                          ...                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444444444444444444444444444   !", "aaa...aaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444   !" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444   !");
    }

    @Test
    public void test36039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36039");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001", (java.lang.CharSequence) "A A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 820 + "'", int2 == 820);
    }

    @Test
    public void test36040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                  4                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test36041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36041");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test36042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "44444444444444444444444444444444440true-140097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36043");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4000", "########################4444444444444444444444440TRUE-1.009...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36044");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 615);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36045");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 4A4 4rt4004.479004.414-4eurt4004.479004.414-4eurt4004.479004.414-4eurt40", (double) 895L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 895.0d + "'", double2 == 895.0d);
    }

    @Test
    public void test36046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36046");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str3, "44444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test36047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("00       000       000       00a", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36048");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " true-1.  97. ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###########################################true-197############################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test36049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("               444444444444.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               444444444444" + "'", str1, "               444444444444");
    }

    @Test
    public void test36050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaa", "TRUE-1.0097.0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36051");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                      ...                           ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA         A         A        ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36052");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 17L, (double) 61, (double) 205);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.0d + "'", double3 == 17.0d);
    }

    @Test
    public void test36053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36053");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444440true-1.0097.", "0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                                                     0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36054");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "0444444444       444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", charSequence2, "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI." + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.");
    }

    @Test
    public void test36056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36056");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test36057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36057");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test36058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444 ..." + "'", str1, "444444444 ...");
    }

    @Test
    public void test36059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36059");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " . 97 . ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################aHI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################aHI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36061");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...........................................................................................................................................................................", 551);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("44444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", "7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", str2, "44444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test36063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36063");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                             ...                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.00true-1.97.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 797, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36065");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test36066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36066");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                 ", "44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36067");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                 0aaa                           ", "                                                                                                                                                                                                                                                                                                                                                                                                               #######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ", 344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                       0aaa                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0aaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0true-1.0097.00tr", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00tr" + "'", str2, "0true-1.0097.00tr");
    }

    @Test
    public void test36070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36070");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a44444", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("                                             A                                                 ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test36071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36071");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "true -   97                                                                                                                                                                                                                                                                           a44444a444444a444444444444444444a44444a                                                                                                                                                                                                                                                                          ", 721);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test36072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ..." + "'", str2, "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...");
    }

    @Test
    public void test36073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 10, "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36074");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A A A A ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "tr...", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 44 + "'", int16 == 44);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test36075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36075");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("A   hi!hi!", "...44444...TRUE-1.4444444...97.4444444...4444444444444..", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444 true - 1 . 97 . 444444444444444444444444444                                         ...                                                     4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     ...                                                     4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444" + "'", str2, "                                     ...                                                     4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test36077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36077");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36079");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     a    ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test36080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36081");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0true-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test36082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36082");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) ".0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + ".0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-" + "'", charSequence2, ".0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-");
    }

    @Test
    public void test36083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36083");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test36084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36084");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                            ", "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", 8);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaa0aaaaaaaaaaaaa444444...", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                            " + "'", str5, "                            ");
    }

    @Test
    public void test36085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36085");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("######...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test36086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36086");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                     100.0                                                     4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0                                                     4444" + "'", str1, "100.0                                                     4444");
    }

    @Test
    public void test36087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi                                                                                                                                  0aaaa                                                                                                                                  ", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi                                                                                                                                  0aaaa                                                                                                                                  " + "'", str2, "hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi                                                                                                                                  0aaaa                                                                                                                                  ");
    }

    @Test
    public void test36088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36088");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36089");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...!hi!hi!hi!hi!hi!hi!", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36090");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a0a", "                                                                               ...0...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("444440true-1.0097...4", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test36091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36091");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "4444################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################" + "'", str3, "#################################################");
    }

    @Test
    public void test36092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36092");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444aHI!HI!..");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test36093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444...AAAAAAAAA44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...AAAAAAAAA44444444444444444444444444444444444444444" + "'", str1, "4444444...AAAAAAAAA44444444444444444444444444444444444444444");
    }

    @Test
    public void test36094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36094");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36095");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0097.00true-1.00", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36097");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                     aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36098");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" A", 975, 179);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36099");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test36100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36100");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hi!hi!", 721);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36101");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44aAAAAAA4440true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA", "", 229);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 229 + "'", int3 == 229);
    }

    @Test
    public void test36102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36102");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa", "A         A         A        ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444440true-1.0097", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444440true-1.0097" + "'", str2, "44444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test36104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444" + "'", str2, "4444444");
    }

    @Test
    public void test36105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36105");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444...44444444444444444444444444444444440TRUE-1.0097...44097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", (java.lang.CharSequence) "A0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 188 + "'", int2 == 188);
    }

    @Test
    public void test36106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36106");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                       #A#44444444444444444444#...#44444444444444444444444444444444444444...", "aa0aaaaaaaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       #A#44444444444444444444#...#44444444444444444444444444444444444444..." + "'", str2, "                       #A#44444444444444444444#...#44444444444444444444444444444444444444...");
    }

    @Test
    public void test36108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36108");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..", 41, 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36109");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0aaaaa    ", "4444444444444444444444444444444444444444444444444444444444444444444444   !    ", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa", 144, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36111");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36112");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaa", "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                             ", 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36113");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("         .");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36114");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36115");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36116");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", '#');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("hi", "                                ", 7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                                         ...444444440tr...                                          ", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("...                                      ", strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                         ...444444440tr...                                          " + "'", str10, "                                         ...444444440tr...                                          ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test36117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36117");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("aaaa0aaaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "true-1. 97. 444444444444444444444444444444444444444444 true-1. 97. 44444444444444444444444444", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 28 + "'", int17 == 28);
    }

    @Test
    public void test36118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36118");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                  4                   ", 951, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  4                   " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  4                   ");
    }

    @Test
    public void test36120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "a   hi!hi!...truea   hi!hi!...-a   hi!hi!...a   hi!hi!...a   hi!hi!...97a   hi!hi!...a   hi!hi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A   hi!hi!...truea   hi!hi!...-a   hi!hi!...a   hi!hi!...a   hi!hi!...97a   hi!hi!...a   hi!hi!..." + "'", str1, "A   hi!hi!...truea   hi!hi!...-a   hi!hi!...a   hi!hi!...a   hi!hi!...97a   hi!hi!...a   hi!hi!...");
    }

    @Test
    public void test36121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36121");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("     A    4", ".44444444444444444444444444444444A    4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790", "                       44444444444444444444...4444                       44444444444444444444...4444", "                                                                                            4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("00aaaaaaaaaaaaa...", "4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a.........a....0001.....................................................a.........a", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36125");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaa                                                                ...44444", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT", 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" true-1.  97. ", "444444444444444444444440.7900.1-eurt0aaaa                                                     0.001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " true-1.  97. " + "'", str2, " true-1.  97. ");
    }

    @Test
    public void test36127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("true-1.00                                           true-1.97.", "                                               A                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1.00                                           true-1.97." + "'", str2, "true-1.00                                           true-1.97.");
    }

    @Test
    public void test36128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36128");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str1, "1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test36129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36129");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!hi!h!hi!h", "...900.1-EURT04444444444444444444444444444444444444444444", (-1));
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!hi!h!hi!h" + "'", str6, "!hi!h!hi!h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!hi!h!hi!h" + "'", str8, "!hi!h!hi!h");
    }

    @Test
    public void test36130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36130");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("     A    4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test36131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("           A         A         A         A         A         A         A         A         A         A         A         A         A         A ...", "true-1....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..." + "'", str2, "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ...");
    }

    @Test
    public void test36132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "444444444444444444444444444444444444444444447900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAAAAA...00.7900.1-EURT00.79...AAAAAAA", "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAA...00.7900.1-EURT00.79...AAAAAAA" + "'", str2, "AAAAAAA...00.7900.1-EURT00.79...AAAAAAA");
    }

    @Test
    public void test36134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36135");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0true-1.0097.0444444444444444444444444", (float) 16L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.0f + "'", float2 == 16.0f);
    }

    @Test
    public void test36136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36136");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("IH", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "97...#############################################################################################", 551, 403);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test36137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36137");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a4000                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                               #######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                aaaa" + "'", str2, "                                                                                                aaaa");
    }

    @Test
    public void test36139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...true-1....97....      #a######################...##############################################      #a######################.", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...true-1....97....      #a######################...##############################################      #a######################." + "'", str2, "...true-1....97....      #a######################...##############################################      #a######################.");
    }

    @Test
    public void test36140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36140");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 79, 671L, (long) 444);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 671L + "'", long3 == 671L);
    }

    @Test
    public void test36141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0AAAA                                                                                                                                  A                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0AAAA                                                                                                                                  A" + "'", str1, "00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0AAAA                                                                                                                                  A");
    }

    @Test
    public void test36142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                          44444444444444444440true-1.0097.", 546, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat" + "'", str3, "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat");
    }

    @Test
    public void test36143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("4444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36144");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...t0444444444444444444444444444.....#...#4#a#", 657, 441);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444A444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36146");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 95 + "'", int3 == 95);
    }

    @Test
    public void test36147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                               true  ", "...44444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               true  " + "'", str2, "                                               true  ");
    }

    @Test
    public void test36148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444A", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444A" + "'", str2, "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444A");
    }

    @Test
    public void test36149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36149");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100.0 AAAA0TRUE-1.0097.044444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test36150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36150");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36151");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "444444444444444440true-1.0097...444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str5, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str7, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test36152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36152");
        char[] charArray11 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 45 + "'", int15 == 45);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test36153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36153");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ..." + "'", charSequence2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
    }

    @Test
    public void test36154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36154");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 54, 648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 648 + "'", int3 == 648);
    }

    @Test
    public void test36155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36155");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                     AAAAAA0AAAAAAA              ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test36156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36156");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("    A     ");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("444444...", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("   !    ", strArray4);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test36157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36157");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444" + "'", charSequence2, "a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444");
    }

    @Test
    public void test36158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                       444...44444444444444444444444444444444440TRUE-1.0097", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt044444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       444...44444444444444444444444444444444440TRUE-1.0097" + "'", str2, "                                       444...44444444444444444444444444444444440TRUE-1.0097");
    }

    @Test
    public void test36159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36159");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaa0aaaaa", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " true-1.  97. ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     A    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test36160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36160");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...4444.....", "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 645);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36161");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("A A 1000 A A############################################################################################################################################################################################################################### A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  ######################################################################################################################################################################################################################################################################################", "                                                                                    100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                ", 243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("a.7900.1-eurt0444444444444444444444444444444444444444444444a.7900.1-eurt04444444444444444444a.7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a.7900.1-eurt0444444444444444444444444444444444444444444444a.7900.1-eurt04444444444444444444a.7900.1-eurt04444444444444444444444444444444444444444444" + "'", str1, "a.7900.1-eurt0444444444444444444444444444444444444444444444a.7900.1-eurt04444444444444444444a.7900.1-eurt04444444444444444444444444444444444444444444");
    }

    @Test
    public void test36163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("A         A                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A A" + "'", str1, "A A");
    }

    @Test
    public void test36164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36164");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("         000", 38, "...44444444444444444444444444444444440true-1.0097...44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444444444444444         000" + "'", str3, "...44444444444444444444444         000");
    }

    @Test
    public void test36165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36165");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.a97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    a   HI!HI!...", "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444A44444                                                                                                                                                                                                                          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36166");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0ue-1.0097...444444444444444444444444########################################################################################100.", ".");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444                                      100.0                                                     aaaa444444444444444444444", "                                                  0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36169");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("00       000       000       00A", "0");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("......44444444444444444444444444444444440TRUE-1.0097...         a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a    ...44444444444444444444444444444444440TRUE-1.0097...4444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 608 + "'", int4 == 608);
    }

    @Test
    public void test36170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36170");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("         ...", "                                                                                                      ", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...AAAA0AAAA", 982);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AAAA0AAAA" + "'", str2, "...AAAA0AAAA");
    }

    @Test
    public void test36172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36172");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A      ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36173");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test36174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36174");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#########################################################################################################################################################                                                                                                                                  0AAAA                                                                                                                                  #########################################################################################################################################################", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36175");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("444444444444444444444444...44444", strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4", strArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                 ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test36176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#aRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0" + "'", str1, "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#aRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0");
    }

    @Test
    public void test36177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ...", (java.lang.CharSequence) "                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            44444444444444444444444444                                               100.0                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                ", 975, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "##################                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test36179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       ", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         " + "'", str2, "                         ");
    }

    @Test
    public void test36180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36180");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                           444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                           444444444444" + "'", str1, "                                           444444444444");
    }

    @Test
    public void test36181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36181");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("a44444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "                                                                                                                                                                                                                                                                                       0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ", 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36182");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("#########################                                                                               ...0...#########################", "4444444...444444           AAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "        0aaaa         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        0aaaa         " + "'", str1, "        0aaaa         ");
    }

    @Test
    public void test36184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36184");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("true                                         TRUE-1                                                                                                  44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A444", "004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 ", 24);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test36185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36185");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...44444444444444444444444444444444440true-1.0097...", 262L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 262L + "'", long2 == 262L);
    }

    @Test
    public void test36186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta0", 614);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta0" + "'", str2, "4444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta0");
    }

    @Test
    public void test36187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36187");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444444444444444 0444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444 0444444444" + "'", str1, "444444444444444444 0444444444");
    }

    @Test
    public void test36188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36188");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(969, 46, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 969 + "'", int3 == 969);
    }

    @Test
    public void test36189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                      100.0                                                ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test36190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test36191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444", "                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36192");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444                                      100.0                                                     aaaa444444444444444444444", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                     a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 87 + "'", int25 == 87);
    }

    @Test
    public void test36193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E" + "'", str2, "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E");
    }

    @Test
    public void test36194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36194");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("                                            100.01aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test36195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("H!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.." + "'", str1, "H!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..");
    }

    @Test
    public void test36196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36196");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                       0                                                                                                                                 ", "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36197");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("a         a                                                     1000    a         a", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-E\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36199");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444" + "'", str1, " 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444");
    }

    @Test
    public void test36200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36200");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                          ##100.0###                                           ", 608);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36201");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
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
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test36202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("-1.0097.0", 554, "                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0097.0                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true" + "'", str3, "-1.0097.0                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true");
    }

    @Test
    public void test36203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36203");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                      4444444444444444444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                       ", 170);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36204");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    public void test36205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAA       ..." + "'", str1, "AAAAAAAAAAAAAAAAA       ...");
    }

    @Test
    public void test36206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36206");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...                          ...", (java.lang.CharSequence) "4true4-4449744");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...                          ..." + "'", charSequence2, "...                          ...");
    }

    @Test
    public void test36207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097", 570, "79  .1-eurt 444444440 true - 1 . 44444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097" + "'", str3, "44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097");
    }

    @Test
    public void test36208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36208");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                             ...", "444444444444444444440TRUE-    ...AAAA0AAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36209");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36210");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36211");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("a#4#...", "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "...44444444444444444444444         000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36213");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("        HI!H4444404444HI!HI.A A A ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!H4444404444HI!HI.A A A" + "'", str1, "HI!H4444404444HI!HI.A A A");
    }

    @Test
    public void test36214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36214");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  A      A                            100.0                                                     AAAA", (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36215");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                   ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36216");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 267 + "'", int9 == 267);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 267 + "'", int11 == 267);
    }

    @Test
    public void test36217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36217");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test36218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36218");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(".. A...", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36219");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444", 134, 632);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444" + "'", str3, "444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444");
    }

    @Test
    public void test36220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36220");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa", ".7900.1-eurt04444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt0444444444444444444444444444444444444444444444A", 384);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36221");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "444444444444444444444444...44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444...44444" + "'", str1, "444444444444444444444444...44444");
    }

    @Test
    public void test36222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36222");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("444444444444", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("       ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "H!ih!h!ih!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "       ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test36224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A A ", 73, "...                                                               ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                               ...A A " + "'", str3, "...                                                               ...A A ");
    }

    @Test
    public void test36225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444...HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36226");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 64, 734.0f, 96.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 734.0f + "'", float3 == 734.0f);
    }

    @Test
    public void test36227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36227");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                97.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tra0true-1.0097.00true-1.0097.00true-1.0097.00tr", "444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tra0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tra0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test36229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36229");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "444aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa                         100.0                                                     aaaa444444444444444444444", ".0097.00true-1.0097.00true-1.0097.00tr", 895);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "true-1.0097.0444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36231");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 279.0f, (double) 502, (double) 99L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 502.0d + "'", double3 == 502.0d);
    }

    @Test
    public void test36232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36232");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("####################################    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH#####################################", ".7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36234");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                            100.01aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444444444444444444", "4444444TRUE-1.00TRUE-1.97.                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444" + "'", str2, "44444444444444444444");
    }

    @Test
    public void test36236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                          ...                                                                                                                                                                                                                                                                                            ", 130);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                               ..." + "'", str2, "                                                                                                                               ...");
    }

    @Test
    public void test36237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36237");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36238");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", 648, 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36239");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("H!ih!h!ih!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"H!ih!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36240");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36241");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-EURT04444", (double) 841.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 841.0d + "'", double2 == 841.0d);
    }

    @Test
    public void test36242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36242");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 84, (long) 384, 37L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 37L + "'", long3 == 37L);
    }

    @Test
    public void test36243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36246");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                          rue-1.0097.0", "...         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36247");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(". 97 . 4444444444444444444444444444444444444444444", "7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", 58);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', 76, 220);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 76");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test36248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) ".1-eurt00.7900.1-eurt");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36250");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             0TRUE-1 0097 0", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0TRUE-1a0097a0" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0TRUE-1a0097a0");
    }

    @Test
    public void test36252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0", " 44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0" + "'", str3, "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0");
    }

    @Test
    public void test36253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36253");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444", "UU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36254");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...0TRUE-1.0097...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00Ta0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...0TRUE-1.0097..." + "'", str3, "...0TRUE-1.0097...");
    }

    @Test
    public void test36255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36255");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097 ", (long) 17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test36256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36256");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444", "                                                                                                                                 0                                                                                                                     ", "         a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                                ...                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true-1.  97. true-1.4444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true-1.  97. true-1.4444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa4444444444444444444444444444444444444444444 true-1.  97. aaaa aaaaa444444444");
    }

    @Test
    public void test36257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36257");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                     100.0                                                     aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36258");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                        ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  rue-1.0097.0                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test36259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aa");
    }

    @Test
    public void test36260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36260");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "    A         A                                                     100.0    A         A     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36261");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 554, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36262");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36263");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               A A 0001 A a", "aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "             rue-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("              ", 123);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                           " + "'", str2, "                                                                                                                           ");
    }

    @Test
    public void test36266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36266");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62 + "'", int1 == 62);
    }

    @Test
    public void test36267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36267");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    A         A                                                     100.0    A         A     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    A         A                                                     100.0    A         A     .." + "'", str1, "    A         A                                                     100.0    A         A     ..");
    }

    @Test
    public void test36268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36268");
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A    ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny(".0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test36269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                           ...      ", 250, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!H                                                                                                           ...      " + "'", str3, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!H                                                                                                           ...      ");
    }

    @Test
    public void test36270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36270");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444440true-1.0097.0100.0", "4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36271");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4true4-4449744", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0T...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36272");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0TRUE...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36273");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                       444...44444444444444444444444444444444440true-1.0097...44444...44444444444444", "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 ", 80);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("..    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ", "                                                                         aaaa0aaaaa   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         aaaa0aaaaa   " + "'", str2, "                                                                         aaaa0aaaaa   ");
    }

    @Test
    public void test36275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36275");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", (long) 4444444);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4444444L + "'", long2 == 4444444L);
    }

    @Test
    public void test36276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36276");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 116, 202);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 116");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                             00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ", 51, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 " + "'", str3, "                             00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test36278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36279");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36280");
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
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, '4', 98, 645);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test36281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", "a0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36283");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A0true-1.0097.00true-1.0097.00true-1.0097.00tr", "    a   HI!HI!..", 19);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("......4444444...4444444...4444444", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str6, "A0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str8, "A0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test36284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36285");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "...444444440tr...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36286");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "", 57);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4', 53, 1);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "", 57);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray5, strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                          ###################################################", "A44444", 93);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("            444444444444444  444444444444444             ..", strArray13, strArray20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, ' ');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str15, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "            444444444444444  444444444444444             .." + "'", str21, "            444444444444444  444444444444444             ..");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                                                                                          ###################################################" + "'", str23, "                                                                                                                                          ###################################################");
    }

    @Test
    public void test36287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36287");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...                                                               ...A A ", (java.lang.CharSequence) "0       000       000       00Aurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36288");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0", "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36290");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...44444444444444444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A...     A    -EURT04444444444444444444444444444444444..." + "'", str1, "A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A...     A    -EURT04444444444444444444444444444444444...");
    }

    @Test
    public void test36291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36291");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36292");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 253, 0.0d, (double) 267.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test36293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 " + "'", str2, "                 ");
    }

    @Test
    public void test36294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36294");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("   444444444444444444444444...44444", strArray3, strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.00tr", "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray8);
        java.lang.Class<?> wildcardClass10 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "   444444444444444444444444...44444" + "'", str5, "   444444444444444444444444...44444");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test36295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36295");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aA44444A44a44444", 826);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36296");
        short[] shortArray6 = new short[] { (short) 100, (byte) 100, (byte) 100, (short) 100, (byte) 100, (short) 10 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 100, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
    }

    @Test
    public void test36297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36297");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a44\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36298");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "00       0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaa" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36299");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36300");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("A44444444444444444444...444444444444444444444444444444444444444444444", "aaaaaa0aaaaaaaaaaaaa444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("00aaaaaaaaaaaaa...aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00aaaaaaaaaaaaa...aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaa" + "'", str1, "00aaaaaaaaaaaaa...aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aaaa");
    }

    @Test
    public void test36302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36302");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("      00");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test36303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0097..##################################....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..0097..##################################", "00       0true00       0-00       000                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!IH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test36305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("true-1.4444444...97", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                true-1.4444444...97" + "'", str2, "                                                                                true-1.4444444...97");
    }

    @Test
    public void test36306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36306");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444404444444440444444444044444444404444444440444444444044444444404444444a         a    0001                                                     a         a", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444404444444440444444444044444444404444444440444444444044444444404444444a         a    0001                                                     a         a" + "'", str3, "444404444444440444444444044444444404444444440444444444044444444404444444a         a    0001                                                     a         a");
    }

    @Test
    public void test36307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36307");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("true-1.       ...97true-1.       ...97");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true-1.       ...97true-1.       ...97" + "'", str1, "true-1.       ...97true-1.       ...97");
    }

    @Test
    public void test36308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("A         A                                                     100.0    A         A0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a4444444444444444444444444444444444444444", "...      aaaa0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36309");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     A    44");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                       444...44444444444444444444444444444444440TRUE-1.0097", strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test36310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 98, "a004444444000444444400044444440");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a004444444000444444400044444440a004444444000444444400044444440a004444444000444444400044444440a0044" + "'", str3, "a004444444000444444400044444440a004444444000444444400044444440a004444444000444444400044444440a0044");
    }

    @Test
    public void test36311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36311");
        short[] shortArray6 = new short[] { (short) 100, (byte) 100, (byte) 100, (short) 100, (byte) 100, (short) 10 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 100, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
    }

    @Test
    public void test36312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.044", 149, "4444444###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0444444444###aaaaaaaaaa" + "'", str3, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0444444444###aaaaaaaaaa");
    }

    @Test
    public void test36313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36313");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                          44444444444444444440true-1.0097", "         ", 4);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                               44444444444444444440true-1.0097" + "'", str4, "                                                                                                                                                                                                               44444444444444444440true-1.0097");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                                                                                  44444444444444444440true-1.0097" + "'", str6, "                                                                                                                                                                                                                  44444444444444444440true-1.0097");
    }

    @Test
    public void test36314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36314");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444", 623);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36315");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36316");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("######################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", 39, 175);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa" + "'", str2, "0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
    }

    @Test
    public void test36318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36318");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("  ", (float) 546L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 546.0f + "'", float2 == 546.0f);
    }

    @Test
    public void test36319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36319");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                  ", "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                 ...                                                ", (int) (short) 100, 266);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36321");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "     Ahi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaaaaaaaaaaaAhi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaaaaaaaaaa    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("..true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444", 982);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                   ..true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                   ..true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444");
    }

    @Test
    public void test36323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36324");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test36325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36325");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                    44444444444444444440true-1.009", "a0aaaaa              0true-1.0097.00true-1.0097.00trAaaaaaaaaaa4444444...4444444...4444444...4a0aaaaa              0true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36326");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 88, 667);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test36328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36328");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(".00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.0                                                                                                                                                                                                                                                                         0.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.0                                                                                                                                                                                                                                                                         0.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.0" + "'", str1, ".00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.0                                                                                                                                                                                                                                                                         0.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.0");
    }

    @Test
    public void test36329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36329");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36330");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00..." + "'", str2, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...");
    }

    @Test
    public void test36331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36331");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("####################################################################################################################################################################################################################################################...t0...", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444", "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444444444444444444444444                                                                                                                   0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 788, 546);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36334");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("##100.0###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36335");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!", "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36336");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36337");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     a    ", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4true-1.4497.4444444444444444444444444444", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A    ", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("-EURT04444", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 44 + "'", int17 == 44);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test36338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36338");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...44444444444444444444444444444444440true-1.0097...", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "444444444...");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...44444444444444444444444444444444440true-1.0097..." + "'", str4, "...44444444444444444444444444444444440true-1.0097...");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test36339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36339");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 36, 548.0f, (float) 42);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 36.0f + "'", float3 == 36.0f);
    }

    @Test
    public void test36340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0TRUE-1.009...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  .79  .1-EURT  .79  .1-EURT  .79  .1-EURT ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!", "...aaaa...444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", 138, "Ahi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ahi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4" + "'", str3, "Ahi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4");
    }

    @Test
    public void test36344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36344");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("a HI!HI!HI!HI!HI!HI!H", "#######...#######...#######...#######...#######...#######...#######...#######...######           ", 344, 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a HI!#######...#######...#######...#######...#######...#######...#######...#######...######           " + "'", str4, "a HI!#######...#######...#######...#######...#######...#######...#######...#######...######           ");
    }

    @Test
    public void test36345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36345");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 144, (double) 61, (double) 670L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 670.0d + "'", double3 == 670.0d);
    }

    @Test
    public void test36346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36346");
        long[] longArray1 = new long[] { 99L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[99]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 99L + "'", long3 == 99L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
    }

    @Test
    public void test36347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36347");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                          44444444444444444440true-1.0097HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ", "44444444444444444444444a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36348");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444a444444444444444444444444", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...4444...44....t..4444444444444444444444444444444444444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test36349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "                                                                                                                                  000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test36350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36350");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaa    a   HI!HI!aaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaa    a   HI!HI!aaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444444444444444444444444444444 4 444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444 4 444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444 4 444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                               AAAA0AAAA                      ", 172);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               AAAA0AAAA                                                                                                    " + "'", str2, "                                                               AAAA0AAAA                                                                                                    ");
    }

    @Test
    public void test36353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36353");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 165, (float) 542, (float) 170);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 542.0f + "'", float3 == 542.0f);
    }

    @Test
    public void test36354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36354");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444TRUE-1.00TRUE-1.97.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36355");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 138, 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36356");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444.444444444.4444444444444444444444444444444444444444444444444444410004444.444444444.444444444", "####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test36357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(".....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444." + "'", str2, "4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
    }

    @Test
    public void test36358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36358");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "00 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36359");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                ", "4444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 435);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36361");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 87 + "'", int1 == 87);
    }

    @Test
    public void test36362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36362");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 3, (long) 76, (long) 27);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 76L + "'", long3 == 76L);
    }

    @Test
    public void test36363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36363");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "790041-eurt044410040", "44444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97", "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36365");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E", "100.                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                          ", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a######################...##############################################      #a######################.                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          " + "'", str2, "                          ");
    }

    @Test
    public void test36367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36367");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "a0aaaaa0true-1.0097.0444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a0aaaaa0true-1.0097.0444" + "'", str1, "a0aaaaa0true-1.0097.0444");
    }

    @Test
    public void test36368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                     aaaa0aaaaa                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaa" + "'", str1, "aaaa0aaaaa");
    }

    @Test
    public void test36369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36370");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                      a                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 216, "!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaa    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "...                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36374");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0TRUE-1.0097.04444444444444444444444444440AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                       A                                 ", 632);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       A                                 " + "'", str2, "                       A                                 ");
    }

    @Test
    public void test36376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36376");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa", (double) 4.4444042E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444404224E9d + "'", double2 == 4.444404224E9d);
    }

    @Test
    public void test36377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36377");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(86.0f, (float) 253, (float) 330);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 330.0f + "'", float3 == 330.0f);
    }

    @Test
    public void test36378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36378");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36379");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                0.001                                               ", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T0097.00T", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                AAAA0AAAAA    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test36380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36380");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("000                                                                                                                                                                                                                                                                                                                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 000                                                                                                                                                                                                                                                                                                                                                                                        is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36381");
        java.lang.String[] strArray6 = new java.lang.String[] { "a", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", strArray6, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str9, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test36382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36382");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36383");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA         A         A        ...", "    A     ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", ".79  .1-EURT44eurt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36385");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                      ", "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440trueaaaaaaaaaaaaaaa", 149);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test36387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           " + "'", str2, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ");
    }

    @Test
    public void test36388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36388");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 52L, (float) 850L, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 850.0f + "'", float3 == 850.0f);
    }

    @Test
    public void test36389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36389");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    ", "0true-1.0097.  a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097                 ...                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36390");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                                                                 ", "...00.7900.1-eurt00.7900.1-eurt0", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                aaaa", "                                            100.0");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("97.0", strArray5, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444", strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97.0" + "'", str9, "97.0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test36391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AAAA", "..7900                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA" + "'", str2, "AAAA");
    }

    @Test
    public void test36392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36392");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAA0AAAA0.7900.1-EURT04444444444444444...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test36393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36393");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                               ...", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa4444444...aaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36394");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                " + "'", str1, "                                                ");
    }

    @Test
    public void test36396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36396");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaa", "H!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36397");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444...444444           AAAAAAAAAAA", 224, "true-1.00                                           true-1.97.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1.00                                           true-1.97.true-1.00                                           true-1.97.true-1.00                                           true-1.97.4444444...444444           AAAAAAAAAAA" + "'", str3, "true-1.00                                           true-1.97.true-1.00                                           true-1.97.true-1.00                                           true-1.97.4444444...444444           AAAAAAAAAAA");
    }

    @Test
    public void test36398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36398");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test36399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36399");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaTRUE-1.##97.aa", "44444444444444444440TRUE-1.0097.                    44444444444444444444444444      #a######################...##############################################      #a######################.");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444444444444444444444444444444440true-1.0097.", 257);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444" + "'", str2, "4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444");
    }

    @Test
    public void test36401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaa...", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test36402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36402");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "...00.7900.1-eurt00.7900.1-eurt0", (int) (byte) 1);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("44444444444444..", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       444...44444444444444444444444444444444440true-1.0097...44444...44444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("444...44444444444444444444444444444444440true-1.0097...44                                        ", strArray5, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 40");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test36403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36403");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test36404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36404");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36405");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0true-1.0097.0444444444444444444444444444444444444444444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 165, (int) (short) 10);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444", strArray2, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 8 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test36406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444444444444444444444444444444444444444", 665);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444");
    }

    @Test
    public void test36407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h!ih!h!ih!", 104, "HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!h!ih!HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str3, "h!ih!h!ih!HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test36408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36408");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("A A ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T" + "'", str4, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
    }

    @Test
    public void test36409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36409");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
    }

    @Test
    public void test36410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36410");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    ", "0444...44444444444444444444444444444444440TRUE-1.0097...4 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36411");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(".0097.00true-1.0097.00true-1.0097.00tr", 36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36412");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444 true - 1 . 97 . 4444444444444444444444444444444444444444444" + "'", str2, "44444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test36414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36414");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0097.00true-1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00.1-eurt00.7900" + "'", str1, "00.1-eurt00.7900");
    }

    @Test
    public void test36415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36415");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444..974", 173, 57);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test36416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", "4...7900");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   " + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ");
    }

    @Test
    public void test36417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36417");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444444444444444444444444AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.44444", (java.lang.CharSequence) "a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36418");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0true-1.0097.0");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...true0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...-0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...10097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...00970097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...0" + "'", str7, "00097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...true0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...-0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...10097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...00970097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444....0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...0");
    }

    @Test
    public void test36419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36419");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 262, (long) 34, 3L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 262L + "'", long3 == 262L);
    }

    @Test
    public void test36420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36420");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444##############4true-1.4497.4444", "04444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                    444...44444444444444444444444444444444440TRUE-1.0097...44                                        ", "   4444444...AAAAAAAAA44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 424, "...                                                                             ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                             ......                                                                             ......                                                                             ......                                                                             ......                                                                             ......      " + "'", str3, "...                                                                             ......                                                                             ......                                                                             ......                                                                             ......                                                                             ......      ");
    }

    @Test
    public void test36423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, "0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test36424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36424");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("e7.04444ee444ee7.04444ee444ee7.04444ee444ee7. A", "AAAAAAA...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36425");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...", " ...", 0, 131);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " ..." + "'", str4, " ...");
    }

    @Test
    public void test36426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36426");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36427");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0" + "'", str1, "00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0");
    }

    @Test
    public void test36428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36428");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(267L, 0L, (long) 27);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 267L + "'", long3 == 267L);
    }

    @Test
    public void test36429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36429");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(224L, (long) 124, (long) 750);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
    }

    @Test
    public void test36430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36430");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "true - 97");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "True - 97" + "'", str1, "True - 97");
    }

    @Test
    public void test36431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...40true-1.0097.04444444444444444444444444444444444...A A A A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...40TRUE-1.0097.04444444444444444444444444444444444...a a a a" + "'", str1, "...40TRUE-1.0097.04444444444444444444444444444444444...a a a a");
    }

    @Test
    public void test36432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36432");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test36433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36433");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                                                                                                                                                   aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa                                                                                                                                                                                                                                                                                                                    ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test36434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 23, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################" + "'", str3, "#######################");
    }

    @Test
    public void test36435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36435");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("44444444444444444444444444444444444444444440true-1.0097.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36436");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI!H4444404444HI!HI.A A A", "...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     a...", 550);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36437");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test36438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36438");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 15, (long) 150, 15L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 15L + "'", long3 == 15L);
    }

    @Test
    public void test36439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.044", "    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!......7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!......7900.1-eurt0" + "'", str2, "    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!......7900.1-eurt0");
    }

    @Test
    public void test36440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36440");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                      aahI!aa                                                                                                                                                                                                                                                                                                                                       ", "                                             A                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt", 539);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
    }

    @Test
    public void test36442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tra0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36443");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479" + "'", str1, "4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479");
    }

    @Test
    public void test36444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) ".0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                       4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                       ", 819);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                             4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                             4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test36447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444", 0, 202);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444");
    }

    @Test
    public void test36448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36448");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test36449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36449");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                         100.                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444444444444444441004.4044444444444444444444444444444444444444444444444", 833);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36451");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 92, "                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.a97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4444444###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36452");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "A         A         A        ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36453");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                             ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..", "4444444...444444           aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...444444           aaaaaaaaaaa" + "'", str2, "4444444...444444           aaaaaaaaaaa");
    }

    @Test
    public void test36456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...44444...true-1.4444444...97.4444444...4444444444444...4", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444...true-1.4444444...97.4444444...4444444444444...4" + "'", str2, "...44444...true-1.4444444...97.4444444...4444444444444...4");
    }

    @Test
    public void test36457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36457");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444a4444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 167);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("            ", "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa" + "'", str2, "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa");
    }

    @Test
    public void test36459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36459");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("            AAAA0AAAAA0AAAA0AAAAA0AAAA0AAAAA0AAAA0A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA0AAAAA0AAAA0AAAAA0AAAA0AAAAA0AAAA0A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "AAAA0AAAAA0AAAA0AAAAA0AAAA0AAAAA0AAAA0A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36460");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("    A     .7900.1-eurt0444444444444444444...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36461");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "a         a                                                     1000    a         a", 191);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#true-#.############################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str5, "#true-#.############################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test36462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36462");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaa                 ...                                                     444444444444444440true-1.0097...444444444444444444444444aaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36463");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "AAAA0AAAAA AAAA0AAAAA AAAA0AAAAA AAAA0AAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36464");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A A", 159, "a         a                                                     1000    a         a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A Aa         a                                                     1000    a         aa         a                                                     1000    a" + "'", str3, "A Aa         a                                                     1000    a         aa         a                                                     1000    a");
    }

    @Test
    public void test36465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36465");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4444444                                                                                                                                                                                                                                                                                                                                                                                                               ", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A                                                                   ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test36466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36466");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str3, "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test36467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36467");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444...4444444...4444444...4...", "######################################################################################################################################################################################################################################################################################################################################################################################################################Ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 434);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuu", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuu" + "'", str2, "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuu");
    }

    @Test
    public void test36469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36469");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test36470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("  A      A                            100.0                                                     AAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A      A                            100.0                                                     AAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36471");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444", "                    0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test36472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...aaaa...444444444", "        a4444444444444444444444444444444         ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444497.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444...444444444" + "'", str3, "...4444...444444444");
    }

    @Test
    public void test36473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test36474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36474");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", (java.lang.CharSequence) "A A A A ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test36475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36475");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 10, 17, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test36476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36476");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444440true-1.0097...44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36477");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36478");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "-1.0097.0                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36479");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test36480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "44444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa" + "'", str1, "44444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa");
    }

    @Test
    public void test36481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36481");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("...    0true-1.0097.00true-1.0097.00true-1.0097.00t");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36483");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#########################...#########################...########################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "A    4444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                             ", "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36485");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36486");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444444444.", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("1.0097.04444444444444444444444444", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0097.04444444444444444444444444" + "'", str2, "1.0097.04444444444444444444444444");
    }

    @Test
    public void test36488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36488");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 4444404444L, 638.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.444404444E9d + "'", double3 == 4.444404444E9d);
    }

    @Test
    public void test36489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36489");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                A A ###################################                 ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test36490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa", "                                                                                         #######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa" + "'", str2, "aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa");
    }

    @Test
    public void test36491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36491");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                               100.0");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0" + "'", str3, "100.0");
    }

    @Test
    public void test36492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36492");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##100.0###", "a###Ahi!hi!...###Ahi!hi!...###", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh###############################################################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str1, "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test36494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36494");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444440true-1.0097", "                                              ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.009" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.009");
    }

    @Test
    public void test36496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "0true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test36497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4true-1.4497.4444444444444444444444444444", "aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("0AAA079001-EURT0", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0AAA079001-EURT0" + "'", str2, "0AAA079001-EURT0");
    }

    @Test
    public void test36499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36499");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444", 951, 130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36500");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                                                                                                                                                             9EURT79EURT                                                                                                                                                                                                                                                                                                                             ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }
}

