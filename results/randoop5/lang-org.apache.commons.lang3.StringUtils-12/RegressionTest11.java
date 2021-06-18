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
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 0, "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  00.00.00  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!ihaaaaaaa", (int) '4');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaa", strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("1.0  0.0 ", strArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("IHAAAAAAA                                                                  ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("################################################################################################.HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################################################################################.HI..." + "'", str1, "################################################################################################.HI...");
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   4");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAA1004", " ih                                           ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                 -1.0  0.0                                                   ", "               !IHAAAAAAA               ", (int) 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("Aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                 -1.0  0.0                                                   " + "'", str5, "                                                 -1.0  0.0                                                   ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                 -1.0  0.0                                                   " + "'", str6, "                                                 -1.0  0.0                                                   ");
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                           -1.0  0.0", "########                                                                                  ", "-1.0  0.0aaaaaaa10041-1.0  0.0aaaaaaa10041-1.0  0.0aaaaaaa10041-1.0  0.0aaaaaaa10041-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           -1.0  0.0" + "'", str3, "                                                                                           -1.0  0.0");
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.aaaaaaahi!aaaaaa1                                        -1.0     0.                                        -1.0     0.41");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("444444444444440.1- .044444444...", "                                                                                                                                                                                                                                                                                                                                                                                                                                            ...    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                  a                                                  ", "...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  a                                                  " + "'", str2, "                                                  a                                                  ");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HIAAAAAAAhi!AAAAAA10041", "...                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4001AAAAAA!IHAAAAAAA           ", 438);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4001AAAAAA!IHAAAAAAA           " + "'", str2, "4001AAAAAA!IHAAAAAAA           ");
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("14001AAAAAA!IHAAAAAAA                                                                            ", "aaaaaaahi", 144);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        .." + "'", str1, "        ..");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("               hi               ", 105, 939);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               hi               " + "'", str3, "               hi               ");
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 88 + "'", int1 == 88);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!ih!IHAAAAAAA                                 ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
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
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
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
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                            aaaaaaahi!aaaaaa10041", 11, 911);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("           AAAAAAAHI!AAAAAA1004", "####");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                           aaaaaaahi!HI!                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AAAAAAAHI!AAAAAA1004" + "'", str5, "AAAAAAAHI!AAAAAA1004");
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "1.00.0", (java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaahi!aaaaaa1004", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                          aaaaaaahi!", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       aaaaaaahi!" + "'", str2, "       aaaaaaahi!");
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...AAAAA...", (int) 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAA...                                                                                      " + "'", str3, "...AAAAA...                                                                                      ");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4####                                                             ", "   aaaaaaa100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0.00.0                                    ", "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

