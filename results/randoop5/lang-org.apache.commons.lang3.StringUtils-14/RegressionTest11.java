import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("################################################################################################.HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################################################################################.HI..." + "'", str1, "################################################################################################.HI...");
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   4");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAA1004", " ih                                           ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                 -1.0  0.0                                                   ", "               !IHAAAAAAA               ", (int) 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("Aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                 -1.0  0.0                                                   " + "'", str5, "                                                 -1.0  0.0                                                   ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                 -1.0  0.0                                                   " + "'", str6, "                                                 -1.0  0.0                                                   ");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                           -1.0  0.0", "########                                                                                  ", "-1.0  0.0aaaaaaa10041-1.0  0.0aaaaaaa10041-1.0  0.0aaaaaaa10041-1.0  0.0aaaaaaa10041-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           -1.0  0.0" + "'", str3, "                                                                                           -1.0  0.0");
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.aaaaaaahi!aaaaaa1                                        -1.0     0.                                        -1.0     0.41");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("444444444444440.1- .044444444...", "                                                                                                                                                                                                                                                                                                                                                                                                                                            ...    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                  a                                                  ", "...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  a                                                  " + "'", str2, "                                                  a                                                  ");
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HIAAAAAAAhi!AAAAAA10041", "...                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4001AAAAAA!IHAAAAAAA           ", 438);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4001AAAAAA!IHAAAAAAA           " + "'", str2, "4001AAAAAA!IHAAAAAAA           ");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("14001AAAAAA!IHAAAAAAA                                                                            ", "aaaaaaahi", 144);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        .." + "'", str1, "        ..");
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("               hi               ", 105, 939);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               hi               " + "'", str3, "               hi               ");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 88 + "'", int1 == 88);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!ih!IHAAAAAAA                                 ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", "   4");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 74, 74);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!aaaaaa1004", strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                        -1.0     0.0#############################################", "AAAAAAAHI!", 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) (short) 0, (int) (byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi!");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                        -1.0     0.0#############################################" + "'", str9, "                                        -1.0     0.0#############################################");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                        -1.0     0.0#############################################" + "'", str11, "                                        -1.0     0.0#############################################");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                            aaaaaaahi!aaaaaa10041", 11, 911);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("           AAAAAAAHI!AAAAAA1004", "####");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                           aaaaaaahi!HI!                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AAAAAAAHI!AAAAAA1004" + "'", str5, "AAAAAAAHI!AAAAAA1004");
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "1.00.0", (java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaahi!aaaaaa1004", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                          aaaaaaahi!", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       aaaaaaahi!" + "'", str2, "       aaaaaaahi!");
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...AAAAA...", (int) 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAA...                                                                                      " + "'", str3, "...AAAAA...                                                                                      ");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4####                                                             ", "   aaaaaaa100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0.00.0                                    ", "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        char[] charArray10 = new char[] { '#', '4', ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                    ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!####", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!                                                                                          ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                          " + "'", str2, "HI!                                                                                          ");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                ###################a-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 !#-1.0#####0.-1.0   AAAAAAA10040.                #######", "aaaaaaahi!aaaaaa1004");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("14Aaaaaaahi!aaaaaa100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14Aaaaaaahi!aaaaaa100" + "'", str1, "14Aaaaaaahi!aaaaaa100");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ihaaaaa", "HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HIAAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAAHI!AAAAAA1004", (java.lang.CharSequence) "                ##########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                           aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!" + "'", str3, "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!");
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!", 29, "################AAAAAAAHI!AAAAAA1004################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!" + "'", str3, "AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        char[] charArray12 = new char[] { '#', '4', ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                        -1.0     0.", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "001AAAA       AAAA", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaahi!.-1.00.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-", "...              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!.-1.00.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-" + "'", str2, "aaaaaaahi!.-1.00.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-");
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaahi", "                   !ihaaaaaaa                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("IH!IHAAAAAAA 0.00.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IHAAAAAAA 0.00.0" + "'", str1, "IH!IHAAAAAAA 0.00.0");
    }
}

