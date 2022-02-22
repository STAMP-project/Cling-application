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
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   hi!hi!..", "", "0000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   hi!hi!.." + "'", str3, "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   hi!hi!..");
    }

    @Test
    public void test35002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str1, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test35003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35003");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                100.0aaaa                 ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35004");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35005");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("####################################################################################################################################################################################################################################################...t0444444444444444444444444444...", "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35006");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test35007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35007");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 895, 0.0f, (float) 50L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test35008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35008");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaTRUE-1.##97.aa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444", 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35009");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh###############################################################################", "...aaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35010");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (float) 842L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 842.0f + "'", float2 == 842.0f);
    }

    @Test
    public void test35011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                         A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                    ", 895);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                    " + "'", str2, "                         A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                    ");
    }

    @Test
    public void test35012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0true-1.00-1.0097.04444444444444444444444444444444444444444444", 50, "                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.00-1.0097.04444444444444444444444444444444444444444444" + "'", str3, "0true-1.00-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test35013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35013");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                      hI!HI!HI!HI!HI!HI!HI!HI!HI!HI", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test35014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#########.                                                   ", "TRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########.                                                   " + "'", str2, "#########.                                                   ");
    }

    @Test
    public void test35015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35015");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "                                                                                                                                                                           a         ", "     A    4", 15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test35016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35016");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...!hi!hi!hi!hi!hi!hi!", "1aaaaaaaaaaa", 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", 164, 141);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test35018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35018");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "4                                                   ", (int) (byte) 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 127, 99);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str5, "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str10, "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test35019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35019");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444440097...##########################################0444##############################################4444444444444...###########################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35020");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ..." + "'", str1, "true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...");
    }

    @Test
    public void test35021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa" + "'", str3, "Aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test35022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35022");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                         ih0.0100.0                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35023");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("100.0 AAAA0TRUE-1.0097.044444444444444444444444", ".0097.00TR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaa0", "       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a" + "'", str1, "a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a");
    }

    @Test
    public void test35026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                         #######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                         #######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                          " + "'", str1, "                                                                                         #######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                          ");
    }

    @Test
    public void test35027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35027");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test35028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35028");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35029");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0true-1.0097.00true-1.0097.00true-1.0097.00tr A ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa4true-1.4497.4444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444", "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iAi irti00i!i!900i!i1i-ieurti00i!i!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii iAi irti00i!i!900i!i1i-ieurti00i!i!                                       A HIhHIhHIhHAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "iAi irti00i!i!900i!i1i-ieurti00i!i!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii iAi irti00i!i!900i!i1i-ieurti00i!i!                                       A HIhHIhHIhHAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                            ...", "             AAAA0AAAAA    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            ..." + "'", str2, "                            ...");
    }

    @Test
    public void test35032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35032");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaa", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test35033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35033");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444   00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35034");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAhI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAhI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAhI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################");
    }

    @Test
    public void test35035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35035");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0AAAA", "    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("100.0#####100.0###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0#####100.0##" + "'", str1, "100.0#####100.0##");
    }

    @Test
    public void test35037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("000                                                                                                                                                                                                                                                                                                                                                                                       ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "000                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test35038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35038");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 83L, (double) 79L, 330.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 330.0d + "'", double3 == 330.0d);
    }

    @Test
    public void test35039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                      hI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "...                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35040");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 384 + "'", int1 == 384);
    }

    @Test
    public void test35041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35041");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444...4444444444........44444444444", 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test35042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35042");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("4444444440097...#############################################################################################", "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35043");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 797 + "'", int1 == 797);
    }

    @Test
    public void test35044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35044");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 671, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test35045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35045");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                             \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35049");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                      aaaa 0 aaaaa               ", 625L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 625L + "'", long2 == 625L);
    }

    @Test
    public void test35050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35050");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 368, 4.4444042E9f, 22.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 22.0f + "'", float3 == 22.0f);
    }

    @Test
    public void test35051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35051");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test35052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35052");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444", 165, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35054");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test35055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35055");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...", "A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35056");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 165 + "'", int2 == 165);
    }

    @Test
    public void test35057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35057");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("a   HI!HI!...truea   HI!HI!...-a   HI!HI!...a   HI!HI!...a   HI!HI!...97a   HI!HI!...a   HI!HI!...", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...44                             ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44                             " + "'", str2, "...44                             ");
    }

    @Test
    public void test35059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35061");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("..44440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444HI HI HI HI HI HI HI HI HI HI...4444a44444444                                                                                                                                                                   ", (short) 4);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 4 + "'", short2 == (short) 4);
    }

    @Test
    public void test35062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...44444444444444444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444444444444444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A" + "'", str1, "...44444444444444444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
    }

    @Test
    public void test35063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35065");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    ", 26, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35066");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44", "4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35067");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...44444...true-1.4444444...97.4444444...444444...44444...true-1.4444444...97.4444444...4444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa...", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa..." + "'", str2, "AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa...");
    }

    @Test
    public void test35070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35070");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...4a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44", "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35071");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0true-1.0aaaaaaaaaaaaaa", "44444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt04444444444444444444444444444444444444444444", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35072");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                                                                            0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A                                 100.0                                                     aaaa..                                                                                                                                                                                            ", "           aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A", "444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...44444444444444444444444                 ...                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A" + "'", str2, ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A");
    }

    @Test
    public void test35074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35074");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                a   hi!hi!...                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35075");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 23, 0L, 236L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test35076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35076");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                         #######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                          ", (java.lang.CharSequence) "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                         #######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                          " + "'", charSequence2, "                                                                                         #######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                          ");
    }

    @Test
    public void test35077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa", 570);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa" + "'", str2, "aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa");
    }

    @Test
    public void test35078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35079");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 220);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                     4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                     4444444444444444444444444444444444444444444ATRUE-1.A97.A4444444444444444444444444444444444444444444                                                                                     " + "'", str1, "                                                                                     4444444444444444444444444444444444444444444ATRUE-1.A97.A4444444444444444444444444444444444444444444                                                                                     ");
    }

    @Test
    public void test35082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4" + "'", str1, "4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4");
    }

    @Test
    public void test35083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35083");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35084");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi                                                                                                                                  0aaaa                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35085");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "      ", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Aaaaaaaaaaa4444444...4444444...4444444...4", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test35086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35086");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444", "true -   97");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35087");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", 754);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35088");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                      100.0", "Ahi!hi!...", 840);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...44444...4444444...4...ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35090");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!", "Aaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!" + "'", str2, "#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!");
    }

    @Test
    public void test35092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35092");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                      ...                           ", "44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097", 570);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35093");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#######...#######...#######...#######...#######...#######...#######...#######...######           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35094");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("0aaaa                                                                                                                                  A                                                                                                                                  0aaaa", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "-1.0097.04444444444444444444444444444444444444444444", 119, 51);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test35095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35095");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(667.0d, (double) 172.0f, 92.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 667.0d + "'", double3 == 667.0d);
    }

    @Test
    public void test35096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35096");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!", "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35098");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444... 4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444... 4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test35099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35099");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ...44444444444444444444444444444444440true-1.0097...44444", "4444444TRUE-1.00TRUE-1.97.                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35100");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0true-1.0", (double) 957L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 957.0d + "'", double2 == 957.0d);
    }

    @Test
    public void test35101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35101");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi", 9, 424);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444..0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi" + "'", str4, "4444444..0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi");
    }

    @Test
    public void test35102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35102");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAA", 170);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35103");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                      100.0                                                AAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", 951);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00..." + "'", str2, "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...");
    }

    @Test
    public void test35105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35106");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("   1000    .         .        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   1000    .         .        " + "'", str1, "   1000    .         .        ");
    }

    @Test
    public void test35107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35107");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35108");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("   444444444444444444444444...44444", "...                                                                ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.44444" + "'", str4, "444444444444444444444444AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.44444");
    }

    @Test
    public void test35109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35109");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###################################################################################################################################################################################################################################################444444444444444444444440.7900.1-eurt0aaaa                                                     0.001###################################################################################################################################################################################################################################################", "...00true-1.0097.00tru...", "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################################################################################################################################################################################################################44444444444444444444444 aaa  aaaaaa  aaaa                                                      a  a###################################################################################################################################################################################################################################################" + "'", str3, "###################################################################################################################################################################################################################################################44444444444444444444444 aaa  aaaaaa  aaaa                                                      a  a###################################################################################################################################################################################################################################################");
    }

    @Test
    public void test35110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00", "                       4a4444444444444444444444...4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00" + "'", str2, "                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00");
    }

    @Test
    public void test35111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35111");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35112");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaa0aaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " true-1.  97. ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444...                       a                       a                       a                       a                       a                       a  ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("0true-1 0097 044444444444444444444444444 4", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...AAAAAAAAAAAAAAAAAAAAAAAAA", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 42 + "'", int19 == 42);
    }

    @Test
    public void test35113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35113");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("4444444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA");
    }

    @Test
    public void test35115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0" + "'", str1, "0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0");
    }

    @Test
    public void test35116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35116");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                          ", 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35117");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test35118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35118");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("7900.1-eurt0444100.0A00       000       000       0A00 ", 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test35119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35119");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A         A                                                     1000    A         A");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35120");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1aaaaaaaaaaa", "##################################################################################################################################################################################################################################################################################### A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  #############################################################################################################################################################################################################################################", "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  rue-1.0097.0                                                                                                                                                                                                                                                               ", "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  rue-1.0097.0                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  rue-1.0097.0                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test35122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35122");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 172, (long) 167, (long) 187);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 167L + "'", long3 == 167L);
    }

    @Test
    public void test35123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35123");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...........#######################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ", "4777777777777777777777aaaa0aaaaa777777777777777777777777777777777777777777aaaa0aaaaa777777777777777777777777777777777777777777aaaa0aaaaa7777777...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 " + "'", str2, " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ");
    }

    @Test
    public void test35125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35125");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                                                     0", ".. A..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35126");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(".true-1...97..44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test35127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35128");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA" + "'", str1, "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA");
    }

    @Test
    public void test35129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                     " + "'", str2, "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                     ");
    }

    @Test
    public void test35130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("a0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, "097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test35131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35131");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "                                                                                            4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44", 750);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35132");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test35133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35133");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35134");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H...", "                                                                                                                                                                                                                        ", 132);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H..." + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H...");
    }

    @Test
    public void test35135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test35136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("AAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAA..." + "'", str1, "AAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test35137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                           aaaa0aaaaa                  4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaa0aaaaa                  4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35138");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4", "HI!", 1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", 47);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                      hI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test35139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35139");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(91, 269, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 269 + "'", int3 == 269);
    }

    @Test
    public void test35140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35140");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444...44444444444444444444444444444444440true-1.0097...44", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', (int) (short) 100, 34);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444...44444444444444444444444444444444440true-1.0097...44" + "'", str5, "444...44444444444444444444444444444444440true-1.0097...44");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str10, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test35141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35141");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...4a444hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44", ".", 55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 0, 127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35142");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                                                       A0                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 368 + "'", int1 == 368);
    }

    @Test
    public void test35143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35143");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                           0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35145");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444...44444444444444444444444444444444440TRUE-1.0097...44", "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35146");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "rt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ", "A         A         A         A         A         A         A         A         A         A   114", "                                                0.001                                      ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           " + "'", str3, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ");
    }

    @Test
    public void test35148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("true-1.4444444...97", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test35149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35149");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("A A A A A", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35150");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35152");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    ", "  4444444444444444444444444 true - 1 . 97 . 44444444444444...", "RT0000EURT0000EURT0000EURT0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35153");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35154");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444", "aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaa4true-1.4497.4444444444444444444444444444", 127);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35155");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("     ...         aaaa0aaaaa44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaa0aaaaa44444" + "'", str1, "...aaaa0aaaaa44444");
    }

    @Test
    public void test35156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("################################################################0TRUE-1.04444444...4444444...444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################################################0TRUE-1.04444444...4444444...444" + "'", str1, "################################################################0TRUE-1.04444444...4444444...444");
    }

    @Test
    public void test35157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35158");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4444444...", "4444444...");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("4444A44444", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "4444");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test35159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35159");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("100.0 aaaa0true-1.0097.044444444444444444444444", 101);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35161");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0atruea-a1a.a00aaaa4444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35162");
        char[] charArray7 = new char[] { '4', '4', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...44444...true-1.4444444...97.4444444...4444444444444...", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test35163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35163");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...0...AAA0AAAAAAAAA0AAAAAAAAA0AAAA44444444444444444444444444444444444444", "a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35164");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("40true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444   !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35165");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 982, (double) 951, (double) 61L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 982.0d + "'", double3 == 982.0d);
    }

    @Test
    public void test35166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35166");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("####################################    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH#####################################", "44444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "", 25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "####################################    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH#####################################" + "'", str4, "####################################    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH#####################################");
    }

    @Test
    public void test35167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35167");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Ahi!hi!...", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test35168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35168");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                      100.0                                   ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("A.7ee444ee44440.7ee444ee44440.7ee444ee44440.7e", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35169");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.000    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.000    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                               ...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35170");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...A .....44444...true-1.4444444...97.4444444...4444444444444...                  4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35171");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(4.0f, (float) 170L, (float) 51L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 170.0f + "'", float3 == 170.0f);
    }

    @Test
    public void test35172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35172");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("....4444444444444444444444444444..", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               4444444444444444444", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35173");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                                                                  ", "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!", 670);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa", strArray4, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str7, "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa" + "'", str12, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa");
    }

    @Test
    public void test35174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35174");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaa...00.7900.1-eurt00.79...aaaaaaa", 125, 656);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35175");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAA0AAAAA AAAA0AAAAA AAAA0AAAAA AAAA0AAAAA", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test35176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35176");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0097...", "     A    ", (int) '4');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                        44...7900.1-eurt04444444444444444444444444444444444...444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test35177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4000                                                                                                                                                                                                      ", "00       0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4000                                                                                                                                                                                                      " + "'", str2, "4000                                                                                                                                                                                                      ");
    }

    @Test
    public void test35178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35178");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 670);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35179");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444...", "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35180");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...                                                                ", "444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35181");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4             ", "0TRUE-1.0097.00TRUE-1....0true-1.0097...", 267);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35182");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("00       000       000       00A", "a   HI!HI!...truea   HI!HI!...-a   HI!HI!...a   HI!HI!...a   HI!HI!...97a   HI!HI!...a   HI!HI!...", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                     0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test35184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaa", "         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaa");
    }

    @Test
    public void test35185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35185");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("AA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test35186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35186");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", (java.lang.CharSequence) "...0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35187");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                   rt00.7900.                   ", "        a                     44444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   rt00.7900.                   " + "'", str2, "                   rt00.7900.                   ");
    }

    @Test
    public void test35189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#######...#######...#######...#######...#######...#######...#######...#######...######           #######...#######...#######...#######...#######...#######...#######...#######...######   44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097#######...#######...#######...#######...#######...#######...#######...#######...######           #######...#######...#######...#######...#######...#######...#######...#######...######   ", 277);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######...#######...#######...#######...#######...#######...#######...#######...######           #######...#######...#######...#######...#######...#######...#######...#######...######   44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097#######...#######...#######...#######...#######...#######...#######...#######...######           #######...#######...#######...#######...#######...#######...#######...#######...######   " + "'", str2, "#######...#######...#######...#######...#######...#######...#######...#######...######           #######...#######...#######...#######...#######...#######...#######...#######...######   44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097#######...#######...#######...#######...#######...#######...#######...#######...######           #######...#######...#######...#######...#######...#######...#######...#######...######   ");
    }

    @Test
    public void test35190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35190");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "###################################################################################################################################################################################################################################################################################################################################################################################################...44444444444444444444444444444444444444444444444444444...###################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", charSequence2, "aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35191");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 96);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str6, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test35192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35192");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("         ......00.7900.1-eurt00.79......aaaa", "0000000000000000000000000000000000000000000000000000000000000...000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35193");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aa 100.0aaaa", "4444444true-1.00true-1.97.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35194");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("A A A A ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test35195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35195");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0", "hi", 657);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35196");
        long[] longArray6 = new long[] { (byte) -1, 267, (byte) 1, '#', 10, (short) 10 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 267, 1, 35, 10, 10]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 267L + "'", long7 == 267L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 267L + "'", long8 == 267L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 267L + "'", long9 == 267L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 267L + "'", long10 == 267L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 267L + "'", long11 == 267L);
    }

    @Test
    public void test35197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35197");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444440true-1.0097...4", "A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 550);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444440true-1.0097...4" + "'", str3, "444440true-1.0097...4");
    }

    @Test
    public void test35198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("A0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "A0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test35199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35199");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35200");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("att-------ttt-------ttt-------tt", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35202");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', 959, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 95 + "'", int3 == 95);
    }

    @Test
    public void test35203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...4444                                                              ", "   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    0true-1.00-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444                                                              " + "'", str2, "...4444                                                              ");
    }

    @Test
    public void test35204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35204");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                       #A#44444444444444444444#...#44444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       #A#44444444444444444444#...#44444444444444444444444444444444444444..." + "'", str2, "                       #A#44444444444444444444#...#44444444444444444444444444444444444444...");
    }

    @Test
    public void test35207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35207");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                               a    TRUETRUETRUET                                                              ", (double) 19L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.0d + "'", double2 == 19.0d);
    }

    @Test
    public void test35208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35208");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097", strArray1, strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097" + "'", str3, "TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097");
    }

    @Test
    public void test35209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35209");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                     99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                     99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35211");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35213");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4                                                 100.0                                                                             AAAA0AAAAA", "                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00  " + "'", str3, "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00  ");
    }

    @Test
    public void test35215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("04444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "04444444444444444444444444" + "'", str1, "04444444444444444444444444");
    }

    @Test
    public void test35216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35216");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "T00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35217");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 156);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("    A     ", (java.lang.Object[]) strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("0TRUE-1.0097.0", strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("...         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0", strArray4, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str13, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test35218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35218");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                  ", 589);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440trueaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35220");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ", "a0000000000", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35221");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test35222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35222");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35223");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("######################################################a######################...###################################################################################################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test35224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35224");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaa0aaaa                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaa0aaaa                     \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test35226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35226");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(125.0d, (double) 671L, (double) 907);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 125.0d + "'", double3 == 125.0d);
    }

    @Test
    public void test35227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...444                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35228");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
    }

    @Test
    public void test35229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35229");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaatrue0aaaa0.aaatruaaa", "...aaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "Aaaa...", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaatrue0aaaa0.aaatruaaa" + "'", str4, "aaaaatrue0aaaa0.aaatruaaa");
    }

    @Test
    public void test35230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35230");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aa100.0aaaa", 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35231");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                       a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test35232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35232");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", 502, "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a######################...##############################################      #a######################.                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a######################" + "'", str3, "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a######################");
    }

    @Test
    public void test35233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35233");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                         AAAA0AAAAA", "                       444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .", 47, 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                          444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .AAAA" + "'", str4, "                                                          444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .AAAA");
    }

    @Test
    public void test35234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35234");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aa..", 744);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35235");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Ahi!hi!...", "A A A A ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ahi!hi!..." + "'", str3, "Ahi!hi!...");
    }

    @Test
    public void test35236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35236");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ", 49);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                                                                    ...aaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test35237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", 585, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
    }

    @Test
    public void test35238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("rt00.7900.1-eurt00.7900.1-eurt00.7944444444444444444444 !1-eurt00.7900.1-eurt00.7900.1-eurt0", 38, "                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7944444444444444444444 !1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", str3, "rt00.7900.1-eurt00.7900.1-eurt00.7944444444444444444444 !1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test35239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("A4A4A4A444444444444444444444444a4...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A4A4A4A444444444444444444444444a4...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35240");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("true                                         TRUE-1                                                                                                  44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A444", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true                                         TRUE-1                                                                                                  44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A444" + "'", str3, "true                                         TRUE-1                                                                                                  44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A444");
    }

    @Test
    public void test35242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35242");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                     4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35243");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                             0                  ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35244");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...ue-1.0097.044444444444444444444444444444444...", ".7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35245");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a00a.a1a-atruea0", 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test35246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35246");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#...#4#a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35247");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(418, 418, 667);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 667 + "'", int3 == 667);
    }

    @Test
    public void test35248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35248");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa                                                                                                                                                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35249");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("0       00", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444444444444444444444444444444444444444444444hi!", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test35250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35250");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", "                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35251");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                          100.0                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                 " + "'", str2, "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
    }

    @Test
    public void test35253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...                                                                ", 840, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...                                                                " + "'", str3, "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...                                                                ");
    }

    @Test
    public void test35254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35254");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...4444444444444444444444444440t...", "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35255");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                      100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444" + "'", str2, "100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444");
    }

    @Test
    public void test35257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35258");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "aaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str8, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
    }

    @Test
    public void test35259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35259");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa", (float) 441);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 441.0f + "'", float2 == 441.0f);
    }

    @Test
    public void test35260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35260");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...a..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...a.." + "'", str1, "...a..");
    }

    @Test
    public void test35261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35261");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A", "0AAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test35262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35262");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test35263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35263");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0tr");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35264");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "444444444 ...", (java.lang.CharSequence) "44444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35265");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                      41004.404                                                ", "                       a                             ###    a   HI!HI!...###    a   HI!HI!...###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4444444..444444444444444440T", "                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                            100.0                ...                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35268");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 4, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test35269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35269");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(632, 788, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 86 + "'", int3 == 86);
    }

    @Test
    public void test35270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35270");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a   HI!HI!..    a   HI!HI!..    a   HI!HI!.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                          44444444444444444444444a", 220);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35272");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                100.0#####100.0###", "44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", "0                                             100.0                                                     aaaa                                                                                                                                                                                                                                                                                   ", 670);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                100.0#####100.0###" + "'", str4, "                                                                                100.0#####100.0###");
    }

    @Test
    public void test35273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                            100.0                                                     aaaa", 52, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            100.0                                                     aaaa" + "'", str3, "                            100.0                                                     aaaa");
    }

    @Test
    public void test35274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAA                         ", 630, 259);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAA                         " + "'", str3, "AAAAAAAAAAAAAA                         ");
    }

    @Test
    public void test35275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35275");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35276");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...4444.....", "      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", 181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35277");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35278");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4", 819);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35279");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "A A A                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35280");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4ue-1.0097...444444444444444444444444########################################################################################100.44", "A0true-1.0097.00true-1.0097.00true-1.0097.00tr", 101);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test35281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35281");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0       00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0       00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "0       00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35283");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                      ...                                                     ", 57);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "44444444444444444440TRUE-1.0097.                    ");
        java.lang.String[] strArray9 = null;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h" + "'", str10, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
    }

    @Test
    public void test35284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35284");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 449, 32.0f, 0.001f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.001f + "'", float3 == 0.001f);
    }

    @Test
    public void test35285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" 4...7900.1-EURT04444444444444444444444444444444444...4440");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 4...7900.1-EURT04444444444444444444444444444444444...4440" + "'", str1, " 4...7900.1-EURT04444444444444444444444444444444444...4440");
    }

    @Test
    public void test35286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35286");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!", "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A    A00 000 0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!" + "'", str3, "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
    }

    @Test
    public void test35287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "true-1. 97.  true-1. 97. ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true-1. 97.  true-1. 97. " + "'", str1, "true-1. 97.  true-1. 97. ");
    }

    @Test
    public void test35288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.0                ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("   a         ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   a         " + "'", str2, "   a         ");
    }

    @Test
    public void test35291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35291");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444###4444444###4444444###4###");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test35292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("   4444444...AAAAAAAAA44444444444444444444444444444444444444444", "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35293");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444 0.79 0.1-eurt 04444444444444444444444444444444444444444444", "######################################################################################################444444444444444440true-1.0097...444444444444444444444444                                                                                        100.", 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                               a                        44444444444444444444                        ...                        444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               a                        44444444444444444444                        ...                        444444444444444444444444444444444444444444444" + "'", str1, "                                               a                        44444444444444444444                        ...                        444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "...a     ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...a     .." + "'", str1, "...a     ..");
    }

    @Test
    public void test35296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35296");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                              0                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35297");
        int[] intArray5 = new int[] { 57, 267, (byte) -1, 9, 5 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[57, 267, -1, 9, 5]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 267 + "'", int7 == 267);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 267 + "'", int9 == 267);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 267 + "'", int10 == 267);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test35298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...7.044444444444444444444444444..", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", "4444444...44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4447404444444444444444444444444444" + "'", str3, "4447404444444444444444444444444444");
    }

    @Test
    public void test35299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35299");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ", (java.lang.CharSequence) "###################################       hi!hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 " + "'", charSequence2, "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test35300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35300");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                 aaaa0aaaaa", "!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0097...40097...4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0097...40097...4" + "'", str1, "0097...40097...4");
    }

    @Test
    public void test35302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35302");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35303");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "true 1.  97.", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaa                                                                ...44444", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test35304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("A A A A A", 656);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A A A A A" + "'", str2, "A A A A A");
    }

    @Test
    public void test35305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35305");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                     ...                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                     ...                                      " + "'", str1, "                                                     ...                                      ");
    }

    @Test
    public void test35306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35306");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("###    a   HI!HI!...", "000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.", 449);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi." + "'", str2, "    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
    }

    @Test
    public void test35308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35308");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(256, 741, 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 741 + "'", int3 == 741);
    }

    @Test
    public void test35309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35309");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...0TRUE-1.0097...######################################################################################################444444444444444440true-1.0097...444444444444444444444444                                                                                        100.######################################################################################################444444444444444440true-1.0097...444444444444444444444444                                                                                        100.###########################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35310");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...7.044444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35311");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(156.0f, (float) 545, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 545.0f + "'", float3 == 545.0f);
    }

    @Test
    public void test35312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35312");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "..####0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "True444...444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                               AAAA0AAAA                      ", "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               AAAA0AAAA                      " + "'", str2, "                                                               AAAA0AAAA                      ");
    }

    @Test
    public void test35314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0", "                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0" + "'", str2, "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0");
    }

    @Test
    public void test35315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35315");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                         0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!hi!hiTTTTTTi!h", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hiTTTTTTi!h" + "'", str2, "!hi!hiTTTTTTi!h");
    }

    @Test
    public void test35318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...000     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...000     .." + "'", str1, "...000     ..");
    }

    @Test
    public void test35319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35319");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                   ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test35320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35320");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa", "aahaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35321");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...097.00tr.0097.00tr.0097.00tr             ...", "TRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-", 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...097.00tr.0097.00tr.0097.00tr             ..." + "'", str3, "...097.00tr.0097.00tr.0097.00tr             ...");
    }

    @Test
    public void test35323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35323");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("true-1.00true-1.97.", 78, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.00true-1.97." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.00true-1.97.");
    }

    @Test
    public void test35325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35325");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444444true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35326");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                    444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaa" + "'", str2, "aaaaaaaaaaa");
    }

    @Test
    public void test35328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35328");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E", 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test35329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35329");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 548L, (double) 181, (double) 650L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 181.0d + "'", double3 == 181.0d);
    }

    @Test
    public void test35330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35330");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaaaaa   ", "...aaaa...444444444", 4444444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "A A ###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35332");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test35333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35333");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                     " + "'", str1, "                                                                                                                                     ");
    }

    @Test
    public void test35334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35334");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test35335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35335");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444440", 4.4444440004444446E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4444444444444445E43d + "'", double2 == 4.4444444444444445E43d);
    }

    @Test
    public void test35336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35336");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(91L, (long) 141, (long) 65);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 141L + "'", long3 == 141L);
    }

    @Test
    public void test35337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35337");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "", 57);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 53, 1);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test35338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35338");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0true-1.00                                           true-1.97.                                                                                   ", 146, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.00                                           true-1.97.                                                                                   " + "'", str3, "0true-1.00                                           true-1.97.                                                                                   ");
    }

    @Test
    public void test35339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35340");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "              ", 45);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                      a                                                     ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0", '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(".                                  aaaa.", strArray6, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".                                  aaaa." + "'", str10, ".                                  aaaa.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0" + "'", str11, "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
    }

    @Test
    public void test35341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("       ", "44444444444444444444444444444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test35342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35342");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", "                                                              ", 550);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35343");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35344");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47", "                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35345");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("true-1.  97.", "#################################################   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35346");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            ", "                                                                                                                                                                                                                                                                                      0true-1.00                           aaaa0aaaaa                                             aaaa0a                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            " + "'", str2, "                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            ");
    }

    @Test
    public void test35348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                      0true-1.00                           aaaa0aaaaa                                             aaaa0a                                                                                                                                                                                                                                                                                       ", "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0", "44...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35349");
        long[] longArray1 = new long[] { (short) 100 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
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
    public void test35350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35350");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "A ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A ..." + "'", str1, "A ...");
    }

    @Test
    public void test35351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35351");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                     ", "                                     100.0                                                     aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35352");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...........#######################################################################################", (java.lang.CharSequence) "true-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...........#######################################################################################" + "'", charSequence2, "...........#######################################################################################");
    }

    @Test
    public void test35353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35353");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("            1000    a         a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35354");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("         a                                          ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test35355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35355");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35356");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 114.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 114.0d + "'", double2 == 114.0d);
    }

    @Test
    public void test35357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35357");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                       44444444444444444444...4444                       44444444444444444444...4444", "A    44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       44444444444444444444...4444                       44444444444444444444...4444" + "'", str2, "                       44444444444444444444...4444                       44444444444444444444...4444");
    }

    @Test
    public void test35359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35359");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            ", "A     0true-1 0097 00true-1 0097 00true-1 0097 00tr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35360");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
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
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test35361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35361");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "444444444444444440true-1.0097...444444444444444444444444#####################################################################################################################################################################################", 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0" + "'", str3, "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
    }

    @Test
    public void test35362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...IH", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35363");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35364");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...0TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35365");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hI!", "...44444...4444444...4...aaaaaa...", "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr44A4", 156);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
    }

    @Test
    public void test35366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", "####                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", ".0097.00TRUE-1.0097.00TRUE-1.0097.00TR.0097.00TRUE-1.0097.00TRUE-1.0097.00TR.0097.00TRUE-1.0097.00TRUE-1.0097.00TR.0097.00TRUE-1.0097.00T0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test35368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35368");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...44444...true-1.4444444...97.4444444...444444...44444...true-1.4444444...97.4444444...4444444", 732, 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("44444444444444444444444444444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44aAAAAAA4440true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...44444444444...                 aaaaaaaaaaa aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0         aaa", "444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35371");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Aahaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test35372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35372");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444440TRUE-1.0097.                    ", "      00", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444...44a1a4444444...4444444...44...a144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35374");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                               aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......", "####################aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ######################################", 17);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35375");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("True444...444444444444444444444", "444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444####################################################################################################################################################################################", 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "True444...444444444444444444444" + "'", str3, "True444...444444444444444444444");
    }

    @Test
    public void test35376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35376");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                    444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35377");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", (java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "HI!", 56, 47);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concatWith("  ...", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097", strArray6, strArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a', 63, 959);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str19, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097" + "'", str20, "44444444444444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test35378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35378");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                   rt00.7900.                   ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                    rt00.7900.                   ################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################## is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...aaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35382");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "aa100.0aaaa", "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35383");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...7.044444444444444444444444444...", "            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35384");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test35385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35385");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", "4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35388");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444440.7900.1-EURT0", "...000     ..", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35389");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 9.0, 100.0, 86.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test35390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35390");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 891, (float) 173);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 891.0f + "'", float3 == 891.0f);
    }

    @Test
    public void test35391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35391");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                            4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35392");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                               hI!", "...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0TRUE-1.04444444...4444444...444", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     ", 665);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-1.04444444...4444444...444" + "'", str3, "0TRUE-1.04444444...4444444...444");
    }

    @Test
    public void test35394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35394");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.A44444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A44444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35395");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0true-1.0097.0");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "0.001");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0true-1.0097.0" + "'", str5, "0true-1.0097.0");
    }

    @Test
    public void test35396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440TRUE-1.0097...44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test35397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35397");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0aaaaa    ", "        a                     ", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35398");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.00-1.0097.0444444444444444444444444444444...", "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 5);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                      100.0                                                      ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "true-1.00-1.0097.0444444444444444444444444444444" + "'", str6, "true-1.00-1.0097.0444444444444444444444444444444");
    }

    @Test
    public void test35399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35399");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa     ", ".0097.00TR.0097.00TR.0097.00TR.009a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                          a                             ###    a   HI!HI!...###    a   HI!HI!...###.0097.00TR.0097.00TR.0097.00TR.009");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa     " + "'", str2, "aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa     ");
    }

    @Test
    public void test35401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35401");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "TRUE-1.##97.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35402");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test35403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35403");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "A A A A a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A A A A a" + "'", str1, "A A A A a");
    }

    @Test
    public void test35404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35404");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35405");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                       0aaaa                                                                                                                                  A                                                                                                                                  0aaaa                                                                                                                                      ", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35406");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 4, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test35407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0aaa", (java.lang.CharSequence) "                    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                             #0true-1.0097.0##########################################0true-1.0097.0############################                                                                                                                                                                                                                              ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                             #0true-1.0097.0##########################################0true-1.0097.0############################                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                             #0true-1.0097.0##########################################0true-1.0097.0############################                                                                                                                                                                                                                              ");
    }

    @Test
    public void test35409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35409");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...                                                                                                                                                                             ...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35410");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0097...");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...44444...true-1.4444444...97.4444444...4444444444444...", '#');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaa0aaaaa", "A", 48);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                       a", strArray6, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                            ", strArray2, strArray10);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                       a" + "'", str11, "                       a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                                                            " + "'", str12, "                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test35411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 46, "                       a                             ###    a   HI!HI!...###    a   HI!HI!...###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("A    4444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A    4444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444" + "'", str1, "A    4444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444");
    }

    @Test
    public void test35414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(".######################a#      ##############################################...######################a#      44444444444444444444444444                    .7900.1-EURT04444444444444444444", "                                                                                                                                 0                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".######################a#      ##############################################...######################a#      44444444444444444444444444                    .7900.1-EURT04444444444444444444" + "'", str2, ".######################a#      ##############################################...######################a#      44444444444444444444444444                    .7900.1-EURT04444444444444444444");
    }

    @Test
    public void test35415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35415");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ..", 63, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            .." + "'", str3, "...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ..");
    }

    @Test
    public void test35416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35416");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "A    ", (java.lang.CharSequence) ".001                                      ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test35417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 967, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35418");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("      a     ", 123);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      a                                                                                                                    " + "'", str2, "      a                                                                                                                    ");
    }

    @Test
    public void test35420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35420");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray4, strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("0TRUE-1.0097.0", strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0" + "'", str8, "100.0");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test35421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35421");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                   aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test35422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35422");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                    ", "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0", 468);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                    " + "'", str4, "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                    ");
    }

    @Test
    public void test35423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 147, 479);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35424");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(842L, (long) 22, 17L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 842L + "'", long3 == 842L);
    }

    @Test
    public void test35425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35425");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "true-1.  97.", "                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test35426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744", "44444444444444444444444444444444444444444440true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744");
    }

    @Test
    public void test35427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                           a                        A A A A                                                                 ", "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           a                        A A A A                                                                 " + "'", str2, "                                           a                        A A A A                                                                 ");
    }

    @Test
    public void test35428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAA", "                       a                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35429");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("TRUE-1.0097.0", 615);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35431");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0true-1.0097.0444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                         aaaa0aaaaa   ", "...444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         aaaa0aaaaa   " + "'", str2, "                                                                         aaaa0aaaaa   ");
    }

    @Test
    public void test35433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35433");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                                                                aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                         ", (java.lang.CharSequence) "044444444444444444444444444                                                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444", "44444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35435");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("97.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", "##100.0###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35436");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "a0000000000", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           ", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0097..###############################################################################################################################################", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                               100.", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "##", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i444444444444444444444444444444", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test35437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35437");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test35438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35438");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ", "4444444...4444444...44a1a4444444...4444444...44...a1     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35439");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("aaaa0aaaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...aaaaaaaaaaaaaaa...                                   ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test35440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35440");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35441");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    }

    @Test
    public void test35442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35442");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444440true-1.0097.0100.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444440true-1.0097.0100." + "'", str1, "444440true-1.0097.0100.");
    }

    @Test
    public void test35443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35443");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                      100.0                ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test35444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...            ...            ...            ...            ...            ...            ...         ", "...4#444hi!hi!hi!h############################...44", 750, 205);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...            ...            ...            ...            ...            ...            ...         ...4#444hi!hi!hi!h############################...44" + "'", str4, "...            ...            ...            ...            ...            ...            ...         ...4#444hi!hi!hi!h############################...44");
    }

    @Test
    public void test35445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35445");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 24L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test35446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35446");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444A444444444444444444        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35447");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(648, 650, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 650 + "'", int3 == 650);
    }

    @Test
    public void test35448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35448");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test35449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35449");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0ATRUEA-A1A.A0097A.A0");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("444444444444444444444444...44444", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...                          ...", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("Aaa4444444...4444444...4444444...4  ", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Aaa4444444...4444444...4444444...4  " + "'", str10, "Aaa4444444...4444444...4444444...4  ");
    }

    @Test
    public void test35450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35450");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 10);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray5, strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0", strArray9, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str10, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test35451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("            1000    a         a", "##########################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            1000    a         a" + "'", str2, "            1000    a         a");
    }

    @Test
    public void test35452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35452");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A    4", 9.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test35453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "aaaaaaa...00.7900.1-eurt00.79...aaaaaaa", "                                         AAAA0AAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444444..0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi", "               444444444444.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444..0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi" + "'", str2, "4444444..0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi");
    }

    @Test
    public void test35455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35455");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa", "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35457");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("A0A", 68, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35459");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097", "a0aaaaa0true-1.0097.0444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "a44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test35461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAA", 57, "A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A 0true-1.0097.00true-1.00AAAAA 0true-1.0097.00true-1.009" + "'", str3, "A 0true-1.0097.00true-1.00AAAAA 0true-1.0097.00true-1.009");
    }

    @Test
    public void test35462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444", "#a######################...##############################################", "         .");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444" + "'", str3, "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444");
    }

    @Test
    public void test35463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35463");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr", "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H", 150);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                          ##100.0###                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test35466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35466");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                         ...444444440tr...                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35467");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35468");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      100.0                                                AAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                             9EURT79EURT                                                                                                                                                                                                                                                                                                                             ", 441);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35469");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35470");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...", "44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("true-1.00true-1.97.", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1.00true-1.97." + "'", str3, "true-1.00true-1.97.");
    }

    @Test
    public void test35472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444440true-1.0097." + "'", str1, "4444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test35473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi", (int) (short) 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35474");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0true-1009700true-1009700true-1009700true-1009700true-1009700true-1009700true-100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1009700true-1009700true-1009700true-1009700true-1009700true-1009700true-100" + "'", str1, "0true-1009700true-1009700true-1009700true-1009700true-1009700true-1009700true-100");
    }

    @Test
    public void test35476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                  0aaaa                                                                  4ue-1.0097...444444444444444444444444########################################################################################100.44                                                                                                                                  0aaaa                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                  0aaaa                                                                  4ue-1.0097...444444444444444444444444########################################################################################100.44                                                                                                                                  0aaaa                                                                   " + "'", str1, "                                                                                                                                  0aaaa                                                                  4ue-1.0097...444444444444444444444444########################################################################################100.44                                                                                                                                  0aaaa                                                                   ");
    }

    @Test
    public void test35477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35477");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 156 + "'", int1 == 156);
    }

    @Test
    public void test35478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "                                                                                                                                  0aaaa                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test35479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35479");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444440true-1.0097", "44444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35480");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 17L, (double) 664, (double) 4.4444443E13f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4444443213824E13d + "'", double3 == 4.4444443213824E13d);
    }

    @Test
    public void test35481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                 A A A A                        a                                                                                              ", "                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 A A A A                        a                                                                                              " + "'", str2, "                                                                 A A A A                        a                                                                                              ");
    }

    @Test
    public void test35482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35482");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 419, (long) 32, 463L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test35483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35483");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("900.1-EURT0444444444444444444444444444", "a0000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Aaaa0aa00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35485");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("##100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 368);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35486");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a0a", "0true-1.0097.044444444444444444444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a#a" + "'", str4, "a#a");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test35487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35487");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("true444...44444444444444444444444444444444440TRUE-1.0097...44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35488");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35489");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("A   ", "####################################################################################################################################################################################################################################################...t0...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35490");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0", (double) 24);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.0d + "'", double2 == 24.0d);
    }

    @Test
    public void test35491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35491");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4", "Aa00a       a000a       a000a       a00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35493");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("444444444444444444444444444444444444444444444444444444444444E-1.0         0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35494");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0true-1.00                                           true-1.97.                                                                                   ", "4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("a004444444000444444400044444440", "A A A A A A A A A A A A A A A A A A A A A A A A 4479     000       000       09700       000       0", "4444a44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test35497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35497");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", (java.lang.CharSequence) "..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 359 + "'", int2 == 359);
    }

    @Test
    public void test35498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35498");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.0097.", "                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ", 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097", "Ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest70.test35500");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 133);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

