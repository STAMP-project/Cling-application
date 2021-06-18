import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "IH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str1, "IH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...                          ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1." + "'", str1, "0. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ihaaaaaaa                                                   ", "iH          ", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1h-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.", "                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1h-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1." + "'", str2, "-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1h-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                           aaaaaaa                                            ", "aa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           aaaaaaa                                            " + "'", str3, "                                           aaaaaaa                                            ");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "-1.0  0.0aaa", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  00.00.00  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ", "4444444444444444444444444444440.0440.1-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  00.00.00  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 " + "'", str2, "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  00.00.00  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaa", 900);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                aaaa" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                aaaa");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("-1.0                                                                                  0.0", "                   !ihaaaaaaa                                                                       ", 900);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0                                                                                  0.0" + "'", str3, "-1.0                                                                                  0.0");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "ihaaaaaa", 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("#############################################0.0     0.1-                                        ", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!" + "'", str2, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                          aaaaaaahi!", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("-1.0     0.0", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str6, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("IH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str2, "IH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.", "AAAAAA1001", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        ", 95, "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        " + "'", str3, "aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        ");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!ihaaaaaaa", strArray5, strArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("444444444444440.1- .044444444...", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!ihaaaaaaa" + "'", str12, "hi!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4###4###4###4###4###4###4###4###4###4###", "               !IHAAAAAAA               ", 939);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444440. -1.044444444444444444444444", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                                     4");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!AAAAAA1001", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!AAAAAA1001" + "'", str2, "hi!AAAAAA1001");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", (java.lang.CharSequence) "        -1.0     0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 916 + "'", int2 == 916);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaa", 51, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa" + "'", str3, "aaaaaaaaaa");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("####", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str6, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                            aaaaaaahi!aaaaaa10041", "aaaaaaahi!", 12);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("...AAAAA...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAA10041                        ", (java.lang.CharSequence) "                                                               ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######hi                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######!                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 362 + "'", int2 == 362);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "14001aaaaaa!ihaaaaaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4!ihaaaaaaa                                                                                                                                                                                          ", "               1004                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a!a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                        ########                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                        ########                                        " + "'", str1, "                                        ########                                        ");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("14001aaaaaa!ihaaaaaaa                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14001aaaaaa!ihaaaaaaa" + "'", str1, "14001aaaaaa!ihaaaaaaa");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                             ...", (java.lang.CharSequence) "!ihaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                          aaaaaaahi!", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str3, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "14001########aaa", (java.lang.CharSequence) "###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!IH       ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0                                                                                  0.0", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!ih                                                                                               ", "IHAAAAAAA                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                 -1.0  0.0                                                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0.0 -1.0", 930);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0 -1.0" + "'", str2, "0.0 -1.0");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("......", "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......" + "'", str3, "......");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "AAAAAA10041", (java.lang.CharSequence) "AAAAAAA1004");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAAAAA10041" + "'", charSequence2, "AAAAAA10041");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("   aaaaaaa1004", "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh", "                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.aaaaaaahi!aaaaaa1                                        -1.0     0.                                        -1.0     0.41");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   aaaaaaa1004" + "'", str3, "   aaaaaaa1004");
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("AAAAAAAhi!AAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAA!ihAAAAAAA" + "'", str1, "AAAAAA!ihAAAAAAA");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("a!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa", "a", "AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          ", "0.0");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#################################Aaaaaaahi!aaaaaa10041##################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                          " + "'", str4, "                                                                                          ");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("-1.0  0.0                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0                               " + "'", str1, "-1.0  0.0                               ");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!ihaaaaaaa", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                            !ihaaaaaaa" + "'", str2, "                                                                            !ihaaaaaaa");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                     4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...!AAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!AAA..." + "'", str1, "...!AAA...");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444", "1.0     0.1.0  0.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#############", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '#');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAA", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("hi!ihaaaaaaa", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAA", strArray5, strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AAAAAAA" + "'", str12, "AAAAAAA");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaahi!", "1.0     0.1.0  0.0 ", 930);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", "AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(".");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aah                                                                                                                        aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!", "hi!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aah                                                                                                                        aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!" + "'", str2, "aah                                                                                                                        aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI" + "'", str1, "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                          AAAAAAA1004", 825, "aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi                                                                                          AAAAAAA1004" + "'", str3, "aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi                                                                                          AAAAAAA1004");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "1.00.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("A", "#                                                                                          aaaaaaahi!", (int) (byte) -1, 12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#                                                                                          aaaaaaahi!" + "'", str4, "#                                                                                          aaaaaaahi!");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0.0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                           aaaaaaahi!HI!                                            ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "14001AAAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih", (java.lang.CharSequence) "aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.00.0" + "'", str1, "-1.00.0");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a!a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a!a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a!a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("A", 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!i!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!i!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!####" + "'", str1, "hi!i!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!####");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!ihaaaaaaa                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", "4001aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ihaaaaaaa                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######" + "'", str2, "hi!ihaaaaaaa                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !i!ihaaaaaaa", ".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA" + "'", str2, "AAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!iha!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa", "AAAAAAAhi!AAAAAA10041");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!iha!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa" + "'", str4, "!iha!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                  ########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                  ########" + "'", str1, "                                                                                  ########");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "-1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.aaaaaaahi!aaaaaa1                                        -1.0     0.                                        -1.0     0.41");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", "                                         1.0     0.                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "10041");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimeToLive of -1 is less than 0: AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                     ...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "-1.0     0aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaa", (java.lang.CharSequence) "                                                                                                   100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...    ...", 52, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    ...                                          " + "'", str3, "...    ...                                          ");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444444444440.1-.", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444440.1-." + "'", str2, "444444444444440.1-.");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaa", "-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "####### AAAAAAA10040. ###################aaaaaaahi!#-1.0#####0.-1.0 AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("          ", "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444444444440.1-.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444440.1-." + "'", str1, "444444444444440.1-.");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("0.0  0.1-", "", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-" + "'", str3, "0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAA", "A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                               i!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               i!                                               " + "'", str1, "                                               i!                                               ");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAAAHI!AAAAAA1004         -1.0  0.0                                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAHI!AAAAAA1004         -1.0  0.0                                                  " + "'", str2, "AAAAAAAHI!AAAAAA1004         -1.0  0.0                                                  ");
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1.0  0.0 ", 630, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                               ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######hi                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######!                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######hi                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######!                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######" + "'", str1, "###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######hi                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######!                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                    ", "!ihaaaaaaa                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) " 0.0  0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4001AAAAAAA", "... 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaahi!aaaaaa10041                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "14001aaaaaa!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaa10041                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "aaaaaaahi!aaaaaa10041                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######hi                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######!                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", "aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   aaaaaaa1004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004" + "'", str3, "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#############aaaaaaahi!#-1.0#####0.", "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############aaaaaaahi!#-1.0#####0." + "'", str3, "#############aaaaaaahi!#-1.0#####0.");
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi4", "AAAAAA10041", 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str6, "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("-1.0  0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0." + "'", str1, "-1.0  0.");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("100", "0.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', (-1), 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                   aaaaaaahi!. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                     4");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("###################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!IHAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa", 916);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0.00.0                                                                                       aaaaaaahi!HI", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("IH!IHAAAAAAA                                                                                       0.00.0", "                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IHAAAAAAA                                                                                       0.00.0" + "'", str2, "IH!IHAAAAAAA                                                                                       0.00.0");
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("################################################################################## 0.0  0.1.0     0.1################################################################################## 0.0  0.1.0     0.1###########AAAAAAA1004################################################################################## 0.0  0.1.0     0.1################################################################################## 0.0  0.1.0     0.1############", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1###########AAAAAAA1004###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1############" + "'", str3, "###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1###########AAAAAAA1004###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1############");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  ", 48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih!IHAAAAAAA                                 ...", "4001AAAAAA!IHAAAAAAA           ", "                                                                                  ########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ih                                           ..." + "'", str3, " ih                                           ...");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "1.0  0.0                                  ", "...");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0.00.0                                                                                       AAAAAAAHI!hi", 95);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("   4", (java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("AAAAAAAHI!AAAAAA1004         -1.0  0.0                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!AAAAAA1004         -1.0  0.0" + "'", str1, "AAAAAAAHI!AAAAAA1004         -1.0  0.0");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(".", "-1.00.", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0", "0.00.0", (int) 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                               i!                                               ", 6, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "  ", "0.1- #############################################0.0");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!aaaaaa1004", "4001AAAAAAA");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaahi!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", "1.0     0.1.0  0.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                          aaaaaaa1004", "AAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAi!iAAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAh", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaahi", "                                                  a                                                  ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAHI!", 916, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444440.1- .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444440.1- " + "'", str1, "444444444444440.1- ");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("           AAAAAAAHI!AAAAAA10041", "ih!IHAAAAAAA                                                                                       0.00.0", "444444444444440.1- .");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444141" + "'", str3, "444444444444444444444444444141");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", "4###4###4###4###4###4###4###4###4###4###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                 ", 94, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                              0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0  0.1-" + "'", str1, "0.0  0.1-");
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaahi!.-1.00.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-", "444444444444440.1- .044444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444444444444444444", "1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                   aaaaaaahi!", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("14001AAAAAA!IHAAAAAAA           ", "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0.0a a a0.1-", (java.lang.CharSequence) "                    ...!AAA...                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!", "-1.0   AAAAAAA10040.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa" + "'", str3, "!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaahi!aaaaaa1004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaahi!HI!", 17, "#############################################0.0     0.1-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####aaaaaaahi!HI!" + "'", str3, "####aaaaaaahi!HI!");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", "aaaaaaahi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("14001aaaaaaa", "hi!");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("                                ", "10041", (int) (byte) -1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("                                ", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("4001AAAAAA!IHAAAAAAA           ", (java.lang.Object[]) strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("1004", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                " + "'", str12, "                                ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1004" + "'", str13, "1004");
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!ihaaaaaaa                                                                                          ", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       " + "'", str2, "                                       ");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("###a#a#a####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###A#A#A####" + "'", str1, "###A#A#A####");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!ihaaaaaaa                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaa", "hi!ihaaaaaaa                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", (int) (byte) 10);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4                                                                                                ");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray9, strArray14);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   ", "10041");
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny("... ...", strArray21);
        java.lang.String[] strArray23 = null;
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.", strArray21, strArray23);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", strArray14, strArray23);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", strArray5, strArray14);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, '4');
        boolean boolean29 = org.apache.commons.lang3.StringUtils.startsWithAny("i                               ", strArray14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str15, "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040." + "'", str24, "#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041" + "'", str25, ".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI" + "'", str26, "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str28, "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAA", " 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("-1.0   AAAAAAA10040.", "######################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0   AAAAAAA10040." + "'", str2, "-1.0   AAAAAAA10040.");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10041", "hi!ih", (int) (byte) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaa");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10041" + "'", str5, "10041");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######", "!ihAAAAAAA       ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aAAAAA1001", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAA1001" + "'", str2, "aAAAAA1001");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041" + "'", str1, ".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("           aaaaaaahi!aaaaaa10041", "");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!" + "'", str5, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...!AAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!AAA..." + "'", str1, "...!AAA...");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                   ", "aaaaaaahi!.-1.00.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-", "HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI", 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                   " + "'", str4, "                                   ");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!ih       ", "0.00.0...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("-1.0     0aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaa", "a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "           AAAAAAAHI!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                        -1.0     0.0", 0, "IH!IHAAAAAAA 0.00.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0.0" + "'", str3, "                                        -1.0     0.0");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0  0.0aaa", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                ###################a-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 !#-1.0#####0.-1.0   AAAAAAA10040.                #######", 825, "444444444444444444444444444141");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                ###################a-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 !#-1.0#####0.-1.0   AAAAAAA10040.                #######" + "'", str3, "                ###################a-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 !#-1.0#####0.-1.0   AAAAAAA10040.                #######");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("4####                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        char[] charArray13 = new char[] { '#', '4', ' ', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1.0     0.0", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAhi!AAAAAA", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("... ...", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0.0", (java.lang.CharSequence) "AAAAAA1001                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041" + "'", str1, ".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#############AAAAAAAHI!#-1.0#####0.", "!ihaaaa...", 362);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                   100", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", "0.00.0                                                                                       aaaaaaahi!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!I!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!" + "'", str1, "AAAAAAAHI!I!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa" + "'", str2, "aaaaaa");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAAAAHI!I!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa", "aaaaaaahi!444444444444444444444444444444444444444444");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("4###4###4###4###4###4###4###4###4###4##", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaa");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4                                      AAAAAAAhi!AAAAAA100414", strArray5, strArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaa" + "'", str9, "aaaaaa");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4                                      AAAAAAAhi!AAAAAA100414" + "'", str10, "4                                      AAAAAAAhi!AAAAAA100414");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaahi!aaaaaa1004", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaa1004" + "'", str2, "aaaaaaahi!aaaaaa1004");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("14001AAAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih", "");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach(" 0.0  0.1-", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi!ih      ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " 0.0  0.1-" + "'", str7, " 0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str9, "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.aaaaaaahi!aaaaaa1                                        -1.0     0.                                        -1.0     0.41");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004", 90, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-" + "'", str2, ".1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("1.0  0.0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaihaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0  0.0" + "'", str2, "1.0  0.0");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                   aaaaaaahi!. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-" + "'", str1, "aaaaaaahi!. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-1.0                                                                                  0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-1.0  0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }
}

