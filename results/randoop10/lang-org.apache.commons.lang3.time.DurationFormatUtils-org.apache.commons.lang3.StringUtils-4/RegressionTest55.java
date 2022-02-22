import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest55 {

    public static boolean debug = false;

    @Test
    public void test27501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27502");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000IAA!IH !IH                                                                                                !IH                                                                             HI!                                                                                                HI! HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP0Y0M0DT0H0M0.045S!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                                                                                 ", "p00-1Y11-130DT2374359-159.999359998900000000000000000000000000000023I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27503");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 83);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.083S" + "'", str1, "P0Y0M0DT0H0M0.083S");
    }

    @Test
    public void test27504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27504");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "P0Y0M0DT0H0M0.281S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27505");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("P00-");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0 daysHI!HI!HI!HI!HI!HI..HI", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       i!P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.099");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       i!P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.099" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       i!P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.099");
    }

    @Test
    public void test27507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27509");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0I!p0-100030t00000.099-123I!p0-100030t00000.099-1p0-100030t00000.099-1p0-100030t00000.099-123I!p0-100030t00000.099-P00-1Y11M30DT23H59", "A:AA:AAA1A1", 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27510");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("h", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aahi!" + "'", str7, "aahi!");
    }

    @Test
    public void test27511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27511");
        char[] charArray10 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HS0HS000HSHS0HS000HSH##hi##", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test27512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27512");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "0i!");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray18);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray18);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                             aahi!", strArray18);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray18);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, 'a');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhh" + "'", str19, "hhh");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhh" + "'", str24, "hhh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hahaaaha" + "'", str26, "hahaaaha");
    }

    @Test
    public void test27513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27513");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S 444444444444", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27514");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27515");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  s0 s0 s0 HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("P0Y0M0DT0H0M0.474S", "P0Y0M0DT0H0M0.127S");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27517");
        char[] charArray13 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "I  I  I  I  I  I", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!                                                                             ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test27518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27518");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I..I..I..I..I..I", 224);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27519");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", 92, "P0Y0M0DT0H0M0.151S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test27521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27521");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27522");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                    i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27523");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 5, (long) 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.029S" + "'", str2, "P0Y0M0DT0H0M0.029S");
    }

    @Test
    public void test27524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!i44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i" + "'", str2, "!i");
    }

    @Test
    public void test27525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27525");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, " HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27526");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S0S00S0S00S0S00S0S00Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27527");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("P0Y0M0DT0H0M0.244S", "P0Y000DT00000.1261", "HHHH...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.244S" + "'", str3, "P0Y0M0DT0H0M0.244S");
    }

    @Test
    public void test27528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27528");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " HI! HI! HI! HI! HI! HI! HI! HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27529");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                            I:II:IIII32                                           ", "H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27530");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                    i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     ", "P0Y0M0DT0H0M0.151S", "  ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("############I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", "0M0H0TD0M0Y0PS594.0M0H0TD0M0Y0Ps389.95m95h32td03m11y1-p", "0...3h59059.8720 ...3h59059.8720second");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str3, "############I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test27532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27532");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!4HI!444HI!4");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27533");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("###########p0y0m0dt0h0m0.000s############                                          ###########p0y0m0dt0h0m0.000s############                  0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-1", "0:00:00.106");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27534");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ", 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27535");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "################P-1Y11-130DT2374359-159.9913599910#####################", " P0Y0M0DT0H0M0.395S               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test27536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("P0Y0M0DT0H0M0.101S", "!i       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test27537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27537");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...!iH!iH!iH!iH!iH!iH!iH!iH!i-1Y11M30DT23H59M59.853S-1Y11M30DT23H59M59.853S-1Y11M30DT23H59M59.853S-1Y11M30DT23H59M59.853S-1Y11M30DT23H59M59.853S-1Y11M30DT23H59M59.853S-1Y11M30DT23H59M59.853S-1Y11M30DT23H59M59.853S-1Y11M30DT23H59M59.853S-1Y11M30DT23H59M59.853S-1Y11M30DT23H59M59.85");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  HI!59M59.999", 84, 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27539");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'dHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27540");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 918);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.918S" + "'", str1, "P0Y0M0DT0H0M0.918S");
    }

    @Test
    public void test27541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27541");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'SocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces", "AAAAAAAAAASYAD 0AAAAHHHAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD 0AAAAHHHAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27542");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" SECON", 299, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                      SECON" + "'", str3, "                                                                                                                                                                                                                                                                                                      SECON");
    }

    @Test
    public void test27544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27544");
        char[] charArray14 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ###############################################################################################", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y0M0DT0H0M0.290S", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test27545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0:00:00.0974444444444444444444444444444444444444444444444AAHI!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.090:00:00.1060:00:00.0974444444444444444444444444444444444444444444444AAHI!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.09");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.0974444444444444444444444444444444444444444444444AAHI!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.090:00:00.1060:00:00.0974444444444444444444444444444444444444444444444AAHI!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.09" + "'", str1, "0:00:00.0974444444444444444444444444444444444444444444444AAHI!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.090:00:00.1060:00:00.0974444444444444444444444444444444444444444444444AAHI!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.09");
    }

    @Test
    public void test27546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27546");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test27547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27547");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                         p0y0m0dt0h0m0.126s                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27548");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ai!aaaaaaaaaaaaaaaa2ahi!aaai!", "'P'yyyy''''d''1'                                       hIYhIYhPPPh1Y");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27549");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("   hI!hI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!hI!HI!" + "'", str1, "hI!hI!HI!");
    }

    @Test
    public void test27550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H.!i0Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "P-1Y11M30DT23H59M59.295S", "0:00:00.961");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test27551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27551");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0...3h59059.8720 ...3h59059.8720seconds0:00:00.0930...3h59059.8720 ...3h59059.8720seconds", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                               0:00:00.004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27553");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("          ", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0:00:00.071");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                 0:00:00.495                                 ", "SDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCES", "                                                                                                                                444S4S4M4m4H4H4TD4d4...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 0:00:00.495                                 " + "'", str3, "                                 0:00:00.495                                 ");
    }

    @Test
    public void test27556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27556");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "            Hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27557");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("P-1Y11M30DT23H59M59.990", "##################################################################################00000000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M3DT23H59M59.99" + "'", str3, "P-1Y11M3DT23H59M59.99");
    }

    @Test
    public void test27558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27558");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27559");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDNOCE3367656161- 0                                                                                             ", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27560");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 212, (long) 846, "        P0Y0M0DT0H0M0.0:00:00.038        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        P0Y000DT00000.0:00:00.038        " + "'", str3, "        P0Y000DT00000.0:00:00.038        ");
    }

    @Test
    public void test27561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27561");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "P0Y000DT00000.041474");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27562");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#!#HI#!#HI#!" + "'", str3, "HI#!#HI#!#HI#!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test27563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27563");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!ih...h!Ih!Ih                                       'H'TD'd'M'M'Y'yyyy'P'                                                                                                                      ", "P-1Y11M30DT23H59M59.932S", "!ih !ih                   H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !P0Y0M0DT0H0M0.030Sh AAAAAAAAAAAAAAAAAAAAAAAAA!ih !ih                   ", 918);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih...h!Ih!Ih                                       'H'TD'd'M'M'Y'yyyy'P'                                                                                                                      " + "'", str4, "!ih...h!Ih!Ih                                       'H'TD'd'M'M'Y'yyyy'P'                                                                                                                      ");
    }

    @Test
    public void test27564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaP0Y0M0DT0H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAp0y0m0dt0h..." + "'", str1, "AAAAAAAAAAp0y0m0dt0h...");
    }

    @Test
    public void test27565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27565");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27566");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 931, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.166S" + "'", str2, "P-1Y11M30DT23H59M59.166S");
    }

    @Test
    public void test27567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   hi!  hip00-1Y11M30DT23H59M59.964S44                        ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!  hip00-1Y11M30DT23H59M59.964S44                        " + "'", str2, "   hi!  hip00-1Y11M30DT23H59M59.964S44                        ");
    }

    @Test
    public void test27568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27568");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("---------------------------P-1Y11M30DT23p59M59.853S", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27569");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s" + "'", str1, "p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s");
    }

    @Test
    public void test27571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.01010", 0, "0s 0s 0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.01010" + "'", str3, "0I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.01010");
    }

    @Test
    public void test27572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("s808.95m95h32td03m11y1-p", 918);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                               s808.95m95h32td03m11y1-p                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                               s808.95m95h32td03m11y1-p                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test27573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                     0 seconds                      ", 193, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     0 seconds                                                                                                                                                                   " + "'", str3, "                     0 seconds                                                                                                                                                                   ");
    }

    @Test
    public void test27574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27574");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("sdnoces", "43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27575");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI", "P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y0000S0S0444444444444444444444444444444P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000", 152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27576");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0:00:00.010", "                                                  'p'YYYY'y'm'm'D'dt'h'", 45);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27577");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                            44 days                                                             ", "                                                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAA", 126, 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27579");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("P0Y0M0DT0H0M0.097S");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("P0Y0M", strArray2, strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135", "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S", 34);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("i:ii:iih i ", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 15 vs 34");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M" + "'", str5, "P0Y0M");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test27580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27580");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0:00:00.277", "0:00:00.015");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27581");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0I!p000000t00000.099-10I!p000000t00000.099-1p000000t00000.099-1p000000t00000.09", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "daysI!I!I!I!I!I!I!I!I!I!I!I!I...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27583");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "HI!  HI!  HI!  HI!  HI!  HI..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "P0Y0M0DT0H0M0.017S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27585");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h", "0 SECONDS");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("0i!", (java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("0:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.00", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
    }

    @Test
    public void test27586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                            p0y0m0dt0h0m0.100s", "hi!  hi!  hi!  hi!  hi!  hi..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                            p0y0m0dt0h0m0.100s" + "'", str2, "                                                                            p0y0m0dt0h0m0.100s");
    }

    @Test
    public void test27587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27587");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!h...hi!a!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!hahi!                                                                                       h", "I..I..I..I..I..I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                              0i!0i!0i!0i!0i!0i!0i!0i!0i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!0i!" + "'", str1, "0i!0i!0i!0i!0i!0i!0i!0i!0i!");
    }

    @Test
    public void test27589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27589");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaa SECONaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaa", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############", 19, 306);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############                                                          HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############                                                          HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaa");
    }

    @Test
    public void test27590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27590");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "-1Y11-130DT2374359-159.999359998900000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27591");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("p0y0m0dt0h0m0.000s", (java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test27592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27592");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "sdnocesH!IH!IH!IH!IH!IH!IH!IH!IH...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SdnocesH!IH!IH!IH!IH!IH!IH!IH!IH..." + "'", str1, "SdnocesH!IH!IH!IH!IH!IH!IH!IH!IH...");
    }

    @Test
    public void test27593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27593");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y0-10DT07430-10.0013599969", "", 188);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaHI" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaHI");
    }

    @Test
    public void test27595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27595");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                   ########################################", "                                                              P0Y0M0DT0H0M0.098S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0:00:00.027", "hi!'p'YYYY'");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27598");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("P-1Y11M30DT23H59M59.912S", "                                          0DAY-1616567371                                            I:II:IIII32                                            0DAY                                            I:II:IIII32                                            0DAY                                            I:II:IIII32                                          0DAY-1616567371                                            I:II:IIII32                                            0DAY                                            I:II:IIII32                                            0I!P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27599");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444", "!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...", 336);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444" + "'", str3, "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27600");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h", "0 SECONDS");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("0i!", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaa", "h");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "743I!  P-1Y11-130DT2374359-159.9033599964...000000000000000000000000000000743I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!h", (java.lang.Object[]) strArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'", strArray4, strArray9);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 397, 68);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aaaaaaaaaa" + "'", str14, "aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'" + "'", str15, "44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test27601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27601");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Hhhaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("I!0I!0I!0I!0I!0I!0I!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y", "###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!0I!0I!0I!0I!0I!0I!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y" + "'", str2, "I!0I!0I!0I!0I!0I!0I!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y");
    }

    @Test
    public void test27603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27603");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.492", "P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAA", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27604");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.101S");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test27605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...#######################################", 611);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...#######################################" + "'", str2, "hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...#######################################");
    }

    @Test
    public void test27606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27606");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444Y0M0DT0H04444444444", "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27607");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0                                           23IIII:II:I                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0                                           23IIII:II:I                                           " + "'", str1, "!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0                                           23IIII:II:I                                           ");
    }

    @Test
    public void test27608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27608");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", 93, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27609");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaa0i0aaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27610");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 417);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.417" + "'", str1, "0:00:00.417");
    }

    @Test
    public void test27611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27611");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!Hi!hi!Hi!Hi!Hi!hi!Hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test27612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "743I!I!I! ", (java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("M0DT0H0M0.034S", "HI", "18 000018 0018 018 000018 0018 018 000018 0018 018 000018 0018 018 000018 0018 018 000018 0018...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M0DT0H0M0.034S" + "'", str3, "M0DT0H0M0.034S");
    }

    @Test
    public void test27614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27614");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("0 daysaahi!", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27615");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAHI!P0000Y0M0DT0H0M0.99S", "aaaaaaaaaaaaaaaaaaaaaaaaaa##", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "                                                                                                                                44459711441145942344TD43041144Y400-14P4                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27617");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!P0Y0M0DT0H0M0.002Shi!P0Yi" + "'", str1, "Hi!P0Y0M0DT0H0M0.002Shi!P0Yi");
    }

    @Test
    public void test27618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27618");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.099S", ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "hhh", 8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a', 33, 8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", strArray5, strArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!", strArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '#', 18, 3);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.startsWithAny("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  " + "'", str14, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test27619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("010 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "                                                                                         aaaaaaaaaaaaaaaaaaa", 969);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "010 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "010 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test27620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27620");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0                                               DAYS                                               ", (java.lang.CharSequence) "                                         P0Y0M0DT0H0M0.126S                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 414 + "'", int2 == 414);
    }

    @Test
    public void test27621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1hi!::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1hi!::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1hi!::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1hi!::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1" + "'", str1, "hi!::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1hi!::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1hi!::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1");
    }

    @Test
    public void test27622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27622");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0:00:00.0974444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         ", "743I!I!I!0:00:00.086 0i!0i!0i!0i!0i!0i!0i!0i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "3599424540.0-107430td0-10y0paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27624");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("P-1Y11M30DT23H59M59.166S", "PaYa-1aDTa743a-1a.a3 3599959aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aYaMaDTaHaMa", "iHhiHhiHhiHhp-1Y11M30DT23H59M59.924S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                           ...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Hi!Hi!hi!Hi!Hi!Hi!hi!Hi!", "hi!4hi!444hi!40i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                           ..." + "'", str3, "                           ...");
    }

    @Test
    public void test27627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.0320:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "S540.0M0H0TD0M0Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.0320:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.0320:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27628");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0:00:00.0170:00:00.0170:00P0Y0000DT0a00a9915", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27629");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "i!0000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27630");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                P0Y0M0DT0H0M0.100S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "0i0", "D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D -1Y11M30DT23H59M59.964S44                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                P0Y0M0DT0H0M0.100S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str3, "                P0Y0M0DT0H0M0.100S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test27631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27631");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0H0M0.011S", 134, "P-1Y11M30DT23H59M59.912S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.912SP-1Y11M30DT23H59M59.912SP-1Y11M30DP0Y0M0DT0H0M0.011SP-1Y11M30DT23H59M59.912SP-1Y11M30DT23H59M59.912SP-1Y11M30D" + "'", str3, "P-1Y11M30DT23H59M59.912SP-1Y11M30DT23H59M59.912SP-1Y11M30DP0Y0M0DT0H0M0.011SP-1Y11M30DT23H59M59.912SP-1Y11M30DT23H59M59.912SP-1Y11M30D");
    }

    @Test
    public void test27632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27632");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0:00:00.900");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27633");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("P-1Y11M30DT23H59M59.924S", 106, "       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ...       ...       ...       ...       ...       ...       ...       ...  P-1Y11M30DT23H59M59.924S" + "'", str3, "       ...       ...       ...       ...       ...       ...       ...       ...  P-1Y11M30DT23H59M59.924S");
    }

    @Test
    public void test27634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27634");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44's's.S'm'M'h'h'td'D'm'm'y'YYYY'p'", "P-1Y11M30DT23", 14);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27635");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.200S", "T H H", 84);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#####T 00                                                                                                                                                                                            ", "   00i!i!hi!   00i!i!hi!   00i!i!hi!  AAAAAAAAAAAAAAAAAAAAA...   00i!i!hi!   00i!i!hi!   00 00I!  I.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0:00:00.900");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.900" + "'", str1, "0:00:00.900");
    }

    @Test
    public void test27638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27639");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!h", "######################################hp0y000dt00000.01010#######################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.509S", 53, "sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnoces");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.509SsdnocessdnocesHI!sdnocessdnocesHI!s" + "'", str3, "P0Y0M0DT0H0M0.509SsdnocessdnocesHI!sdnocessdnocesHI!s");
    }

    @Test
    public void test27641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27641");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y000000000" + "'", str1, "3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y000000000");
    }

    @Test
    public void test27642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 186, "hi!        hi!                        hi!        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test27643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("   hi!  hip00-1Y11M30DT23H59M59.964S44                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   hi!  hip00-1y11m30dt23h59m59.964s44                        " + "'", str1, "   hi!  hip00-1y11m30dt23h59m59.964s44                        ");
    }

    @Test
    public void test27644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "P0Y000DT00000.47316");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27645");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!hi!hi!hi!h!i  i!hi!hi!hi!h", "P0Y0M0D...                        ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 108, 288);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 108");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!hi!hi!hi!h!iHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str4, "i!hi!hi!hi!h!iHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test27646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27646");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 484);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!" + "'", str1, "  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!");
    }

    @Test
    public void test27648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27648");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("#########0M0.001S");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27649");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAHI!P0000Y0-10DT07430-10.99359999144444444", "                                                                                                                                                                                                        P0Y0M0DT0H0M0.100S         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27650");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 903, "000000000000I!  I!  I!  I!  I!  I..I!I!...I I!I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000000000I!  I!  I!  I!  I!  I..I!I!...I I!I!" + "'", str2, "000000000000I!  I!  I!  I!  I!  I..I!I!...I I!I!");
    }

    @Test
    public void test27651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP", (int) (short) 10, "I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP" + "'", str3, "aahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP");
    }

    @Test
    public void test27652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27652");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:0", "P0Y000DT00000.03796", 277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27653");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hi!4hi!444hi!4", " !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!  hi!  h", " 'P'yyyy''M'M'd''H'H'm'M's0'0", "!IH !IH !IH !IH !IH !IH !IH !IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!!hi!!!h" + "'", str3, "hi!!!hi!!!h");
    }

    @Test
    public void test27655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                P-1Y11M30DT23H59M59.679S                                                                                                                                ", (java.lang.CharSequence) "0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320 HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!  HI!  HI!  HI!  HI!  HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27657");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.032");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                       Hi!Hi!hi!", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "aahi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0                                           23IIII:II:I                                           ", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0                                           23IIII:II:I                                           " + "'", str13, "!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0                                           23IIII:II:I                                           ");
    }

    @Test
    public void test27658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115", "0:00:00.079");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27659");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "pP0Y0M0DT0H0M0.191S0P0Y0M0DT0H0M0.191SYP0Y0M0DT0H0M0.191S0P0Y0M0DT0H0M0.191SM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27660");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("I! HI! HI! HI! HI! HI! HI! HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I! HI! HI! HI! HI! HI! HI! HI" + "'", str1, "I! HI! HI! HI! HI! HI! HI! HI");
    }

    @Test
    public void test27661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27661");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 306);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27662");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("P0Y0M0DT0H0M0.970S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27663");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("P0Y0M0DT0H0M0.093S", "0:00:00.001                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27664");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 97, "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   " + "'", str2, "                                                                                                   ");
    }

    @Test
    public void test27665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27665");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "P0Y000DT00000.07111", (java.lang.CharSequence) "i!P0Y0M0DT0H0M0.099Shi!P0...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27666");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("000000000000I!  I!  I!  I!  I!  I..I!I!...I I!I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27667");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H.!i0Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H..");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444a44444444444444444444444444444444444444444444440000I4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444I4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444I4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444I4444444444444444444444444444444444444444444444a444444444444444444444444444444444444444608401.00000TD000Y0P", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("230.00:00:0                                                                               ", "H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !P0Y0M0DT0H0M0.030Sh AAAAAAAAAAAAAAAAAAAAAAAAA", "###t 00###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "230.00:00:0                                                                               " + "'", str3, "230.00:00:0                                                                               ");
    }

    @Test
    public void test27669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.0450");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP000000T0H000.0450" + "'", str1, "000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP000000T0H000.0450");
    }

    @Test
    public void test27670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27670");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444444444444444444444444444444444444444441-990.00000TD000Y0P!ih1-990.1-990.00000TD000Y0P!ih1-990.1-990.00000TD000Y0P!ih1-990.aa4444444444444444444444444444444444444444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P", (java.lang.CharSequence) "        P0Y0M0DT0H0M0.100S         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 598 + "'", int2 == 598);
    }

    @Test
    public void test27671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("#####T 00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####T 00" + "'", str1, "#####T 00");
    }

    @Test
    public void test27672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27672");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaa0:00:00.018", 45, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa0:00:00.018AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "aaaa0:00:00.018AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27673");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "P0Y0M0DT0H0M0.030Sh AAAAA...", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27674");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00052 0052...", "P0Y0M0DT0H0M0.110S                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27675");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI", 204, "p0Y0M0DT0H0M0.024");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI" + "'", str3, "HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI");
    }

    @Test
    public void test27676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("   HI!  HI!  HI!  HI!  HI!  HI...", 80, 372);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27677");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                               P0Y0M0DT0H0M0.271S                                                                                               hi! hi!", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                               P0Y0M0DT0H0M0.271S                                                                                               hi! hi!" + "'", charSequence2, "                                                                               P0Y0M0DT0H0M0.271S                                                                                               hi! hi!");
    }

    @Test
    public void test27678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27678");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "0S0S0444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("2890 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!Hi!Hi!Hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!Hi!Hi!Hi!Hi!H", 12, 435);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!Hi!Hi!Hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!Hi!Hi!Hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test27680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27680");
        char[] charArray5 = new char[] { '4' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                              HI!", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#####################P0Y000DT00000.020134", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
    }

    @Test
    public void test27681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27681");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                              1                                                              ", (int) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                              1                                                              " + "'", str3, "                                                              1                                                              ");
    }

    @Test
    public void test27682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...  ########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...  ########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..." + "'", str2, "...  ########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...");
    }

    @Test
    public void test27683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27683");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.045S", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27684");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 139, "######!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######!000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!#######" + "'", str2, "######!000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!#######");
    }

    @Test
    public void test27685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27685");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("iHhi0:00:00.191####", 417, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444p0y0m0dt0h0m0.003sp0y0m0dt0h0m0.003sp0y0m00444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0DAYS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27687");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("H         h         h         h         h         h         h         h         h         h         h AAHI!'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H         h         h         h         h         h         h         h         h         h         h AAHI!'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s'" + "'", str1, "H         h         h         h         h         h         h         h         h         h         h AAHI!'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s'");
    }

    @Test
    public void test27688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27688");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                                                               hi! ", "                                                                                              hi!", 8);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Y0M0DT0H0", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("00i!i!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test27689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0:00:00.484", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.484" + "'", str2, "0:00:00.484");
    }

    @Test
    public void test27690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27690");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.000S", " #0 days 0 hours 0 minutes 0 seconds ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "S001.0M0H0TD0M0Y0P                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...######################################################################################################################################################################################", "                                                                               0:00:00.032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...######################################################################################################################################################################################" + "'", str2, "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...######################################################################################################################################################################################");
    }

    @Test
    public void test27693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27693");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray4, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "D 0", 115, 4);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "P0Y0M0DT0H0M0.009S");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                              P00-1     ##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M", "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("P-1Y11M30DT23H59M59.937S  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI", strArray4, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str8, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test27694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27694");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "P-1Y11M30DT23H59M59.711S                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.711S                                                           " + "'", str1, "P-1Y11M30DT23H59M59.711S                                                           ");
    }

    @Test
    public void test27695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27695");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 552, "hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#4440#i#!#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#4440#i#!#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444" + "'", str3, "hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#4440#i#!#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444");
    }

    @Test
    public void test27696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0:00:00.277", "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.277" + "'", str2, "0:00:00.277");
    }

    @Test
    public void test27697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27697");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444p0y000dt00000.099104444", "                                                                            p0Y000DT00000.065100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                               44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                                                              44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               hi!", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          hi!" + "'", str2, "                          hi!");
    }

    @Test
    public void test27699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27700");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!P0Y000DT00000.099495hi!P0Y000DT000", 476, "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hhi!P0Y000DT00000.099495hi!P0Y000DT000'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hhi!P0Y000DT00000.099495hi!P0Y000DT000'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test27701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27701");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                                                                                44432440404044TD404...", (java.lang.CharSequence) "Hi!P0Y0M0DT0H0M0.099...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                44432440404044TD404..." + "'", charSequence2, "                                                                                                                                44432440404044TD404...");
    }

    @Test
    public void test27702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:" + "'", str1, "010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:");
    }

    @Test
    public void test27703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27703");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray8, strArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray8);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", strArray8);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a');
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("#############################################################################P0Y0M0DT0H0M0.100", strArray8);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.startsWithAny("AAAAAAAAAAAAP0Y0M0DT0H0M0.045S", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aahi!" + "'", str20, "aahi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test27704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27704");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P-1Y11M30DT23H59M59.233S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          p-1y11m30dt23h59m59.233s" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          p-1y11m30dt23h59m59.233s");
    }

    @Test
    public void test27705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("         ...aaaaaaaap0Y000DT00000.01010S00S0S00S0S00S         ", "i!P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.099");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                         p-1y11m30dt23h59m59.424s", 301);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                     p-1y11m30dt23h59m59.424s" + "'", str2, "                                                                                                                                                                                                                                                                                     p-1y11m30dt23h59m59.424s");
    }

    @Test
    public void test27707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27707");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 37, (long) 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test27708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("h         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S" + "'", str2, "h         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
    }

    @Test
    public void test27709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27709");
        char[] charArray12 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ###############################################################################################", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11M30DT23H59M59.826S", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test27710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27710");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0M0DT0H0M0.043S     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0M0DT0H0M0.043S     " + "'", str1, "0M0DT0H0M0.043S     ");
    }

    @Test
    public void test27711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27711");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 417, (long) 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.601S" + "'", str2, "P-1Y11M30DT23H59M59.601S");
    }

    @Test
    public void test27712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27712");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.197S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27713");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 93, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############                                                          HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaa", "aaaaaaaaaaHi!Hi!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############                                                          HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaa" + "'", str2, "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############                                                          HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaa");
    }

    @Test
    public void test27716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27716");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0:00:00.053");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27717");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!44HI!44HI!44!HI!44HI!44HI!44H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27718");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                             ", "Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099", 290);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27719");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(" S0 S0 S0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " s0 s0 s0 " + "'", str1, " s0 s0 s0 ");
    }

    @Test
    public void test27720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27720");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444" + "'", str1, "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27721");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 21);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.021S" + "'", str1, "P0Y0M0DT0H0M0.021S");
    }

    @Test
    public void test27722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27722");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 99, (long) 54, "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0-10DT07430-10.0453599955                                                                                                                                                  " + "'", str3, "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0-10DT07430-10.0453599955                                                                                                                                                  ");
    }

    @Test
    public void test27723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                 h!ih!ih!ih!i  i!h!ih!ih!ih!i       ", "4444444444444444444444444444444444444444444444aahi!D");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 h!ih!ih!ih!i  i!h!ih!ih!ih!i       " + "'", str2, "                                                                 h!ih!ih!ih!i  i!h!ih!ih!ih!i       ");
    }

    @Test
    public void test27724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27724");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27725");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("P-1Y11030DT23059059.98", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27726");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                         hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!                                            ", 20, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!                                            " + "'", str3, "                                         hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!                                            ");
    }

    @Test
    public void test27727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27727");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("          0000000000i!                                                           hi!          i!                                                           hi!          i!                                                           hi!          i!                                                           hi!          i!                                                           hi!          i!                                                           hi!          i!                                                           hi!          i!                                                           hi!          i!                                                           hi!          i!                                                           hi!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27728");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", 32);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("!i0                                                                                             ", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aahi!" + "'", str6, "aahi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test27729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27729");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'                                                                                                                               ", "001560.00000TD000Y0p");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27730");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 114, (long) (short) 10, "aaaaaaaaaaaaaaa                 p0y0m0dt0h0m0.001s                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaa                 p0001439030t0h014390.00159                 " + "'", str3, "aaaaaaaaaaaaaaa                 p0001439030t0h014390.00159                 ");
    }

    @Test
    public void test27731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27731");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.487S", "                                                               44459711441145942344TD43041144Y400-14P4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27732");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P-1Y11M30DT23H59M59.711S                                                           ", "                                                                               ::.99                                                                               ::.99                                                                               ::.99                                                                               ::.99                                                                               ::.99                                                                               ::.99                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa", 191);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27733");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                    HI!                   ", "                                                        44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!                                                         ", "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  s0 s0 s0 HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                    HI!                   " + "'", str3, "                                                                                    HI!                   ");
    }

    @Test
    public void test27734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAA0:00:00.010", 97, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAA0:00:00.01044444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "AAAAAAAAAAAAAAAAAA0:00:00.01044444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27735");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                    ", 139, 138);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27736");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27737");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0:00:00.087");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27738");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Hi!Hi!hi!Hi!Hi!Hi!hi!Hi!", "H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H##  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!##", 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27739");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#############################################################################################################################################################daysI!I!I!I!I!I!I!I!I!I!I!I!I...######################################################################################################################################################################################################################################", 697, "'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI     #############################################################################################################################################################daysI!I!I!I!I!I!I!I!I!I!I!I!I...######################################################################################################################################################################################################################################" + "'", str3, "'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI     #############################################################################################################################################################daysI!I!I!I!I!I!I!I!I!I!I!I!I...######################################################################################################################################################################################################################################");
    }

    @Test
    public void test27740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...#######################", "H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...#######################" + "'", str2, "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...#######################");
    }

    @Test
    public void test27742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27742");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            s020.0m0h0td0m0y0p                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "HI!  HI!  HI!  HI!  HI!  HI..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27743");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 75);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.075" + "'", str1, "0:00:00.075");
    }

    @Test
    public void test27744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27744");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0 SECOND", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "Y0M0DT0H0M");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", strArray4);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 SECOND" + "'", str6, "0 SECOND");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test27745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27745");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                        010.00:00:0", 970, 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27746");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##############################################################hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", "                                                                 h!ih!ih!ih!i  i!h!ih!ih!ih!i       ", 53);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27747");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...          0 seconds                      ", "hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27748");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", 290);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str7, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str11, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test27749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27749");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.027S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27750");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#############################################################################################################################P0Y0hP0Y00", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444IH4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27751");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("999.95095!ih  IIIIIIIIIIIIIIII0000000000000000", "44444S H000S H0S HS H000S H0S HS H000S H0S H44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("######################################################################################################################################################################################################################################daysI!I!I!I!I!I!I!I!I!I!I!I!I...######################################################################################################################################################################################################################################", "'p'YYYY'y'm'm'D'dt'h'");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################################################################################################################################################################################daysI!I!I!I!I!I!I!I!I!I!I!I!I...######################################################################################################################################################################################################################################" + "'", str2, "######################################################################################################################################################################################################################################daysI!I!I!I!I!I!I!I!I!I!I!I!I...######################################################################################################################################################################################################################################");
    }

    @Test
    public void test27753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27753");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("p0Y0M0DT0H0M0.323S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27754");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("###################################hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################hi!" + "'", str1, "###################################hi!");
    }

    @Test
    public void test27755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! hI!", "  hP00-1Y11030DT23059059.9994800000:00:00.082  hP00-1Y11030DT23059059.9994800000");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("sdnoces 0'H'TD'd'M'M'Y'yyyy'P'                                                                                                                                                                                                                                                                    ", "  hi!  hi!  !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sdnoces 0'H'TD'd'M'M'Y'yyyy'P'                                                                                                                                                                                                                                                                    " + "'", str2, "sdnoces 0'H'TD'd'M'M'Y'yyyy'P'                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test27757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0H0M0.107S", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       P0Y0M0DT0H0M0.107S                                        " + "'", str2, "                                       P0Y0M0DT0H0M0.107S                                        ");
    }

    @Test
    public void test27758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27759");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0 days", "230.00:00:0", (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0", strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("'p'YYYY'y'm'm'D'dt'h'                              ", strArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("           00noce0 0        ", strArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                Hi!                                                 ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " days" + "'", str8, " days");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test27760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", 252);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'                                                                                                                                                                                                                           " + "'", str2, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'                                                                                                                                                                                                                           ");
    }

    @Test
    public void test27761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("::.99", "44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "::.99" + "'", str2, "::.99");
    }

    @Test
    public void test27762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!  HI!  HI!  HI!  HI!  HI", "aaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI" + "'", str2, "HI!  HI!  HI!  HI!  HI!  HI");
    }

    @Test
    public void test27763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aahi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M", 27, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M" + "'", str3, "aahi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
    }

    @Test
    public void test27764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27764");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444                       4444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27766");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.099S", ' ');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "hhh", 8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, 'a', 33, 8);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", strArray6, strArray10);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray10);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("P0Y000DT00000.01010", "                                                Hi!                                                 ");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray20);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hi!hi!#######################", strArray20);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray10, strArray20);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray20);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  " + "'", str15, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "P0Y000DT00000.01010" + "'", str21, "P0Y000DT00000.01010");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str24, "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "P0Y000DT00000.01010" + "'", str25, "P0Y000DT00000.01010");
    }

    @Test
    public void test27767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!4hi!444hi HI!  HI..hi!4hi!444hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!4hi!444hi HI!  HI..hi!4hi!444hi" + "'", str1, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!4hi!444hi HI!  HI..hi!4hi!444hi");
    }

    @Test
    public void test27768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27768");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "PpYpMpDS808.95M95H32TD03M11Y1-PPpYpMpDT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                         P-1Y11M30DT23H59M59.424S", 289, 531);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                         P-1Y11M30DT23H59M59.424S" + "'", str3, "                                                                                                                                                                                                                                                                         P-1Y11M30DT23H59M59.424S");
    }

    @Test
    public void test27770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27770");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...                                 !i0!i0!i0!i0!i0!i0!i0!i0!i0", "0 seconds");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27771");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                             444597114");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                             444597114" + "'", str1, "                                                                                                                             444597114");
    }

    @Test
    public void test27772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27772");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                           'P'yyyy'Y'M'M'd'DT'H'0 seconds                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27774");
        char[] charArray12 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       ...hi!4444444444444444444444444444444444444444444444a44444444444444444444444444444444444444", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0:00:00.089", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test27775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!44days44days44days44days44days44days44days44days44day                                                                                                                                           'P'YYYY'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27776");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Hi!Hi!hi!Hi!Hi!Hi!hi!Hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27777");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa######################'Sdnoceaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################", (java.lang.CharSequence) "hS H000S H0S HS H000S H0S HS H000S H0S Hh");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa######################'Sdnoceaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa######################'Sdnoceaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################");
    }

    @Test
    public void test27778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27778");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "y000dt00000.031");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27779");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "808.95M95H32TD03M11Y1-P                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27780");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0H0M0.135S", "PaYa-1aDTa743a-1a.a3 3599959aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27781");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.0DAY88Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.0DAY88Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S" + "'", str5, "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.0DAY88Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S");
    }

    @Test
    public void test27782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27782");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.49");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27783");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                P-1Y11M30DT23H59M59.679S                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                       P0Y0M0DT0H0M0.395S                                       ", 109, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############                                       P0Y0M0DT0H0M0.395S                                       " + "'", str3, "#############                                       P0Y0M0DT0H0M0.395S                                       ");
    }

    @Test
    public void test27785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27785");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                         P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                        aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27786");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 109);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("'M'M'd'DT'H'H'm'M's.S'S'Hi!#######################################################################", "AAAAAAAAAAAAAAAAAA0:00:00.010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'M'M'd'DT'H'H'm'M's.S'S'Hi!#######################################################################" + "'", str2, "'M'M'd'DT'H'H'm'M's.S'S'Hi!#######################################################################");
    }

    @Test
    public void test27788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27788");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("270NOCE0", 336);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) ' ', "aaaaaaaaaaaaaaaaaaaH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############                                                          HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27790");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0 daysHI!HI!HI!HI!HI!HI..HI                                                                      ", "0 0 0  0 0 0.930s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 daysHI!HI!HI!HI!HI!HI..HI                                                                      " + "'", str2, "0 daysHI!HI!HI!HI!HI!HI..HI                                                                      ");
    }

    @Test
    public void test27792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0TD000Y0Ph", "                                                                                                                                44459711441145942344TD43041144Y400-14P4                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TD000Y0Ph" + "'", str2, "0TD000Y0Ph");
    }

    @Test
    public void test27793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...44444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444", "           44459711441145942344TD43041144Y400-14P4", 25);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27795");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
    }

    @Test
    public void test27796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27796");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...                 hi! hi!   hi!hi! hi!   hi...", "!ih...h!Ih!Ih                                       'H'TD'd'M'M'Y'yyyy'P'                                                                                                                      ", 17);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27797");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 151, (long) 75, " I0i!44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " I0i!44444" + "'", str3, " I0i!44444");
    }

    @Test
    public void test27798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27798");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ', 139, 95);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                                       P-1Y11030DT23059059.999444", 135, 98);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "aahi!" + "'", str18, "aahi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test27799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27799");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", (int) (short) -1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test27800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27800");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("day88                                                                                                                                                                                                                                                                                                            ", "'p'YYYY'y'm'm'D'dsdnoces  'p'YYYY'y'm'm'D'd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27801");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!  HI!  HI!  HI!  HI!  HI..", "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "", 97, 15);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1", strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test27802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27802");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("P-1Y11M30DT23H59M59.983S");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.983S" + "'", str2, "P-1Y11M30DT23H59M59.983S");
    }

    @Test
    public void test27803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27803");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI..P0Y0M0DT0H0M0.446S", (java.lang.CharSequence) "                       P00-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27804");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0a:a00a:a00a.a030");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("230.00:00:0", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '#', 126, 118);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("... HI..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "... HI..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str10, "... HI..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test27805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444p0y0m0dt0h0m0.030sh         aaaaaaaaaaaaaaaaaaaaaaaaa                                      ih                      " + "'", str1, "44444444444p0y0m0dt0h0m0.030sh         aaaaaaaaaaaaaaaaaaaaaaaaa                                      ih                      ");
    }

    @Test
    public void test27806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27806");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  h", "                    i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...                  8010.00000TD000Y0P...                   ", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                  8010.00000TD000Y0P...                   " + "'", str3, "...                  8010.00000TD000Y0P...                   ");
    }

    @Test
    public void test27808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                    'P'yyyy'Y'M'M'd'DT'H'0 seconds");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                    'P'yyyy'Y'M'M'd'DT'H'0 seconds" + "'", str1, "                                                                                                                                                                                                                                                                    'P'yyyy'Y'M'M'd'DT'H'0 seconds");
    }

    @Test
    public void test27809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27809");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 36, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I" + "'", str3, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
    }

    @Test
    public void test27810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0i!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI.." + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..");
    }

    @Test
    public void test27811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27811");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27812");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("TH", "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P-1Y11M30DT23H59M59.863S", 372, "I!  0I..hi!4hi!444h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.863SI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I" + "'", str3, "P-1Y11M30DT23H59M59.863SI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I");
    }

    @Test
    public void test27814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                         0:00:00.021                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                         0:00:00.021                                                                                          " + "'", str1, "                                                                                         0:00:00.021                                                                                          ");
    }

    @Test
    public void test27815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27815");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       ", "0 D0 D0 D0 D0 D0 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", 75);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                       " + "'", str5, "                       ");
    }

    @Test
    public void test27816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("p0Y000DT00000.01010", 903, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0Y000DT00000.01010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str3, "p0Y000DT00000.01010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test27817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27817");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S", "hi! hi! hi!hi! hi! hi!hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27818");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                       T 00", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 414);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27820");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                          0 seconds                                                          ", "p0y0m0dt0h0m0.151s", " DAYS                                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                          0 seconds                                                          " + "'", str3, "                                                          0 seconds                                                          ");
    }

    @Test
    public void test27821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27821");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 27, (long) 277, "ys  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  daysaa  daysi!  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27822");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 42, 226);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27824");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                   p0y000dt00000.07111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test27826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27826");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27828");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("P0Y0-10DT07430-10.5483599952", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27829");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("P0Y0M0DT0H0M0.107S", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 284, "...  #################################################################################################################################################################################################            y0m0dt0h0...  #################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...  #################################################################################################################################################################################################            y0m0dt0h0...  ############################################################" + "'", str3, "...  #################################################################################################################################################################################################            y0m0dt0h0...  ############################################################");
    }

    @Test
    public void test27831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("00noce0                                                                                             0 SECOND");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00NOCE0                                                                                             0 SECOND" + "'", str1, "00NOCE0                                                                                             0 SECOND");
    }

    @Test
    public void test27832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0I!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI!", "   P yyyy Y        T H H          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!", "010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###########################################Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 336, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###########################################Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###########################################Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("P0Y0M0DT0H0M0.509SsdnocessdnocesHI!sdnocessdnocesHI!s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.509SsdnocessdnocesHI!sdnocessdnocesHI!s" + "'", str1, "P0Y0M0DT0H0M0.509SsdnocessdnocesHI!sdnocessdnocesHI!s");
    }

    @Test
    public void test27836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0:00:00.063", "50278.9509503...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.063" + "'", str2, "0:00:00.063");
    }

    @Test
    public void test27837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27837");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D00 D");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I!                                                                                                  P                                                                                                  I..", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                                                                                                  P                                                                                                  I.." + "'", str2, "I!                                                                                                  P                                                                                                  I..");
    }

    @Test
    public void test27839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P0Y0M0DT0H0M0.099S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaYMDHM.1Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P0Y0M0DT0H0M0.099S" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test27840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27840");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HI! HI!HI!H...HI! H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27841");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("T4H4H", 186);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "T4H4H" + "'", str2, "T4H4H");
    }

    @Test
    public void test27843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27843");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "::::::::32", (java.lang.CharSequence) "                                                                                                                                44432440404044TD404...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("P-1Y11M30DT23H59M59.730S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.730S" + "'", str2, "P-1Y11M30DT23H59M59.730S");
    }

    @Test
    public void test27845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27845");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27846");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("######p00-1######p00-1######p00-1######p00-1#####P-1Y11M30DT23H59M59.808S######p00-1######p00-1######p00-1######p00-1#####", "!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!Hi!Hi!H...HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH...H!iH!iH!IH" + "'", str1, "H!IH...H!iH!iH!IH");
    }

    @Test
    public void test27848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aahi!P0000Y0-10DT07430-10.993599991", "0:00:00.093");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!P0000Y0-10DT07430-10.993599991" + "'", str2, "aahi!P0000Y0-10DT07430-10.993599991");
    }

    @Test
    public void test27849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AA0I!p000000-100t07430-10.99359999144444444", "                                                              P0Y0M0DT0H0M0.098S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA0I!p000000-100t07430-10.99359999144444444" + "'", str2, "AA0I!p000000-100t07430-10.99359999144444444");
    }

    @Test
    public void test27850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27850");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2, "P0Y0M0DT0H0M0.009S");
    }

    @Test
    public void test27851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "########################################################################444444444444444444                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27852");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("AAAAAAAAAAAA0:00:00.007", "#0 0a000 0 hour 0 0inute00 0 econ00 !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444                                                                                             0 -1616567633ECONDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#0 0a000 0 hour 0 0inute00 0 econ00 !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!4444444444", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27853");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!i0                                                                                      ...", 73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("P0Y0M0...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27855");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi! ", "0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0a0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0a0" + "'", str1, "0i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0a0");
    }

    @Test
    public void test27857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27857");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  HI!  HI!  HI!  HI!  HI!  HI..", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("S100.0M0#########", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S100.0M0#########" + "'", str2, "S100.0M0#########");
    }

    @Test
    public void test27859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27859");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hhhhi!hi!hi!hi!", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27860");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0444444444444444444444444444444444444444444444444444444444444444444444444444442");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27861");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P-1Y11M30DT23H59M59.950SP-1Y11M30DT23H59M59.233SP-1Y1", "P-1Y11030DT23059059.97215");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27862");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("P Y M DT H M n 56S", "aahi!P0000Y0M0DT0H0M0.99S", 5, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aahi!P0000Y0M0DT0H0M0.99S DT H M n 56S" + "'", str4, "aahi!P0000Y0M0DT0H0M0.99S DT H M n 56S");
    }

    @Test
    public void test27863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1", "1010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27864");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...", "0   seconds");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27865");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                       P0Y0M0DT0H0M0.271                                       ", 71, "  hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       P0Y0M0DT0H0M0.271                                       " + "'", str3, "                                       P0Y0M0DT0H0M0.271                                       ");
    }

    @Test
    public void test27866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27866");
        char[] charArray11 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!                                                                                                hi! hi!", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.301S", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27867");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("###################", "p-1y11m30dt23h59m59.993s0DAY88a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.053", "#############################################################################################################################P0Y0hP0Y0M", 78);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "::.53" + "'", str4, "::.53");
    }

    @Test
    public void test27869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27869");
        char[] charArray13 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0i0", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaa0:00:00.018", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!P0000Y0-10DT07430-10.99359999", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "... HI...", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test27870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!", 39, "'m'm'D'dt'h'h'M'm'S.s's'hI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'m'm'D'dt'h'h'Mhi!hi!hi!'m'm'D'dt'h'h'M" + "'", str3, "'m'm'D'dt'h'h'Mhi!hi!hi!'m'm'D'dt'h'h'M");
    }

    @Test
    public void test27871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27871");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 7, (long) 81, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11-130DT2374359-159.9323599041444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11-130DT2374359-159.9323599041444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11-130DT2374359-159.9323599041444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27872");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aahi!P0000Y0-10DT07430-10.99359999");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27873");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.045S", "0 DAYS");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!", strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1Y11M30DT23H59M59.964S44", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("P0Y0M0DT0H0M0.091S", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 7 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test27874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("        P0Y0M0DT0H0M0.063S        ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444440:00:00.02");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        P0Y0M0DT0H0M0.063S        " + "'", str2, "        P0Y0M0DT0H0M0.063S        ");
    }

    @Test
    public void test27875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27875");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "############i!00000000000000000000000000000i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" aaaaaa", 246);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("    hi!       ", 961);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    hi!       " + "'", str2, "    hi!       ");
    }

    @Test
    public void test27878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27878");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 958, (long) 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.072S" + "'", str2, "P-1Y11M30DT23H59M59.072S");
    }

    @Test
    public void test27879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("P0Y0M0DT0H0M0.188S", "Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.188S" + "'", str2, "P0Y0M0DT0H0M0.188S");
    }

    @Test
    public void test27880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi", "00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi" + "'", str2, "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi");
    }

    @Test
    public void test27881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("s540.0m0h0td0m0y0paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", 918);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s540.0m0h0td0m0y0paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           " + "'", str2, "s540.0m0h0td0m0y0paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ");
    }

    @Test
    public void test27882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27882");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11087", "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11087" + "'", str3, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11087");
    }

    @Test
    public void test27884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", 87, "  hi! ###############################################################  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...#######################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!  hi! ######################" + "'", str3, "i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!  hi! ######################");
    }

    @Test
    public void test27885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27885");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!IH !IH                                                                                                !IH                                                                             HI!                                                                                                HI! HI   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", 63, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!IH !IH                                                                                                !IH                                                                             HI!                                                                                                HI! HI   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str3, "   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!IH !IH                                                                                                !IH                                                                             HI!                                                                                                HI! HI   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test27886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27886");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("P0Y0M0DT0H0M0.224S", "PaYaMaDTaHaMa.a3 Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27887");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0 SECOND", "", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 SECOND" + "'", str5, "0 SECOND");
    }

    @Test
    public void test27888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27888");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("... HI..", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test27889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27889");
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0 DAYS", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                   0I!", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("8", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                      i0                       ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 22 + "'", int26 == 22);
    }

    @Test
    public void test27890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27890");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "###############################################################################################", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27891");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0:00:00.00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27892");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P0Y000DT00000.09710", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P0Y000DT00000.09710" + "'", str4, "000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P0Y000DT00000.09710");
    }

    @Test
    public void test27893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!H", 306);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!H" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!H");
    }

    @Test
    public void test27894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(".HHH:HH:H", 186, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27895");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "P-1Y11M30DT23H59M59.972S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1Y11M30DT23H59M59.972S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str1, "p-1Y11M30DT23H59M59.972S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test27896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("1-00P                       ", 111, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1-00P                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "1-00P                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27897");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAAAAAAAAAAA...", "hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!       0I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str2, "i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test27900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("P-1Y11M30DT23H59M59.533S", 697);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.533S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "P-1Y11M30DT23H59M59.533S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test27901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27901");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", "P0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27902");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################################################################################################################################daysI!I!I!I!I!I!I!I!I!I!I!I!I...######################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...!iH!iH!iH!iH!iH!iH!iH!iH!i-1Y11M30DT23H59M59                                                                            p0Y000DT00000.065100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "P-1Y11M30DT23H59M59.999S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str1, "P-1Y11M30DT23H59M59.999S");
    }

    @Test
    public void test27905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27905");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ", "Y0M0DT0H0M0.097P0Y0M0DT        ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27906");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("S401.0M0H0TD0M0Y0P", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27907");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", ' ');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("P0Y000DT00000.01010", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("::.99aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "::.99aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str8, "::.99aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0 SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!" + "'", str1, "0SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
    }

    @Test
    public void test27909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" DAYS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " DAYS" + "'", str1, " DAYS");
    }

    @Test
    public void test27910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                            ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27911");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###############################################################################################  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!4444444sdnoces  4444444444444  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27912");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", "...                                                                                                                                                                                    P0Y...", 151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0:00:00.0974444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0000000020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27915");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'                                       hI!hI!h...hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27916");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("IH                            4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444!ih", "0:00:00.097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27917");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                 00-1 11 30  23 59 59 964 44                                                                                                                                0 0 0  0 0 0 010 ", "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27919");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("0 SECONDS", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "              44 0a00              ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  P0Y0M0DT0H0M0.000S                ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33 + "'", int21 == 33);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test27920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27920");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("00: 00: 00:00: 00: 00:00: 00: 00:", "#########0M0.001S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27921");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                 44444444444444444444444444444444444444444                                                                                                                                                                                                                                  ", "AA0I!P0000Y000DT00000.99612", 91);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27922");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("!hi!hi!h                                           ", "", 900);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi!h                                           " + "'", str3, "!hi!hi!h                                           ");
    }

    @Test
    public void test27923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I" + "'", str2, "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
    }

    @Test
    public void test27924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27924");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray7, strArray14);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray7, strArray18);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray18);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray18);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                              P00-1     ##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray18, strArray24);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test27925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27926");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("p00-1y11m30dt23h59m59.999s00000000000000000000000000000023iiiiiiiiiiiiiiiiiiiiiiiiiiiii", 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test27927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AA0I!p000000-100t07430-10.99359999", "                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0                        010.00:00:0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###########    m    h m     s############", "                                  0140 0 0                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########    m    h m     s############" + "'", str2, "###########    m    h m     s############");
    }

    @Test
    public void test27929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27929");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("#############################################################################P0Y0M0DT0H0M0.100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################P0Y0M0DT0H0M0.100" + "'", str1, "#############################################################################P0Y0M0DT0H0M0.100");
    }

    @Test
    public void test27930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......0 ......0 ......0 ......0 ......0 ......0 ......0 ......0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27931");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("00NOCE0#0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00NOCE0#0" + "'", str1, "00NOCE0#0");
    }

    @Test
    public void test27932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 seconds                                           ", "P-1Y11M30DT23H59M59.989S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 seconds                                           " + "'", str2, "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 seconds                                           ");
    }

    @Test
    public void test27933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27933");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str1, "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test27934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27934");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0:00:00.417");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("!i0                                                                                      ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i0 ..." + "'", str1, "!i0 ...");
    }

    @Test
    public void test27936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I" + "'", str1, "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I");
    }

    @Test
    public void test27937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27937");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0:00:00.012", "", 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test27938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27938");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.010");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0 seconds");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray15, strArray22);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray15);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, "");
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, 'a');
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.concatWith("Hi!", (java.lang.Object[]) strArray15);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray15);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.endsWithAny("P0Y0M0DT0H0M0.018S", strArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("P0Y0M0DT0H0M0.365S", strArray2, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "aahi!" + "'", str28, "aahi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hi!Hi!hi!" + "'", str29, "Hi!Hi!hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test27939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27939");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("S278.95M95H3...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S278.95M95H3..." + "'", str1, "S278.95M95H3...");
    }

    @Test
    public void test27940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27940");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("P0Y0M0DT0H0M0.930S", "ih                                                                                              ", "059.872103", 25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.930S" + "'", str4, "P0Y0M0DT0H0M0.930S");
    }

    @Test
    public void test27941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27941");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("p0Y0M0DT0H0M0.024", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27942");
        char[] charArray7 = new char[] { '4', ' ', ' ', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("I!HI!HI!HI!HI!H...", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44459711441145942344TD43041144Y400-14P4", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  ,  , #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test27943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27943");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("H        ", "44days");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test27944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27944");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0H0M0.395S", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("p0Y000DT00000.00228", "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test27946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27946");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27947");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAHI!P0000Y0M0DT0H0M0.99S", "0:00:00.052");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhh");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("-130DT2374359-159.8723599999", strArray4, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("!i       #######################################################################################################################################################################################################################################################################################", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-130DT2374359-159.8723599999" + "'", str7, "-130DT2374359-159.8723599999");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AAHI!P0000Y0M0DT0H0M0.99S" + "'", str8, "AAHI!P0000Y0M0DT0H0M0.99S");
    }

    @Test
    public void test27948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!p0Y0M0DT0H0M0.496Sh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27949");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("p0y0m0dt0h0m0.003sp0y0m0dt0h0m0.003sp0y0m00", 397);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############                                                          HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaa", "0:00:00.134");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test27952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27952");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!       0I!", 108);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!hi!", "s808.95m95h32td03m11y1-p");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!hi!" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!hi!");
    }

    @Test
    public void test27954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27954");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27955");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27956");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0:00:00.092");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27957");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M", "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi                                                                                               hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...   hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27958");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" 0 T        Y 0000 P", "...hi!  hi!  hi!  hi!  hi!  hi!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test27959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!", "P0Y0M0DT0H0M0.035S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27960");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" 0 d ", "                                             ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test27961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  !ihaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  !ihaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaah" + "'", str2, "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  !ihaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test27962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("##i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!p0y0m0dt0h0m0.271s days", "                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!p0y0m0dt0h0m0.271s days" + "'", str2, "##i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!p0y0m0dt0h0m0.271s days");
    }

    @Test
    public void test27963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27963");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 252);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.252" + "'", str1, "0:00:00.252");
    }

    @Test
    public void test27964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27964");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("'44                                                                                                                ", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("0:00:00.034", "P0Y0M0DT0H0M0.564S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.034" + "'", str2, "0:00:00.034");
    }

    @Test
    public void test27966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27966");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!I0!I0!I                                           ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27967");
        char[] charArray13 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!Hi!hi!", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("  HI!  HI!  HI!  HI!  HI!  HI...", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test27968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'YYYY'Y'M'M'D'DT'H'0 SECONDS" + "'", str2, "'YYYY'Y'M'M'D'DT'H'0 SECONDS");
    }

    @Test
    public void test27969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27969");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                               P0Y0-10DT07430-10.2713599914                           ", "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 958);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27970");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "P0Y0M0DT0H0M0.094S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test27971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27971");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) 187);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.087S" + "'", str2, "P0Y0M0DT0H0M0.087S");
    }

    @Test
    public void test27972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("S", "! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S" + "'", str2, "S");
    }

    @Test
    public void test27973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27973");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P-1Y11M30DTS0 S0 S0P-1Y11M30DT2", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI...AAAAAAAAAAAAAAAAAAP0Y0000DT0a00a9915", 495);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27974");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "0:00:00.99");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 97, 97);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                               0:00:00.004", 955, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27975");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aahi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                  i!0i!i!i!i!i!i!i!i!i!", (java.lang.CharSequence) "hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27977");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 0a00", "P-1Y11030DT23059059.98", "S870.0M0H0TD0M0Y0PD43041144Y400-14P4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 0a00" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 0a00");
    }

    @Test
    public void test27978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27978");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                            I:II:IIII32                                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 98 + "'", int1 == 98);
    }

    @Test
    public void test27979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27979");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444", "                                                                                    P0000Y0M0DT0         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27980");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0econ00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...                                                       hI!hI!h...hi!                          ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27982");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", "hi!hi!hi! ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                               ...", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', 105, 5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test27983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44's's.S'm'M'h'h'td'D'm'm'y'YYYY'p'##########################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44's's.S'm'M'h'h'td'D'm'm'y'YYYY'p'##########################################################################################################################################################################################################################################################################" + "'", str1, "44's's.S'm'M'h'h'td'D'm'm'y'YYYY'p'##########################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test27984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAAAAAAAAAAAA                 P0Y0M0DT0H0M0.001S                 ", "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAA                 P0Y0M0DT0H0M0.001S                 " + "'", str2, "AAAAAAAAAAAAAAA                 P0Y0M0DT0H0M0.001S                 ");
    }

    @Test
    public void test27985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27985");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 146, "                        010.00:00:0                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        010.00:00:0                                                                                                                                                                      " + "'", str2, "                        010.00:00:0                                                                                                                                                                      ");
    }

    @Test
    public void test27986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27986");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P-1Y11030DT23059059.95048");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051Sp-1yhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051Sp-1yhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S" + "'", str1, "p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051Sp-1yhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
    }

    @Test
    public void test27988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27988");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M", "hi!4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27989");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...#######################hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "0:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.052");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27991");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("S", "444444444444444P0Y0M0DT0H0M0.395S444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27992");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045SHhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP", "'44", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27993");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 192 + "'", int2 == 192);
    }

    @Test
    public void test27994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27994");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0:00:00.03", "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27995");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) " i# #4#hi# #444#hi# #4#hi# #4#hi# #444#hi# #4#hi# #4#hi# #4440#i# #hi# #4#hi# #444#hi# #4#hi# #4#hi# #444#hi# #4#hi# #4#hi# #444", (java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000H S0H S000H SH S0H S000H SH S0H S000H S00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 488 + "'", int2 == 488);
    }

    @Test
    public void test27996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27996");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 14, (long) 187);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.173S" + "'", str2, "P0Y0M0DT0H0M0.173S");
    }

    @Test
    public void test27997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI", 611);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI" + "'", str2, "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI");
    }

    @Test
    public void test27999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27999");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 277, (long) 22, "h23AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp00059030t0h0590.04559", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test28000");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 T044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 ", "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032", 192);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }
}

