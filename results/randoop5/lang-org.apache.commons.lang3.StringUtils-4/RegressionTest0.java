import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("-1.0  0.0", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0" + "'", str2, "-1.0  0.0");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "-1.0  0.0", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("-1.0  0.0", "", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0  0.0" + "'", str3, "-1.0  0.0");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!", (int) (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaahi!" + "'", str3, "aaaaaaahi!");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!" + "'", str1, "aaaaaaahi!");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaahi!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str2, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2, "hi!");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("-1.0  0.0", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), ' ', ' ', 0.0d };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(objArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(objArray4, ' ');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0,  ,  , 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0,  ,  , 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0  0.0" + "'", str5, "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0     0.0" + "'", str7, "-1.0     0.0");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.EMPTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (byte) 100, 1L };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray2, '4');
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("-1.0     0.0", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("-1.0  0.0", "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0" + "'", str2, "-1.0  0.0");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "aaaaaaahi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("10041", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                          aaaaaaahi!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str2, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("10041", "-1.0     0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("-1.0     0.0", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!" + "'", str1, "aaaaaaahi!");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("-1.0     0.0", "-1.0     0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0     0.0", "", 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0.0" + "'", str1, "-1.0     0.0");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "10041", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0.0" + "'", str1, "-1.0     0.0");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("-1.0     0.0", "-1.0     0.0", "-1.0     0.0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("-1.0     0.0", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0     0.0" + "'", str2, "-1.0     0.0");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", (int) (short) 1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                          aaaaaaahi!", 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1.0     0.0", "                                                                                          aaaaaaahi!", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("-1.0  0.0", "-1.0  0.0", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!" + "'", str1, "aaaaaaahi!");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("-1.0  0.0", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0" + "'", str2, "-1.0  0.0");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                          aaaaaaahi!", "-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!" + "'", str2, "aaaaaaahi!");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("-1.0     0.0", "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("-1.0     0.0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), ' ', ' ', 0.0d };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(objArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(objArray4, "                                                                                          aaaaaaahi!", 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0,  ,  , 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0,  ,  , 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0  0.0" + "'", str5, "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("-1.0     0.0", (int) '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0.0" + "'", str3, "                                        -1.0     0.0");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaahi!", "aaaaaaahi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("-1.0  0.0", "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!", "-1.0  0.0", (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("10041", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("-1.0  0.0", 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("10041", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!", "                                        -1.0     0.0", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihaaaaaaa" + "'", str1, "!ihaaaaaaa");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("-1.0     0.0", "                                        -1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("10041", "-1.0     0.0", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10041" + "'", str3, "10041");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                        -1.0     0.0", "10041", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0.0" + "'", str3, "                                        -1.0     0.0");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                          aaaaaaahi!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str2, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("10041", "!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10041" + "'", str2, "10041");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                          aaaaaaahi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str2, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                          aaaaaaahi!", "", "!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str3, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0     0.0", "", 100);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ihaaaaaaa", "hi!", (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!ihaaaaaaa" + "'", str4, "hi!ihaaaaaaa");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaahi!", "10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0.0" + "'", str1, "-1.0     0.0");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str1, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi!", "                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("10041", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10041" + "'", str2, "10041");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!", "hi!ihaaaaaaa", "!ihaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("-1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0" + "'", str1, "-1.0  0.0");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!ihaaaaaaa", "-1.0  0.0", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!" + "'", str1, "aaaaaaahi!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi!ihaaaaaaa", "aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                          aaaaaaahi!", (int) 'a', "                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str3, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int0 = org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                        -1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                          aaaaaaahi!", "HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                        -1.0     0.0", "10041", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0.0" + "'", str3, "                                        -1.0     0.0");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("-1.0  0.0", "10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                          aaaaaaahi!", "10041", "aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str3, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str1, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!", "10041", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                          aaaaaaahi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ihaaaaaaa", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ihaaaaaaa" + "'", str3, "!ihaaaaaaa");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaahi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa" + "'", str2, "aaaaaaa");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                          aaaaaaahi!", "hi!", "10041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str3, "                                                                                          aaaaaaa10041");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("!ihaaaaaaa", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                        -1.0     0.0", "aaaaaaahi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!ihaaaaaaa", (java.lang.CharSequence) "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                          aaaaaaa10041", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str2, "                                                                                          aaaaaaa10041");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("-1.0  0.0", "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                          aaaaaaahi!", "aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("10041", "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("10041");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "HI!", (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("-1.0  0.0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!ihaaaaaaa", "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ihaaaaaaa" + "'", str2, "hi!ihaaaaaaa");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                          aaaaaaa10041", "aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!" + "'", str1, "AAAAAAAHI!");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("-1.0     0.0", "HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0     0.0" + "'", str2, "-1.0     0.0");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("-1.0     0.0", "aaaaaaa", "HI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hi!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10041" + "'", str1, "10041");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AAAAAAAHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaa", "aaaaaaa", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!" + "'", str1, "AAAAAAAHI!");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaahi!", "-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!" + "'", str2, "aaaaaaahi!");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "aaaaaaahi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaahi!", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "10041", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!", "HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("-1.0  0.0", "hi!", "10041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0  0.0" + "'", str3, "-1.0  0.0");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("-1.0  0.0", 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0  0.0 " + "'", str3, "-1.0  0.0 ");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!", (int) (byte) 1, "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                        -1.0     0.0" + "'", str1, "                                        -1.0     0.0");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!ihaaaaaaa", (java.lang.CharSequence) "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaa", "!ihaaaaaaa", "aaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa" + "'", str3, "aaaaaaa");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               hi!                                               " + "'", str2, "                                               hi!                                               ");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str1, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                               hi!                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10041" + "'", str1, "10041");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!", "!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                          aaaaaaa10041", "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("-1.0     0.0", "aaaaaaa", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaa", "10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ihaaaaaaa" + "'", str1, "hi!ihaaaaaaa");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!ihaaaaaaa", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihaaaaaaa" + "'", str2, "!ihaaaaaaa");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("-1.0  0.0 ", "                                        -1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!" + "'", str1, "aaaaaaahi!");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!ihaaaaaaa", "hi!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                               hi!                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("10041", "!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!" + "'", str1, "aaaaaaahi!");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10041", (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAHI!", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("-1.0     0.0", "", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0     0.0" + "'", str3, "-1.0     0.0");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.Object[] objArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(objArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0 " + "'", str1, "-1.0  0.0 ");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaahi!", "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.00.0" + "'", str1, "-1.00.0");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!ihaaaaaaa", "", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "-1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!ihaaaaaaa", 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                        -1.0     0.0", "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!ihaaaaaaa", "!ihaaaaaaa", "hi!ihaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaa", "HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa" + "'", str2, "aaaaaaa");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "-1.00.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1.0  0.0 ", (int) (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0  0.0 " + "'", str3, "-1.0  0.0 ");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                               hi!                                               ", "aaaaaaahi!", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               hi!                                               " + "'", str3, "                                               hi!                                               ");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("-1.0     0.0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("HI!", "                                                                                          aaaaaaahi!", 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!" + "'", str3, "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("-1.0     0.0", (int) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0     0.0" + "'", str3, "-1.0     0.0");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                          aaaaaaahi!", "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str2, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                        -1.0     0.0", "hi!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        -1.0     0.0" + "'", str2, "                                        -1.0     0.0");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAHI!", (java.lang.CharSequence) "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               hi!                                               " + "'", str1, "                                               hi!                                               ");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), ' ', ' ', 0.0d };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(objArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(objArray4, 'a');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0,  ,  , 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0,  ,  , 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0  0.0" + "'", str5, "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a a a0.0" + "'", str7, "-1.0a a a0.0");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                          aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa10041" + "'", str1, "aaaaaaa10041");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("-1.0     0.0");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "-1.0     0.0");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!", "                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.Object[] objArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.concat(objArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                          aaaaaaahi!", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("-1.0  0.0 ", "aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!" + "'", str2, "aaaaaaahi!");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!ihaaaaaaa", "aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("-1.0  0.0", 102);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.lang3.StringUtils stringUtils0 = new org.apache.commons.lang3.StringUtils();
        java.lang.Class<?> wildcardClass1 = stringUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                          aaaaaaahi!", "aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("-1.0a a a0.0", "-1.0     0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "                                                                                          aaaaaaahi!", (int) ' ');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                               hi!                                               ", strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("-1.0a a a0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0a a a0.1-" + "'", str1, "0.0a a a0.1-");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0.0a a a0.1-", "-1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAAHI!", "10041", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAHI!" + "'", str3, "AAAAAAAHI!");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("-1.0a a a0.0", "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0a a a0.0" + "'", str2, "-1.0a a a0.0");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaa", "                                   ", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!ihaaaaaaa", "-1.0a a a0.0", "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ih       " + "'", str3, "hi!ih       ");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "                                        -1.0     0.0", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("-1.0  0.0 ", "-1.00.0", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 " + "'", str3, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAHI!", "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!", "-1.00.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0.0a a a0.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0a a a0.1-" + "'", str1, "0.0a a a0.1-");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaahi!", "10041", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!ihaaaaaaa", (java.lang.CharSequence) "!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!", 102, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ihaaaaaaa", "                                        -1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!ih       ", "aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("-1.0  0.0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0.0a a a0.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0a a a0.1-" + "'", str1, "0.0a a a0.1-");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 " + "'", str2, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!", 3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaa", (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ihaaaaaaa", "10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!" + "'", str1, "aaaaaaahi!");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaahi!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                        -1.0     0.0", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0.0" + "'", str3, "                                        -1.0     0.0");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("-1.00.0", 4, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.00.0" + "'", str3, "-1.00.0");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("10041", "                                                                                          aaaaaaahi!", "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10041" + "'", str3, "10041");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                        -1.0     0." + "'", str1, "                                        -1.0     0.");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaa10041", "!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa10041" + "'", str2, "aaaaaaa10041");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AAAAAAAHI!", "-1.0a a a0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAHI!" + "'", str2, "AAAAAAAHI!");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("-1.00.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.00.0" + "'", str1, "-1.00.0");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!ihaaaaaaa", "                                        -1.0     0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0" + "'", str1, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", (java.lang.CharSequence) "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.00.0", "HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, '4');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "aaaaaaahi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                        -1.0     0.", (int) (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0." + "'", str3, "                                        -1.0     0.");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("10041", "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10041" + "'", str2, "10041");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "-1.0     0.0", (java.lang.CharSequence) "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "-1.0     0.0" + "'", charSequence2, "-1.0     0.0");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                          aaaaaaa10041", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa10041" + "'", str2, "aaaaaaa10041");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!" + "'", str2, "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                        -1.0     0.0", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        -1.0     0.0" + "'", str2, "                                        -1.0     0.0");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("10041", "                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1004" + "'", str2, "1004");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0" + "'", str2, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AAAAAAAHI!", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAHI!" + "'", str2, "AAAAAAAHI!");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("-1.0  0.0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                        -1.0     0.0", (int) 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0.0#############################################" + "'", str3, "                                        -1.0     0.0#############################################");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaa10041", "aaaaaaa", (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1.0a a a0.0", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!", "-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.stripAll(strArray0);
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 " + "'", str2, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "1004", (java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "1004" + "'", charSequence2, "1004");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!", "hi!ih       ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                          aaaaaaahi!", "!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          " + "'", str2, "                                                                                          ");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                          aaaaaaahi!", "                                        -1.0     0.", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10041");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("-1.0     0.0", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("-1.0     0.0", "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0" + "'", str2, "0.0");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0.0a a a0.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0a a a0.1-" + "'", str1, "0.0a a a0.1-");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!", "aaaaaaahi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                          aaaaaaa10041", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 " + "'", str4, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0.0a a a0.1-", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "1004", (java.lang.CharSequence) "hi!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "1004" + "'", charSequence2, "1004");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ihaaaaaaa", "-1.0     0.0", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaa10041", "-1.00.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "-1.0a a a0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("10041", "-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("-1.0  0.0", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0" + "'", str2, "-1.0  0.0");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0.0", "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0" + "'", str2, "0.0");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0.0a a a0.1-", 90);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("1004", "                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1004" + "'", str2, "1004");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0  0.0 ", "aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", (int) (byte) 10, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!ihaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ihaaaaaaa" + "'", str2, "hi!ihaaaaaaa");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                          aaaaaaahi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!ih       ", "hi!ihaaaaaaa", "0.0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAAAAHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0.0" + "'", str1, "-1.0     0.0");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "-1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!ih       ", "                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ih       " + "'", str2, "hi!ih       ");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("1004", "!ihaaaaaaa", "-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1004" + "'", str3, "1004");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ihaaaaaaa", 90, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1004", "0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                        -1.0     0.0#############################################", (int) (short) 10, "hi!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0.0#############################################" + "'", str3, "                                        -1.0     0.0#############################################");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                               hi!                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               hi!                                               " + "'", str2, "                                               hi!                                               ");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0.0a a a0.1-", "aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0a a a0.1-" + "'", str2, "0.0a a a0.1-");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                        -1.0     0.", "aaaaaaahi!", "aaaaaaahi!", 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                        -1.0     0." + "'", str4, "                                        -1.0     0.");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0.0", 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 0.0                                                  " + "'", str2, "                                                 0.0                                                  ");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa10041" + "'", str1, "aaaaaaa10041");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("1004", "-1.00.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                          aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                          aaaaaaa1004" + "'", str1, "                                                                                          aaaaaaa1004");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("-1.0     0.0", "0.0a a a0.1-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0     0.0" + "'", str2, "-1.0     0.0");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                        -1.0     0.", 4, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0." + "'", str3, "                                        -1.0     0.");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("-1.0  0.0", "10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0" + "'", str2, "-1.0  0.0");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          aaaaaaa10041", 'a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { strArray2 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(objArray3, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[[                                                                                          , , , , , , , 10041]]");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                        -1.0     0.0#############################################", "-1.0  0.0 ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAAAAAHI!", "-1.0a a a0.0", "                                   ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("-1.0  0.0", "-1.0     0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0" + "'", str1, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("-1.0  0.0", "HI!", "hi!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0  0.0" + "'", str3, "-1.0  0.0");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                        -1.0     0.0#############################################", "4", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1004", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", "                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   4" + "'", str3, "   4");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                               hi!                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", "                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                        -1.0     0.0", "1004", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!ih       ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2, "hi!");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                          ", "AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          " + "'", str2, "                                                                                          ");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                          aaaaaaa1004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "-1.0     0.0", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                        -1.0     0.0#############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                        -1.0     0.0", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("-1.0  0.0 ", "   4", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAAAAAHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0.0a a a0.1-", "HI!", "AAAAAAAHI!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "!ihaaaaaaa", (java.lang.CharSequence) "4");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!ihaaaaaaa" + "'", charSequence2, "!ihaaaaaaa");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4", (int) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!ihaaaaaaa", "                                                                                          aaaaaaa10041", "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ih" + "'", str3, "hi!ih");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!ihaaaaaaa", (int) '4');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaa", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                          aaaaaaahi!", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("-1.0     0.0", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                          ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("10041", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", "-1.0  0.0", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                          aaaaaaahi!", "                                        -1.0     0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", "aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0" + "'", str2, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                               hi!                                               ", "hi!", 90);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ihaaaaaaa", (int) (byte) -1, "-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ihaaaaaaa" + "'", str3, "!ihaaaaaaa");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                 0.0                                                  ", 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    ..." + "'", str3, "...    ...");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "-1.0  0.0 ", (java.lang.CharSequence) "hi!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                          ", "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                        -1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaa", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("-1.0  0.0", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                        -1.0     0.0#############################################", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("1004", "aaaaaaa", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaahi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   ", "                                               hi!                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                          aaaaaaahi!", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str3, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                          aaaaaaahi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                          aaaaaaa1004", 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaa1004" + "'", str3, "                                                                                          aaaaaaa1004");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                   ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                          aaaaaaahi!", "", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          aaaaaaa10041", 'a');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                 0.0                                                  ", "                                        -1.0     0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-1.0  0.0 ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("-1.0  0.0", "...    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                 0.0                                                  ", (java.lang.CharSequence) "-1.0     0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                          aaaaaaa10041", "aaaaaaahi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           aaaaaaahi!aaaaaa10041" + "'", str3, "           aaaaaaahi!aaaaaa10041");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                        -1.0     0.0#############################################", (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!ih       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ih       " + "'", str1, "hi!ih       ");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", "AAAAAAAHI!", (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!" + "'", str4, "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!ih", 4, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaa", (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "", 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!ih       ", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0" + "'", str1, "-1.0  0.0");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa10041" + "'", str1, "aaaaaaa10041");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "1004", (java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!ihaaaaaaa", "AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihaaaaaaa" + "'", str2, "!ihaaaaaaa");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                          aaaaaaa10041", "                                               hi!                                               ", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ihaaaaaaa", "10041", "...    ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ihaaaaaaa" + "'", str3, "!ihaaaaaaa");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "-1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                        -1.0     0.", "                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!" + "'", str1, "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0.0a a a0.1-", (int) 'a', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0a a a0.1-" + "'", str3, "0.0a a a0.1-");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!", "           aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                               hi!                                               ", (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("-1.0a a a0.0", "-1.0a a a0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                          ", 0, "                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          " + "'", str3, "                                                                                          ");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1.00.0", "4", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "-1.0  0.0", (java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!ih", "                                               hi!                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", "                                   ", "   4");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                          aaaaaaa1004", "aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          aaaaaaa1004" + "'", str2, "                                                                                          aaaaaaa1004");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!ihaaaaaaa", "1004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ihaaaaaaa" + "'", str2, "hi!ihaaaaaaa");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaa", (int) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa" + "'", str3, "aaaaaaa");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                        -1.0     0.", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0     0." + "'", str2, "-1.0     0.");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                 0.0                                                  ", "h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!ihaaaaaaa", 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                 0.0                                                  ", 102, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 0.0                                                  " + "'", str3, "                                                 0.0                                                  ");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "                                               hi!                                               ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               hi!                                               " + "'", str1, "                                               hi!                                               ");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("-1.0     0.0", "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0" + "'", str1, "-1.0  0.0");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa10041" + "'", str1, "aaaaaaa10041");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                        -1.0     0.0#############################################", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0.0", "-1.0     0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                 0.0                                                  ", "   4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "...    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...    ..." + "'", str1, "...    ...");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1.00.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                   ", "4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          aaaaaaa10041", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "10041");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("                                               hi!                                               ", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 8 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", "                                                 0.0                                                  ", "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!" + "'", str3, "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI" + "'", str1, "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...    ...", (int) (short) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    ..." + "'", str3, "...    ...");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0.0", "0.0", 4, (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.00.0" + "'", str4, "0.00.0");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("           aaaaaaahi!aaaaaa10041", "                                                 0.0                                                  ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           aaaaaaahi!aaaaaa10041" + "'", str3, "           aaaaaaahi!aaaaaa10041");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                        -1.0     0.", (java.lang.CharSequence) "                                               hi!                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "-1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI" + "'", str1, "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("-1.0  0.0", "-1.0  0.0 ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0  0.0" + "'", str3, "-1.0  0.0");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        char[] charArray8 = new char[] { '#', '4', ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!ihaaaaaaa", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0     0.0", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                 0.0                                                  ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1.0a a a0.0", "hi!ihaaaaaaa", "                                        -1.0     0.0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("-1.0     0.", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0     0." + "'", str2, "-1.0     0.");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        char[] charArray7 = new char[] { '#', '4', ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!ihaaaaaaa", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 90 + "'", int10 == 90);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!", "0.00.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4", "   4", (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   4" + "'", str4, "   4");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0     0.", "                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", "-1.0a a a0.0", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                        -1.0     0.0#############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0.0", (int) '#', 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!ih", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!i" + "'", str2, "i!i");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!ihaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                 0.0                                                  ", "4", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.0     0.0", "                                                                                          aaaaaaa10041");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("           aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!aaaaaa10041" + "'", str1, "aaaaaaahi!aaaaaa10041");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i" + "'", str1, "i!i");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("10041", "aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("i!i", "-1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "10041", "aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0.0" + "'", str1, "-1.0     0.0");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!ih       ", (java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                        -1.0     0.0", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                 0.0                                                  ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################0.0##################################################" + "'", str3, "#################################################0.0##################################################");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("           aaaaaaahi!aaaaaa10041", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("1004", "...    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1004" + "'", str2, "1004");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4", "-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                        -1.0     0.", "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        -1.0     0." + "'", str2, "                                        -1.0     0.");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("   4", "-1.0  0.0", (int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0  0.0" + "'", str4, "-1.0  0.0");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                               hi!                                               ", (int) (byte) 100, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAAHI!", (java.lang.CharSequence) "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("h", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaahi!", "AAAAAAAHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                          aaaaaaa1004", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

