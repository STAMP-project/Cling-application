import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaa" + "'", str1, "aaaaaaaaa");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!AAAAAA10041", 52, "                                                  0.0  0.1-                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      hi!AAAAAA10041" + "'", str3, "                                      hi!AAAAAA10041");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("14001AAAAAA!IHAAAAAAA                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14001AAAAAA!IHAAAAAAA" + "'", str1, "14001AAAAAA!IHAAAAAAA");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAAAAA10041                        ", "001AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4                                                                                                ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4                                                                                                ");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray13, strArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach(".00.1-", strArray3, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str9, "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str19, "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaahi!. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", ".0#####0.1-#!IHAAAAAAA############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004" + "'", str1, "###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", "4###4###4###4###4###4###4###4###4###4###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI" + "'", str5, "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!IHAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("################################################################################## 0.0  0.1.0     0.1", "aa        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1.0     0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 825, "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0     0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str3, "-1.0     0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444444440.1- .044444444...", "#############################################0.0     0.1-                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444440.1- .044444444..." + "'", str2, "444444444444440.1- .044444444...");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                             AAAAAAA...                                             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              !ihaaaaaaa...              ", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("-1.0     0.");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0     0." + "'", str2, "-1.0     0.");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("a", "aaaaaaa100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                   100", "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ", "aaahi!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                   100" + "'", str3, "                                                                                                   100");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!ih  ...              ...", 0, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ih  ...              ..." + "'", str3, "hi!ih  ...              ...");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.0 -1.00.0-1.0 0.", "0. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "! ih" + "'", str1, "! ih");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                            aaaaaaahi!aaaaaa10041", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi!ih      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), ' ', ' ', 0.0d };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(objArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(objArray4, "IH!IHAAAAAAA 0.00.", 438, 100);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0,  ,  , 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0,  ,  , 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0  0.0" + "'", str5, "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   aaaaaaa100", "######################################################", 935);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0" + "'", str1, "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("-1.00.", "#############AAAAAAAHI!#-1.0#####0.");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!", "                                        -1.0     0.", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HAAAAAAA                                                                                       0.00.0", "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HAAAAAAA                                                                                       0.00.0" + "'", str2, "HAAAAAAA                                                                                       0.00.0");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                         1.0     0.                                          ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         1.0     0.                                          " + "'", str2, "                                         1.0     0.                                          ");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1.0                                                                                  0.0", "                                                 -1.0  0.0                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 ahi4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("14001aaaaaa!ihaaaaaaa                                                                            ", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14001aaaaaa!ihaaaaaaa                                                                            " + "'", str2, "14001aaaaaa!ihaaaaaaa                                                                            ");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                    ...!AAA...                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    ...!aaa...                     " + "'", str1, "                    ...!aaa...                     ");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                               hi!                                               ", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", (int) (byte) 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                               hi!                                               " + "'", str5, "                                               hi!                                               ");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ihaaaaaaa                                                                                          ", "Aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("a", "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                        -1.0     0.0", (java.lang.CharSequence) "                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ihaaaaaaa                                                                                         ", "-1.0     0.0");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!ihaaaaaaa" + "'", str6, "!ihaaaaaaa");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!ihaaaa...", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               !ihaaaa..." + "'", str2, "                                                                                               !ihaaaa...");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!ihaaaaaaa... ...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... ...a!ih" + "'", str2, "... ...a!ih");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                 ", "AAAAAAAhi!AAAAAA", 101);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1h-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.", 7, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0.00.0...", 83, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444440.00.0..." + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444440.00.0...");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4AAAAAAAhi!AAAAAA100414", "iH", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.", "......", "-1.00.0#############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0." + "'", str3, "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.");
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                 -1.0  0.0                                                  ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 -1.0  0.0                                                  " + "'", str2, "                                                 -1.0  0.0                                                  ");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!" + "'", str1, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-11-  -1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-11- -1-" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-11- -1-");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("           aaaaaaahi!aaaaaa10041", "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray15 = new char[] { '#', '4', ' ', '4' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                        -1.0     0.", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                          ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...    ...", charArray15);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!ih                                                                                               ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                       ", "                                                                                    !ihaaaaaaa###########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       " + "'", str2, "                                       ");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               hi!                                               " + "'", str1, "                                               hi!                                               ");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("10041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a', (int) (byte) 1, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10041" + "'", str2, "10041");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10041" + "'", str5, "10041");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10041" + "'", str8, "10041");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI", "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", "1.0     0.1.0  0.0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI" + "'", str3, "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1.0     0.", "14001AAAAAA!IHAAAAAAA           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "################################################################################## 0.0  0.1.0     0.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1.0  0.0 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "           AAAAAAAHI!AAAAAA10041                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(".0  0.", "##########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0.0a a a0.1-", "-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0..." + "'", str2, "1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0...");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0     0.0", "", 100);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("!ih!IHAAAAAAA                                 ...", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0!ih!IHAAAAAAA                                 ...0.0" + "'", str7, "-1.0!ih!IHAAAAAAA                                 ...0.0");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                  AAAAAAAHI!AAAAAA10041", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 916);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004" + "'", str2, "!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaa");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaa1004", "                                              ", "hi4444444444444444444444444444440.0440.1-!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                       " + "'", str2, "HI!                                                                                       ");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                        -1.0     0.0");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("   aaaaaaa100", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                           aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                              ", "a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 ahi4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                              " + "'", str2, "                                           aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                              ");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i                               ", "                              0.0  0.1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444", "-1.0 0.0", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a" + "'", str1, "-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("14001aaaaaa!ihaaaaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14001aaaaaa!ihaaaaaaa" + "'", str2, "14001aaaaaa!ihaaaaaaa");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#############", "IH!IHAAAAAAA 0.00.", 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#############IH!IHAAAAAAA 0.00." + "'", str4, "#############IH!IHAAAAAAA 0.00.");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                          aaaaaaa10041", "                                               hi!                                               ", (int) (byte) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str4, "                                                                                          aaaaaaa10041");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41", "####aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41" + "'", str2, "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("10041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "-1.0     0aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaa", 5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10041" + "'", str2, "10041");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10041" + "'", str5, "10041");
        org.junit.Assert.assertNotNull(strArray6);
    }
}

