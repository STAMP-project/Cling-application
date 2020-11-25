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
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1h-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.", 7, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0.00.0...", 83, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444440.00.0..." + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444440.00.0...");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4AAAAAAAhi!AAAAAA100414", "iH", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.", "......", "-1.00.0#############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0." + "'", str3, "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                 -1.0  0.0                                                  ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 -1.0  0.0                                                  " + "'", str2, "                                                 -1.0  0.0                                                  ");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!" + "'", str1, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-11-  -1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-11- -1-" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-11- -1-");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("           aaaaaaahi!aaaaaa10041", "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                       ", "                                                                                    !ihaaaaaaa###########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       " + "'", str2, "                                       ");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               hi!                                               " + "'", str1, "                                               hi!                                               ");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
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
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", "1.0     0.1.0  0.0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI" + "'", str3, "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1.0     0.", "14001AAAAAA!IHAAAAAAA           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "################################################################################## 0.0  0.1.0     0.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1.0  0.0 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "           AAAAAAAHI!AAAAAA10041                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(".0  0.", "##########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0.0a a a0.1-", "-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0..." + "'", str2, "1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0...");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0     0.0", "", 100);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("!ih!IHAAAAAAA                                 ...", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0!ih!IHAAAAAAA                                 ...0.0" + "'", str7, "-1.0!ih!IHAAAAAAA                                 ...0.0");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                  AAAAAAAHI!AAAAAA10041", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 916);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004" + "'", str2, "!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaa");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaa1004", "                                              ", "hi4444444444444444444444444444440.0440.1-!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                       " + "'", str2, "HI!                                                                                       ");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                           aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                              ", "a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 ahi4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                              " + "'", str2, "                                           aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                              ");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i                               ", "                              0.0  0.1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444", "-1.0 0.0", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a" + "'", str1, "-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("14001aaaaaa!ihaaaaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14001aaaaaa!ihaaaaaaa" + "'", str2, "14001aaaaaa!ihaaaaaaa");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#############", "IH!IHAAAAAAA 0.00.", 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#############IH!IHAAAAAAA 0.00." + "'", str4, "#############IH!IHAAAAAAA 0.00.");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                          aaaaaaa10041", "                                               hi!                                               ", (int) (byte) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str4, "                                                                                          aaaaaaa10041");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41", "####aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41" + "'", str2, "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
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

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......" + "'", str1, "......");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                  ########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                  ########" + "'", str1, "                                                                                  ########");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1004", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "                                                                                                    ");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", strArray3, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        ", (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-" + "'", str10, "0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1004" + "'", str11, "1004");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444444444444444444444444444444444444444444444444444h", "...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444h" + "'", str2, "444444444444444444444444444444444444444444444444444h");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#############IH!IHAAAAAAA 0.00.", "-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############IH!IHAAAAAAA 0.00." + "'", str2, "#############IH!IHAAAAAAA 0.00.");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!ihaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', 900, 102);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA", "AAA", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaa                              0.0  0.1-HI!hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa                              0.0  0.1-HI!hi!" + "'", str2, "aaaaaaa                              0.0  0.1-HI!hi!");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                              ####4                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                              ####4                 " + "'", str1, "                                                                              ####4                 ");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("###########################################################################################################################################################################                                               i!                                               ###########################################################################################################################################################################", "########################################-", "                                               0.00.0", 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###########################################################################################################################################################################                                               i!                                               ###########################################################################################################################################################################" + "'", str4, "###########################################################################################################################################################################                                               i!                                               ###########################################################################################################################################################################");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(".HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI.." + "'", str1, ".HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI..");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4                                                                                                ", "###A#A#A####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                                                                                                " + "'", str2, "4                                                                                                ");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a!a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.aaaaaaahi!aaaaaa1                                        -1.0     0.                                        -1.0     0.41");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-", ".HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#############################################0.0     0.1-                                        ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#############################################0.0     0.1-                                        ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0  0.0                               ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("444444444444440.1- .044444444...", "####aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444440.1- .044444444..." + "'", str2, "444444444444440.1- .044444444...");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("       AAAAAAA1004a4###       AAAAAAA1004a", "i!aaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" ", " ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1.0  0.", 42, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("IH!IHAAAAAAA 0.00.0", 103, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "1.0   aaaaaaa10040.");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaahi!aaaaaa10041                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaa", "                                        -1.0     0.0", (int) (short) 10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                          AAAAAAA1004", strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", strArray2, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "4###", 6, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10041" + "'", str3, "10041");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10041" + "'", str6, "10041");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str13, "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                               hi!                                               ", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               hi!                                               " + "'", str2, "                                               hi!                                               ");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("14001aaaaaa!ihaaaaaaA", "", "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aaaaaaahi!", "aaaaaaahi!", (int) (short) 10);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("4001AAAAAA!IHAAAAAAA           ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444440. -1.044444444444444444444444", "                   !ihaaaaaaa                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4001aaaaaa!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAHI!AAAAAA1004         -1.0  0.0", "aaaaaaahi!aaaaaa10041                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAHI!AAAAAA1004         -1.0  0.0" + "'", str2, "AAAAAAAHI!AAAAAA1004         -1.0  0.0");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        char[] charArray13 = new char[] { '#', '4', ' ', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1.0     0.0", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAA1001                        ", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!aaaaaaa                                                                                          ihaaaaaaa", "##########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("iH", "AAAAAAA1004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iH" + "'", str2, "iH");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("14001AAAAAA!IHAAAAAAA                                                                            ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0", "-1.0   AAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HI!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("14001aaaaaa!ih", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!##########################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                          aaaaaaahi!", 630);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "   aaaaaaa1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   aaaaaaa1004" + "'", str1, "   aaaaaaa1004");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAA1004", "-1.0 0.0", 88);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 42, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ihaaaaaaa                                                   ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("        ...", 937);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        ..." + "'", str2, "        ...");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                           aaaaaaahi!HI!                                            ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0     0.", "           aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                          -1.0  0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 937);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444" + "'", str1, "4444444444444444444");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("4", strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10041" + "'", str3, "10041");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10041" + "'", str7, "10041");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10041" + "'", str9, "10041");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##########################################################################################", 0, "AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################" + "'", str3, "##########################################################################################");
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1004", "AA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1004" + "'", str2, "1004");
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IHAAAAAAA" + "'", str1, "IHAAAAAAA");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444440.00.0...", "########################################-1.0#####0.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              #############################################0.0     0.1-                                        ", "#############IH!IHAAAAAAA 0.00.", 778);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.00.0", "                                               hi!                                               ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAAAAAAHI!AAAAAA1004         -1.0  0.0                                                  ", 935);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAHI!AAAAAA1004         -1.0  0.0                                                  " + "'", str2, "AAAAAAAHI!AAAAAA1004         -1.0  0.0                                                  ");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str1, "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ihaaaaaaa", ".0#####0.1-#!IHAAAAAAA############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) ".HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI..", (java.lang.CharSequence) "#                                                                                          aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 443 + "'", int2 == 443);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) ".HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004", 223, "AAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAi!iAAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004" + "'", str3, "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                          -1.0  0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("001aaaaaa!ihaaaaaaa41");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "001AAAAAA!IHAAAAAAA41" + "'", str1, "001AAAAAA!IHAAAAAAA41");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4###4###4###4###4###4###4###4###4###4###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                    ", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.", "hi!ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aahi!ihaaaaaaaaa", "44444441004");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aAAAAA1001");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAA1001" + "'", str1, "aAAAAA1001");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 0.0                                                  ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 88);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "           aaaaaaahi!aaaaaa10041", "                                                 -1.0  0.0                                                   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                             " + "'", str1, "...                             ");
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1004", 83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                         -1.0  0.0                                                  ", "!ihAAAAAAA       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444440.00.0...", "AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(".", 10, "aahi!ihaaaaaaaaa                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi.aahi!" + "'", str3, "aahi.aahi!");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa11--");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 AHI4", "1.0     0.1.0  0.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1###########AAAAAAA1004###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1############", "-...", 935);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA..." + "'", str1, "aAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 39, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################" + "'", str3, "#######################################");
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          AAAAAAA1004", "4###4###4###4###4###4###4###4###4###4##", (int) (byte) -1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("-1.0  0.0", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("100", "HI!                                                                                          aaaa", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "444444444444440.1- .04444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi4", "aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  ", 92);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi4" + "'", str5, "hi4");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi4444444444444444444444444444440.0440.1-!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("001aaaaaa!ihaaaaaaa41", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!##########################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaah", "4444444444444444444                                                                                      ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa                                                                                          ", "-1.0     0.0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#                                                                                          aaaaaaahi!", "aaaaaaa1004", 937);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######" + "'", str1, "###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                       a                                                                                                    a                                                                                                    a                                 0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0                                                  a                                                                                                    a                                                                                                    a                                 ", "0.0 -1.0", 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       a0.0 -1.0      a                                 " + "'", str3, "                                       a0.0 -1.0      a                                 ");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                    ", "                                         1.0     0.                                          ", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("A0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 AHI4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 AHI4" + "'", str1, "A0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0A 0.0 A0.0-1.0 A -1.0AA0.0 A -1.0A 0.0 AHI4");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("001AAAAAA!IHAAAAAAA41", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   001AAAAAA!IHAAAAAAA41                                   " + "'", str2, "                                   001AAAAAA!IHAAAAAAA41                                   ");
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                   !ihaaaaaaa                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihaaaaaaa" + "'", str1, "!ihaaaaaaa");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                               hi!                                               ", "#############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                  a                                                                                                    a                                                                                                    a                                 0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0                                                  a                                                                                                    a                                                                                                    a                                 ", "-");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  a                                                                                                    a                                                                                                    a                                 0.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.0                                                  a                                                                                                    a                                                                                                    a                                 " + "'", str3, "                                                  a                                                                                                    a                                                                                                    a                                 0.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.0                                                  a                                                                                                    a                                                                                                    a                                 ");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41", (java.lang.CharSequence) "#############");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41" + "'", charSequence2, "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("########################################-", "1.0     0.1.0  0.0 ##################################################################################", "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################-" + "'", str3, "########################################-");
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("#############################################0.0     0.1-                                        ", "                                                  a                                                  ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAAAAAAI!IAAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAA...");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("hi!ihaaaaaaa", strArray9, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concatWith("0.0a a a0.1-", (java.lang.Object[]) strArray14);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                     10041", strArray14);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", strArray2, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "                                                                                          aaaaaaa1004", 2, 624);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!ihaaaaaaa" + "'", str16, "hi!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str17, "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str18, "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI" + "'", str20, "                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "           AAAAAAAHI!AAAAAA10041", 900);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("        ...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("0.00.0                                    ", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                          ", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '#', (int) (short) 1, 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4001AAAAAAA", (int) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4001AAAAAAA" + "'", str3, "4001AAAAAAA");
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                   aaaaaaahi!. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", "AAAAAA1001                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        char[] charArray2 = new char[] {};
        boolean boolean3 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("     4####      ", "                                             AAAAAAA...                                             ", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!        4###4###4###4###4###4###4###4###4###4###                                                                                 aaaa", " 0.0  0.1-", (int) 'a');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("4001aaaaaa!ih", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aahi!ihaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI", "IH!IHAAAAAAA 0.00.0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                        -1.0     0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAA!ihAAAAAAA", "######################################################", 51);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaahi!444444444444444444444444444444444444444444", 624);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!444444444444444444444444444444444444444444" + "'", str2, "aaaaaaahi!444444444444444444444444444444444444444444");
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("########", "4001aaaaaa!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!ih                                                                        ####4               ", 42, "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ih                                                                        ####4               " + "'", str3, "hi!ih                                                                        ####4               ");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.", 0, "iH          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1." + "'", str3, "0. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                      hi!AAAAAA10041", "!ihAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("################################################################################## 0.0  0.1.0     0.1", "                                                                  AAAAAAAHI!AAAAAA10041       ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("4####                                                             ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             " + "'", str2, "4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             ");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#######################################", 106);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################                                                                   " + "'", str2, "#######################################                                                                   ");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                               AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                               AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI" + "'", str4, "                                                                               AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                        -1.0     0.0");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "44444444444444444444444444444444");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("i                               ", 105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("14001AAAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih", 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "14001AAAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih" + "'", str3, "14001AAAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1.0     0.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hI!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!ihaaaa...", "                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "AAAAAAAHI!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", '#');
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("######################################################", strArray4, strArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("44444444444444444444444444444444                                          ", strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10041" + "'", str5, "10041");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "######################################################" + "'", str12, "######################################################");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                          aaaaaaa10041", "                                               hi!                                               ", (int) (byte) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi!ih       ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4', 42, (int) (byte) 10);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str5, "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aaaaaaa10041" + "'", str11, "aaaaaaa10041");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                   !ihaaaaaaa                                                                       ", "-1.00.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004", "      ", "AAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!#-1.0#####0.-1.0   AAAAAAA1000.AAAAAA    #######AAAAAA    ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.AAAAAA    #######AAAAAA    ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.AAAAAA    #######aaaaaaa1004" + "'", str3, "!#-1.0#####0.-1.0   AAAAAAA1000.AAAAAA    #######AAAAAA    ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.AAAAAA    #######AAAAAA    ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.AAAAAA    #######aaaaaaa1004");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                              0.0  0.1-                                                        ", ".HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI..." + "'", str2, ".HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI....HI...");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI", 362, "aaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0HI" + "'", str3, "aaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0  0HI");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4001AAAAAA!IHAAAAAAA           ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4001AAAAAA!IHAAAAAAA           " + "'", str2, "4001AAAAAA!IHAAAAAAA           ");
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                  a                                                                                                    a                                                                                                    a                                 0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0                                                  a                                                                                                    a                                                                                                    a                                 ", "-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) (byte) 1, 935);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...                             ", 51, "hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi44444444444444444...                             " + "'", str3, "hi44444444444444444...                             ");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!i", "aaaaaaahi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AAAAAAA...");
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!i" + "'", str4, "i!i");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA", "HI!                                                                                          ", 83);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HIAAAAAAAhi!AAAAAA10041" + "'", str4, "HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HIAAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aahi.aahi!", (int) '#', 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "IH!IHAAAAAAA 0.00.", "aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        " + "'", str2, "aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        ");
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                               hi!                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004", "AAAAAAAHI!AAAAAA1004         -1.0  0.0", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh", "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!", "...                             ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...    ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 930);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaa1004", "AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa1004" + "'", str2, "aaaaaaa1004");
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!ahi!i!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!####", "444444444444444444444444444141", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("       AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aahi!ihaaaaaaaaa                                                                      ", "                                                        AAAAAAAHI!AAAAAA10041 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaa", "1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI", "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih!IHAAAAAAA                                                                                       0.00.0", "aaaaaaahi!aaaaaa10041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, " 0.0  0.1-");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.", "                                           aaaaaaahi!HI!                                            ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("A", "aaaaaah");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4001aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa1004" + "'", str1, "aaaaaaa1004");
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.0     0.0", "                                                                                          aaaaaaa10041");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "4001AAAAAAA");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.00.0", "                                               hi!                                               ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "");
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Aaaaaaahi!aaaaaa10041", strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.00.0", "aaaaaaahi!");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "AAAAAA10041");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                   ", strArray12, strArray18);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1", strArray4, strArray12);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '#', (int) 'a', 11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "1.0     0.1.0  0.0 ##################################################################################", 4, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                   " + "'", str21, "                                   ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1" + "'", str22, "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        -1.0     0.0" + "'", str1, "        -1.0     0.0");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa                              0.0  0.1-HI!hi!", "####", 102);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.00.0", "                                               hi!                                               ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "aAAAAA1001", 101, 42);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  ", "!ihAAAAAAA       ", 630);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...              ...", (java.lang.CharSequence) "AAAAAAAHI!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "1.0     0.1.0  0.0 ", (java.lang.CharSequence) "444444444444444444444440.1-.04444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "1.0     0.1.0  0.0 " + "'", charSequence2, "1.0     0.1.0  0.0 ");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!IH       ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("100", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("10041", "4444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                               i!                                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi" + "'", str4, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                    ...!AAA...                     ", 778, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA", "444444444444440.1- .", " 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!AAAAAA1001", "                              0.0  0.1-                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.", "AAAAAAAHI!", 39);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", "aaaaaaahi!HI!", "44444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        char[] charArray15 = new char[] { '#', '4', ' ', '4' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1.0     0.0", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#################################################0.0##################################################", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ih       ", charArray15);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1.0  0.0", charArray15);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa1004", charArray15);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                                                                                                               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("44444..........4444444444444444440.0440.1-", "AAAAAAAhi!AAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("001AAAAAAA", "                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001AAAAAAA" + "'", str2, "001AAAAAAA");
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4###", "#############################################0.0     0.1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          ..." + "'", str2, "                                                          ...");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              #############################################0.0     0.1-                                        ", (int) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              #############################################0.0     0.1-                                        " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              #############################################0.0     0.1-                                        ");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                     4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "ihaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                          aaaaaaahi!", " 0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str2, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                            AAAAAAAHI!AAAAAA10041", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aAAAAA1001", (java.lang.CharSequence) "   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aAAAAA1001" + "'", charSequence2, "aAAAAA1001");
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("########################################-1.0#####0.", "!ihaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################-1.0#####0." + "'", str2, "########################################-1.0#####0.");
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                   aaaaaaahi!. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", 911);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   aaaaaaahi!. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-" + "'", str2, "                                                   aaaaaaahi!. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !ihAAAAAAA       ", "-1.0     0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !ihAAAAAAA       " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !ihAAAAAAA       ");
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" 001AAAAAAA", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         001AAAAAAA" + "'", str2, "                                         001AAAAAAA");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("-1.0     0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0." + "'", str1, "-1.0     0.");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                                                                                                                                                                                               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                ", "... ...", 100, 362);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    ... ...     Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                " + "'", str4, "                                                                                                    ... ...     Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("444444444444444444444444444444444444444444444444444444444444444444444444440.00.0...", "-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("1.0     0.", "4####                              ", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                            aaaaaaahi!aaaaaa10041", "hi!IHAAAAAAA", 825);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.00.0", "                                               hi!                                               ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "");
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Aaaaaaahi!aaaaaa10041", strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.00.0", "aaaaaaahi!");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "AAAAAA10041");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                   ", strArray6, strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!ihaaaaaaa", "!ihaaaaaaa");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray18);
        java.lang.Class<?> wildcardClass22 = strArray18.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                   " + "'", str15, "                                   ");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi4" + "'", str20, "hi4");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("A", ".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI", "                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI" + "'", str2, "AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI");
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa11--", "aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        -1.0     0aa        ", "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa11--" + "'", str3, "aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa11--");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004" + "'", str1, "aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Aaaaaaahi!aaaaaa10041", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14Aaaaaaahi!aaaaaa100" + "'", str2, "14Aaaaaaahi!aaaaaa100");
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                  AAAAAAAHI!AAAAAA10041", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "#############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                          ...", "14001AAAAAA!IHAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAHI!AAAAAA1004         -1.0  0.0                                                  ", "-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAHI!AAAAAA1004                                                           " + "'", str2, "AAAAAAAHI!AAAAAA1004                                                           ");
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("####", "444444AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######hi                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######!                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", 74, "AAAAAAAHI!I!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######hi                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######!                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######" + "'", str3, "###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######hi                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######!                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######");
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "                  ", "hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hiAhi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hiAhi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4" + "'", str1, "hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hiAhi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4444444444444444444444444444440.0440.1-!hi4");
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("!ih!IHAAAHI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!IHAAAHI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI" + "'", str1, "!ih!IHAAAHI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI");
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...    ...                                          ", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    ...                                          " + "'", str3, "...    ...                                          ");
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAA1004", "                              0.0  0.1-", "iH          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI" + "'", str2, "AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                                                                                                                                                                                                                                                                               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                ", "HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0. -1.0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("0.00.0                                                                                       aaaaaaahi!HI", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00.00.0                                                                                       aaaaaaahi!HI.0.00.0                                                                                       aaaaaaahi!HI 0.00.0                                                                                       aaaaaaahi!HI-0.00.0                                                                                       aaaaaaahi!HI10.00.0                                                                                       aaaaaaahi!HI.0.00.0                                                                                       aaaaaaahi!HI0" + "'", str3, "00.00.0                                                                                       aaaaaaahi!HI.0.00.0                                                                                       aaaaaaahi!HI 0.00.0                                                                                       aaaaaaahi!HI-0.00.0                                                                                       aaaaaaahi!HI10.00.0                                                                                       aaaaaaahi!HI.0.00.0                                                                                       aaaaaaahi!HI0");
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ihhi!14001aaaaaa!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "aaaaaaaaaaaaaaaaa.HI...aaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("4                                                                                                ", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaahi!", strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a', 88, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", "#############aaaaaaahi!#-1.0#####0.");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0", "                                                             ####4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             ####4" + "'", str2, "                                                             ####4");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1.0   aaaaaaa10040.", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI", 438);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1.0  0.0 ", "aaaaaaaaaa", 109);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "                                                                                          aaaaaaahi!", (int) ' ');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                               hi!                                               ", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "...    ...", (int) (short) 1, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAhi!AAAAAA", 54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("#############aaaaaaahi!#-1.0#####0.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        char[] charArray10 = new char[] { '#', '4', ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!ihaaaaaaa", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0     0.0", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                            AAAAAAAHI!AAAAAA10041", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444440.1- ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14 + "'", int16 == 14);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("-1.0   aaaaaaa10040.", "                             ...", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!" + "'", str2, "                                                                                    aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!");
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                                                                          -1.0  0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "                                               i!                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          -1.0  0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          -1.0  0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", "aaaaaaa10041", 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041" + "'", str4, ".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4####                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4####" + "'", str1, "4####");
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "14001AAAAAA!IHAAAAAAA                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                 0.0                                                  ", "AA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444440.1- .04444444444444444444444", 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-", "                ###################A-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 !#-1.0#####0.-1.0   AAAAAAA10040.                #######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!aaaaaaa                                                                                          ihaaaaaaa", "Hi!ih", "444444AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4aaaaaaa                                                                                          44aaaaaaa" + "'", str3, "4aaaaaaa                                                                                          44aaaaaaa");
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100" + "'", str3, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100");
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4###4###4###4###4###4###4###4###4###4###", "iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("IH!IHAAAAAAA                                                                                       0.00.0", " ih                                           ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aaaaaaahi!", "10041", 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!ihaaaaaaa", strArray5, strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "0.0", (int) (short) 100, (int) (short) -1);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!i", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!ihaaaaaaa" + "'", str12, "hi!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4!ihaaaaaaa                            ...", "hI!                                                                                          ", 630);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaa    1-", "AAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("-1.0     0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0" + "'", str1, "-1.0     0");
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("       AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       AAAA" + "'", str2, "       AAAA");
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0.0 -1.0", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0     0.0", "", 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a0.0" + "'", str5, "-1.0a0.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa1-0aaaaaaa11--", " 001AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!" + "'", str1, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", (int) (short) -1, "########################################-1.0#####0.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str3, "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0     0.0", "", 100);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("100", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.01000.0" + "'", str7, "-1.01000.0");
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HIAAAAAAAhi!AAAAAA10041", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1.00.0#############################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                            ...    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("001aaaaaa!ihaaaaaaa", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "001aaaaaa!ihaaaaaaa" + "'", str3, "001aaaaaa!ihaaaaaaa");
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        char[] charArray12 = new char[] { '#', '4', ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ihaaaa...", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("########################################-", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("14001aaaaaa!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14001aaaaaa!ihaaaaaaa" + "'", str1, "14001aaaaaa!ihaaaaaaa");
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "-1.0  0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.00.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "           AAAAAAAHI!AAAAAA10041                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AAAA10041", "-1.0     0.", "14001aaaaaaaaaaaaaaaaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 103);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAA10041" + "'", str4, "AAAA10041");
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                          ", 109);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ih!IHAAAAAAA                                                                                       0.00.0", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!IHAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.00.0" + "'", str3, "ih!IHAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.00.0");
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444!IHAAAAAAA4444444444444444440.0440.1-", (java.lang.CharSequence) "001aaaaaa!ihaaaaaaa41");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######hi                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######!                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###a#a#a####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("      ...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      ..." + "'", str2, "      ...");
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4AAAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("14001AAAAAA!IHAAAAAAA                                                                  ", "-1.0!ih!IHAAAAAAA                                 ...0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "1.0  0.0 ", 443);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str3, "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("-1.0  0.0aaa", "################################################################################## 0.0  0.1.0     0.1################################################################################## 0.0  0.1.0     0.1###########AAAAAAA1004################################################################################## 0.0  0.1.0     0.1################################################################################## 0.0  0.1.0     0.1############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                          aaaaaaa10041", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str3, "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str5, "                                                                                          aaaaaaa10041");
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("444444444444440.1-.", 911);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444440.1-." + "'", str2, "444444444444440.1-.");
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!", 825);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("           AAAAAAAHI!AAAAAA10041                                                          ", (int) 'a', "                                        -1.0     0.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              AAAAAAAHI!AAAAAA10041                                                              " + "'", str3, "              AAAAAAAHI!AAAAAA10041                                                              ");
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("-...", "aaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-..." + "'", str2, "-...");
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "                                                                                          aaaaaaahi!", (int) ' ');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                                               hi!                                               ", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("hi!aaaaaa1004", (java.lang.Object[]) strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10041" + "'", str7, "10041");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!ih                                                                        ####4               ", "!ihaaaaaaa... ...", 778);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                 ", "               1004                ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA1000.                #######" + "'", str2, "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA1000.                #######");
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("      ...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("    ", 101, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                     " + "'", str3, "                                                                                                     ");
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                ###################A-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 !#-1.0#####0.-1.0   AAAAAAA10040.                #######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "   aaaaaaa100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   aaaaaaa100" + "'", str1, "   aaaaaaa100");
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             " + "'", str2, "4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             ");
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!i", "aaaaaaahi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AAAAAAA...");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 17, 9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!i" + "'", str4, "i!i");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        char[] charArray9 = new char[] {};
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0  0.0 ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                  a                                                  ", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("           aaaaaaahi!aaaaaa10041", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        char[] charArray14 = new char[] { '#', '4', ' ', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1.0     0.0", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAhi!AAAAAA", charArray14);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                            AAAAAAAHI!AAAAAA10041", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                          aaaaaaaaaa", "#############################################0.0     0.1-", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("-1.0                                                                                  0.0", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("A   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "A   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                               hi!                                               ", "444444444444444444444440.1-.04444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               hi!                                               " + "'", str3, "                                               hi!                                               ");
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!ih      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ih      " + "'", str1, "hi!ih      ");
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa" + "'", str1, "a!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa");
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004" + "'", str2, "   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004");
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", "#                                                                                          aaaaaaahi!", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaa                              0.0  0.1-HI!hi!", "hI!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa                              0.0  0.1-HI!hi" + "'", str2, "aaaaaaa                              0.0  0.1-HI!hi");
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!" + "'", str1, "Aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("           AAAAAAAHI!AAAAAA10041", "###A#A#A####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           AAAAAAAHI!AAAAAA10041" + "'", str2, "           AAAAAAAHI!AAAAAA10041");
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                           aaaaaaahi!HI!                                            ", "                                                             ####4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!HI!" + "'", str2, "aaaaaaahi!HI!");
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", 102, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "-1.0  0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi4444444444444444444444444444440.0440.1-!", "aahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "4###4###4###4###4###4###4###4###4###4###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                    ...!aaa...                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ihaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1###########AAAAAAA1004###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1############", 900);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1###########AAAAAAA1004###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1############                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1###########AAAAAAA1004###################################################################################0.0##0.1.0#####0.1###################################################################################0.0##0.1.0#####0.1############                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################", "AA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("i!aaaaaa10041", "aahi.aahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!aaaaaa10041" + "'", str2, "i!aaaaaa10041");
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("A   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaa-1.0  0.aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                           aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                              ", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                              " + "'", str3, "                                           aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                                                                                       aaaaaaa                              ");
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0.0a a a0.1-", "14001AAAAAA!IHAAAAAAA                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ih!IHAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.00.0", "                                                                                                     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41" + "'", str2, "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41");
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0   aaaaaaa10040.", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAHI!AAAAAA1004         -1.0  0.0                                                  ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaahi!.-1.00.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaahi!.-1.00.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-" + "'", str1, "Aaaaaaahi!.-1.00.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-");
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaahi!.-1.00.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!.-1.00.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-" + "'", str1, "aaaaaaahi!.-1.00.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-0.00.1-");
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!i" + "'", str1, "hi!i");
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("IH!IHAAAAAAA 0.00.0", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                  ", "AAAAAA1001");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                            aaaaaaahi!aaaaaa10041", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("       AAAAAAA1004a4###       AAAAAAA1004a", "-1.0a a a0.0", 438);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             ", "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             " + "'", str2, "4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             4####                                                             ");
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!ih", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("-1.00.0#############################################", "444444444444444444444444444141");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00.0#############################################" + "'", str2, "-1.00.0#############################################");
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("iH", "                                AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                    !ihaaaaaaa###########");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!ahi!i!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1004", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("0.00.0                                                                                       aaaaaaahi!HI!", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 88, 362);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 88");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                                                                                                                                                                                                                                          -1.0  0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "##########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          -1.0  0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          -1.0  0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("########################################-1.0#####0.", "###########################################################################################################################################################################                                               i!                                               ###########################################################################################################################################################################", "-1.0   AAAAAAA10040.", 21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "########################################-1.0#####0." + "'", str4, "########################################-1.0#####0.");
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!IHAAAHI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI! AAAAAAAHI!HI", "", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "-1.00.0#############################################", "       AAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                     ", "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAHI!AAAAAA1004", 52, "###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######aaaaaaa1004");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################AAAAAAAHI!AAAAAA1004################" + "'", str3, "################AAAAAAAHI!AAAAAA1004################");
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!IH" + "'", str1, "HI!IH");
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                        -1.0     0.", "AAAAAAA...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("i!aaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("14001AAAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih", "");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach(" 0.0  0.1-", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi!ih      ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 105, 105);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaahi!aaaaaa10041", 105, 49);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " 0.0  0.1-" + "'", str7, " 0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str9, "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("   aaaaaaa1004", "   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa1004" + "'", str2, "aaaaaaa1004");
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("a!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa" + "'", str2, "a!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa");
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", "4001AAAAAAA#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("14.0     0.1-                                        .0     0.1-                                        1aaaaaa!ihaaaaaaa.0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-", "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  00.00.00  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 910, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                     -1.0  0.0 ", (java.lang.CharSequence) "                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("14001aaaaaaa", "hi!");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("                                ", "10041", (int) (byte) -1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("                                ", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("4001AAAAAA!IHAAAAAAA           ", (java.lang.Object[]) strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("1004", strArray3, strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                " + "'", str12, "                                ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1004" + "'", str13, "1004");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "14001aaaaaaa" + "'", str14, "14001aaaaaaa");
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "               hi               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                           aaaaaaahi!HI!                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!HI!" + "'", str1, "aaaaaaahi!HI!");
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("1.0  0.0 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaahi!aaaaaa10041", "                                                                                                   100", 32);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAA1001", 49, "0.00.0                                                                                       aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAA10010.00.0                                 " + "'", str3, "AAAAAA10010.00.0                                 ");
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa", "                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.aaaaaaahi!aaaaaa1                                        -1.0     0.                                        -1.0     0.41", 916);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "               !IHAAAAAAA               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               !IHAAAAAAA               " + "'", str1, "               !IHAAAAAAA               ");
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("001AAAAAAA", "       AAAA", 7, 911);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "001AAAA       AAAA" + "'", str4, "001AAAA       AAAA");
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0   aaaaaaa10040.", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "        ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0." + "'", str2, "-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.0a-1.00.0-1.0aa0.");
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444", "AAAAAAAHI!AAAAAA1004         -1.0  0.0                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("IHAAAAAAA", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "14.0     0.1-                                        .0     0.1-                                        1aaaaaa!ihaaaaaaa.0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-                                        .0     0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "AAAAAA!ihAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "   aaaaaaa100", (java.lang.CharSequence) "!iha!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4###4###4###4###4###4###4###4###4###4###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4###4###4###4###4###4###4###4###4###4###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4###4###4###4###4###4###4###4###4###4###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004", "-1.0  0.0aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!-1.0   aaaaaaa10040.hi4444444444444444444444444444440.0440.1-!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("################################################################################## 0.0  0.1.0     0.1################################################################################## 0.0  0.1.0     0.1###########AAAAAAA1004################################################################################## 0.0  0.1.0     0.1################################################################################## 0.0  0.1.0     0.1############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################################################################## 0.0  0.1.0     0.1################################################################################## 0.0  0.1.0     0.1###########AAAAAAA1004################################################################################## 0.0  0.1.0     0.1################################################################################## 0.0  0.1.0     0.1############" + "'", str1, "################################################################################## 0.0  0.1.0     0.1################################################################################## 0.0  0.1.0     0.1###########AAAAAAA1004################################################################################## 0.0  0.1.0     0.1################################################################################## 0.0  0.1.0     0.1############");
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!ahi!i!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!####", "AAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!ahi!i!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!####" + "'", str2, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!ahi!i!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!####");
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   AAAAAAA100", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                       AAAAAAA100" + "'", str2, "                                                                                       AAAAAAA100");
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                            !ihaaaaaaa", "-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                            !ihaaaaaaa" + "'", str2, "                                                                            !ihaaaaaaa");
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!IH       ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...!AAA...", (java.lang.CharSequence) "0. -1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                       aaaaaaahi!HI!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                                 -1.0  0.0                                                   ", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0.00.0", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                       AAAAAAAHI!HI!", (java.lang.CharSequence) "a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0aa0.0 a -1.0a 0.0 ahi4");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                       AAAAAAAHI!HI!" + "'", charSequence2, "                                                                                       AAAAAAAHI!HI!");
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          -1.0  0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                            !ihaaaaaaa", "-1.0  0.0aaaaaaa10041-1.0  0.0aaaaaaa10041-1.0  0.0aaaaaaa10041-1.0  0.0aaaaaaa10041-1.0  0.0", "14001aaaaaa!ihaaaaaaa", 443);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                            !ihaaaaaaa" + "'", str4, "                                                                            !ihaaaaaaa");
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                          aaaaaaa10041", "aaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                  a                                                                                                    a                                                                                                    a                                 0.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.0                                                  a                                                                                                    a                                                                                                    a                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                  a                                                                                                    a                                                                                                    a                                 0.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.0                                                  a                                                                                                    a                                                                                                    a                                 " + "'", str1, "                                                  a                                                                                                    a                                                                                                    a                                 0.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.01.00.0                                                  a                                                                                                    a                                                                                                    a                                 ");
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IHAAAAAAA", "aaaa", 7);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("-1.00.0", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        char[] charArray9 = new char[] { '#', '4', ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!ihaaaaaaa", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0     0.0", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                            !ihaaaaaaa", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(charSequence0, (java.lang.CharSequence) "                                                                                                   100");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                   100" + "'", charSequence2, "                                                                                                   100");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                   001AAAAAA!IHAAAAAAA41                                   ", "-1.0!ih!IHAAAAAAA                                 ...0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!IHAAAAAAA", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!IHA" + "'", str2, "hi!IHA");
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!IHAAAAAAA", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "10041", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HI!                                                                                          hi!HIAAAAAAAhi!AAAAAA10041", 49, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("1.0     0.1.0  0.0 ##################################################################################", "A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaahi", "                                                  a                                                  ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("444444444444440.1- .04444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444440.1- .04444444444444444444444" + "'", str1, "444444444444440.1- .04444444444444444444444");
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "0.0  0.1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("-1.0  0.0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa######");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444440.1- .", 109, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...", "                                                   aaaaaaahi!", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ihaaaaaaa                                                                                         ", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih#######                                                                                         " + "'", str3, "!ih#######                                                                                         ");
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        char[] charArray10 = new char[] { '#', '4', ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!ihaaaaaaa", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0     0.0", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0.00.0", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "... ...", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAA10041", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1.0  0.0", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.0440.0" + "'", str3, "1.0440.0");
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaah", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaa                              0.0  0.1-HI!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 438);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaihaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0.00.0                                    ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" ", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!ih!IHAAAHI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IHAAAHI!hi!" + "'", str1, "IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IH!IHAAAAAAA                                                                                          !IHAAAHI!hi!");
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                     10041                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0  0.0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!", 90);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith(".00.1-", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0  0.0" + "'", str5, "-1.0  0.0");
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!ihAAAAAAA       ", "4444444444444444444                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444                                                                                      " + "'", str2, "4444444444444444444                                                                                      ");
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4", ' ');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004", 4, "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004" + "'", str3, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004");
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA1000.                #######", 16, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                  ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  " + "'", str2, "                                                                                  ");
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 0, "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  00.00.00  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }
}

